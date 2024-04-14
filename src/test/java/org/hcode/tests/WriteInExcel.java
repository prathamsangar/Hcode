package org.hcode.tests;

import org.hcode.dataProviders.WriteFile;
import org.testng.annotations.Test;

public class WriteInExcel {
	
	@Test
	public void Write() {
		
		new WriteFile();
		WriteFile.writeToExcel(1, 1, "magic");
	}

}
