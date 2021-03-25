package drawing;

/**

 *
 **
 ***
 ****

 Draw right triangle

*/

public class RightTriangle {

    public static void main(String[] args) {
        int height = 4;
        int base = 4;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < base; j++) {
                if(j <= i) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

}
