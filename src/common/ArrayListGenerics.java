package common;

import java.util.ArrayList;

public class ArrayListGenerics {
    public static void main(String[] args) {
        /**
         * without generics
         * Member Type WARNING (NO ANY ERROR such as compile time or runtime)
         * This is because String and Integer are also 'Object'
         */
        ArrayList aList = new ArrayList();
        aList.add("hello");
        aList.add(2);
        System.out.println(aList.get(0));
        System.out.println(aList.get(1));
    }
}
