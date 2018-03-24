package com.autokm.repository;

import java.util.List;

import com.autokm.model.auto;



public interface autokmRepository  
extends Repository<auto,Integer>
{

	void save(auto autokm);
	
	List<auto> findAll();
}