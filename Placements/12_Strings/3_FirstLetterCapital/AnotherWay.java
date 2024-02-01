public class AnotherWay {
    public static String firstLetterUpper(String inputstr){
        StringBuilder sb = new StringBuilder("");
        
        sb.append(Character.toUpperCase(inputstr.charAt(0)));

        for(int i = 1; i < inputstr.length(); i++){
            if(inputstr.charAt(i) == ' ' && i < inputstr.length()-1){
                sb.append(inputstr.charAt(i));
                i++;
                sb.append(Character.toUpperCase(inputstr.charAt(i)));
            }
            else{
                sb.append(inputstr.charAt(i));
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args){
        String str = "hi, i am shreyansh";

        System.out.println(firstLetterUpper(str));
    }    
}
