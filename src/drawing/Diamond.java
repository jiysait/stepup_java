package drawing;

/**

   *
  ***
 *****
  ***
   *

 Draw Diamond

 */
public class Diamond {

    public static void main(String[] args) {
        int height = 11; // 5
        int width = 11; // 5
        int mid_h = height / 2;
        int mid_w = width / 2;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i < mid_h) {
                    // upper half
                    if(j >= mid_w - i && j <= mid_w + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if(i > mid_h) {
                    // lower half
                    if(j >= mid_w - ((height - 1) - i) && j <= mid_w + ((height - 1) - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // middle line
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

}
