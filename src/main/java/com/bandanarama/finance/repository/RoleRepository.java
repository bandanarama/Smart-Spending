package com.bandanarama.finance.repository;

import com.bandanarama.finance.model.ERole;
import com.bandanarama.finance.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
