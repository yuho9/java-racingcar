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
	
} 