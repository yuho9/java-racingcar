package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; 

public class StringTest {

	@Test
	@DisplayName("요구사항 1-1 : 1,2을 , 로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.")
	void splitString() { 
		String str = "1,2"; 
		   
		String[] strArr = str.split(","); 
		
		assertThat(strArr).contains("1","2");
		assertThat(strArr).containsExactly("1","2");
	}
	
	@Test
	@DisplayName("요구사항 1-2 : \"1\"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.")
	void splitString_one() {
		String str = "1";
		
		String[] strArr = str.split(",");
		
		assertThat(strArr).containsExactly("1");
	}
	
	@Test
	@DisplayName("요구사항 2 : (1,2) 값이 주어졌을 때 String의 substring 메소드를 활용해 () 을 제거하고 1,2를 반환하도록 구현한다.")
	void remove() {
		String str = "(1,2)";
		
		String result = str.substring(1,str.length()-1);
		
		assertThat(result).isEqualTo("1,2");
	}
	
	@Test
	@DisplayName("요구사항 3-1 : abc 값이 주어졌을 때 String의 ??? 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.")
	void getChar() {
		String str = "abc";
		
		char get = str.charAt(2);
		
		assertThat(get).isEqualTo('c');
		
	}
	
	
	
} 