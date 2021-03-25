package drawing;

/**

 ****
  ****
   ****
    ****

 Draw Rhombus star pattern
*/

public class Rhombus {

    public static void main(String[] args) {
        int height = 4;
        int width = 4;
        int grid = 7;

        for( int i = 0; i < height; i++ ) {
            for( int j = 0; j < grid; j++ ) {
                if (j < i || j >= width + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
