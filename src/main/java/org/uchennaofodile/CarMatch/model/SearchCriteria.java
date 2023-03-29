package org.uchennaofodile.CarMatch.model;

import java.io.Serializable;
import jakarta.persistence.Column;
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
@Table(name="search_criteria")
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
	@Column(nullable = false)
	String model;
	@Column(nullable = false)
	int minYear;
	@Column(nullable = false)
	int maxYear;
	@Column(nullable = false)
	double minPrice;
	@Column(nullable = false)
	double maxPrice;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	User user;

}
