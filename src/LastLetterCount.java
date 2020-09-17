import java.util.Arrays;

public class LastLetterCount {

	public static void sAndYCount(String str){
		
		int yCount = 0;
		int sCount = 0;
		
		String[] words = str.split(" ");
		
		for(String w: words) {
			char lastChar = w.charAt(w.length()-1);
			
			if(lastChar == 'S' || lastChar == 's')
				sCount++;
			else if (lastChar == 'Y' || lastChar == 'y')
				yCount++;	
		}
		
		System.out.println("Words Ending with s: " + sCount );
		System.out.println("Words Ending with y: " + yCount );
	}
	
	public static String replaceYandS(String str) {
		String[] words = str.split(" ");
		int firstY = -1;
		int firstS = -1;
		
		for(int i = 0; i<words.length; i++) {
			String w = words[i];
			
			char lastChar = w.charAt(w.length()-1);
			
			if((lastChar == 'S' || lastChar == 's') && firstS == -1)
				firstS = i;
			else if ((lastChar == 'Y' || lastChar == 'y') && firstY == -1)
				firstY = i;
		}
		
		if(firstY>=0 && firstS>=0) {
			String temp = words[firstY];
			words[firstY] = words[firstS];
			words[firstS] = temp;
		}
		
		return String.join(" ", words);
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str = "What's wrong with silly Harry";
		System.out.println(str);
		sAndYCount(str);
		str = replaceYandS(str);
		System.out.println(str);
	}

}
