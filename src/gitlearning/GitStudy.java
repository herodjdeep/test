package gitlearning;

import java.util.Scanner;

public class GitStudy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mood details as happy or sad");
		String mood= s.next();
		if(mood.contentEquals("happy")) {
		System.out.println("Learning Git Throughly");
	}
		else if(mood.contentEquals("sad")) {
			System.out.println("I am sad will learn git another day");
			System.out.println("MC");
		}
		else {
<<<<<<< HEAD
			System.out.println("You have entered wrong input, rerun the application");
=======
			System.out.println("sleep");
>>>>>>> parent of 4358c79 (modified the git msg)
		}
	}

}
