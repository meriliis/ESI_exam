package com.example.demo.inventory.domain.repository;

import com.example.demo.inventory.domain.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Meri on 09-Jun-17.
 */
@Repository
public interface PropertyRepository extends JpaRepository<Property, String> {
}
