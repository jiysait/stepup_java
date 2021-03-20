package common;

public class ReverseString {

    public static void main(String[] args){
        String str = "abc";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }

}
