import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int second = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>second && arr[i]!=max) {
				second = arr[i];
			}
		}
		
		System.out.println(second);
	}
}
