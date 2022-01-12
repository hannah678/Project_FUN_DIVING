public class Ex5_2_1 { // (Q)배열의 총합과 평균 구하기
    public static void main(String[] args) {
        int sum = 0;         // 총점을 저장하는 변수
        float average = 0f;  // 평균을 저장하는 변수 

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0; i < score.length; i++) {
            sum += score[i]; //sum=sum+score[i] // sum=0+100=100  //  sum=100+88 // sum=100+88+100...
        }

        average = (float)sum/score.length;  // sum과 score.length가 모두 int값이므로 아무거나 하나를 float로 변환
        // 변환하지 않을 시 소수점 아래는 버림

        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
    }
    
}
