package Personpack;

public class Person {
	String name;
	int age;
	String DPt;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;;
		}
		public int getAge() {
			return age;
		}
		
	public void setAge(int age) {
			
	this.age = age;
		}
		
	public String getDpt() {
			
	return DPt;
		}
		
	public void setDpt(String dpt) {
			
	this.DPt = dpt;
		}
		
	    
	
	    public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dpt=" + DPt + "]";
		                 }
		
	public Person(String name, int age, String dpt) {
			
	super();
			
	this.name = name;
			
	this.age = age;
			
	this.DPt = dpt;
		}
	  public Person(){}
	      }


	
	
	
	


