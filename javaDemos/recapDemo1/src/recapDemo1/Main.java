package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 25;
		int sayi3 = 30;
		
		if (sayi1 > sayi2) {
			if (sayi1 > sayi3) {
				System.out.println("Sayı1 en büyüktür");
			}
		}
		if (sayi2 > sayi3) {
			System.out.println("Sayı2 en büyüktür");
		}
		else
		{
			System.out.println("Sayı3 en büyüktürtür");
		}		
	}
}	
