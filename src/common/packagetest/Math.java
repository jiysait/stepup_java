package common.packagetest;

public class Math {
    public static int abs(int num){
        System.out.println("depth = 1");
        return num < 0 ? -num : num;
    }
}
