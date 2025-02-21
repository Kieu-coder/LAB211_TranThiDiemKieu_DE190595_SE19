
package week01;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountWC {
    private String input;

    public CountWC(String input) {
        this.input = input;
    }
    
    Map<String, Integer> countWord(){
        Map<String, Integer> wordCount = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(input, ",.?:;\n\t ");
        
        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
         }
        return wordCount;
    }
    
    Map<Character, Integer> countCharacter(){
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char ch: input.toCharArray()){
            char lowerChar = Character.toLowerCase(ch);
            if(Character.isWhitespace(lowerChar)){
                continue;
            }
            charCount.put(lowerChar,charCount.getOrDefault(lowerChar, 0) +1);
        }
        return charCount;
    }
    
    
}
