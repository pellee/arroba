import java.util.*;


public class Program {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String email = "";
		
		System.out.println("Ingrese su email: ");
		email=in.nextLine();
		boolean arroba=false;
		
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				arroba=true;
				break;
			}
		}
		
		if(arroba)
			System.out.println("email correcto.");
		else
			System.out.println("email incorrecto.");
	}
}
