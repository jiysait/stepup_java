package common;

public class RuntimeErrorTest {
    public static void main(String[] args) {
        String message = "Hello world!";
        /**
         * message is a reference of string which means it is treated as an array of char
         * Once process below tries to access out of bound of an array, it throws exception
         */
        String newMessage = message.substring(6, 12) + message.substring(12, 6);
        System.out.println(newMessage);
    }
}
