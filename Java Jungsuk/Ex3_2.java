public class Ex3_2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j=i++; // 후위형 > ++ 나중에
        // j=i;, i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" +j);

        i=5; // 비교를 위해 다시 초기화
        j=0;

        j = ++i; // 전위형 > ++ 먼저
        // ++i;, j=i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" +j);
    }
    
}
