// comparable demo 

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;

class Student implements Comparable<Student>{
private String name;
private int roll;
private int age;
public Student (String name,int roll,int age)
{
super();
this.name=name;
this.roll=roll;
this.age=age;
}
public String getName()
{
return name;
}
public int getRoll()
{
return roll;
}
public int getage()
{
	return age;
}
public void setName(String name)
{
this.name=name;
}
public void setRoll(int roll)
{
this.roll=roll;
}
@Override
public int compareTo(Student student)
{
int  compareroll=((Student) student).getage();
return this.age - compareroll;
}
@Override
    public String toString() {
        return "[ rollno=" + roll + ", name=" + name + "]";
    }
}

public class ArrayObject
{
public static void main(String args[])
{
 List<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student( "JOHN", 26,20));
	   arraylist.add(new Student("JOE", 24,30));
	   arraylist.add(new Student( "DAN", 32,4));

	   Collections.sort(arraylist);

	   for(Student str: arraylist){
			System.out.println(str);
	   }

}

}
