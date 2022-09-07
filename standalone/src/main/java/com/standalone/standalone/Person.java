package com.standalone.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person 
{
	private List<String> friends;
	private Map<String, Integer> feestructre;
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeestructre() {
		return feestructre;
	}

	public void setFeestructre(Map<String, Integer> feestructre) {
		this.feestructre = feestructre;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructre=" + feestructre + "]";
	}

	
	
	

}
