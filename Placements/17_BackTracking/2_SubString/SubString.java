public class SubString {
    public static void findSubString(String str, String newStr, int i){
        //base case
        if(i == str.length()){
            if(newStr.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(newStr);
            }
            return;
        }
        //recursion
        findSubString(str, newStr+str.charAt(i), i+1); //Yes case
        findSubString(str, newStr, i+1);  //No case
    }
    public static void main(String[] args){
        String str = "abc";
        findSubString(str,"", 0);
    }    
}
