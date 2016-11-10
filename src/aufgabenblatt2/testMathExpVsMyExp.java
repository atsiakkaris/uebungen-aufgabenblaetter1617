package aufgabenblatt2;

import org.junit.Assert;
import org.junit.Test;

public class testMathExpVsMyExp {
	
	@Test
	public void Euler() {
		Assert.assertEquals("Die ExFunktion aus 5 ist 148.41315910257657", Math.exp(5));
	}

}