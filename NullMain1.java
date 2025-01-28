package section3_ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data d = null;
        System.out.println("1. data = " + d); // d 변수에 가리키는 객체가 없다

        d = new Data();
        System.out.println("2. data = " + d); // d 변수가 참조할 객체가 존재

        d = null;
        System.out.println("3. data = " + d); // d 변수는 Date() 인스턴스를 더는 참조 하지않는다.
        //참고로 참조하지 않게된 이런 인스턴스는 JVM의 가비지 컬렉션이 자동으로 메모리에서 제거한다.
    }
}
