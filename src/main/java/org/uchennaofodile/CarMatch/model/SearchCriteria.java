package org.uchennaofodile.CarMatch.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "search_criteria")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchCriteria implements Serializable {
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

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	User user;

}
