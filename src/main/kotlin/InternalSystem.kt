class InternalSystem {

    fun logIn(admin: Authenticable, password: Int){
        if (admin.authentication(password)) {
            println("Successfully Authenticated")
        } else {
            println("Failed to authenticate")
        }
    }

    

}