public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
         //double shortPi = Math.round(pi * 1000)/1000.0;

        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000)/1000); //3
        System.out.println(Math.round(pi*1000)/1000.0); //3.142 //Math.round()는 소수 첫째자리를 반올림한 정수가 됨

        //System.out.println(shortPi); //변수를 사용해서 4줄을 2줄로 간략하게 코딩하기

        System.out.println((int)(pi*1000)/1000.0); //3.141(소수점 버리기)
    }
    
}
