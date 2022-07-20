package digitalBank

class Pessoa {
    var nome = "Lucas"
    var cpf = "111.111.111-11"
    private set

    constructor()
    fun personInfo() = "$nome e $cpf"
}

fun main() {
    val lucas = Pessoa()
    println (lucas.personInfo())


}