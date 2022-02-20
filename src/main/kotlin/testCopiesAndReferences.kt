fun testCopiesAndReferences() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("numberX $numberX")
    println("numberY $numberY")
}