package com.nutri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutri.app.entity.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

}
