package aufgabenblatt2;

public class Euler {
	
	private static double calcFactorial(long basis) {
		double result = 1.0;
		for(int i = 1; i <= basis; i++) {
		result = result * i;
		}
	return result;
	}

	public static double myExp(int x) {
		// TODO berechne e^x mittels der auf Aufgabenblatt 2 angegebenen Formel
		double result=1;
		for (int ii=1; ii<= 100; ii++) {
		result = result + ( Math.pow(x, ii) / calcFactorial(ii) );
		
//		System.out.println("Result="+result);
//		System.out.println("Fakultät="+calcFactorial(ii));
//		System.out.println();
		}
		return result;
	}
	
//	public static double myExpFast(int x){
//		// TODO beschleunige myExp()
//	}

public static void main(String[] args){
	
	double yo=myExp(5);
	System.out.println("Das Egebniss ist " + yo +".");
	}
	
}
