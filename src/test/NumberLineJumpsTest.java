package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class NumberLineJumpsTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
    public String kangaroo(int x1, int v1, int x2, int v2) {
    	// Write your code here
    	/**
    	 *  z			y
			x2-x1 == i(v1-v2)
			:: z%y == 0	되는 케이스
			
			--0 2 5 1	되는케이스
			2	4	6	8	10
			6	7	8	9	10
			5 == i	되는 케이스
			--0 3 4 2
			3	6	9	12
			6	8	10	12
			4 == i
			--0 100 100 10	안되는 케이스
			100 - 0 = i(100-10)
			100 == 90i
    	 */
    	
        if(v1 <= v2)
            return "NO";
        else{
            if((x2-x1) % (v1-v2) != 0 ){
                return "NO";
            }
            return "YES";
        }
    }

}
