package digitalBank

abstract class Funcionario(
    name: String,
    cpf: String,
    val salario: Double,
    ) :Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio() : Double

    override fun toString(): String = """
        Name: ${name}
        Cpf: ${cpf}
        Salario: ${salario}
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
    }