import java.util.List;

public class Conta {
	
	private String nome;
	private String documento;
	private String conta;
	private Banco banco;
	private double saldoDebito;
	private List<Transferencia> transferencias;
	
	public Conta(String nome, String documento, String conta, Banco banco, double saldoDebito, double saldoCredito) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.conta = conta;
		this.banco = banco;
		this.saldoDebito = saldoDebito;

	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public double getSaldoDebito() {
		return saldoDebito;
	}
	public void setSaldoDebito(double saldoDebito) {
		this.saldoDebito = saldoDebito;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}
	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	
}
