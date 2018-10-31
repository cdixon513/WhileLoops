import java.util.Scanner;

public class WhileLoops{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n, count;
    System.out.print("Enter a number: ");
    n = scanner.nextInt();
    count = 0;

    while(Math.pow(count, 2) < n){
      System.out.println(Math.pow(count, 2));
      count ++;
    }

    System.out.println();
    count = 0;
    while(count*10 < n){
		System.out.println(count*10);
		count ++;
	}

	System.out.println();
	    count = 0;
	    while(Math.pow(2, count) < n){
			System.out.println(Math.pow(2, count));
			count ++;
	}
  }
}