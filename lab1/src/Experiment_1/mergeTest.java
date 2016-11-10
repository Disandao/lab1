package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "x+y";
		String re = test.Merge(str);
		assertEquals("1*x+1*y",re);
		//fail("尚未实现");
	}

}
