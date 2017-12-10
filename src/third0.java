public class third0 {
    public static void main(String[] args) {

        int[] m1;
        m1 = new int[3];

        for(int i = 0; i < m1.length; i++) {
            int q = 8;
            m1[i] = m1[i] + q;
            q = q - 1;
            System.out.println(m1[i]);
        }

    }
}
