
public class Song {

	public static void main(String[] args) {
		int beerNum = 99;

		while (beerNum > 0) {

			printSongPart(beerNum);
			beerNum = beerNum - 1;

		}
		System.out.println("��� ������� ���� �� �����");
	}
	
	private static void printSongPart(int beerNum) {
		String word = "������� (�������)";
		if (beerNum == 1) {
			word = "�������"; // single number
		}

		System.out.println(beerNum + " " + word + " ����.");
		System.out.println(beerNum + " " + word + " ���� �� �����");
		System.out.println("������ ����.");
		System.out.println("����� �� �����.");

		if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " ���� �� �����");
		}
		
	}
}
