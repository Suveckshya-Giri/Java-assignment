class Circle
{
     double radius;
	//constructor overoading
     public Circle ()   //default constructor
     {
	


     }

     public Circle (double radius)   //parameterized constructor
	{
	    this.radius = radius;
	}

	
	//parameterized constructor with object as parameter
	//but sometime also known as copy constructor
	public Circle(Circle circle)
	{
	   this.radius = circle.radius;
	}

	public double calculateArea()  //method calculateArea
	{
	   return 3.14*radius*radius;
	} 




	public static void main(String[] args)
	{
	     Circle c1 = new Circle();
	     System.out.println("The area of circle is "+c1.calculateArea());
	     Circle c2 = new Circle(2);
	     System.out.println("The area of circle is "+c2.calculateArea());
	     Circle c3 = new Circle(c2);
	     System.out.println("The area of cirlce is "+c3.calculateArea());



	}
	
}