package task2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
	static String ageCalculator(String db)
	{
		Date currentDate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String sd=sdf.format(currentDate);
		
		ArrayList<Integer> ar=new ArrayList();
		ArrayList<Integer> ar1=new ArrayList();
		
		StringTokenizer st=new StringTokenizer(db,"-");
		StringTokenizer st1=new StringTokenizer(sd,"-");
		
		while(st.hasMoreTokens())
		{
			ar.add(Integer.parseInt(st.nextToken()));
		}
		int day1=ar.get(0);
		int month1=ar.get(1);
		int year1=ar.get(2);
		
		while(st1.hasMoreTokens())
		{
			ar1.add(Integer.parseInt(st1.nextToken()));
		}
		int day2=ar1.get(0);
		int month2=ar1.get(1);
		int year2=ar1.get(2);
		
		int fday=0,fmonth=0,fyear=0;
		if(day2>day1)
		{
			fday=day2-day1;
		}
		else
		{
			fday=(day2+30)-day1;
			month2--;
		}
		if(month2>month1)
		{
			fmonth=month2-month1;
		}
		else
		{
			fmonth=(month2+12)-month1;
			year2--;
		}
		fyear=year2-year1;
		return "You are "+fday+" days "+fmonth+" months "+fyear+" years old";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your date of birth in dd-MM-yyyy format: ");
		String db=sc.nextLine();
		System.out.println(ageCalculator(db));
	
	}

}
