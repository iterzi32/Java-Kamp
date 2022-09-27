package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		// System.out.println("Eleman sayısı: "+mesaj.length());
		// System.out.println("Beşinci eleman: "+mesaj.charAt(4));
		// System.out.println(mesaj.concat(" yaşasın!"));
		// System.out.println(mesaj.startsWith("B")); //string ifadenin ne ile
		// başladığını kontrol eder
		// System.out.println(mesaj.endsWith("M"));
		// char[] karakterler = new char[5];
		// mesaj.getChars(0,4,karakterler,0);
		// System.out.println(karakterler);
		// System.out.println(mesaj.indexOf('a'));

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(3, 6));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
	}
}
