package com.nutri.app.service.impl;

import com.nutri.app.entity.Appointment;
import com.nutri.app.repository.AppoinmentRepository;
import com.nutri.app.service.IAppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements IAppointmentService {

    @Autowired
    AppoinmentRepository appointmentRepository;

    @Override
    public void createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public void updateAppointment(Integer id, Appointment updatedAppointment) {
        Appointment appointment = appointmentRepository.findById(id).orElse(null);
        if (appointment != null) {
            appointment.setAppointmentDate(updatedAppointment.getAppointmentDate());
            appointment.setGoogleMeetLink(updatedAppointment.getGoogleMeetLink());
            appointment.setNutrologist(updatedAppointment.getNutrologist());
            appointment.setUser(updatedAppointment.getUser());
            appointmentRepository.save(appointment);
        }
    }

    @Override
    public void deleteAppointment(Integer id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public Appointment getAppointment(Integer id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
