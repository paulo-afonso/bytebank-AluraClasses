fun testEmployees() {
    val alex = Manager(
        name = "Alex",
        cpf = "111.111.111-11",
        salary = 1000.0,
        password = 12345
    )

    println("nome ${alex.name}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salary}")
    println("bonus ${alex.bonus}")
    println()

    val peter = Manager(
        name = "Peter",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 1234
    )

    println("nome ${peter.name}")
    println("cpf ${peter.cpf}")
    println("salario ${peter.salary}")
    println("bonus ${peter.bonus}")
    if (peter.authentication(1234)) {
        println("succeded authentication")
    } else {
        println("failed authentication")
    }
    println()

    val paul = Director(
        name = "Paul",
        cpf = "333.333.333-33",
        salary = 4000.0,
        password = 102030,
        plr = 200.0
    )


    println("nome ${paul.name}")
    println("cpf ${paul.cpf}")
    println("salario ${paul.salary}")
    println("bonus ${paul.bonus}")
    println("prl ${paul.plr}")
    if (paul.authentication(102030)) {
        println("succeded authentication")
    } else {
        println("failed authentication")
    }

    val calculator = BonusCalculator()
    calculator.register(alex)
    calculator.register(peter)
    calculator.register(paul)

    println("Total Bonus = ${calculator.total}")
}