package com.cothing.rua.agileDev;

public class PrimeGeneratorV2 {

	private static int a;
	private static boolean[] b;
	private static int[] primes;
	
	public static int[] generatePrimes(int maxValue){
		if(maxValue < 2){
			return new int[0];
		}else{
			initializeSieve(maxValue);
			sieve();
			loadPrimes();
			return primes;
		}
	}
	
	private static void initializeSieve(int maxValue){
		
		b = new boolean[maxValue + 1];
		for(int i = 0; i < b.length; i++)
			b[i] = false;

		
	}
	
	private static void sieve(){
		for(int i = 2; i < Math.sqrt(b.length); i ++){

				for(int j = 2 * i; j < b.length; j += i ){
					b[j] = true;

			}
		}
	}
	
	private static void loadPrimes(){
		int count = 0;
		for(int i = 0; i < b.length; i++){
			if(!b[i])
				count++;
		}
		primes = new int[count];
		for(int i = 0, j = 0; i < b.length; i++){
			if(b[i]){
				primes[j++] = i;
			}
		}
	}
}
