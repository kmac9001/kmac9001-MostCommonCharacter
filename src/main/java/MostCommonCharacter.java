import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char ret = ' ';
        int max = 0;
        HashMap<Character, Integer> contains = new HashMap<>();
        for(int x = 0; x < str.length(); x++){
            Character temp = str.charAt(x);
            if(contains.containsKey(temp)){
                int tempInt = contains.get(temp)+1;
                if(tempInt > max){
                    max = tempInt;
                    ret = temp;
                }
                contains.put(temp, tempInt);
            }
            else{
                contains.put(temp, 1);
                if(1 > max){
                    max = 1;
                    ret = temp;
                }
            }
        }
        
        return ret;
    }
}
