package com.simplilearn.datatype.package2;
class Dog extends Object
{
	String name;
	int cost;
	String color;
	String bread;
	public Dog()
	{
		super();
	//Default Constructor is here;	
	}
	public Dog(String name)
	{
		super();
		this.name=name;
	}
	public Dog(String name,int cost)
	{
		super();
		this.name=name;
		this.cost=cost;
	}
	public Dog(String name,int cost,String color)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	public Dog(String name,int cost,String color,String bread)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.color=color;
		this.bread=bread;
	}
	void run()
	{
		System.out.println("Dog run");
	}
	void eat()
	{
		System.out.println("Dog eat");
	}
	void display()
	{
		System.out.println(name);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(bread);
	}
	}
public class constructorDog {
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.display();
		System.out.println("--------------------------");
		Dog d2=new Dog("Rocky");
		d2.display();
		System.out.println("--------------------------");
		Dog d3=new Dog("Tommy",5000);
		d3.display();
		System.out.println("--------------------------");
		Dog d4=new Dog("Tangya",7000,"white");
		d4.display();
		System.out.println("--------------------------");
		Dog d5=new Dog("Jimmy",8000,"Black","GR");
		d5.display();
				
	}

}











