package com.nutri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutri.app.entity.Annotation;

public interface AnnotationRepository extends JpaRepository<Annotation, Integer> {

}
