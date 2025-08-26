package com.krishna.JWT.repository;

import com.krishna.JWT.entity.UserRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRegisterEntityRepository extends JpaRepository<UserRegisterEntity, Long> {

	Optional<UserRegisterEntity> findByUsername(String username);
}
