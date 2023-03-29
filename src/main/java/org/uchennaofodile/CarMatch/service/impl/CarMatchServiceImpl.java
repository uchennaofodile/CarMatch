package org.uchennaofodile.CarMatch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uchennaofodile.CarMatch.model.Car;
import org.uchennaofodile.CarMatch.repository.CarMatchRepository;
import org.uchennaofodile.CarMatch.service.CarMatchService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
public class CarMatchServiceImpl implements CarMatchService {

	final CarMatchRepository carMatchRepository;

	@Autowired
	public CarMatchServiceImpl(CarMatchRepository carMatchRepository) {
		super();
		this.carMatchRepository = carMatchRepository;

	}

	@Override
	public List<Car> getAllCarsbyUserId(List<Long> idList) {
		// TODO Auto-generated method stub

		return this.carMatchRepository.findAllById(idList);

	}

	@Override
	public List<Car> getAllCars() {
		return this.carMatchRepository.findAll();
	}

	@Override
	public boolean deleteACarById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
