import java.util.Scanner;

public class Pave {

	public static void main(String[] args) {
		double largeur = -1.0;
		double longueur = -1.0;
		double hauteur = -1.0;
		Scanner sc = new Scanner(System.in);
		
		while(largeur < 0){
			System.out.println("La largeur doit etre positive ! \n Largeur :");
			largeur = sc.nextDouble();
		}
		
		while(longueur < 0){
			System.out.println("La longueur doit etre positive ! \n Longueur :");
		    longueur = sc.nextDouble();
		}
	    
		while(hauteur < 0){
			System.out.println("La hauteur doit etre positive ! \n Hauteur :");
		    hauteur = sc.nextDouble();
		}
	    
	    double volume = largeur * longueur * hauteur;
	    System.out.println("Le volume du pave est : " + volume);
	}
	
}
//Fait par Antoine Latour et Olivier Batier
