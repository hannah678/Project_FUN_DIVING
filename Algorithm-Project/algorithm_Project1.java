import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_Project1 {
		
		//swap메서드
		public static void swap(int a[],int idx1, int idx2) {
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
		}
		
		//내림차순 퀵정렬(QuickSort)
		public static void myQuick(int a[], int left, int right) {
			int pivot = a[(left+right)/2];
			
			do {
				while(a[left]>pivot) left++; 
				while(a[right]<pivot) right--;
				
				if(left<=right) { 
					swap(a,left++,right--);
				}
			}while(left <= right);
			if(left < right) {
				myQuick(a, left, right);
			}
			if(left < right) {
				myQuick(a, left, right);
			}
		}
	 
	public static void main(String[] args) throws IOException {
		//입력
		System.out.print("학생 수 입력 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		System.out.println();
		for(int i=0; i<N; i++) {
			System.out.printf("학생 %d 점수 입력 : ",(i+1));
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//퀵정렬 메소드 호출
		myQuick(arr, 0, arr.length - 1);
		
		
		//출력
		System.out.println();
		System.out.println("성적 순으로 정렬");
		for(int i=0; i<N; i++) {
			System.out.println((i+1)+"등 : "+arr[i]);
		}
	}

}
