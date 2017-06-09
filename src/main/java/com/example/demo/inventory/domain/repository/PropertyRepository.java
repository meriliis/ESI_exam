package com.example.demo.inventory.domain.repository;

import com.example.demo.inventory.domain.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Meri on 09-Jun-17.
 */
@Repository
public interface PropertyRepository extends JpaRepository<Property, String> {
    @Query("select p from Property p where p.city like ?1" +
            " and p not in (select pr.property from PropertyReservation pr where ?2 < pr.reservationPeriod.endDate and ?3 > pr.reservationPeriod.startDate)")
    List<Property> findAvailableProperties(String city, LocalDate startDate, LocalDate endDate);
}
