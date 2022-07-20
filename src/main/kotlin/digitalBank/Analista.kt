package digitalBank
class Analista(
    name : String,
    cpf : String,
    salario : Double,
) : Funcionario (name, cpf, salario) {
    override fun calculoAuxilio() : Double = salario * 0.1
    override fun salarioTotal(): Double = salario * 1.1
}