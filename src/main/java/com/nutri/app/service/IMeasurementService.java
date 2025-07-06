package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Measurement;

public interface IMeasurementService {
    void createMeasurement(Measurement measurement);

    void updateMeasurement(Long id, Measurement measurement);

    void deleteMeasurement(Long id);

    Measurement getMeasurement(Long id);

    List<Measurement> getAllMeasurements();
}