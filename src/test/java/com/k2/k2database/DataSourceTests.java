package com.k2.k2database;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataSourceTests {

	@Test
	void testNoArgsConstructor() {
		DataSource dataSource = new DataSource();
		assertNotNull(dataSource);
	}
	
	@Test
	void testAllArgsConstructor() {
		DataSource dataSource = new DataSource("URL", "USERNAME", "PASSWORD");
		assertNotNull(dataSource);
		assertEquals("URL", dataSource.getUrl());
		assertEquals("USERNAME", dataSource.getUsername());
		assertEquals("PASSWORD", dataSource.getPassword());
	}
	
	@Test
	void testEquals() {
		DataSource ds1 = new DataSource("URL", "USERNAME", "PASSWORD");
		DataSource ds2 = new DataSource("URL", "USERNAME", "PASSWORD");
		assertEquals(ds1, ds2);
	}
	
	@Test
	void testHashCode() {
		DataSource ds1 = new DataSource("URL", "USERNAME", "PASSWORD");
		DataSource ds2 = new DataSource("URL", "USERNAME", "PASSWORD");
		assertEquals(ds1.hashCode(), ds2.hashCode());
	}
	
	@Test
	void testToString() {
		DataSource ds1 = new DataSource("URL", "USERNAME", "PASSWORD");
		assertEquals("DataSource(url=URL, username=USERNAME, password=PASSWORD)", ds1.toString());
	}
	
	@Test
	void testGettersAndSetters() {
		DataSource ds = new DataSource();
		ds.setUrl("URL");
		ds.setUsername("USERNAME");
		ds.setPassword("PASSWORD");
		
		assertEquals("URL", ds.getUrl());
		assertEquals("USERNAME", ds.getUsername());
		assertEquals("PASSWORD", ds.getPassword());
	
	}

}
