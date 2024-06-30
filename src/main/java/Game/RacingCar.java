package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//자동차 이름 입력 후 쉼표를 기준으로 분리
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String input = sc.nextLine();
		String[] name = input.split(",");
		
		

	}

}
