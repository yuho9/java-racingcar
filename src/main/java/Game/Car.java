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
	

}
