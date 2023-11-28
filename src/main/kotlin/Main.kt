fun main(args: Array<String>) {
    val test = Test()
    val t = T()

    test.runTest(t, {println("Tests are going")})
}

class T() {
    fun before() {
        println("before() in class T")
    }
    fun after() {
        println("after() in class T")
    }
}