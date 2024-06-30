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
		
		//자동차 리스트 생성
		List<Car> carList = new ArrayList<>();
			for (String n : name) {
				try {
					carList.add(new Car(n.trim()));
					} 
				catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					return; // 프로그램 종료
					}
		        }
	 
			//횟수 입력
			System.out.println("시도할 회수는 몇회인가요?");
			int n = sc.nextInt();
			
			//레이스 시작
				System.out.println("실행 결과");
				Race race = new Race(carList);
				race.start(n);

				//승자 출력
				List<String> winners = race.winner();
				System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
				
				
				
				
				sc.close();


	}

}
