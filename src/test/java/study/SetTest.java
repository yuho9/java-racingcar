package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	@DisplayName("요구사항 2 : Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.")
	void checkContain(int input) {
	assertTrue(numbers.contains(input));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	@DisplayName("요구사항 3 : 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.")
	void checkContain_bool(int input) {
		if(input < 4) {
			assertThat(numbers.contains(input)).isTrue();
		}
		else {
			assertThat(numbers.contains(input)).isFalse();
		}
	}
	
}