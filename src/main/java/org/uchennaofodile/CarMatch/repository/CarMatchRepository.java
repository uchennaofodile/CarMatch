package org.uchennaofodile.CarMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uchennaofodile.CarMatch.model.Car;

//JPA Generic takes two parameters
//First is the type of the JPA Entity , second is the type of the primary key

public interface CarMatchRepository extends JpaRepository<Car, Long> {
	
	
	
}
