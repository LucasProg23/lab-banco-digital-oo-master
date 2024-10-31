public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Venilton");

		ContaCorrente cc = new ContaCorrente(cliente);
		ContaPoupanca poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(50, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.cobrarTaxaManutencao();
		poupanca.aplicarRendimento();

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		// Gerenciamento pelo Banco
		Banco banco = new Banco();
		banco.setNome("Banco Digital");
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		banco.listarContas();
	}
}
