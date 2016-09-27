package com.cothing.rua.agileDev;

public class PrimeGenerator {

	public static int[] generatePrimes(int maxValues){
		if(maxValues >= 2){
			int s = maxValues + 1;
			boolean[] f = new boolean[s];
			for(int i = 0; i < s; i++)
				f[i] = true;
			f[0] = f[1] = false;
			
			for(int i = 2; i < Math.sqrt(maxValues); i++ ){
				for(int j = 2 * i; j < s; j += i){
					f[j] = false;
				}
			}
			
			int count = 0;
			for(int i = 0; i < s; i++){
				if(f[i])
					count++;
			}
			
			int[] primes = new int[count];
			for(int i = 0, j = 0; i < s; i++){
				if(f[i]){
					primes[j++] = i;
				}
			}
			
			return primes;
		} else {
			return new int[0];
		}
	}
}
