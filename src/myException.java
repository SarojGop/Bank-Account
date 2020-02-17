//my Exception class
public class myException extends Exception{
	//private variables
	private int line;
	private String msg;
	//Default constructors
	public myException() {
		super();
		this.line = 0 ;
		this.msg = " ";
	}
	
	//constructor with parameters
	public myException(int line, String msg) {
		super(msg);
		this.line = line;
		this.msg = msg;
	}
	
	public String toString(){
		String St = "Error " + this.line + "Msg: "+ this.msg;
		return St;
	}
	

}
