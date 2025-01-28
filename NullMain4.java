package section3_ref;

/**
 * NPE 관련 내용
 */

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.cnt = " + bigData.cnt);
        System.out.println("bigData.data = " + bigData.data);

        //참조할 값을 주면 NPE를 해결할 수 있다.
        System.out.println("bigData.data.val" + bigData.data.val);
    }
}
