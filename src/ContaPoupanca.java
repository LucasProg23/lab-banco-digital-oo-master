public class ContaPoupanca extends Conta {
	private static final double TAXA_RENDIMENTO = 0.005;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void aplicarRendimento() {
		double rendimento = saldo * TAXA_RENDIMENTO;
		this.depositar(rendimento);
		System.out.println(String.format("Rendimento de %.2f aplicado.", rendimento));
	}
}
