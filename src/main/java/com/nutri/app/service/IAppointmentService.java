package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Appointment;

public interface IAppointmentService {
    void createAppointment(Appointment appointment);

    void updateAppointment(Long id, Appointment appointment);

    void deleteAppointment(Long id);

    Appointment getAppointment(Long id);

    List<Appointment> getAllAppointments();
}
