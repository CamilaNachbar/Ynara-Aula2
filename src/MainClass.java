
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco("Santander", 55, 1229);
		Conta usuario1 = new Conta("Camila", "1234", "1", banco, Double.parseDouble("1234"), Double.parseDouble("1234") );
		
		Conta usuario2 = new Conta("Ynara", "1234", "1", banco, Double.parseDouble("123455"), Double.parseDouble("12345678") );
		
		
		
	}

}
