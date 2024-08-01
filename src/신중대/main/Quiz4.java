package 신중대.main;

public class Quiz4 {
	public static int fltmxm(int[] sja) {
		if(sja.length < 3) {
			return -999;
		}
		
		int tja = 0;
		 for (int n : sja) {
			tja = tja + n;
		}
		 return tja;
	}

	public static void main(String[] args) {	
		int[] dkf1 = new int[] {2, 4, 6, 8, 10};
		int result1 = fltmxm(dkf1);
		
		int[] dkf2 = new int[] {2, 4};
		int result2 = fltmxm(dkf2);
		 System.out.println("첫번째 배열의 합계: " + result1);
		 System.out.println("첫번째 배열의 합계: " + result2);
		

	}

	
}
