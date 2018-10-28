// comparitor demo

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;

class Student {
private String name;
private int roll;

public Student (String name,int roll)
{
this.name=name;
this.roll=roll;
}
public String getName()
{
return name;
}
public int getRoll()
{
return roll;
}
public void setName(String name)
{
this.name=name;
}
public void setRoll(int roll)
{
this.roll=roll;
}
public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

	public int compare(Student s1, Student s2) {
	   int  StudentName1 = s1.getRoll();
	   int StudentName2 = s2.getRoll();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
@Override
    public String toString() {
        return "[ rollno=" + roll + ", name=" + name + "]";
    }
}

public class ArrayOfObject
{
public static void main(String args[])
{
ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student("Zues", 10));
	   arraylist.add(new Student( "Abhay", 21));
	   arraylist.add(new Student( "panky", 15));

	   /*Sorting based on Student Name*/
	   System.out.println("Student Name Sorting:");
	   Collections.sort(arraylist, Student.StuNameComparator);

	   for(Student str: arraylist){
			System.out.println(str);
	   }}

}
