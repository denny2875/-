package 신중대.main;

public class Quiz2 {

	public static void main(String[] args) {
		

		int rpwjf = 3;

		if(rpwjf>=3 && rpwjf<=5){
			System.out.println("현재 계절은 봄입니다.");
		} else if(rpwjf>=6 && rpwjf<=8) {
			System.out.println("현재 계절은 여름입니다.");
		} else if(rpwjf>=9 && rpwjf<=11) {
			System.out.println("현재 계절은 가을입니다.");
		} else if(rpwjf==12 || rpwjf==1 || rpwjf==2) {
			System.out.println("현재 계절은 겨울입니다.");
		} else {
			System.out.println("월이 잘못되었습니다.");
		}

	}

}
