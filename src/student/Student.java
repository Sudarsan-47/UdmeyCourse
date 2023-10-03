package student;

public class Student {
	String name;
	String SSN;
	String email;
	private static int ID=1000;
	String UserID;
	private String phone;
	private String city;
	private String state;
	String[] courses;
	int balance;
	
	
	Student(String name, String SSN) {
		email=name+"@gmail.com";
		this.name=name;
		ID++;
		this.SSN=SSN;
		GenerateID();

	}
	
	public void GenerateID() {
		int min=1000,max=9000;
		int random=(int) (Math.random()*(max-min));
		random=random+min;
		System.out.println(random);
		UserID=ID+""+random+""+SSN.substring(0,4);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll(String[] courses) {
		this.courses=courses;
	}
	void pay(int amount) {
		System.out.println("Payment is processing...");
		this.balance+=amount;
		checkBalance();
	}
	void checkBalance() {
		System.out.println("The balance is : "+balance);
	}
	
	@Override
	public String toString() {
		return "[\n name: "+name+"\n UserID :"+UserID+" \n emailID: "+email+"\n Balance :"+balance+" \n city: "+getCity()+" \n state: "+getState()+" \n phone: "+getPhone()+"\n ]";
	}
	
	void showCourses() {
		System.out.println("The courses this particular students has enrolled are: ");
		for(int i=0;i<courses.length;i++) {
			
			System.out.println(courses[i]);
		}
	}
	
	
}
