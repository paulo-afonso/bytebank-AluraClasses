class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : AdminEmployee(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
){

    override val bonus: Double
        get() {
            return salary
        }
}
