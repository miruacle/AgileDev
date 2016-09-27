package com.cothing.rua.agileDev;

import junit.framework.TestCase;

public class TestGeneratePrimes extends TestCase{

	public static void main(String[] args){
		junit.swingui.TestRunner.main(new String[] {
				"TsetGeneratePrimes"
		});
	}
	
	public TestGeneratePrimes(String name){
		super(name);
	}
	
	public void testPrimes(){
				
		int[] nullArray = PrimeGeneratorV2.generatePrimes(0);
		assertEquals(nullArray.length, 0);
		
		int[] minArray = PrimeGeneratorV2.generatePrimes(2);
		assertEquals(minArray.length, 1);
		assertEquals(minArray[0], 2);
		
		int[] threeArray = PrimeGeneratorV2.generatePrimes(3);
		assertEquals(threeArray.length, 2);
		assertEquals(threeArray[0], 2);
		assertEquals(threeArray[1], 3);
		
		int[] centArray = PrimeGeneratorV2.generatePrimes(100);
		assertEquals(centArray.length, 25);
		assertEquals(centArray[24], 97);
	}
}
