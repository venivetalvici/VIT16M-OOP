import java.util.Arrays;

public class ReviewArray {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = firstArray;
        firstArray[0] = 1000;
        System.out.println(Arrays.toString(secondArray));
        System.out.println(firstArray);
        System.out.println(secondArray);
    }

}