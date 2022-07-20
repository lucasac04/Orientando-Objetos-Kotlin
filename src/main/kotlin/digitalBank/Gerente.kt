package digitalBank

class Gerente(
    name : String,
    cpf : String,
    salario : Double,
    val Senha : String,

) : Funcionario(name = name, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "senha123" == Senha
    override fun salarioTotal(): Double = salario * 1.4

}
