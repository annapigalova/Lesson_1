
public class Song {

	public static void main(String[] args) {
		int beerNum = 99;

		while (beerNum > 0) {

			printSongPart(beerNum);
			beerNum = beerNum - 1;

		}
		System.out.println("Нет бутылок пива на стене");
	}
	
	private static void printSongPart(int beerNum) {
		String word = "бутылок (бутылки)";
		if (beerNum == 1) {
			word = "бутылка"; // single number
		}

		System.out.println(beerNum + " " + word + " пива.");
		System.out.println(beerNum + " " + word + " пива на стене");
		System.out.println("Возьми одну.");
		System.out.println("Пусти по кругу.");

		if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " пива на стене");
		}
		
	}
}
