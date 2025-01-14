package com.shoponge.shipping;

import org.springframework.data.repository.CrudRepository;

import com.shoponge.common.entity.Country;
import com.shoponge.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
