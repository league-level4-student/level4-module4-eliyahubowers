package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Jtest {
	
	EncapsulateTheData entd = new EncapsulateTheData();
	
	@Test
	public void testGettersSetters() {
		entd.setDegreesTurned(1000);
		assertEquals(360, entd.getDegreesTurned());
		entd.setItemsReceived(-10);
		assertEquals(0, entd.getItemsReceived());
		entd.setNomenclature("");
		assertEquals(" ", entd.getNomenclature());
		entd.setMemberObj("a string");
		assertFalse(entd.getMemberObj() instanceof String);
	}

}
