package com.myclass.pep_classes;

public class P3_Miscellaneous{

	/*
	 * Let's say the number is 429. 
	 * 
	 * So the possible combination is -
	 * 
	 * 429 --> Given Number
	 * 
	 * We have to find all the combination 
	 * --------
	 * 249
	 * 294
	 * 492 ---> Answer
	 * 924
	 * 942
	 */

		public static void findCombinations(int num) {
			String strNum = String.valueOf(num);
			findCombinations("", strNum);
		}
	
		private static void findCombinations(String prefix, String str) {
			int n = str.length();
			if (n == 0) {
				System.out.println(prefix);
			} else {
				for (int i = 0; i < n; i++) {
					findCombinations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
				}
			}
		}
		
		public static void trick(int num) {
			// int num = 429;
			findCombinations(num);
		}

		
	
}