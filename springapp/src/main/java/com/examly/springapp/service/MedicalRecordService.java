package com.examly.springapp.service;

import com.examly.springapp.model.MedicalRecord;
import java.util.List;

public interface MedicalRecordService {
    MedicalRecord addMedicalRecord(MedicalRecord medicalRecord);
    List<MedicalRecord> getAllMedicalRecords();
    MedicalRecord getMedicalRecordById(Long id);
    MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecord);
    List<MedicalRecord> getMedicalRecordsByPatientId(Long patientId);
}