package Personpack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class Collections {

	String name;
	int age;
	String DPt;
	Scanner scan = new Scanner(System.in);
	int choice;

	List<Person> list = new ArrayList<Person>();

	public void AddMethod()  throws SQLException
	{
		try{
		Connection con =db.createConnection();
		 PreparedStatement ps =con.prepareStatement("insert into details (name,age,DPt) values (?,?,?)");
		Person p=new Person();
		System.out.println("Enter person name: ");
		name=scan.next();		 
		p.setName(name);	
		ps.setString(1,p.getName());
		System.out.println("enter the DPt");
		DPt=scan.next();
		p.setDpt(DPt);
		 ps.setString(3,p.getDpt());
		System.out.println("enter the age");
		age=scan.nextInt();
		p.setAge(age);	
		ps.setInt(2,p.getAge());
		list.add(p);
		int i=ps.executeUpdate();
		//con.close();
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	public void UpdateMethod() throws SQLException
	{
		Connection con=db.createConnection();
		 PreparedStatement ps =con.prepareStatement("Update details SET age=?, DPt=? where name=?");
        Person p=new Person();
		System.out.println("enter the new  name");
		DPt=scan.next();
		System.out.println("enter the new department");
		String newdpt=scan.next();
		System.out.println("enter the new age");
		age=scan.nextInt();
		ListIterator ti=list.listIterator();
		while(ti.hasNext()){
			Object person= ti.next();
			if( ((Person) person).getName().equals(name))
			{
				p.setName(newdpt);
				ps.setString(1,toString());
				p.setDpt(DPt);
				ps.setString(2, getDPt());
				p.setAge(age);
				ps.setInt(3, getInt());
			}
			ti.remove();
			ti.add(person);
		}
		int i=ps.executeUpdate();
		for(Person til:list)
		{

		}
	}

	private int getInt() {
		
		return 0;
	}
	private String getDPt() {
		
		return null;}
	



	public void DeleteMethod() throws SQLException
	{
		 Connection con=db.createConnection();
		    PreparedStatement ps=con.prepareStatement("delete from details where name=?");
		
		Person p=new Person(); 
		System.out.println("Enter name record you want to Delete: ");
		name = scan.next();
		Iterator<Person> it=list.iterator();
		while(it.hasNext()){
			if(it.next().getName().equals(name)){
				
				it.remove();
				ps.setString(1,p.getName());
				System.out.println("The person "+name+" is deleted");
			}
		}
		 int i=ps.executeUpdate();
	}

	public void Displaymethod() throws SQLException
	{
		Connection con=db.createConnection();
		PreparedStatement ps=con.prepareStatement("select * from details");
		

		for(Person p:list)
			System.out.println(p);
	}
}




