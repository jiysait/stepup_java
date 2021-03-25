package drawing;

/**

    *
   * *
  *   *
 *******

 Draw hollow pyramid

*/

public class HollowPyramid {

    public static void main(String[] args) {
        int height = 4;
        int base = 7;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < base; j++) {
                if(i < height - 1) {
                    if(j == height - i - 1 || j == (base - 1) - (height - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

}
