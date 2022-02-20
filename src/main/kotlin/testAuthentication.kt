fun testAuthentication() {
    val manager = Manager(
        name = "Alen",
        cpf = "111.111.111-11",
        salary = 1000.0,
        password = 101095
    )

    val director = Director(
        name = "Ted",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 170490,
        plr = 200.0
    )

    val client = Client(
        name = "Jorge",
        cpf = "555.555.555-55",
        password = 777
    )

    val system = InternalSystem()
    system.logIn(manager, 101095)
    println()
    system.logIn(director, 170490)
    println()
    system.logIn(client, 777)

}