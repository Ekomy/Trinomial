package HomeWork1;
import java.util.Scanner;
import java.lang.Math;

public class Trinomial {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double solution=0;
		
		System.out.println("Finding zero points of ax^2+bx+c");
		System.out.println("A number:");
		double nA = in.nextInt();
		System.out.println("B number:");
		double nB = in.nextInt();
		System.out.println("C number:");
		double nC = in.nextInt();
		
		double check = (nB*nB)-(4*nA*nC);
		
		if(check<0) {
			System.out.println(" There are no real roots ");
			System.out.println("Do you want to know complex answers ? Press:1 for yes");
			int decide = in.nextInt();
			if(decide==1) {
				
				double realPart = -nB / (2 *nA);
	            double imaginaryPart = Math.sqrt(-check) / (2 * nA);
				System.out.println("reel part:"+ realPart+ "imaginary part" + imaginaryPart+"i" );
				
				double imaginaryPart2 = -(Math.sqrt(-check) / (2 * nA));
				System.out.println("reel part:"+ realPart+ "imaginary part" + imaginaryPart2+"i" );
			}
		}
		
		if(check==0) {
			solution = (-nB)/2*nA;
			System.out.println(solution);
		}
		
		if(check>0) {
			
			solution = ((-nB + Math.sqrt(check))/2*(nA));
			double solutionb =(int) ((-nB - Math.sqrt(check))/2*(nA));
			System.out.println("First root:"+ solution+ " Second root:"+ solutionb);
		}
		
		in.close();
	}
	

}
