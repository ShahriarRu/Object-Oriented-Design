// singleton design pattern in java

class singleton
{
	private static singleton s;
	private singleton()
	{
		
	}
	public static singleton getInstance()
	{
		if(s==null)
		{
			s=new singleton();
		}
		return s;
	}
}

class singleton_test
{
	public static void main(String args[])
	{
		singleton s1=singleton.getInstance();
		singleton s2=singleton.getInstance();
		System.out.println(s1==s2);
	}
}



// class singleton
// {
// 	private static singleton obj = new singleton();
// 	private singleton()
// 	{
// 		System.out.println("singleton object created");
// 	}
// 	public static singleton getInstance()
// 	{
// 		return obj;
// 	}
// }
// class singletonTest
// {
// 	public static void main(String args[])
// 	{
// 		singleton obj1 = singleton.getInstance();
// 		singleton obj2 = singleton.getInstance();
// 		if(obj1 == obj2)
// 			System.out.println("same object");
// 		else
// 			System.out.println("different object");
// 	}
// }

