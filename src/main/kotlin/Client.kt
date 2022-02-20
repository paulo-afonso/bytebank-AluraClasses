class Client(
    val name: String,
    val cpf: String,
    private val password: Int
) : Authenticable {

    override fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}