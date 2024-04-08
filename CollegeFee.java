package feescollegestudent;
import java.util.*;

public class ClgFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y= new Scanner(System.in);
		
		System.out.println("............Enter below details of the Student.........");
		
		System.out.println("Enter Student Id:");
		int stdId=y.nextInt();
		
		System.out.println("Enter Student Name:");
		String stdName=y.next();
		
		System.out.println("Enter Department of the Student:");
		String dept=y.next();
		
		System.out.println("Enter Gender of the Student:");
		String gender=y.next();
		
		System.out.println("Enter Student Category:");
		String category=y.next();
		
		System.out.println("Enter Stduent College Fee:");
		double clgFee=y.nextDouble();
		
		
		if (category.equals("Hosteller"))
		{
			
			System.out.println("Enter Block name(A-D):");
			char bloName=y.next().charAt(0);
			
			System.out.println("Enter Room Type(Ac or Non-Ac:");
			String roomtype=y.nextLine();
	
			Student h=new Hosteller(stdId, stdName, dept, gender, category, clgFee, stdId, bloName, roomtype);
			
			double totalFee=h.calculateTotalFee();	
			System.out.println("Total Fee="+totalFee);
		}
		else if(category.equals("DayScholar"))
		{
			System.out.println("Enter Bus Number:");
			int busNo=y.nextInt();
			
			System.out.println("Enter the distance between College and Your boarding point(4Km-50Km):");
			float dist=y.nextFloat();
			
			Student d=new DayScholar(stdId, stdName, dept, gender, category, clgFee, busNo, dist);
			double totalFee=d.calculateTotalFee();
			
			System.out.println("Totalfee:"+totalFee);
			
		}
		
		
		

	}

}
