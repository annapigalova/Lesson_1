import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = processCheck(scanner);
		multiplyNum(num);

	}

	private static void multiplyNum(int num) {
		int result = 1;

		while ((int) (num / 10) != 0) {
			if (num < 0) {
				result = (num % 10) * result;
				num = (int) (num / 10) * (-1);
			} else {
				result = (num % 10) * result;
				num = (int) (num / 10);
			}
		}
		;

		System.out.println("������������ ����: " + result);

	}

	private static int processCheck(Scanner scanner) {
		int num = 0;
		boolean isInputOK = false;

		System.out.print("������� ����� �������������� ����� �����: ");

		while (!isInputOK) {
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				int abs = Math.abs(num);
				if (abs > 999 && abs < 10000) {
					isInputOK = true;
				} else {
					System.out.println("��������������.... ");

				}
			} else {
				System.out.println("������� ���������� ��������!! ");
				scanner.next();
			}
		}
		System.out.println("�� ����� " + num);

		return num;
	}
}