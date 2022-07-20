package digitalBank

class Gerente(name : String, cpf : String, salario : Double) : Funcionario(name = name, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun salarioTotal(): Double = salario * 1.4

}
