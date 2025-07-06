package com.nutri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutri.app.entity.Appointment;

public interface AppoinmentRepository extends JpaRepository<Appointment, Integer> {

}
