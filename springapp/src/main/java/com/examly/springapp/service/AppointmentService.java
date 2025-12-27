package com.examly.springapp.service;

import com.examly.springapp.model.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    Appointment updateAppointment(Long id, Appointment appointment);
    List<Appointment> getAppointmentsByStatus(String status);
}