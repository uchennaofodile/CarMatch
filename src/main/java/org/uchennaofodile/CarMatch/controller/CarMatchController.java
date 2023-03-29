package org.uchennaofodile.CarMatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.uchennaofodile.CarMatch.model.Car;
import org.uchennaofodile.CarMatch.service.CarMatchService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Controller
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarMatchController {

	final CarMatchService carMatchService;

	@Autowired
	public CarMatchController(CarMatchService carMatchService) {
		super();
		this.carMatchService = carMatchService;

	}

	@GetMapping("/")
	public String getHome() {
		return "index";
	}

	// handler method to handle list cars request and return model and view
	@GetMapping("/cars")
	public String getCars(Model model) {

		try {
			model.addAttribute("cars", carMatchService.getAllCars());
			return "cars";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "No cars found";
		}

	}

	@GetMapping("/user/{id}")
	public String getCarsById(@PathVariable("id") List<Long> id, Model model) {

		List<Car> myCars = this.carMatchService.getAllCarsbyUserId(id);
		for (Car car : myCars) {
			System.out.println(car);
		}
		model.addAttribute("allCars", myCars);
		return "user_cars";
	}

}
