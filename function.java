/*
* step1: print my name
* step2: convert from Fahrengeit to Celsius degrees
* @param fahrenheit 
* @return Celsius
*/
public class function{
	public static String nametagText(String name){
		return "Hello, my name is " + name;
	}
	public static double fahrenheit2celsius(double fahrenheit){
		double celsius;
		return celsius = (fahrenheit-32)*5/9;
	}
	public static void printTempeperature(){
		double fahrenheit = 151.21;
		System.out.println("F: "+ fahrenheit);
		double celsius = fahrenheit2celsius(fahrenheit);
		System.out.println("C: "+ celsius);
	}
	public static void main(String[] args){
		String s = nametagText("jacob");
		System.out.println(s);
		printTempeperature();
	}

}