package com.simplilearn.datatype.package2;
class Car1 extends Object
{
	String model;
	String fuel;
	int prise;
	String color;

	public Car1()
	{
		super();
		//default constructor
	}
	public Car1(String model)
	{
		super();
		this.model=model;
			
	}
	public Car1(String model,String fuel)
	{
		super();
		this.model=model;
		this.fuel=fuel;
		
	}
	public Car1(String model,String fuel,int prise)
	{
		super();
		this.model=model;
		this.fuel=fuel;
		this.prise=prise;
				
	}
	public Car1(String model,String fuel,int prise,String color)
	{
		super();
		this.model=model;
		this.fuel=fuel;
		this.prise=prise;
		this.color=color;
	}
	void average()
	{
		System.out.println("Average of car ");
	}
	void speed()
	{
		System.out.println("Speed of car ");
	}
	void display()
	{
		System.out.println(model);
		System.out.println(fuel);
		System.out.println(prise);
		System.out.println(color);
	}
	 }
public class ConstructorCar {
	public static void main(String[] args)
	{
		Car1 c1= new Car1();
		c1.display();
		System.out.println("---------------------------");
		
		Car1 c2= new  Car1("suzuki");
		c2.display();
		System.out.println("---------------------------");
		
		Car1 c3= new Car1("boloro","Disel");
		c3.display();
		System.out.println("---------------------------");
		
		Car1 c4= new Car1("maruti","petrol",500000);
		c4.display();
		System.out.println("---------------------------");
		
		Car1 c5= new Car1("maruti","petrol",500000,"brown");
		c5.display();
		
		
	}

}























