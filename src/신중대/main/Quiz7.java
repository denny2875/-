package 신중대.main;

import java.util.ArrayList;

import abstractex.quiz.Animal;
import abstractex.quiz.Human;
import abstractex.quiz.Tiger;

public class Quiz7 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<>();

	// 시간 없어서 못했어요 죄송합니다

		}

	}

	abstract class Animal {

		public abstract void wka();

		public abstract void rrr();

	}

	class tkfka1 extends Animal {

		@Override
		public void rrr() {
			System.out.println("사람이 두 발로 걷습니다 ");
		}

		public void readBook() {
			System.out.println("사람이 책을 읽습니다");
		}

		@Override
		public void wka() {
			System.out.println("밤에는 잠을 잡니다.");

		}

	}

	class tiger extends Animal {

		@Override
		public void rrr() {
			System.out.println("호랑이가 네 발로 뜁니다 ");

		}

		public void tksid1() {
			System.out.println("호랑이가 사냥을 합니다");
		}

		@Override
		public void wka() {
			System.out.println("밤에는 잠을 잡니다.");

		}

	}
}