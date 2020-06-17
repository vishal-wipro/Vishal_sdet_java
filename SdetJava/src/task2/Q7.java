package task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in   dd Month,Year   format: ");
		String s=sc.nextLine();
		try {
			//DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
			//Date d=df.parse(s);
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("d MMMM,yyyy",Locale.ENGLISH);
			LocalDate ld=LocalDate.parse(s,dtf);
			System.out.println(ld);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
