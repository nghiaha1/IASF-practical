package com.springboot.springbootassignment12.repository;

import com.springboot.springbootassignment12.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street, String>, JpaSpecificationExecutor<Street> {
}
