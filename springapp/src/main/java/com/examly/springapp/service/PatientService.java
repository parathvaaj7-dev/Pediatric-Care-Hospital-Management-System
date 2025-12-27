package com.examly.springapp.service;

import com.examly.springapp.model.Patient;
import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient updatePatient(Long id, Patient patient);
}