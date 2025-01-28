package section3_ref;

/**
 * 참조값 없이 객체를 찾아가면 발생하는 NPE 에러
 * 말그대로 null에 포인트를 찍었을때 나타난다
 */

public class NullMain2 {
    public static void main(String[] args) {
        Data d = null;
        d.val = 10;
        System.out.println(" data = " + d.val);
    }
}
