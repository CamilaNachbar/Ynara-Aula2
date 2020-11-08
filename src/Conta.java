import java.util.List;

public class Conta extends Auditoria {
	
	private String nome;
	private String documento;
	private String conta;
	private Banco banco;
	private float saldoDebito;
	private float saldoCredito;
	private List<Transferencia> transferencias;
	
}
