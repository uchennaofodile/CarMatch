package org.uchennaofodile.CarMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uchennaofodile.CarMatch.model.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}