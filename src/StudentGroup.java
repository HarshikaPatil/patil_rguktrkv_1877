import java.util.Date;
import java.util.*;
import java.io.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation throws Exception{

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
		
		
		
	}

	@Override
	public void setStudents(Student[] students)throws IllegalArgumentException {
	
	//Student students[];
		if(students==null)
		{
			throws IllegalArgumentException;
		}
		
		
		
		return null;

	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
	
	
		int index;
		if(index<0 || index>students.length)
		{
			throws IllegalArgumentException;
		}
		return null;
		
	}

	@Override
	public void setStudent(Student student, int index) {
	int index_position;
		index=index_position;
		StudentGroup(students.length+1);
		students[index_position]=student;
		if(index_position<0 || index_position>students.length)
		{
			throws IllegalArgumentException;
		}
		return null;
	
		
	}

	@Override
	public void addFirst(Student student) {
	//int new_element;
		StudentGroup(students.length+1);
		//Student students[]=new Student()
		Student[0]=student;
		if(students==null)
		{
			throws IllegalArgumentException;
		}
		return null;
	}

	@Override
	public void addLast(Student student) {
		StudentGroup(students.length+1);
		students.add(element);
		if(students==null)
		{
			throws IllegalArgumentException;
		}
		Student student2[]=new StudentGroup(students.length-1);
		for(int i=0;i<students.length;i++)
		{
			if(i!=remove_index)
			{
				student2[i]=Student[i];	
			}
			else
			{
				i=i+1;
			}
		}
	}

	@Override
	public void add(Student student, int index) {
		student=append_element;
		Student sudents1=new Student(students.length+1);
		Student1[index]=append_element;
		if(index<0 || index>students.length)
		{
			throws IllegalArgumentException;
		}
		return null;
		
	}

	@Override
	public void remove(int index) {
		index=specified_index;
		if(index==specified_index)
		{
			while(index<students.length)
			{
				students2[index]=students[index+1];
				index=index+1;	
				
			}
		}
		if(index<0 || index>studens.length)
		{
			throws IllegalArgumentException;
		}
		
		
	}

	@Override
	public void remove(Student student) {
		
		student=first_remove_element;
		if(Students[index]==first_remove_element)
		{
			students[i]=Students[i+1];
		}
		if(students==null)
		{
			throws IllegalArgumentException;
		}
		
	
	}

	@Override
	public void removeFromIndex(int index) {
		index=specified_index;
		if(index==specified_index)
		{
			while(index<students.length)
			{
				students2[index]=students[index+1];
				index=index+1;	
				
			}
		}
		if(index<0 || index>studens.length)
		{
			throws IllegalArgumentException;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		student=specified_element;
		if(students[index]==specified_element)
		{
			while(index<students.length)
			{
				students2[index]=students[index+1];	
				index=index+1;	
				
			}
		}
		if(index<0 || index>studens.length)
		{
			throws IllegalArgumentException;
		}
	}

	@Override
	public void removeToIndex(int index) {
		index=specified_index;
		if(index==specified_index)
		{
			while(index<students.length)
			{
				students2[index]=students[index+1];	
				index=index+1;	
				
			}
		}
		if(index<0 || index>studens.length)
		{
			throws IllegalArgumentException;
		}
	}

	@Override
	public void removeToElement(Student student) {
		student=specified_element;
		if(students[index]==specified_element)
		{
			while(index<students.length)
			{
				students2[index]=students[index+1];
				index=index+1;	
				
			}
		}
		if(index<0 || index>studens.length)
		{
			throws IllegalArgumentException;
		}
	}

	@Override
	public void bubbleSort() {
		int min,index,i;
		min=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i].id<students[i+1].id
			{
			index=i;
			min=index;
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		//Student students_by_birthday[students.length);
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i].date==date}
			{
				Student students_by_birthday[i]=students[i];
			}
		}
		return students_by_birthday;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		for(i=0;i<students.length;i++)
		{
			if(students[i].date>firstDate && students[i].date>lastDate }
			{
				Student students_between_birthday[i]=students[i];
			}
		}
		return students_between_birthday;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i].date==firstdate || students[i].date<=date+days }
			{
				Student students_near_birthdates[i]=students[i];
			}
		}
		return students_near_birthdates;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		int index=0,age,i=0;
		for(i=0;i<students.length;i++)
		{
			if(index==indexOfStudent }
			{
				age=current.year-students[indexOfStudent].date.year
			}
		}
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i].age==age }
			{
				Student students_by_ages[i]=students[i];
			}
		
		return students_by_ages;
}
	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int min,index;
		int i=0;
		min=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i].avgMark<students[i+1].avgMark)
			{
			index=i;
			min=index;
			}
		}
		return students;
	}

	@Override
	public Student getNextStudent(Student student) {
		int i=0;
		int element;
		if(students[i]==element)
		{
		return students[i+1];	
		}
		
}
