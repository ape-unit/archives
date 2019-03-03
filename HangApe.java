import java.util.Scanner;

public class HangApe {

	private static String word = "APE";
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("   WELCOME TO HANGAPE   ");
		System.out.println("------------------------");
		Scanner sc = new Scanner(System.in);
		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word:");
			System.out.println(asterisk);
			String guess = sc.next().toUpperCase();
			hang(guess);
			System.out.println();
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("   CONGRATS. YOU HAVE WON HANGAPE. THE WORD WAS " + word + "   ");
			System.out.println("---------------------------------------------------------------");
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println("   ____________");
			System.out.println("   |          .-`-.");
			System.out.println("   |         / _=_ \\");
			System.out.println("   |        (,(oYo),)");
			System.out.println("   |        |   \"   |");
			System.out.println("   |         \\(---)/ ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println("   ____________");
			System.out.println("   |          .-`-.");
			System.out.println("   |      .-./ _=_ \\.-.");
			System.out.println("   |     {  (,(oYo),) }}");
			System.out.println("   |     {{ |   \"   |} }");
			System.out.println("   |     { { \\(---)/  }}");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("BAD GUESS, TRY AGAIN");
			System.out.println("   ____________");
			System.out.println("   |          .-`-.");
			System.out.println("   |      .-./ _=_ \\.-.");
			System.out.println("   |     {  (,(oYo),) }}");
			System.out.println("   |     {{ |   \"   |} }");
			System.out.println("   |     { { \\(---)/  }}");
			System.out.println("   |     {{  }'-=-'{ } }");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 7) {
			System.out.println("GAME OVER.");
			System.out.println("   ____________");
			System.out.println("   |          .-`-.");
			System.out.println("   |      .-./ _=_ \\.-.");
			System.out.println("   |     {  (,(oYo),) }}");
			System.out.println("   |     {{ |   \"   |} }");
			System.out.println("   |     { { \\(---)/  }}");
			System.out.println("   |     {{  }'-=-'{ } }");
			System.out.println("   |     {{  }'-=-'{ } }");
			System.out.println("___|___ ((((\\)     (/))))");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("   GAME OVER. YOU HAVE FAILED HANGAPE. THE WORD WAS " + word + "   ");
			System.out.println("-------------------------------------------------------------------");
		}
	}
}