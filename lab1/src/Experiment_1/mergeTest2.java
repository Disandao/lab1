package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest2 {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "x+1";
		String re = test.Merge(str);
		assertEquals("1*x+1",re);
		//fail("尚未实现");
	}

}
