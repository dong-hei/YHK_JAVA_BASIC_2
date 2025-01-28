package section3_ref;

/**
 * 즉 참조형을 메소드로 데이터를 전달하면 참조 값이 복사된다.
 * 이때 파람 값을 변경하면 호출자의 변수 값에도 변경된다.
 */
public class MethodChange2 {

    public static void main(String[] args) {
        Data dA = new Data();
        dA.val = 10;
        System.out.println("호출 전 : dA.val = " + dA.val);

        changeRef(dA);
        System.out.println("호출 후 : dA.val = " + dA.val);
        // A와 X 모두 같은 참조값을 참조하고있기 때문에 둘다 20이 된다.
    }

    static void changeRef(Data dataX){
        dataX.val = 20;
    }
}
