package hackerRank;

public class RepeatingNumber {

	public static void main(String[] args) {
		int sum=0, diff=0, ran=0;
		for(int i=1;i<=101;i++){
			if(i==101){
				ran = (int)(Math.random()*100);
				sum += ran;
				System.out.println("Random Number Generated is: "+ran);
			}	
			else
				sum += i;
		}
		System.out.println("Sum is: "+sum);
		diff = sum - (100*(100+1)/2);		// formula for addition of 1 to 100 numbers n(n+1)/2
		System.out.println("Repeating number is: "+diff);
	}

}
