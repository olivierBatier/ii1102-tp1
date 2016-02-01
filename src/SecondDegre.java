import java.util.Scanner;

public class SecondDegre {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double delta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nous travaillerons sur une equation de la forme : ax**2 + bx + c");
		System.out.print("a = ");
		a = sc.nextDouble();
		System.out.print("b = ");
		b = sc.nextDouble();
		System.out.print("c = ");
		c = sc.nextDouble();
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		delta = ((b*b) - (4*a*c));
		
		if(delta > 0){
			double x1 = (-b-Math.sqrt(delta))/(2*a);
			double x2 = (-b+Math.sqrt(delta))/(2*a);
			
			System.out.println("Les solutions sont x1 = "+x1+" et x2 = "+x2);
		}
		else if(delta < 0){
			double racineDeltaAbsolu = Math.sqrt(Math.abs(delta));
			System.out.println("Les solutions sont :");
			System.out.println("x1 = ("+(-b)+" - i"+racineDeltaAbsolu+")/"+2*a);
			//print affiche
			System.out.println("x2 = ("+(-b)+" + i"+racineDeltaAbsolu+")/"+2*a);
		}
		else{
			double x = -b/(2*a);
			System.out.println("La solution est x = "+x);
		}
		
		
	}

}

//Fait par Antoine Latour et Olivier Batier
