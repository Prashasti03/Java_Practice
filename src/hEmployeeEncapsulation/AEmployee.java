package hEmployeeEncapsulation;

// encapsulation - binding data member and method in a single unit (class) is called encapsulation
//full encapsulation - make data member(variables) private and use public getters and setters to access and manipulate 
//those members
//it provides extra security as you cannot access those methods directly, and we can give required logic in setters
// e.g. public void setId(int id){
// if(id<0){
//	syso("invalid ID")
//else{
// this.id=id;
//}

public class AEmployee {
	
	private int id;
	private String companyName;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
