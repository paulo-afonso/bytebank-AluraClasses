abstract class AdminEmployee(
    name: String,
    cpf: String,
    salary: Double,
    protected val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authenticable{

    override fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }

}
