import java.util.Arrays;

public class Ex5_6 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int 배열 // length 지정은 안 해도 됨 // 순서대로 [0]~[4]
        // System.out.println(iArr); // 산출 오류남

        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); // 문자는 오류 안 남

        for(int i=0; i < iArr.length; i++) {
            System.out.println(iArr[i]); // for사용하는 방식
        }

        System.out.println(iArr[0]); // 하나씩 입력하는 방식
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
        System.out.println(iArr[3]);
        System.out.println(iArr[4]);

        System.out.println(Arrays.toString(iArr)); // Arrays import 방식 Alt + shift + o 로 자동추가
        // [100, 95, 80, 70, 60]
    }
    
}
