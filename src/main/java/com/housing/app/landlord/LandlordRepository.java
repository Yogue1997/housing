package com.housing.app.landlord;

import org.springframework.data.jpa.repository.JpaRepository;

//import antlr.collections.List;

import java.util.List;

//import model.landlord;


public interface LandlordRepository extends JpaRepository<Landlord, Integer> {

	Landlord findByAddress(String address);
	Landlord findByCity(String city);
	

}
