package com.Flexon.Java_String_Project;


public class Consonants {

	public static String replaceConsonants(String str) {
		
		int numConsonants = 0;
		char[] strArr = str.toCharArray();
		
		for (int i=0; i<strArr.length; i++) {
			
			char c = strArr[i];
					
			if((c>=97 && c<=122) || (c>=65 && c<=90)) { //Is a letter
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'	) {
					//System.out.println("Is vowel");
				}
				else {
					numConsonants++;
					strArr[i] = '*';
				}
			}
		}
		
		
		System.out.println(numConsonants + " Consonants");
		str = new String(strArr);
		
		return str;
	}
	
	public static void main(String[] args) {
		
//		String myStr = "Welcome!!!";
//		System.out.println(myStr);
//		System.out.println(replaceConsonants(myStr));
	}

}
