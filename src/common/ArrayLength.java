package common;

public class ArrayLength {
    public static void main(String[] args){
        String message = "Hello";
        /**
         * arr.length
         * arraylist.size()
         *
         * runtime error
         */
        for (int i = 0; i < message.length(); i++){
            System.out.print(message.charAt(i+1));
        }
    }
}
