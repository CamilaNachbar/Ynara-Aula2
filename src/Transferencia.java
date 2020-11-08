
public class Transferencia {
	
	private Conta origem;
	private Conta destino;
	private String tipo;
	
	public Transferencia(Conta origem, Conta destino, String tipo) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.tipo = tipo;
	}
	
	public void transferenciaEntreContas(double valor) {
		double saldoOrigem = this.origem.getSaldoDebito() - valor;
		this.origem.setSaldoDebito(saldoOrigem);
		
		System.out.println("Origem" + saldoOrigem);
		
		double saldoDestino = this.destino.getSaldoDebito() + valor;
		this.destino.setSaldoDebito(saldoDestino);
		
		System.out.println("Destino" + saldoDestino);
		
	}
	
}
