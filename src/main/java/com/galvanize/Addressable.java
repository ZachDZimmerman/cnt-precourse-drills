package com.galvanize;

import java.util.List;

/**
 * Created by zachzimmerman on 2/3/17.
 */
public interface Addressable {

	List<Address> getAddresses();
	void addAddress (Address newAddress);
}
