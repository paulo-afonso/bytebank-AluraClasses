abstract class Account(
    val accountHolder: String,
    val number: Int
) {

    var balance = 0.0
        protected set

//    This is how secondary constructors are made
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposit(value: Double) {
        if (value >= 0) {
            this.balance += value
        } else (println("It's not possible to attribute negative value to accounts"))
    }

    abstract fun withdraw(value: Double)

    fun transfer(destination: Account, value: Double): Boolean {
        if (this.balance >= value) {
            this.balance -= value
            destination.deposit(value)
            println("Account holder ${this.accountHolder} sent $value to ${destination.accountHolder}")
            return true
        } else {
            println(
                "Account holder ${this.accountHolder} haven't enough money to transfer. It is necessary more ${value - this.balance} to transfer"
            )
            return false
        }
    }


//    This represents getter and setter, made as functions
//    fun getSaldo(): Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double) {
//        saldo = valor
//    }
}