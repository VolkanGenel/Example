package lesson004;

/* 1 den 100 e kadar (100 dahil değil) olan çift sayıların toplamının tek sayıların toplamına oranı
 * 
 */
public class Question16 {

	public static void main(String[] args) {

	double toplamTek =0, toplamCift=0;
	int i=1;
	while (i>=1 && i<100) {
		if (i%2!=0) toplamTek +=i;
		else toplamCift+=i;
		i++;
	}
	System.out.println(toplamCift/toplamTek);
	
	toplamTek =0; toplamCift=0;
	
	for (i=1;i<100;i+=2) {
		toplamTek+=i;
		toplamCift+= i-1; }
	System.out.println(toplamCift/toplamTek);
	}
}
