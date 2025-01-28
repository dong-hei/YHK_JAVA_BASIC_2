package section3_ref;

public class VarChanger2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.val = 10;
        Data dataB = dataA;

        System.out.println("data A 참조값 = " + dataA);
        System.out.println("data B 참조값 = " + dataB);
        System.out.println("dataA.val = " + dataA.val);
        System.out.println("dataB.val = " + dataB.val);

        //dataA 변경
        dataA.val = 20;
        System.out.println("변경 val = 20");
        System.out.println("dataA.val = " + dataA.val);
        System.out.println("dataB.val = " + dataB.val);

        //dataB 변경
        dataB.val = 30;
        System.out.println("변경 val = 30");
        System.out.println("dataA.val = " + dataA.val);
        System.out.println("dataB.val = " + dataB.val);


    }
}
