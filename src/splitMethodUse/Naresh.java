package splitMethodUse;

import java.util.Arrays;
import java.util.Comparator;

public class Naresh {
 
	public static void main(String[] args) {
		String str=new String("NareshIt,  Priyabrata123 !@#");
		String str1=str.replaceAll("[^a-zA-Z\\s]","");
		String[] words=str1.split("\\s+");
		
		Arrays.sort(words,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareToIgnoreCase(o2);
			}
			
		});
		for(String word:words)
		{
			System.out.println(word);
		}
	}
}
