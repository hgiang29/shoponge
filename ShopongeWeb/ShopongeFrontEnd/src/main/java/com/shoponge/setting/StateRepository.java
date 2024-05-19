package com.shoponge.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shoponge.common.entity.Country;
import com.shoponge.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
