abstract class Assistant(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    
    override val bonus: Double
        get() = salary * 0.05

        //        }        if (type == 0){
        //            return salario * 0.1
        //        } else if (type == 1){
        //            return salario * 0.2
        //        } else{
        //            return salario * 0.3
        //        }

}
