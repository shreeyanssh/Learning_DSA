public class Permutation {
    public static void permutation(String str,String newStr){
        //Base Case
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        //Recursion
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);  //current char

            String newString = str.substring(0, i) 
            + str.substring(i+1);

            permutation(newString, newStr + curr);
        }

    }
    public static void main(String[] args){
        String str = "abc";
        permutation(str,"");
    }    
}
