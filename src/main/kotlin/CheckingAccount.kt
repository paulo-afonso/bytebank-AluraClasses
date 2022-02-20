class CheckingAccount(
    accountHolder: String,
    number: Int
) : Account(
    accountHolder = accountHolder,
    number = number
) {
    override fun withdraw(value: Double) {
        val valuePlusTax = value + 0.1
        if (this.balance >= valuePlusTax) {
            println("Your balance was: $balance")
            this.balance -= valuePlusTax
            println("Now your balance is $balance")
        } else {
            println("You don't have enough money to withdraw")
            println("You need more ${value - balance} to be able to withdraw.")
        }
    }
}