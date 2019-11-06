package ManyMethodsAndInstances;

public class tuna {
	
	private String boyName;
	
	public void SetName(String name) {
		
		boyName=name;
	}
	
	public String getName() {
		
		return boyName;
	}
	
	public void saying() {
		
		System.out.printf("Your first boy friend was "+ getName());
	}

}
