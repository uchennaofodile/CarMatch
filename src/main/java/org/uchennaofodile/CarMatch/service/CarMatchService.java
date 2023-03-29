package org.uchennaofodile.CarMatch.service;

import java.util.List;

import org.uchennaofodile.CarMatch.model.Car;

public interface CarMatchService {
	// Read: Returns all the users cars
	List<Car> getAllCarsbyUserId(List<Long> id);

	List<Car> getAllCars();
	// Update: Returns all the users cars

	// Delete: Deletes a car from the users list of cars
	boolean deleteACarById(long id);

}
