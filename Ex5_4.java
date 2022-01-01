// (Q) 섞기 shuffle

import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < 1000; i++) {  // 섞을 횟수는 맘대로 설정(100회)
            int n = (int)(Math.random()*10); // 0 <= x < 10 의 난수(정수 변환0~9 > 배열 인덱스 값으로 설정)
            int tmp = numArr[0];    // 바꿀 때 배열 값을 잃지 않기 위해 도움변수 추가 tmp // tmp=0
            numArr[0] = numArr[n];  // 배열 값을 서로 바꾸기 // numArr[0] = 0~9 사이의 난수
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));


    }
    
}
