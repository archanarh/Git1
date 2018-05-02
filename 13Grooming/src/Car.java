public class Car {
	void start(Integer x)
	{
		System.out.println(x);
	}
	void start(Short y)
	{
		System.out.println(y);
	}
	public static void main(String[] args) {
	//	new Car().start(new Byte(10));
		//new Car().start(null);  //if u pass null, it gives ambiguity error, bcoz, both methods except null
		new Car().start(10); //it searches for int, long,float,double and finally search for corresponding non-primitive, i.e. Integer, if found, it executes, else, error
	}
}
