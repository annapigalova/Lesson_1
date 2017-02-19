
import java.util.Scanner;
import java.lang.Math;

public class EnterFromConsole {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		float r = 0; // circle radius
		System.out.print("Введите радиус окружности: ");

		while (!scanner.hasNextFloat()) {
			System.out.println("Невалидное число!! Попробуйте еще: ");
			scanner.next();
		}

		if (r < 0) {
			System.out.println("Введите положительное число!!");
		}
		System.out.println("Вы ввели " + r);
		CircleSquare(r);
		CircleLength(r);
	}

	private static void CircleSquare(float r) {
		double S = 0;

		S = Math.PI * Math.pow(r, 2);
		System.out.println("Площадь круга: " + S);

	}

	private static void printInvalidRadius() {

	}

	private static void CircleLength(float r) {
		double L = 0;

		L = 2 * Math.PI * r;
		System.out.println("Длина окружности: " + L);

	}

}