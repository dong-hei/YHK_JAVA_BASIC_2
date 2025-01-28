package section3_ref;


public class Method2 {
    public static void main(String[] args) {
        Student s1 = createStudent("이대호", 17, "A", "체육");
        Student s2 = createStudent("서건창", 16, "D", "수학");


        printStudent(s1);
        printStudent(s2);
    }

    static Student createStudent(String name, int age, String grade, String subject){
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.grade = grade;
        s.subject = subject;
        return s;
    }




    static void printStudent(Student s){
        System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade + " 과목: " + s.subject);
    }
}
