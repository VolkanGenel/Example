package lesson008;

public class Question41 {

	public static void main(String[] args) {
		// Çarpım Tablosu
		// 1x1=1
		int[][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			for(int j=0;j<array[i].length;j++) {
			array[i][j]=(i+1)*(j+1);	
			System.out.println((i+1)+" * "+(j+1)+" = "+array[i][j]);
			}
		}	
	}
}
