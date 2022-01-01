//(Q)2D Table

public class Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}, //score[0]
				{20, 20, 20},    //score[1]
				{30, 30, 30},    //score[2]
				{40, 40, 40}     //score[3] 
		};
		
		int sum = 0;
		for(int i=0; i < score.length; i++) {  //print score[i][j] by using 2 for loops
			
			for (int j=0; j < score[i].length; j++) { 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum=" + sum);
	}
}
