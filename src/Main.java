import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter student details :Id    Fullname	 Dateofbirth	avgMarks	");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String fullname=br.readLine();
		Scanner sc=new Scanner(System.in);
		int Id=sc.nextInt();
		int DOB=sc.nextInt();
		int avgMark=sc.nextInt();
		String fullname=sc.nextLine();
		Student stundents=new Student(Id,fullname,DOB,avgMark);
		
		
		
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
