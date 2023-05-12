package inheritance_3;

public class Company {
																				
	String name;
	String type;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public void displayCompany()
	{
		System.out.println("Company Name : " + name);
		System.out.println("Type(Service/Product) : " + type);
	}
}
