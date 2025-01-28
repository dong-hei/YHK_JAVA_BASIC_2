package section3_ref;

/**
 * NPE 관련 내용
 */

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.cnt = " + bigData.cnt); // int 초기값 null
        System.out.println("bigData.data = " + bigData.data); // 참조형 초기값 null

        //bigdata.data => Null => Null의 val을 찾으려고하니 => 참조할 곳이 없어 NPE 오류 발생!
        System.out.println("bigData.data.val" + bigData.data.val);
    }
}
