package lesson015;

public class Test {

	public static void main(String[] args) {
		
		Question52 test1 = new Question52();
		test1.boyut1=10;
		Question52 test2 = new Question52();
		test2.boyut1=15;
		boolean kontrol = test1.boyut1 == test2.boyut1;
		System.out.println(kontrol);
		test2.boyut1=10;
		kontrol = test1.boyut1 == test2.boyut1;
		System.out.println(kontrol);
		test2.atama();
	//	System.out.println(test1.atama()==test1.boyut1);
		System.out.println(test2.boyut1);
		
		test1.dizi = test1.atama();
		kontrol = test1.dizi.length == test2.dizi.length;
		System.out.println(kontrol);
		
		Question52 test3 = new Question52();
		for (int i = 0; i < test3.dizi.length; i++) {
			System.out.println(test3.dizi[i]);
			
		}
		
	}
}
