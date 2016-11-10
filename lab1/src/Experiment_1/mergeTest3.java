package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest3 {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "3*x+1";
		String re = test.Merge(str);
		assertEquals("3*x+1",re);
		//fail("尚未实现");
	}

}
