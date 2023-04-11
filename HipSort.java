import java.util.Arrays;

public class HipSort {

    public static void main(String[] args) {
        int[] array = new int[]{11, 2, 5, 8, 1, 7, 2, 13, 6, 10, 5, 15, 33, 11};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            subroutin(array, array.length, i);
        }
            for (int i = array.length - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            subroutin(array, i, 0);
        }
    }

    private static void subroutin(int[] array, int hipSize, int rootIndex) {
        int greatest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = leftChild + 1; //2 * rootIndex + 2;

        if (leftChild < hipSize && array[leftChild] > array[greatest]) {
            greatest = leftChild;
        }
        if (rightChild < hipSize && array[rightChild] > array[greatest]) {
            greatest = rightChild;
        }
        if (greatest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[greatest];
            array[greatest] = temp;

            subroutin(array, hipSize, greatest);
        }
    }
}