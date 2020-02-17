import java.util.*;
//class publication
public class Publication extends myException {
	//private variables
	private String TypeofPublication, dateofPublication, Authors, Title;
	
	//default constructors			
	public Publication() {		
		this.TypeofPublication = " ";
		this.dateofPublication = "";
		this.Authors = " ";
		this.Title = " " ;
	}
	//Constructors with parameters
	public Publication(String typeofPublication, String dateofPublication, String authors, String title) {
		this.TypeofPublication = typeofPublication;
		this.dateofPublication = dateofPublication;
		this.Authors = authors;
		this.Title = title;
	}
	
	//Accessors and Mutators
	public String getTypeofPublication() {
		return TypeofPublication;
	}
	public void setTypeofPublication(String typeofPublication) {
		TypeofPublication = typeofPublication;
	}
	public String getDateofPublication() {
		return dateofPublication;
	}//setter date with exception
	public void setDateofPublication(String dateofPublication)throws myException {
	
		if(dateofPublication.equals("")){
			this.dateofPublication= "Invalid Date fromat";
		}else{
			dateofPublication.trim();
			if(dateofPublication.substring(0, dateofPublication.length()-1).contains("/"))
			{

				String [] a = dateofPublication.split("/");
				int months = Integer.parseInt(a[0]);
				int day = Integer.parseInt(a[1]);
				int year = Integer.parseInt(a[2]);
				
				if(day>30||day<1){
					
					myException t = new myException (11," Invalid Day" );
					
					throw t;
				}else if(months>12 || months<1)
				{
					myException u = new myException (11," Invalid Months" );
					System.out.println(u.toString());
					throw u;
				}
				else{
					this.dateofPublication = dateofPublication;}
				
			}
			
		}
		
	
		}
	public String getAuthors() {
		return Authors;
	}
	public void setAuthors(String authors) {
		Authors = authors;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	//Method ToString
	public String toString() {
		return "Publication = " + this.TypeofPublication + "\nDate of Publication = " + this.dateofPublication
				+ "\nAuthors = " + this.Authors + "\nTitle = " + this.Title ;
	}
	//Method Display
	public void Display(){
		System.out.println("Publication = " + this.TypeofPublication);
		System.out.println("Date of Publication = " + this.dateofPublication);
		System.out.println("Authors = " + this.Authors);
		System.out.println("Title = " + this.Title);		
	}
	//Method Read
	public void read(Scanner a)throws myException
	{
		a = new Scanner (System.in);
		System.out.println("Enter Publication : " );
		this.setTypeofPublication(a.nextLine());
		System.out.println("Enter Date of Publication: (mm/dd/yyyy)");
		this.setDateofPublication(a.nextLine());
		System.out.println("Enter Authors = " );
		this.setAuthors(a.nextLine());
		System.out.println("Enter Title " );
		this.setTitle(a.nextLine());
		
	}
	//equal method
	public boolean Equal(Publication p)
	{
		if(this.getTypeofPublication().equals(p.TypeofPublication)&& this.getDateofPublication().equals(p.dateofPublication)
			&&this.getAuthors().equals(p.Authors)&&this.getTitle().equals(p.Title)){
			return true;
		}else {return false;}
	}
}
