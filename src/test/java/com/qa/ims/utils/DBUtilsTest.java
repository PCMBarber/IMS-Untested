package com.qa.ims.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DBUtilsTest {
	
	@Test
	public void testInvalidPropertiesFile() {
		DBUtils.connect("not/a/path/to/properties/file");
		assertEquals("",DBUtils.getInstance().getDB_URL());
		assertEquals("",DBUtils.getInstance().getDB_USER());
		assertEquals("",DBUtils.getInstance().getDB_PASS());
	}
	
	@Test
	public void testInvalidataFile() {
		DBUtils.connectFail();
		assertEquals(0, DBUtils.getInstance().executeSQLFile("src/test/resources/bad-sql-data.sql"));
		DBUtils.connect();
		assertEquals(0, DBUtils.getInstance().executeSQLFile("src/test/resources/bad-sql-data.sql"));
	}
	
}
