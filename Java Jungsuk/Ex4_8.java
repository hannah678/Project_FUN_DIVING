public class Ex4_8 {
    public static void main(String[] args) {
        for (int a = 1; a <= 3; a++) // for(초기화; 조건식; 증감식){}  // 1, 2, 3 (3번 반복)
        System.out.println("Hello!");

        for (int x = 1; x <=10; x=x*2) // 1, 2, 4, 8 (4번 반복)
        System.out.println("Hello?");

        for(int i=1, j=5; i <= 10; i++, j--) // 변수 여러 개 가능
        System.out.println("i=" + i + ", j=" + j);
    }
    
}
