public class five0 {
    public static void main(String[] args) {

        Student student1 = new Student("student1", 18);
        Student student2 = new Student("student2", 19);
        Student student3 = new Student(); //1

        System.out.println(student1.name + " " + student1.age);
        System.out.println(student2.name + " " + student2.age);
        System.out.println(student3.name + " " + student3.age);
    }

    public static class Student {
        String name; //2
        int age;
        Student() {   //3
            this.name = "no name specified";
            this.age = 0;
        }
        Student (String name, int age) { //4
            this.name = name;
            this.age = age;
        }
    }
}
