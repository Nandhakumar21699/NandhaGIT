package org.ten;

import org.testng.annotations.Test;

public class A8 {
	
	@Test(dataProvider = "Amazon data", dataProviderClass = TestNg8.class)
	private void tc33(String data) {
		System.out.println(data);
    }
	
	@Test
	private void tc11() {
		System.out.println("test case 11");
    }

	@Test
	private void tc22() {
		System.out.println("test case 22");
    }


}
