package aufgabenblatt2;

//Gut gelöst. Bitte etwas mehr auf Formatierung achten. 
//Die Musterlösung für die schnellere Variante werde ich demnächst in das repository laden.

public class Euler {
	
	private static double calcFactorial(long basis) {
		double result = 1.0;
		for(int i = 1; i <= basis; i++) {
		result = result * i;		//Formatierung
		}
	return result;				//Formatierung
	}

	public static double myExp(int x, int n) {
		double result=1;
		for (int ii=1; ii<= n; ii++) {
		result = result + ( Math.pow(x, ii) / calcFactorial(ii) );	//Formatierung
		}
		return result;
	}
	
//	public static double myExpFast(int x){
//		// TODO beschleunige myExp()
//	}

public static void main(String[] args){						//Formatierung
	
	int n=17;
	int x=1;
	double yo=myExp(x,n);
	System.out.println("Das Egebniss ist " + yo +".");	
	}									
	
}
