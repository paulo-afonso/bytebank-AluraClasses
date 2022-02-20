fun testDifferentAccounts() {
    val checkingAccount = CheckingAccount(
        accountHolder = "John",
        number = 1000
    )

    val savingAccount = SavingAccount(
        accountHolder = "Ted",
        number = 1001
    )

    checkingAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)

    println("checking ${checkingAccount.balance}")
    println("saving ${savingAccount.balance}")
    println()

    checkingAccount.withdraw(100.0)
    savingAccount.withdraw(100.0)
    println()

    println("checking after withdraw: ${checkingAccount.balance}")
    println("saving after withdraw: ${savingAccount.balance}")
    println()

    checkingAccount.transfer(savingAccount, 100.0)

    println("checking after making transfer: ${checkingAccount.balance}")
    println("saving after receiving transfer: ${savingAccount.balance}")
    println()

    savingAccount.transfer(checkingAccount, 200.0)

    println("saving after making transfer: ${savingAccount.balance}")
    println("checking after receiving transfer: ${checkingAccount.balance}")
    println()
}