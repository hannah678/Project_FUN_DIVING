public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0'); // 문자열3("3")을 문자3('3')으로 변환 후 문자를 숫자로 변환(-'0') //3

        System.out.println('3'-'0' +1); // 문자3에서 문자를 빼고 1더함 // 4
        System.out.println(Integer.parseInt("3") + 1); //문자열3을 숫자3으로 변환 후 숫자1 더함 // 4
        System.out.println("3" + 1); //@_@ 문자열3과 문자열1(앞에 문자열이 있어서 자동 변환)을 더함 // 31
        System.out.println(3 + '0'); // '0'은 숫자로 48이다. //51
        System.out.println((char)(3 + '0')); // char = 형변환 // 문자3
    }
    
}
