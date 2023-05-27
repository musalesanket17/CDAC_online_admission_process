package acts.cdac.in;

import java.util.Scanner;

/*
 * In NextRound we take it for students which students are not satisfied with first Allocation round ;  
 */
public class NextRound {

	private static Scanner sc = new Scanner(System.in);

	public static void CollageListWith2ndRound(int rank) throws InterruptedException {

		System.out.println("Congratulation you are able to take admission in following collages with " + "Your Rank : "
				+ rank + " Collage : ");
		System.out.println("We are Only give You Best Collage List based on your Rank : ");
		System.out.println("Please wait for some time we are analysing your data which you are submitted : ");

		Thread.sleep(5000);

		System.out.println("Thanks for your patience your allowcated collges are here !! ");

		if (rank <= 700) {
			System.out.println();
			System.out.println(" Sunbeam ");
			System.out.println();

		} else if (rank > 700 && rank <= 1300) {
			System.out.println();
			System.out.println("Sunbeam Karad");
			System.out.println("IACSD Pune ");
			System.out.println();

		} else if (rank > 1000 && rank <= 1500) {
			System.out.println();
			System.out.println("Vita");
			System.out.println("CDAC Kharghar");
			System.out.println();

		} else if (rank > 1300 && rank <= 1800) {
			System.out.println();
			System.out.println("Vita");
			System.out.println("CDAC Kharghar");
			System.out.println();

		} else if (rank > 1800 && rank <= 2500) {
			System.out.println();
			System.out.println("CDAC Juhu");
			System.out.println("KNOW IT");
			System.out.println();

		} else if (rank > 2500 && rank <= 3000) {
			System.out.println();
			System.out.println("IET Pune");
			System.out.println();

		} else if (rank > 3000 && rank <= 3500) {
			System.out.println();
			System.out.println("MET IIT Nashik");
			System.out.println("Baguluru");
		} else if (rank > 3500 && rank <= 4000) {
			System.out.println();
			System.out.println("Kochi CDAC");
			System.out.println("Bytes SoftTech");
			System.out.println();

		} else if (rank > 4000 && rank <= 4500) {
			System.out.println();
			System.out.println("Chennai CDAC ");
			System.out.println("hydrabad CDAC");
			System.out.println();

		} else if (rank > 4500 && rank < 5000) {
			System.out.println("Noida CDAC");
			System.out.println();
		} else {
			System.out.println("Please Try Next Time !! ");
		}

		/*
		 * Here we take student choice if they want to go in further admission process;
		 */
		System.out.println("Please enter your choice ");
		StudentList.collegeName = sc.nextLine();

	}

}
