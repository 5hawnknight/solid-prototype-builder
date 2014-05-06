package com.knight.dataobjects;

import com.knight.interfaces.dataobjects.Address;

public class MailingAddressData implements Address 
{
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public MailingAddressData(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	@Override
	public String getStreet() {
		return street;
	}
	@Override
	public String getCity() {
		return city;
	}
	@Override
	public String getState() {
		return state;
	}
	@Override
	public String getZip() {
		return zip;
	}
	@Override
	public String toString() {
		return String.format(
				"MailingAddressData [street=%s, city=%s, state=%s, zip=%s]",
				street, city, state, zip);
	}
}