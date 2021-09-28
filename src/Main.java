import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private static Scanner clavier;
		public static void main(String[] args) {
			System.out.println("Saisir un nombre : ");
			clavier = new Scanner(System.in);
			int nombre = 0;
			try {
				nombre = clavier.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("BOOM,saisie incorrect, voici ton QI :");
				
			}
			System.out.println(nombre);
			//pour commiter
			System.out.println("aurevoir");
			}
			
		
		
		
	
}

