package digitalBank.test

import digitalBank.clientType

fun main() {
    clientType.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    val pf = clientType.PF
    println(">>${pf.name} - ${pf.descricao}")
    val pj = clientType.PJ
    println(">>${pj.name} - ${pj.descricao}")
}