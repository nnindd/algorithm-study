import java.util.Arrays;
import java.util.Scanner;

public class Main_11399_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int sub_num=0;
		for(int i=0;i<N;i++) {
			sub_num+=arr[i];
			arr[i]=sub_num;
		}
		int sum=0;
		for(int a : arr) {
			sum+=a;
		}
		System.out.println(sum);
		
	}
}
