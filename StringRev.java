package hackerRank;

import java.util.*;

public class StringRev {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();		
		String s;
		System.out.print("Enter the String to be reversed: ");
		s = sc.nextLine();
		
		char[] str = s.toCharArray();
		
		for(int i=str.length-1;i>=0; i--)
			sb.append(str[i]);

		System.out.println("Reverse string is: "+sb.toString());
	}

}
