package org.uchennaofodile.CarMatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;

//TrueCar Model
@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(nullable = false)
	String make;
	@Column
	String model;
	@Column(nullable = false)
	@ElementCollection
	List<String> newOrUsed;
	@Column(name = "min_year")
	int minYear;
	@Column(name = "max_year")
	int maxYear;
	@Column(name = "min_price")
	int minPrice;
	@Column(name = "max_price")
	int maxPrice;
	@Column
	@ElementCollection
	List<String> color;
	@Column(name = "popular_features")
	@ElementCollection
	List<String> popularFeatures;
	@Column
	@ElementCollection
	List<String> transmission;
	@Column(name = "drive_type")
	@ElementCollection
	List<String> driveType;
	@Column
	@ElementCollection
	List<String> engine;
	@Column(name = "interior_color")
	@ElementCollection
	List<String> interiorColor;

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
	List<SearchResult> searchResults = new ArrayList<>();

}
