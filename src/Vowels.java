
public class Vowels {

	public static int countVowels(String str) {
		
		int vowels = 0;
		
		for(char c: str.toLowerCase().toCharArray()) {
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowels++;
			}
		}
		
		return vowels;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countVowels("Apple"));	
		System.out.println(countVowels("Elephant"));	

	}

}
