import java.util.Random;

public class Main {

	public static void main(String[] args){
		// Se não passados, explode exception ArrayIndexOutofBound
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		Random r = new Random();
		System.out.println(r.nextInt(10)); // number 0-9
	}
	
}
