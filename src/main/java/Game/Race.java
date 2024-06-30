package Game;

import java.util.ArrayList;
import java.util.List;

public class Race {
	private List<Car> carList;
	
	//생성자
	public Race(List<Car> carList) {
		this.carList = carList;
	}
	
	//현재 기록을 출력
	public void printResult() {
		for(Car car : carList ) {
			System.out.println(car.getName() + " : -" + car.showRecord());
		}
		System.out.println();
	}
	
	//모든 자동차를 움직임
	public void moveCarList() {
        for (Car car : carList) {
            car.move();
        }
    }
	
	//레이스 시작, 횟수를 반복
	public void start(int n) {
		printResult();
        for (int i = 0; i < n; i++) {
            moveCarList();
            printResult();
        }
    }
	
	
	
}
