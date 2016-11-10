package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest4 {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "1+x+x";
		String re = test.Merge(str);
		assertEquals("1+2*x",re);
		//fail("尚未实现");
	}

}
