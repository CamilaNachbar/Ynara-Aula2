import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco("Santander", 55, 1229);
		Conta usuario1 = new Conta("Camila", "1234", "1", banco, Double.parseDouble("300"), Double.parseDouble("1234") );
		Conta usuario2 = new Conta("Ynara", "1234", "1", banco, Double.parseDouble("0"), Double.parseDouble("12345678") );
		
		Transferencia trans = new Transferencia(usuario1,usuario2,"CC");
		trans.transferenciaEntreContas(300);
		
		List<Transferencia> transferencias = new ArrayList<Transferencia>();
		transferencias.add(trans);
		
		usuario1.setTransferencias(transferencias);
	}

}
