package Experiment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergeTest5 {

	@Test
	public void testMerge() {
		result test = new result();
		String str = "1-x+x";
		String re = test.Merge(str);
		assertEquals("1",re);
		//fail("尚未实现");
	}

}
