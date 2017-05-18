package vMware;

import java.util.Scanner;

public class BinaryAdd {
	
	static Scanner sc; 

	//The java code is as
	static String binaryAdd(String a, String b){
		int len = 0;
		int size = 0;
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		char[] max;
		
		
		if(c1.length > c2.length){
			len = c2.length;
			size = c1.length;
			max = c1;
		}		
		else
		{
			len = c1.length;
			size = c2.length;
			max = c2;
		}
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int p = c1.length - 1;
		int q = c2.length - 1;
		
		for(int i=len-1; i>=0; i--){
			if(c1[p] == '0' && c2[q] == '0'){
				if(carry == 0){
					sb.append(0);
					carry = 0;
				}	
				else{
					sb.append(1);
					carry = 0;
				}	
			}
			if((c1[p] == '0' && c2[q] == '1') || (c1[p] == '1' && c2[q] == '0')){
				if(carry == 0){
					sb.append(1);
					carry = 0;
				}	
				else{
					sb.append(0);
					carry = 1;
				}					
			}
			if((c1[p] == '1' && c2[q] == '1')){
				if(carry == 0){
					sb.append(0);
					carry = 1;
				}	
				else{
					sb.append(1);
					carry = 1;
				}
			}
			p--;
			q--;
		}
		
		for(int j = size-len-1; j>=0; j--){
			if(max[j] == '0'){ 
				if(carry == 0){		
					sb.append(0);
					carry = 0;
				}	
				else{
					sb.append(1);
					carry = 0;
				}	
			}
			if(max[j] == '1'){
				if(carry == 0){		
					sb.append(1);
					carry = 0;
				}	
				else{
					sb.append(0);
					carry = 1;
				}	
			}			
		}
		if(carry == 1)
			sb.append(1);	
		return sb.reverse().toString();
	}
	
	
	public static void main(String[] args){
				
		String a, b;
		sc = new Scanner(System.in);
		System.out.print("Enter the 1st binary string: ");
		a = sc.nextLine();
		System.out.print("Enter the 2nd binary string: ");
		b = sc.nextLine();
	
		System.out.println(binaryAdd(a,b));
	}
}
