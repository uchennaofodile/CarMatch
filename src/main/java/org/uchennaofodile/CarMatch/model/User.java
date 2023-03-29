package org.uchennaofodile.CarMatch.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(nullable = false)
	String username;

	String firstName;
	
	String LastName;
	
	@Column(nullable=false)
	String password;

	@Column(nullable=false)
	String email;

	//We use OneToMany because one user can have many search results
	//The SearchResult entity is mapped by the user's id and will contain a column
	//for the user's id 
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	List<SearchResult> searchResults = new ArrayList<>();


	//We use OneToMany because one user can have many search criteria
	//The SearchCriteria entity is mapped by the user's id and the SearchCriteria
	//entity will contain a join column that creates  a relationship between the 
	//SearchCriteria and the User entity
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	List<SearchCriteria> searchCriteria = new ArrayList<>();
}
