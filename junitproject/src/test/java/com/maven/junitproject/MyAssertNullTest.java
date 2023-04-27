package com.maven.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyAssertNullTest {
	public String getPropValue(final String key){
	        Map<String, String> appProps = new HashMap<String, String>();
	        appProps.put("key1", "value 1");
	        appProps.put("key2", "value 1");
	        appProps.put("key3", null);
	        return appProps.get(key);
	    }

	@Test
	public void test() {
		MyAssertNullTest msnt = new MyAssertNullTest();
		//assertNull(msnt.getPropValue("key2"));
		assertSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));
		//assertNotNull(msnt.getPropValue("key2"));
	}
}
