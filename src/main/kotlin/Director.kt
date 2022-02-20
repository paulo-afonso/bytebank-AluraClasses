class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : AdminEmployee(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
){

    override val bonus: Double
        get() {
            return salary + plr
        }

}
