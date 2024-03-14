public class Arrayexception {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 7;

        try {
            for (int i = 0; i < a.length; i++) {
                if (i == b) {
                    int value = a[i];
                    System.out.println("Value at index " + i + ": " + value);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e);
        }
    }
}
