package com.examly.springapp.service;

import com.examly.springapp.model.Admin;
import com.examly.springapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
    
    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
    
    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }
    
    @Override
    public Admin updateAdmin(Long id, Admin admin) {
        admin.setId(id);
        return adminRepository.save(admin);
    }
}
