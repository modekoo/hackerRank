package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class GradingStudentsTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<Integer> grades = Arrays.asList(73,67,38,33);
		
		grades = gradingStudents(grades);
		
		grades.forEach(System.out::println);
		
	}
	
    public List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> gradesList = grades.stream().mapToInt((t) -> {
        									int num = t%5;
        									if(num > 3 && t+1 >= 40) return t+1;
        									else if(num > 2 && t+2 >= 40) return t+2;
        									else return t;
        									}).boxed().collect(Collectors.toList());
        
        return gradesList;
    }

}
