package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals("19:05:45", timeConversion("07:05:45PM"));
	}
	
	@Test
	void test2() {
		assertEquals("00:05:45", timeConversion("12:05:45PM"));
	}
	
    public static String timeConversion(String s) {
    // Write your code here
        boolean PM = s.endsWith("PM");
        s = PM ? s.replace("PM", "") : s.replace("AM", "");
        String[] timeZone = s.split(":");
        int time = Integer.parseInt(timeZone[0]);
        if(time >= 12 && !PM)
            time = time - 12;
        if(time < 12 && PM)
            time = time + 12;

        String result = "" + (time < 10 ? "0"+time : time > 23 ? "0"+(time-24) : time) + ":" + timeZone[1] + ":" + timeZone[2];
        System.out.println(result);
        return result;
    }

}
