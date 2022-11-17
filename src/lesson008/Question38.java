package lesson008;

public class Question38 {

	public static void main(String[] args) {
		/*
		 * bir dizide 13 var ise 13 ve birsonraki eleman toplama
		 * eklenmeden toplam sonucunu bulan kodu yazınız.
		 */
		int nums[] = {1,13,13,13,5,1};
		int toplam=0;
		for (int i = 0; i < nums.length; i++) {
			toplam += nums[i];
			if (i==(nums.length)-1 && nums[i]!=13) break;
			if (i==(nums.length)-1 && nums[i]==13) {toplam -= nums[i]; break;}
			if (nums[i]==nums[i+1] && nums[i]==13)
				toplam -= nums[i];
			else if (nums[i]==13 && nums[i]!=nums[i+1])
				toplam -= (nums[i] +nums[i+1]);	
		}
		System.out.println(toplam);		
	}

}
