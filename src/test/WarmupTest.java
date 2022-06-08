package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class WarmupTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		staircase(6);
	}
	
    public static void staircase(int n) {
    // Write your code here
        for(int i=1; i<=n; i++){
            int spaceEnd = n-i;
            int a = 0;
            int b = 0;
            while(b < spaceEnd){
                System.out.print(" ");
                b++;
            }
            while(a < i){
                System.out.print("#");
                a++;
            }
            System.out.println();
        }
    }

}
