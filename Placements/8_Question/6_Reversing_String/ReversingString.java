public class ReversingString{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() -1 -i;

            char charAtFront = sb.charAt(front);
            char charAtBack = sb.charAt(back);

            sb.setCharAt(front, charAtBack);
            sb.setCharAt(back, charAtFront);
        }
        System.out.println(sb);
    }
}