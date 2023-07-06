//Create a class , declare 5 static variables , 5 non static , initialize the variables -> create 5 objects

public class Company{
	
static String companyName ;
static String companyBranchName;
static String companyLocation;
static String contry;
static String nameOfCeo;

int noOfEmployee;
int salary;
String nameOfEmployee;
int noOfComputer;
int ageOfEmployee;


public static void main(String[] args){
		Company company = new Company(200,10000,"Omkar",100,23);
		System.out.println(company.noOfEmployee);

		Company company1 = new Company(300,12000,"Karthik",100,23);
		System.out.println(company1.salary);
		
		Company company2 = new Company(400,14000,"Sagar",100,23);
		System.out.println(company2.nameOfEmployee);
		
		Company company3 = new Company(250,16000,"Nikhil",100,23);
		System.out.println(company3.noOfEmployee);
		
		Company company4 = new Company(100,18000,"Pratik",100,23);
		System.out.println(company4.ageOfEmployee);
		}

		public Company(int noOfEmployee,int salary,String nameOfEmployee,int noOfComputer,int ageOfEmployee){
		this.noOfEmployee=noOfEmployee;
		this.salary=salary;
		this.nameOfEmployee=nameOfEmployee;
		this.noOfComputer=noOfComputer;
		this.ageOfEmployee=ageOfEmployee;
		
		}
}

