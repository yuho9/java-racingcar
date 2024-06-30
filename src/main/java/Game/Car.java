package Game;

import java.util.Random;

public class Car {
	private String name;
	private int record;
	
	//생성자
	public Car(String name) {
		if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
		this.name = name;
		this.record = 0;
	}
	

	public String getName() {
		return name;
	}
	public int getRecord() {
		return record;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
	//전진,멈춤을 결정하는 랜덤한 수
	public boolean key() {
	        return new Random().nextInt(10) >= 4;
	    }
	
	//key를 바탕으로 기록을 바꿈
	public void move() {
		if(key()) {
			record++;
		}
	}
	
	//기록을 -형태로 반환
	public String showRecord() {
		return "-".repeat(record);
	}
	

}
