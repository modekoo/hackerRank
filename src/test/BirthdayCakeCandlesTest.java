package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class BirthdayCakeCandlesTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		List<Integer> arr = Arrays.asList(3,2,1,3);
		
		assertEquals(2, birthdayCakeCandles(arr));
	}
	
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        long max = candles.stream().max(Integer::compare).orElse(0);
        int count = (int)candles.stream().filter(t -> t == max).count();
        
        return count;
    }

}
