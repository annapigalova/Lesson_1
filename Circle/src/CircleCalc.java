import java.util.Scanner;
import java.lang.Math;

public class CircleCalc {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        float r  = processInput(scanner);
        
		CircleSquareCalc(r);
		CircleLengthCalc(r);

	}
	
	private static float processInput(Scanner scanner) {
		float r = -1; // circle radius
        boolean isInputOK = false;
        
        System.out.print("Enter cirle radius: ");
        
        while(!isInputOK) {
            if (scanner.hasNextFloat()) {
                r = scanner.nextFloat();
                
                if (r < 0) {
                    System.out.println("Enter a positive number!!! ");
                } else {
                    isInputOK = true;
                }
            } else {
                System.out.println("That's not a number! Try again:");
                scanner.next();
            }
        }
        
        System.out.println("Вы ввели " + r);
		return r;
	}

	
	private static void CircleSquareCalc(float r) {
		
		double S = 0;

		S = Math.PI * Math.pow(r, 2);
		System.out.println("Площадь круга: " + S);

	}

	private static void CircleLengthCalc(float r) {
		
		double L = 0;

		L = 2 * Math.PI * r;
		System.out.println("Длина окружности: " + L);

	}

}