package inheritance_3;

public class Software_Company extends Company {
	
	String product;
	String sec ;
	
	public Software_Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Software_Company(String name, String type, String product, String sec)
	{
		this.name = name;
		this.type = type;
		this.product = product;
		this.sec = sec;
	}
	
	public void displaySoftwareCompany()
	{
		displayCompany();
		System.out.println("Product of company : " + product);
		System.out.println("Type(IT/Mech/ENTC/Civil/Chem) : " + sec );
	}
}
