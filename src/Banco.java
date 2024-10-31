import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta adicionada ao banco.");
	}

	public void listarContas() {
		System.out.println("=== Lista de Contas no Banco ===");
		for (Conta conta : contas) {
			System.out.println(String.format("Conta: %d, Agência: %d, Titular: %s, Saldo: %.2f",
					conta.getNumero(), conta.getAgencia(), conta.cliente.getNome(), conta.getSaldo()));
		}
	}
}
