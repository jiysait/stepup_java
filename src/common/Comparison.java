package common;

public class Comparison {
    public static void main(String[] args) {

        boolean b1 = true, b2 = false;
        int i1 = 1, i2 = 2;

        /**
         * '|' is bitwise OR (둘 중 하나라도 1 이면 결과는 1)
         * 1 = 0001, 2 = 0010 (in binary)
         * 0001 | 0010 = 0011
         * 0011 = 3
         */
        System.out.println("(i1 | i2) == 3 is " + ((( i1 | i2 ) == 3) ? "True" : "False"));
        /**
         * Compile Error
         * Operator '&&' cannot be applied to 'int', 'boolean'
         */
//        System.out.println("i2 && b1 is " + ((i2 && b1) ? "True" : "False"));
        /**
         * OR
         */
        System.out.println("b1 || !b2 is " + (( b1 || !b2 ) ? "True" : "False"));
        /**
         * '^' is bitwise XOR (둘 중 하나가 1이면 1, 모두 0 혹은 1으로 같으면 0)
         * 1 = 0001, 2 = 0010
         * 0001 ^ 0010 = 0011
         * 0011 = 3
         */
        System.out.println("(i1 ^ i2) < 4 is " + (( (i1 ^ i2) < 4 ) ? "True" : "False"));
    }
}
