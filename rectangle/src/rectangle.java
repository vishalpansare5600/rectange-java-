
public class rectangle
{
	
	int length;
	int breadth;
	rectangle()

	{
		length=40;
		breadth=30;
	}
	void  area()
	{
		int rectarea=length*breadth;
		System.out.println("area of rect_area=" +rectarea);
	}

	
	public static void main(String[] args)
	{
		rectangle r=new rectangle();
		r.area();
		

	}


}