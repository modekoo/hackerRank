package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PlusMinusTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
	
		plusMinus(arr);
		
	}
	
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        long positiveNum = arr.stream().filter(t -> t> 0).count();
        long negativeNum = arr.stream().filter(t -> t< 0).count();
        long zeroNum = arr.stream().filter(t -> t== 0).count();
        long size = arr.size();
        
        assertEquals(3, positiveNum);
        assertEquals(2, negativeNum);
        assertEquals(1, zeroNum);
        assertEquals(6, size);
        
        System.out.println( (double)positiveNum / (double)size);
        System.out.println( (double)negativeNum / (double)size);
        System.out.println( (double)zeroNum / (double)size);
    }

}
