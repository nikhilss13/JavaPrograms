package hackerRank;
import java.util.*;

	public class ArrayDuplicate {
	private static Scanner sc;
	static int totalCount = 0;
	
		public static void main(String[] args) {
			int n, num;
			sc = new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			n =sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				System.out.print("Enter the element at position "+i+": ");
				num = sc.nextInt();
	//			while(num>n){
	//				System.out.print("Reenter the element at position "+i+": ");
	//				num = sc.nextInt();
	//			}
					a[i]=num;
			}
			System.out.print("Elements in array are: ");
			for(int i=0;i<a.length;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			duplicate(a);
			System.out.println("There are "+totalCount+" repeated numbers:");
		}
		
		public static void duplicate(int[] a){
			int j = 0,count, recount, temp;
			for(int i=0; i<a.length;i++){
				count = 0;
				recount = 0;
				j=i+1;
				while(j<a.length){
					if(a[i]==a[j])
						count++;
					j++;
				}
				if(count>0){
					temp = a[i];
					for(int x=0;x<i;x++){
						if(a[x]==temp)
							recount++;
					}
					if(recount==0){
	//					System.out.println("Element "+a[i]+" is repeated "+count+" times in an array");					
						totalCount++;
						System.out.println(+a[i]+" : "+count+" times");
					}	
				}
					
			}
		}
	
	}
