public class Ex4_7 {
    public static void main(String[] args) {

        // 괄호 {} 안의 내용을 i번 반복한다.
        // (Q)  1~10 사이의 난수를 20개 출력하시오 

        for (int i = 1; i <= 20; i++) {

            // System.out.println((int)Math.random()*10+1); 괄호 안 치면  형 변환 먼저 한 후(0) 연산되어 다1 나옴
            System.out.println((int)(Math.random()*10)+1);
        }
    }
    
}
