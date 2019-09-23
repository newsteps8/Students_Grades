import java.util.Scanner;

public class Pro5_1_150116027 {
      //BÜÞRA GÖKMEN
	  //I will write a program that grades multiple-choice tests about S1,S2,S3,S4 lessons.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello Teacher ! ");
		System.out.println("Please enter the name of student : ");
		String name = input.nextLine();
		if (name.equals("0")) {     //If the user enter "0" , program give the output that is "Program end.Bye!"
			System.out.println("Program ends.Bye!");
			System.exit(0);//And then it exits from the program.
		}
		System.out.println("Please enter the answers key: ");
		String key = input.nextLine();

		System.out.println("Please enter the answers of " + name + " : ");
		String answer = input.nextLine();

		char[] keys = new char[40];// I defined an array that gives key of answers to me.
		char[] answers = new char[40];//I defined an array that gives the answers of question to me.

		int j = 1; //I defined all variables which I will use from this line to 38. line.
		int i = 0;
		int k = 2;
		int l = 3;
		int correctcount;
		int incorrectcount;
		int correctcount0 = 0;
		int incorrectcount0 = 0;
		int correctcount1 = 0;
		int incorrectcount1 = 0;
		int correctcount2 = 0;
		int incorrectcount2 = 0;
		int correctcount3 = 0;
		int incorrectcount3 = 0;

		if ((key.length() == 40) && (answer.length() == 40)) { //I will control count of key and answers whether they are 40 in here.
			for (i = 0; i < 40; i += 4) {//For lesson S1
				if (answer.charAt(i) == key.charAt(i)) //I will calculate count of correct and incorrect answers in here.
					correctcount0++;
				else if ((answer.charAt(i) != key.charAt(i)) || (answer.charAt(i) == '-'))
					incorrectcount0++;
			}

			for (j = 1; j < 40; j += 4) {//For lesson S1
				if (answer.charAt(j) == key.charAt(j))//I will calculate count of correct and incorrect answers in here.
					correctcount1++;
				else if ((answer.charAt(j) != key.charAt(j)) || (answer.charAt(j) == '-'))
					incorrectcount1++;
			}

			for (k = 2; k < 40; k += 4) {//For lesson S2
				if (answer.charAt(k) == key.charAt(k))//I will calculate count of correct and incorrect answers in here.
					correctcount2++;
				else if ((answer.charAt(k) != key.charAt(k)) || (answer.charAt(k) == '-'))
					incorrectcount2++;
			}

			for (l = 3; l < 40; l += 4) {//For lesson S3
				if (answer.charAt(l) == key.charAt(l))//I will calculate count of correct and incorrect answers in here.
					correctcount3++;
				else if ((answer.charAt(l) != key.charAt(l)) || (answer.charAt(l) == '-'))
					incorrectcount3++;
			}
		} else
			System.out.println("illegal input!");//If the user enter the count of answers less than 40 ,the program write "illegal input!"

		correctcount = correctcount0 + correctcount1 + correctcount2 + correctcount3;//All correct answers's count
		incorrectcount = incorrectcount0 + incorrectcount1 + incorrectcount2 + incorrectcount3;//All incorrect answers' count
		System.out.println(
				name + " has " + correctcount + " correct and " + incorrectcount + " incorrect answers in total.");
		System.out.println("The percentage of success is:");//I will calculate the percentage of success of student lesson by lesson.
		System.out.println("S1" + "   " + "S2" + "   " + "S3" + "   " + "S4" + "\n---  ---  ---  ---");
		System.out.println(correctcount0 * 10 + "%" + " " + correctcount1 * 10 + "%" + " " + correctcount2 * 10 + "%"
				+ " " + correctcount3 * 10 + "%");

	}
}