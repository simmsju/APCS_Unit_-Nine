public class Polymorphism {

    public static void main(String[] args) {
        Person p;
        Student s;

        Person p1 = new Person("Helen");
        Student s1 = new Student("John");
        Person poly = new Student("Polly");

        System.out.println(p1 instanceof Student);
        System.out.println(s1 instanceof Student);
        System.out.println(poly instanceof Student);
    }

}
