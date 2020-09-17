
public class Words {
	
	public static int countWords(String str) {
		String [] words = str.trim().split(" ");
		int numWords = 0;
		
		for(String w: words) {
			if(w.trim().length() >0)
				numWords++;
		}
		
		return numWords;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWords("Hi         how  are  you?"));
		
	}

}
