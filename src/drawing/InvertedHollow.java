package drawing;

/**

 *******
  *   *
   * *
    *
 Draw Inverted Hollow Pyramid Star Pattern

 */

public class InvertedHollow {
    public static void main(String[] args) {
        int width = 7;
        int height = 4;

        for( int i = 0; i < height; i++ ) {
            for( int j = 0; j < width; j++ ) {
                if (i > 0) {
                    if(j == i || j == width - i - 1 ) {
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
