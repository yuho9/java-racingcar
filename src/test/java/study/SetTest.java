package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SetTest {
	private Set<Integer> numbers;
	
	@BeforeEach
	void setup() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}
	
	@Test
	@DisplayName("요구사항 1 : Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.")
	void checkSize() {
		assertEquals(3,numbers.size());
	}
	

}