package test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AppleAndOrangeTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		int s = 7;
		int t = 11;
		
		int a = 5;
		int b = 15;
		
		List<Integer> apples = Arrays.asList(-2, 2, 1); 
		List<Integer> oranges = Arrays.asList(5, -6);
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
	
    public void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    	
    	long appleCnt = apples.stream().filter(n -> n+a >= s && n+a <= t ).count();
    	long orangeCnt = oranges.stream().filter(n -> n+b >= s && n+b <= t ).count();
    	
    	System.out.println(appleCnt);
    	System.out.println(orangeCnt);
    	
    }

}
