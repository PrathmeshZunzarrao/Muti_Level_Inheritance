package inheritance_3;

public class Tcs extends Software_Company {
		
	String Ceo;
	String loc;
	double revenue;
	int empno;
	
	public Tcs() {
		// TODO Auto-generated constructor stub
	}
	
	public Tcs(String name, String type, String product, String sec, String Ceo, String loc, double revenue, int empno)
	{
		this.name = name;
		this.type = type;
		this.product = product;
		this.sec = sec;
		this.Ceo = Ceo;
		this.loc = loc;
		this.revenue = revenue;
		this.empno = empno;
	}
	
	public void displayTcs()
	{
		displaySoftwareCompany();
		System.out.println("CEO of company : " + Ceo);
		System.out.println("Location : " + loc);
		System.out.println("No. of employees : " + empno);
		System.out.println("Revenue : " + revenue);
	}
}
