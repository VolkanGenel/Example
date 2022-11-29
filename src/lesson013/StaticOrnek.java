package lesson013;

public class StaticOrnek {

	int number = 0;
	static int number2=0;
	
		public static void main(String[] args) {
			
			StaticOrnek staticOrnek = new StaticOrnek();
			staticOrnek.number=2; // Burada number static değil biz burada classtan nesne
			// çağırırız. Eğer o nesneyi yenilersek, heapte gösterilen alan sıfırlanır ve sayımız
			// ilk haline geri döner.
			
			staticOrnek.numaraVer(); //number=3 ******** number2=1
			staticOrnek = new StaticOrnek();
			staticOrnek.numaraVer(); //number=1 ******** number2=2
			System.out.println(number2);
			
			
	
	}

		public void numaraVer() {
			number+=1;
			number2 += 1;
			System.out.println("number "+number);
			System.out.println("number2 "+number2);
		}
}
