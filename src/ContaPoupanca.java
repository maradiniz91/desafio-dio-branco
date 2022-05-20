
public class ContaPoupanca extends Conta {
	@override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirinfosComuns();
	}
}
