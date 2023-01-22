package com.housing.app.landlord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class LandlordController {

	@Autowired
	private LandlordRepository landRep;
	
	
	
	//Get all the data
	
	@GetMapping("/houses")
	public List<Landlord> getAllHouseData (){
		return landRep.findAll();
	}
	
	@PostMapping("/addhouse") 
	public Landlord newLandLord (@RequestBody Landlord st) {
		return landRep.save(st);
	}
	
	@GetMapping("/housenum/{id}")
	public ResponseEntity<Landlord> getHouseById (@PathVariable int id){
		Landlord s= landRep.findById(id).orElseThrow(() ->  new ResourceNotFoundException("House not found"));
		return ResponseEntity.ok(s);
	}
	
	
	
	@GetMapping("/house/{address}")
	public Landlord getHouseByAddress (@PathVariable String address) {
		 Landlord house = landRep.findByAddress(address);
		 return house;
		
//		if (land.isEmpty()) {
//			System.out.println(new ResourceNotFoundException("House with the address "+ address +" not found"));
//		}
//		return landRep.findByAddress(address);
	}
	
	@GetMapping("/city/{city}")
	public Landlord getHouseByCity(@PathVariable String city ) {
		Landlord house = landRep.findByCity(city);
		return house;
	}
	
	@PutMapping("/house/{id}")
	public ResponseEntity <Landlord> updateHouse (@PathVariable int id, @RequestBody Landlord landLord) {
		
		Landlord l = landRep.findById(id).orElseThrow(() ->  new ResourceNotFoundException("House not found"));
		l.setAddress(landLord.getAddress());
		l.setBathroom(landLord.getBathroom());
		l.setBedroom(landLord.getBedroom());
		l.setCity(landLord.getCity());
		l.setPrice(landLord.getPrice());
		l.setState(landLord.getState());
		l.setZipcode(landLord.getZipcode());
		l.setPortrait(landLord.getPortrait());
		l.setType(landLord.getType());
		Landlord updateHouse = landRep.save(l);
		return ResponseEntity.ok(updateHouse);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteHouse (@PathVariable int id) {
		landRep.findById(id).orElseThrow(() ->  new ResourceNotFoundException("House not found"));
		landRep.deleteById(id);
		
		return "The house with id: "+ id +" is removed from the database.";
	}
	
}









