class hi{
	public void show(){
		for(i=0;i<5;i++){
		System.out.println("hi");
		}
	} 
}

class hello{
	public void show(){
		for(i=0;i<5;i++){
		System.out.println("hello");
		}
	}
}
public class ThreadDemo{
	public static void main(Sting args[]){
		hi obj1=new hi();
		hello obj2=new hello();
		obj1.show();
		obj2.show();

	}
}