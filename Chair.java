public class Chair{
	int marks;
	char grade;
	float cgpa;
	int button;
	String name;
	
	
	public Chair(){	
	System.out.println("constructor");
    System.out.println(marks);	
	System.out.println(grade);
	System.out.println(cgpa);
	System.out.println(button);
	System.out.println(name);
	}
	
	
	public Chair(int marks1 , char grade1, float cgpa1, int button1, String name1){
		System.out.println("parametrised constructor");
		marks = marks1;
		grade = grade1;
		cgpa = cgpa1;
		button = button1;
		name = name1;	
	}
	
	public static void main(String[] args){
		new Chair();
	System.out.println("constructor1");
		Chair chair = new Chair(40 , 'A' , 8.11f , 88 , "Ranjita");
		System.out.println(chair.marks);
		System.out.println(chair.grade);
		System.out.println(chair.cgpa);
		System.out.println(chair.button);
		System.out.println(chair.name);
	}
}




		