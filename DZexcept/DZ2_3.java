public class DZ2_3 {
    

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } 
        //catch (Exception ex) {
        //    System.out.println("Указатель не может указывать на null!");  // нет файла
        //}
        // catch (IndexOutOfBoundsException ex) {    // уже перехвачен ..catch (Throwable ex) {..
        //    System.out.println("Массив выходит за пределы своего размера!");
        //}
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
 