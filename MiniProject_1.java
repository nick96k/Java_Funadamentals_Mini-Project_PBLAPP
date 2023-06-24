import java.util.Scanner;
class MiniProject_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
		char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String[] department = {"R&D", "PM", "Acct", "Front Dest", "Engg", "Manufacturing", "PM"};
		int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		int[] da = {20000, 32000, 12000, 15000, 40000};


		int epn;
		do
		{
			System.out.println("\nEnter Employee Number : ");
			epn	= sc.nextInt();
			if(epn < 1001 || epn >1007)
				System.out.println("Invalid Employee Number" +epn+ " !!!!.... ");
		}while(epn < 1001 || epn >1007);
		if(epn == 1001 || epn == 1002 || epn == 1003 || epn == 1004 || epn == 1005 || epn == 1006 ||epn == 1007)
			System.out.println(" ");
		else
			System.out.println("Invalid Employee Number" +epn+ " !!!!.... ");
		int index = -1;

		for(int i=0; i<empNo.length; i++)
		{
			if(empNo[i] == epn)
				index = i;
		}
		char empDes = designationCode[index];
		String desnt ="";
		int empDa = -1;
		switch(designationCode[index])
		{
			case 'e':
				desnt = "Engineer";
				empDa = 20000;
				break;
			case 'c':
				desnt = "Consultant";
				empDa = 32000;
				break;
			case 'k':
				desnt = "Clerk";
				empDa = 12000;
				break;
			case 'r':
				desnt = "Receptionist";
				empDa = 15000;
				break;
			case 'm':
				desnt = "Manager";
				empDa = 40000;
				break;
		}
		int salary = basic[index] + hra[index] + empDa - it[index];
		System.out.println("EmpNo EmpName Department Designation   Salary");
		System.out.println(epn+"  "+empName[index]+"    "+department[index]+"        "+desnt+"       "+salary);
	}
}