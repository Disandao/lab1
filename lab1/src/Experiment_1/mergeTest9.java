package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest9 {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "x+x";
		String re = test.Merge(str);
		assertEquals("2*x",re);
		//fail("尚未实现");
	}

}
