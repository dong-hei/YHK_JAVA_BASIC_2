package section3_ref;

public class VarChanger1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b 변경, int b = a; 각각 본인의 값만 변경되는 것을 확인할 수 있다.
        b = 30;
        System.out.println("변경 b = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
