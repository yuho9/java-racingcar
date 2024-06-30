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
			if(findMax()==car.getRecord()) {
				System.out.print("*");
			}
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
	
	//현재까지 자동차의 기록중 가장 큰값을 찾아냄
		public int findMax(){
			int max = 0;
			for (Car car : carList) {
				max = (car.getRecord()>max?car.getRecord():max);
	        }
			return max;
		}
		
		//승자를 찾아냄
		public List<String> winner(){
			List<String> winnerList = new ArrayList<>();
			for(Car car : carList) {
				winnerList.add(car.getRecord() == findMax()?car.getName():"");
			}
			winnerList.removeIf(String::isEmpty);
			return winnerList;
	}
	
	
}
