public class Ex5_3 { // (Q)배열 중 최대값과 최소값 찾기
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0]; // max, min 값을 score[0]으로 초기화

        for(int i=1; i < score.length; i++) {  // 배열의 두 번째 요소부터 읽기 위해서 변수i의 값을 1로 초기화
            if(max < score[i]){           // 비교해서 크면 max에 저장
                max = score[i];
            } else if (min > score[i]) {  // 비교해서 작으면 max에 저장 
                min = score[i];
            } // else 생략
        }

        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);

    }
    
}
