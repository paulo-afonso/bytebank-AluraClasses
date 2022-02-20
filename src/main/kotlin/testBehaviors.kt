fun testBehaviors() {
    val accountJoao = CheckingAccount("João", 10)
    accountJoao.deposit(200.0)

    val accountMaria = SavingAccount("Maria", 11)
    accountMaria.deposit(1.0)

    println(accountMaria.balance)
    println(accountJoao.balance)
}