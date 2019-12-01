package com.southwind.repository;

import com.southwind.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
    Admin adminlogin(String username,String password);
}
