package acts.cdac.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
	/*
	 * Here we contain Arraylist of student ;
	 */
	static List<Studentclass> student = new ArrayList<>();
	/*
	 * Here we contain list of all college;
	 */
	static String[] collegeList = new String[15];
	static String collegeName;
	private static boolean flag1 = false;
	private static Scanner sc = new Scanner(System.in);

	public static void AddCollegeList() {

		collegeList[0] = "CDAC Juhu";
		collegeList[1] = "CDAC Kharghar";
		collegeList[2] = "Vita";
		collegeList[3] = "Sunbeam";
		collegeList[4] = "Sunbeam Karad";
		collegeList[5] = "IACSD";
		collegeList[6] = "KNOW IT";
		collegeList[7] = "IET Pune";
		collegeList[8] = "Kochi CDAC";
		collegeList[9] = "Baguluru";
		collegeList[10] = "MET IIT Nashik";
		collegeList[11] = "Bytes SoftTech";
		collegeList[12] = "Noida CDAC";
		collegeList[13] = "Chennai CDAC ";
		collegeList[14] = "hydrabad CDAC";

		for (String el : collegeList)
			System.out.println("        "+el);
//		 System.out.println();

	}

	/*
	 * In AddStudentIntoArrayList we add new instance in Arraylist;
	 */
	public static void AddStudentIntoArrayList(Studentclass s) {
		
        for(Studentclass el :student ) {
//        	System.out.println(el.getRegistrationNumber());
//        	System.out.println(s.getRegistrationNumber());
//        	System.out.println(student.size());

        	if(el.getRegistrationNumber() == s.getRegistrationNumber()) {
        		StudentList.setFlag1(true);

        	}
        	else {
        		StudentList.setFlag1(false);

        	}
        }
        
        if(StudentList.isFlag1()) {
     		System.out.println(" You have already registered in our data ");

        }
        else {
         		StudentList.student.add(s);
        }
		

	}

	public static  boolean isFlag1() {
		return flag1;
	}

	public static void setFlag1(boolean flag1) {
		flag1 = flag1;
	}

	/*
	 * in CollageListWithRank we find best college prediction with help of your rank
	 * ;
	 */
	public static void CollageListWithRank(int rank) {
		System.out.println("We are Only give You Best Collage List based on your Rank : ");
		System.out.println("Congratulation you are able to take admission in following collges with our prediction "
				+ "Your Rank : " + rank );
		System.out.println("Collage : ");
		System.out.println();
		System.out.println();

		if (rank <= 500)
			System.out.println(" Sunbeam ");
		else if (rank > 500 && rank <= 1000) {
			System.out.println("Sunbeam Karad");
			System.out.println("IACSD Pune ");
		} else if (rank > 1000 && rank <= 1500) {
			System.out.println("Vita");
			System.out.println("CDAC Kharghar");
		} else if (rank > 1000 && rank <= 1500) {
			System.out.println("Vita");
			System.out.println("CDAC Kharghar");
		} else if (rank > 1500 && rank <= 2000) {
			System.out.println("CDAC Juhu");
			System.out.println("KNOW IT");
		} else if (rank > 2000 && rank <= 2500) {
			System.out.println("IET Pune");
		} else if (rank > 2500 && rank <= 2800) {
			System.out.println("MET IIT Nashik");
			System.out.println("Baguluru");
		} else if (rank > 2800 && rank <= 3200) {
			System.out.println("Kochi CDAC");
			System.out.println("Bytes SoftTech");

		} else if (rank > 3200 && rank <= 4000) {
			System.out.println("Chennai CDAC ");
			System.out.println("hydrabad CDAC");
		} else if (rank > 4000 && rank < 5000)
			System.out.println("Noida CDAC");
		else
			System.out.println("Please Try Next Time !! ");

	}

	/*
	 * In PrintAllStudentList we print Student list which we already have in sorting
	 * manner based on Their Ranks ;
	 */
	public static void PrintAllStudentList(String str, int password) {
		if (str.equals("Admin") && password == 1234) {
			if (!student.isEmpty()) {
				student.sort(null);
				student.forEach(el -> System.out.println(el.toString()));
			} else {
				System.out.println("We does not conatain any data Please add data first !! ");
			}
		} else {
			System.out.println(
					"We found you are not from Admin department so you are not able to aceess the student list");
		}
	}

	/*
	 * in CollageListWithRank we find best college with help of your rank for
	 * admission purpose ;
	 */
	public static void CollageListWithAdmission(int rank) throws InterruptedException {

		System.out.println("Congratulation you are able to tank admission in following collages with " + "Your Rank : "
				+ rank + " Collage :");
		System.out.println("We are Only give You Best Collage List based on your Rank : ");
		System.out.println("Please wait for some time we are analysing your data which you are submitted : ");

		Thread.sleep(5000);

		System.out.println("Thanks for your patience your allowcated collges are here !! ");

		if (rank <= 500)
			System.out.println(" Sunbeam ");
		else if (rank > 500 && rank <= 1000) {
			System.out.println();
			System.out.println("Sunbeam Karad");
			System.out.println("IACSD Pune ");
			System.out.println();
		} else if (rank > 1000 && rank <= 1500) {
			System.out.println();
			System.out.println("Vita");
			System.out.println("CDAC Kharghar");
			System.out.println();

		} else if (rank > 1500 && rank <= 2000) {
			System.out.println();

			System.out.println("CDAC Juhu");
			System.out.println("KNOW IT");
			System.out.println();

		} else if (rank > 2000 && rank <= 2500) {
			System.out.println();

			System.out.println("IET Pune");
			System.out.println();

		} else if (rank > 2500 && rank <= 3000) {
			System.out.println();

			System.out.println("MET IIT Nashik");
			System.out.println("Baguluru");
			System.out.println();

		} else if (rank > 3000 && rank <= 3500) {
			System.out.println("Kochi CDAC");
			System.out.println("Bytes SoftTech");
			System.out.println();

		} else if (rank > 3500 && rank <= 4000) {
			System.out.println();

			System.out.println("Chennai CDAC ");
			System.out.println("hydrabad CDAC");
			System.out.println();

		} else {
			System.out.println();
			System.out.println("Noida CDAC");
			System.out.println();
		}

		System.out.println("Please enter your choice ");
		collegeName = sc.nextLine();

	}

}
