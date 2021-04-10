package tr.edu.medipol.yazilimaraclari.barancivak;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MuhasebeProgramiTest {

	@Test
	public void muhasebeProgramiTest() {
		
		String ucret= MuhasebeProgrami.ucretHesapla(50, 50);
		Assert.assertEquals("50 * 50 = 2500", ucret);
		
	
	}

}
