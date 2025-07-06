package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Appointment;

public interface IAppointmentService {
    void createAppointment(Appointment appointment);

    void updateAppointment(Integer id, Appointment appointment);

    void deleteAppointment(Integer id);

    Appointment getAppointment(Integer id);

    List<Appointment> getAllAppointments();
}
