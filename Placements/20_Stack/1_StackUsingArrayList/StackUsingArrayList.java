import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int n){
            list.add(n);   // Adds the data in the end i.e. top of Stack
        }

        public static int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            return list.get(list.size() - 1);
        }
    }


    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

    }
}
