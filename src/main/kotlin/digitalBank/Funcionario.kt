package digitalBank

abstract class Funcionario(
    name: String,
    cpf: String,
    val salario: Double,
    ) :Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio() : Double
    protected abstract fun salarioTotal() : Double

    override fun toString(): String = """
        Name: ${name}
        Cpf: ${cpf}
        Salario: ${salario}
        Auxilio: ${calculoAuxilio()}
        Total: ${salarioTotal()}
    """.trimIndent()


}