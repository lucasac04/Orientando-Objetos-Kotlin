package digitalBank.test
import digitalBank.test.relatorioFuncionario
import digitalBank.Analista
import digitalBank.Pessoa

fun main() {

    val joao = Analista("Joao Pedro", "111.111.111-11", 1000.0)

    relatorioFuncionario.relatorio(joao)

}
