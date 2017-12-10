public class second2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            check(i);
        }
    }
    static void check(int number) {
        if (number %2 == 0) {
            System.out.println(number);
        }
    }
}
