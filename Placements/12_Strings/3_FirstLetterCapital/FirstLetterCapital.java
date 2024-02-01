public class FirstLetterCapital {
    public static void firstLetterUpper(String inputStr){
        StringBuilder inputSB = new StringBuilder(inputStr);
        
        for(int i = 0; i < inputStr.length(); i++){
            if(inputSB.charAt(i) == ' '){
            char selectingChar = inputSB.charAt(i+1);
            char upperCaseChar = Character.toUpperCase(selectingChar);
            
            inputSB.setCharAt(i+1, upperCaseChar);
            }
            else if(i == 0){
            char selectingChar = inputSB.charAt(i);
            char upperCaseChar = Character.toUpperCase(selectingChar);
            
            inputSB.setCharAt(i, upperCaseChar);
            }
        }

        System.out.println(inputSB);
    }

    public static void main(String[] args){
        String sb = "hi, i am shreyansh.";
        firstLetterUpper(sb);
    }    
}
