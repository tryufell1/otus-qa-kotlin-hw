interface TestRunner {
    fun runTest(steps: T, test: () -> Unit)
}

class Test : TestRunner {
    override fun runTest(steps: T, test: () -> Unit) {
        println("call before")
        steps.before()
        test()
        println("call after")
        steps.after()
    }
}