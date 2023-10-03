package student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] c= {"english","Tamil","Physics","Biology"};
		Student S1=new Student("Sudarsan","19191");
		S1.enroll(c);
		S1.setCity("CHENNAI");
		S1.setState("TN");
		S1.setPhone("9876567892");
		System.out.println(S1.toString());
		S1.showCourses();
		S1.pay(5000);
		System.out.println("===============================================");
		
		String[] cc= {"English","Physics","Biology","Maths"};
		Student S2=new Student("Vijay","24561");
		S2.enroll(cc);
		S2.setCity("Madurai");
		S2.setState("TN");
		S2.setPhone("9223456543");
		System.out.println(S2.toString());
		S2.showCourses();
		S2.pay(3000);
	}

}
