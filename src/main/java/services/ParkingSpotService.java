package services;

import org.springframework.stereotype.Service;

import repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	ParkingSpotRepository parkingSpotRepository; 
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	
}
