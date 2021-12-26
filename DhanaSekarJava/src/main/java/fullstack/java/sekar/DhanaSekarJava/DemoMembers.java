package fullstack.java.sekar.DhanaSekarJava;

public class DemoMembers 
{
	public static void main(String[] args) 
	{
		MyWorld my=new MyWorld();// local object of main method
		my.java="Swing,JPA";my.python="Tkinter,DJango";my.javascript="Web API,React";
		
		
		MyWorld world=new MyWorld();// local
		world.java="Spring";world.python="DJango,Flask";world.javascript="React, Node";
		
		//my.info();
		//world.info();
		
		MyWorld.hello(world);
		MyWorld.hello(my);
	}
}

class MyWorld
{
	String java,python,javascript;
	public void info() // no return no param
	{
		System.out.println("Java technologies: "+this.java);
		System.out.println("Python technologies: "+this.python);
		System.out.println("Javascript technologies: "+this.javascript);
	}
	
	// no return param
	public static void hello(MyWorld tmp)// obj is receiver
	{
		//MyWorld tmp=new MyWorld();
		//MyWorld tmp=obj;// tmp is receiver
		System.out.println("Java technologies: "+tmp.java);
		System.out.println("Python technologies: "+tmp.python);
		System.out.println("Javascript technologies: "+tmp.javascript);
	}
}