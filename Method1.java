package section3_ref;

public class Method1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        initStudent(s1, "이대호", 17 , "A", "체육");
//        s1.name = "이대호";
//        s1.age = 17;
//        s1.grade = "A";
//        s1.subject = "체육";

        Student s2 = new Student();
        initStudent(s2, "서건창", 16 , "D", "수학");
//        s2.name = "서건창";
//        s2.age = 16;
//        s2.grade = "D";
//        s2.subject = "수학";
//
        Student s3 = new Student();
        initStudent(s3, "강민호", 18 , "B", "과학");
//        s2.name = "서건창";
//        s2.age = 16;
//        s2.grade = "D";
//        s2.subject = "수학";

        printStudent(s1);
        printStudent(s2);
        printStudent(s3);
    }

    static void initStudent(Student student, String name, int age, String grade, String subject){
        student.name = name;
        student.age = age;
        student.grade = grade;
        student.subject = subject;
    }



    static void printStudent(Student s){
        System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade + " 과목: " + s.subject);
    }
}
