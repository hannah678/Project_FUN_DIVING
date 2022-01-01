import java.util.Arrays;


public class Ex5_2 {

    public static void main(String[] args) {
        int[] iArr1 = new int[10]; // 배열의 길이 설정
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60}; // 배열 내용 설정
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i=0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열
        }
        for(int i=0; i < iArr1.length; i++) {
            System.out.println(iArr1[i]+",");
        }
        System.out.println(); // 배열에 저장된 값을 출력한다.



        for (int i=0; i < iArr2.length ; i++) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 난수를 배열
        }

        System.out.println(Arrays.toString(iArr2)); // Arrays import
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // 출력 불가
        System.out.println(chArr); // 출력 가능


        


    }
}
