package com.examly.springapp.service;

import com.examly.springapp.model.Doctor;
import org.springframework.data.domain.Page;
import java.util.List;

public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    Doctor updateDoctor(Long id, Doctor doctor);
    Page<Doctor> getDoctorsPaginated(int pageNumber, int pageSize);
}