import java.util.*;
//tester
public class Tester {
	public static void main(String []args)
	{

		//create object of class article
		Article a = new Article();
		//show Default Article
		System.out.println(a.toString());
		//display method of Article
		System.out.println("\nDisplay Method\n");
		a.Display();
		//set value for Article
		a.setTypeofPublication("Book");
		a.setAuthors("Noam Chomskey,Robert.McChesney");
		try{
		a.setDateofPublication("-1/5/2008");
		a.setPageNumber("22- 45");

		}catch (myException i){
			i.toString();
		}
		a.setTitle("Profit Over");
		try{

			a.setPageNumber("22-45");

		}catch (myException i){
			i.toString();
		}
		a.setNameofJournal("IEEE");
		System.out.println("\nDisplay Method\n");
		a.Display();
	
		//Scanner
		Scanner key = new Scanner(System.in);
		//new object of Article b;
		Article b = new Article();		
		//using method read from article
		try{
			System.out.println("\nNext Article\n");
		b.read(key);
		}catch(myException k){
			k.toString();
		}
		//display value of article b
		b.Display();
		
		//check if to article are same or not
		if(a.Equal(b))
		{
			System.out.println("The Articles are Same");
		}else{
			System.out.println("The Articles are Not Same");
		}
	
		
	}

}
