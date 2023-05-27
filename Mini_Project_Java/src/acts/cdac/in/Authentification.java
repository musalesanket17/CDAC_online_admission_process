package acts.cdac.in;

import java.util.Scanner;

/*
 * In Authentification class we do Authentification first then from here ;
 */
public class Authentification extends StudentList {
	private static Scanner sc = new Scanner(System.in);
	/*
	 * In Boolean field we are flag out last statement ; It help us to print our
	 * last result ;
	 */
	private static boolean flag;

	public static boolean isFlag() {
		return flag;
	}

	public static void setFlag(boolean flag) {
		Authentification.flag = flag;
	}

	/*
	 * This AuthtificationForFurtherProcess do Authentification for Further process;
	 */
	public static void AuthtificationForFurtherProcess(int registrationNo) {
		for (Studentclass el : student) {
			if (el.getRegistrationNumber() == registrationNo) {
				setFlag(true);

				try {
					System.out.println("Please Enter Your Rank : ");
					StudentList.CollageListWithAdmission(sc.nextInt());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				setFlag(false);

			}

		}
		printflag();
	}

	/*
	 * This AuthtificationForFurtherProcess do Authentification for Fee Process;
	 */
	public static void AuthtificationForFee(int registrationNo) {
		for (Studentclass el : student) {

			if (el.getRegistrationNumber() == registrationNo) {
				setFlag(true);

				try {

					TakeFee.TakeStudentFee();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				setFlag(false);

			}

		}
		printflag();
	}

	/*
	 * This AuthtificationForFurtherProcess do Authentification for go to next Round
	 * ;
	 */
	public static void AuthtificationForNextRound(int registrationNo) {
		for (Studentclass el : student) {

			if (el.getRegistrationNumber() == registrationNo) {
				setFlag(true);
				try {
					System.out.println("Please Enter your Rank Here : ");
					NextRound.CollageListWith2ndRound(sc.nextInt());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				setFlag(false);

			}

		}
		printflag();
	}

	/*
	 * This printflag will give us last result this perticular registration number
	 * is Auth or Not ;
	 */

	public static void printflag() {

		if (isFlag()) {

		} else {
			System.out.println("Please Register yourself first then move towords further process :) ");
		}
	}

}
