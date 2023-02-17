public class TestStudent
{
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setName("Doggy");
        s1.setStudentNumber(1000);
        s1.setGpa(3.8);
        System.out.println(s1.getName());
        System.out.println(s1.getStudentNumber());
        System.out.println(s1.getGpa());
        System.out.println();
        Student s2 = new Student("Anne", -1111, 4.0);
        System.out.println(s2.getName());
        System.out.println(s2.getStudentNumber());
        System.out.println(s2.getGpa());
    }
}
//IDEA: Name, StudentNumber -> constructor / Gpa -> setter injection