package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char[] harfler = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö',
				'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z' };
		for (char harf : harfler) {
			switch (harf) {
			case 'a': {
				System.out.println("Kalın Sesli Harf: a");
				break;
			}
			case 'e': {
				System.out.println("İnce Sesli Harf: e");
				break;
			}
			case 'ı': {
				System.out.println("Kalın Sesli Harf: ı");
				break;
			}
			case 'i': {
				System.out.println("İnce Sesli Harf: i");
				break;
			}
			case 'o': {
				System.out.println("Kalın Sesli Harf: o");
				break;
			}
			case 'ö': {
				System.out.println("İnce Sesli Harf: ö");
				break;
			}
			case 'u': {
				System.out.println("Kalın Sesli Harf: u");
				break;
			}
			case 'ü': {
				System.out.println("İnce Sesli Harf: ü");
				break;
			}
			default:
				System.out.println("Geçersiz Harf: " + harf);
				break;
			}
		}
	}
}
