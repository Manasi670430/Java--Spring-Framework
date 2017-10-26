package SpringPackage;

public class World implements Greeter {
	private String Newname;
	
	public String getGreeting(){
		String s ="Hello world from "+ Newname+"!";
		return s;
	}
	public void setName(String name) {
		Newname = name;
	}


}
