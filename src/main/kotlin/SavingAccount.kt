class SavingAccount(
    accountHolder: String,
    number: Int
) : Account(
    accountHolder = accountHolder,
    number = number
) {
    override fun withdraw(value: Double) {
        if (this.balance >= value) {
            println("Your balance was: $balance")
            this.balance -= value
            println("Now your balance is $balance")
        } else {
            println("You don't have enough money to withdraw")
            println("You need more ${value - balance} to be able to withdraw.")
        }
    }
}
