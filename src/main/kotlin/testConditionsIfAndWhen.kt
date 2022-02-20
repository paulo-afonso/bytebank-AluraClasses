fun testConditionsIf(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta Positiva")
    } else if (saldo == 0.0) {
        println("Conta Zerada")
    } else {
        println("Conta Negativada")
    }
}

fun testConditionsWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Seu saldo está positivo")
        saldo == 0.0 -> println("Seu saldo está zerado")
        saldo < 0.0 -> println("Seu saldo está negativo")
    }
}
