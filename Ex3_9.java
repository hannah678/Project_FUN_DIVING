public class Ex3_9 {
    public static void main (String[] args) {
        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        //long c = a * b; //int를 long으로 자동변환 가능한가? 불가능(음수가 나옴. 오버플로우. int*int=int)
        
        long c = (long)a * (long)b; // 둘 중 하나만 long으로 변환하면 나머지는 자동 변환

        System.out.println(c);
    }
    
}
