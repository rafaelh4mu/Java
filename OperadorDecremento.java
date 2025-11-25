public class OperadorDecremento {
	
	public static void main (String[ ] args) {
		int limiteTentativasLogin = 10;
		
		// limiteTentativasLogin--;
		int novoLimiteTentativasLogin = --limiteTentativasLogin;
		
		System.out.println("LImite de tentativos de login " + limiteTentativasLogin);
		System.out.println("Novo lImite de tentativos de login " + novoLimiteTentativasLogin);
	}
	
}