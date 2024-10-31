public class ContaCorrente extends Conta {
	private static final double TAXA_MANUTENCAO = 12.0;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public void cobrarTaxaManutencao() {
		if (saldo >= TAXA_MANUTENCAO) {
			this.sacar(TAXA_MANUTENCAO);
			System.out.println(String.format("Taxa de manutenção de %.2f cobrada.", TAXA_MANUTENCAO));
		} else {
			System.out.println("Saldo insuficiente para cobrança de taxa de manutenção.");
		}
	}
}
