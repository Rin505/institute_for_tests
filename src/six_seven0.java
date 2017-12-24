public class six_seven0 {
    public static void main(String[] args) {
        String name = "Yoku";

        Student yoku = new Student();
        yoku.setName(name);
        yoku.setAge(18);

        System.out.println(yoku.getName());
        System.out.println(yoku.getAge());
    }

    public static class Student {
        private String name;
        private int age;

        String getName () {
            return name;
        }
        void setName(String name) {
            this.name = name;
        }


        int getAge() {
            return age;
        }
        void setAge (int age) {
            this.age = age;
        }
    }

}
