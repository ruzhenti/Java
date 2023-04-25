import java.util.Arrays;

public class DZ1 {
    public static void main(String[] args) {
        int [] d = new int [] {3,8,9,5};
        int [] f = new int [] {3,3,3,4};

        System.out.println("\n1. Разность элементов массивов:");
        System.out.println(Arrays.toString(ArrayDifference(d, f)));

        System.out.println("\n2. Массив, каждый элемент которого равен частному элементов двух входящих массивов");
        System.out.println(Arrays.toString(QuotientOfElementArray(d, f)));
    }
 
    public static int[] ArrayDifference(int[] a, int[] b) {
        try {
				int clen = Math.max(a.length, b.length);
            
                int[] c = new int[clen];
                for (int i = 0; i < c.length; i++) {
                    c[i] = a[i] - b[i];
                }
                return c;
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массивы разной длины!!!");
        }
        return null;
    }

    public static float[] QuotientOfElementArray(int[] a, int[] b) {
        try{
            int clen = Math.max(a.length, b.length);

            float[] c = new float[clen];
                for (int i = 0; i < c.length; i++) {
                    c[i] = a[i] / b[i];
                }
            return c;
        }
        catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("RuntimeException");
        }
        return null;
    }
}