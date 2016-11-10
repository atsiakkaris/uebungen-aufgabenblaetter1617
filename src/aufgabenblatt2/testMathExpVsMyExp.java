package aufgabenblatt2;

import org.junit.Assert;
import org.junit.Test;

public class testMathExpVsMyExp {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Euler() {
		Assert.assertEquals("Die ExpFunktion aus 5 ist:", Euler.myExp(5), Math.exp(5), 0.1);
	}

}