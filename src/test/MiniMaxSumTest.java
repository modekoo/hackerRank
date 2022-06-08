package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MiniMaxSumTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		
		miniMaxSum(arr);
	}
	
	@Test
	void test2() {
		List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);
		
		miniMaxSum(arr);
	}
	
	@Test
	void test3() {
		List<Integer> arr = Arrays.asList(0, 0, 0, 0, 0);
		
		miniMaxSum(arr);
	}
	
	@Test
	void test4() {
		List<Integer> arr = Arrays.asList(0, 0, 1, 0, 0);
		
		miniMaxSum(arr);
	}
	
	@Test
	void test5() {
		List<Integer> arr = Arrays.asList(-100, 0, 0, 0, 500);
		
		miniMaxSum(arr);
	}
	
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here

		int min = 0;
		int max = 0;
		long sum = 0;

		for(int i=0; i<arr.size(); i++){
			int tempNum = arr.get(i);
			sum += arr.get(i);

			if(min == 0) min = tempNum;
			else if(min > tempNum) min = tempNum;

			if(max < tempNum) max = tempNum;
		}

		System.out.println((sum - max) + " " + (sum - min));
	}
	
	public static void afterMiniMaxSum(List<Integer> arr) {
		// Write your code here

		long sum = arr.stream().reduce(0, Integer::sum);
		int tempMax = arr.stream().max(Integer::compare).orElse(0);
		int tempMin = arr.stream().min(Integer::compare).orElse(0);

		long max = sum - tempMin;
		long min = sum - tempMax;
		
		System.out.println(min + " " + max);
	}
	
}
