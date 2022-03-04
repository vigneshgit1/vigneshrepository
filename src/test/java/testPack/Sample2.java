package testPack;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups ="smoke")
	private void tc13() {
		System.out.println("TestCase 3");
	}

	@Test
	private void tc2() {
		System.out.println("TestCase 2");
	}

}
