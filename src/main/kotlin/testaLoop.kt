fun testaLoop() {
    var i = 1
    while (i < 5) {
        var saldo2 = -50.0
        var saldo = 0.0

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        saldo = i * 2 + 10.0

        println("titular: $titular")
        println("número conta: $numeroConta")
        println("saldo: $saldo")
        println()
        i += 20
        saldo2 += i
        testConditionsWhen(saldo)
        testConditionsIf((saldo2))
    }
}