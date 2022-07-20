package digital.Bank

class Pessoa {
    var nome = "Lucas"
    var cpf = "111.111.111-11"
    private set
}

fun main() {
    val lucas = Pessoa()
    println (lucas.nome)
    println (lucas.cpf)

}