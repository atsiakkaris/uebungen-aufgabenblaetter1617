package aufgabenblatt2;

import org.junit.Assert;
import org.junit.Test;

public class testMathExpVsMyExp {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Euler() {
		Assert.assertEquals("Die ExpFunktion aus 5 ist:", Euler.myExp(2,17), Math.exp(2), 1E-15);
	}

}