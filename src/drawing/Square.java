package drawing;

/**

 ****
 ****
 ****
 ****

 Draw square star pattern

*/

public class Square {

    public static void main(String[] args) {
        int width = 4;
        int height = 4;

        for( int i = 0; i < height; i++ ) {
            for( int j = 0; j < width; j++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
