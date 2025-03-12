package Hooks;

import io.cucumber.java.*;

public class HooksConcept1 {
	@Before
	public void method1() {
		System.out.println("Before Scenario");
		
	}
	@BeforeStep
	public void method2() {
		System.out.println("Before each step of the scenario");
	}
	@AfterStep
	public void method3() {
		System.out.println("After each step of the scenario");
		
	}
	@After
	public void method4() {
		System.out.println("After Scenario");
		
	}

}
