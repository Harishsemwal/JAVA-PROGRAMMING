import java.util.*;

class staff
{
	int code;
	String name;
	staff()
	{
		code = 0000;
		name= null;
	}
	
	void code(int c)
	{
		code = c;
	}
	void name(String n)
	{
		name = n;
	}
}

class teacher extends staff
{
	String sub;
	void subject(String s)
	{
		sub = s;
	}
	void publication()
	{
		
	}
	void display()
	{
		System.out.println("The Code of employee is: "+code);
		System.out.println("The Name of employee is: "+name+"\nThe subject to be taught is: "+sub);
	}
}

class typist extends staff
{
	int speed;
	void speed(int s)
	{
		speed = s;
	}
	void display()
	{
		System.out.println("The speed of the typist is: "+speed);
	}
}

class regular extends typist
{
	void display()
	{
		System.out.println("The Code of employee is: "+code+"\nThe Name of employee is: "+name+"\nThe speed of the typist is: "+speed+"\nA regular typist");
	}
}

class casual extends typist
{
	int wage;
	void daily_wage(int w)
	{
		wage = w;
	}
	void display()
	{
		System.out.println("The Code of employee is: "+code+"\nThe Name of employee is: "+name+"\nThe speed of the typist is: "+speed+"\nThe daily wage of the casual typist is: "+wage);
	}
}


class officer extends staff
{
	String grade;
	void grade(String g)
	{
		grade = g;
	}
	void display()
	{
		System.out.println("The Code of employee is: "+code+"\nThe Name of employee is: "+name+"\nThe grade of the officer is: "+grade);
	}
}

public class Database
{
	public static void main(String args [])
	{
		teacher t=new teacher();
		regular r=new regular();
		casual c=new casual();
		officer o=new officer();
		
		t.code(1000);
		t.name("Harish");
		t.subject("english");
		t.display();
		
		r.code(2000);
		r.name("Prasad");
		r.speed(10);
		r.display();
	
		c.code(3000);
		c.name("Semwal");
		c.speed(5);
		c.daily_wage(900);
		c.display();

		o.code(8000);
		o.name("Section");
		o.grade("O+");
		o.display();		
	
		
		System.out.println("Name : Harish Prasad Semwal");
		System.out.println("Semester : IV");
		System.out.println("Section : O");	
	}
	
}