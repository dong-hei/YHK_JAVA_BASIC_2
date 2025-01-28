package section3_ref;

/**
 * 즉 기본형을 메소드로 데이터를 전달하면 값이 복사된다. 
 * 이때 파람 값을 변경하면 호출자의 변수 값에는 영향이 없다.
 */

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);
        changePrimitive(a); // 자바는 int x = a 로 해석한다.
        System.out.println("메소드 호출 후: a = " + a);
        //자바는 항상 값을 복사해서 대입하기에 10
    }

    static void changePrimitive(int x){
        x = 20;
    }
}
