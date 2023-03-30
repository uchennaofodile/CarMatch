package org.uchennaofodile.CarMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uchennaofodile.CarMatch.model.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}