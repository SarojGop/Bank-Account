import java.util.Scanner;

//class article
public class Article extends Publication{
	//private vairables
	private String nameofJournal, pageNumber;

	//default constructor
	public Article() {
		super();
		this.nameofJournal = " ";
		this.pageNumber = " ";
	}
// Constructor with parameters
	public Article(String typeofPublication, String dateofPublication, String authors, String title,String nameofJournal
			, String pageNumber) {
		super(typeofPublication, dateofPublication, authors, title);
		this.nameofJournal = nameofJournal;
		this.pageNumber = pageNumber;
		
	}
	public String getNameofJournal() {
		return nameofJournal;
	}
	public void setNameofJournal(String nameofJournal) {
		this.nameofJournal = nameofJournal;
	}
	public String getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(String pageNumber)throws myException {
		if(!pageNumber.contains("-"))
		{
			System.out.println("Invalid Page Number");
		}else{
		pageNumber.trim();
		String [] a = pageNumber.split("-");
		int beginPage = Integer.parseInt(a [0]);
		int endPage = Integer.parseInt(a[1]);
		if(beginPage<1||endPage<1)
		{
			myException r = new myException (20," Invalid Page Numbers" );
			throw r;
		}else{
		this.pageNumber = pageNumber;
		}}
	}
	
	//Method Read
		public void read(Scanner a)throws myException{
			a = new Scanner (System.in);
			super.read(a);
			System.out.println("Enter Name of Journal : " );
			this.setNameofJournal(a.nextLine());
			System.out.println("Enter Page Numbers : " );
			this.setPageNumber(a.nextLine());
			
		}
		//equal method
		public boolean Equal(Article p)
		{
			if(super.Equal(p)&&this.getNameofJournal().equals(p.nameofJournal)&& this.getPageNumber().equals(p.pageNumber)){
				return true;
			}else {return false;}
		}
		//Method Display
		public void Display(){
			super.Display();
			System.out.println("Name of Journal = " + this.nameofJournal);
			System.out.println("Page Numbers = " + this.pageNumber);
			
		}
		//to String method
		public String toString()
		{
			String st = super.toString()+ "\nName of Journal = " +this.getNameofJournal() +"\nPage Numbers = " + this.getPageNumber();
			return st;
		}

}
