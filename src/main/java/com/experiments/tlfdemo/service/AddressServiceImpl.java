package com.experiments.tlfdemo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.experiments.tlfdemo.model.Address;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	public Address emptyAddress() {
		return new Address();
	}

	@Override
	public long saveAddress(Address address) {
		System.out.println("Saving " + address);
		return new Random().nextBoolean() ? 1 : 0;
	}

}
