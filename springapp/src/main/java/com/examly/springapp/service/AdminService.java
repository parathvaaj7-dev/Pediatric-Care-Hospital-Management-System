package com.examly.springapp.service;

import com.examly.springapp.model.Admin;
import java.util.List;

public interface AdminService {
    Admin addAdmin(Admin admin);
    List<Admin> getAllAdmins();
    Admin getAdminById(Long id);
    Admin updateAdmin(Long id, Admin admin);
}