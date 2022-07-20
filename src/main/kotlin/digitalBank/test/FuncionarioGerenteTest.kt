package digitalBank.test
import digitalBank.Gerente

fun main() {
    val Maria = Gerente("Maria", "100.100.100-11", 10000.00, "senha123")

    relatorioFuncionario.relatorio(Maria)
    AutenticationTest.autenticacao(Maria)
}