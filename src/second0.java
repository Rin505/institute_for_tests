public class second0 {
    public static void main(String[] args) {
        System.out.println(power(3, 12));
    }
    static int power (int a , int b) {
        int result = a;
        for(int i = 1; i < b; i++)
            result = result * a;
        return result;
    }
}
