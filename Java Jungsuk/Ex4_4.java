import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) { //90미만인 값만 들어오기 때문에 (80<= score && score < 90) 필요없음
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }
        // else {
         //   grade = 'F';
          //  }  //else 블럭은 생략 가능. 코드를 간결하게 하기

        System.out.println("당신의 학점은" + grade + "입니다.");

        scanner.close();

    }
}