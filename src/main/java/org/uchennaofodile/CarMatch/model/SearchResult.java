package org.uchennaofodile.CarMatch.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

@Entity
@Table(name="search_result")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class SearchResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	//We use this relationship because there can be many search results for one car
	//The JoinColumn name specifies what the name of the column will be
	//We write our Car entity to show that the car_id is a foreign key in the search_result table
	@ManyToOne
	@JoinColumn(name="car_id", nullable = false)
	Car car;

	//We use this relationship because there can by many search results for one user
	//The JoinColumn name specifies the name of the column (user_id)
	//We write our User entity because the user's id is a foreign key in our search_result table
	@ManyToOne
	@JoinColumn(name="user_id", nullable = false)
	User user;

	//We use this relationship because there can by many search results for one website
	//The JoinColumn name specifies the name of the column (website_id)
	//We write our Website entity because the website's id is a foreign key in our search_result table
	@ManyToOne
	@JoinColumn(name = "website_id")
	private Website website;
}
