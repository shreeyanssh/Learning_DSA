public class PrimitiveType{
    public static void main(String[] args){
        byte myByte = 12;
        short myShort = 12232;
        int myInt = 1231241241;

        long myLong = (long)(10000L + 10L*(myByte + myInt + myShort));
        System.out.println(myLong);
    }
}