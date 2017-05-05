public class loop{
	public static void printInReverse(String[] stringArray) {
		int size = stringArray.length;
		for (int i = size-1; i>=0; i--){
			System.out.println(stringArray[i]);
		}
	}
	public static void monopolyRoll(){
		int count = 0;
		while(count<=10){
			double r1 = Math.random();
			double r2 = Math.random();
			r1 = (int) (r1*100);
			r2 = (int) (r2*100);
			if (r1==r2){
				System.out.println("r1: "+ r1 + " r2: " + r2 + " r1+r2: " + (r1+r2));
				count ++;
			}
		}
	}
	public static void main(String [] args){
		String [] s = {"sd","dsf","adf"};
		printInReverse(s);
		monopolyRoll();

	}
}