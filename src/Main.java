public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int array1[] = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            //array1[i] = i + 1;
            System.out.println(array1[i]);
        }
        float array2[] = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        char array3[] = new char[5];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (char) (i+65);
            System.out.println(array3[i]);
        }
    }
}