public class RemoveDuplicateString {
    public static void removeDuplicate(String input, int index, boolean[] map, StringBuilder newStr){
        if(index == input.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = input.charAt(index);
        //kaam

        if(map[currentChar - 'a'] == true){
            removeDuplicate(input, index+1, map, newStr);
        }
        else{
            map[currentChar - 'a'] = true;
            removeDuplicate(input, index+1, map, newStr.append(currentChar));
        }
    }
    public static void main(String[] args){
        String input = "mynameisshreyansh";
        int index = 0;
        boolean map[] = new boolean[25];
        StringBuilder newStr = new StringBuilder("");    
        
        removeDuplicate(input, index, map, newStr);
    }    
}
