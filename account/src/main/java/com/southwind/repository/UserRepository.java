package com.southwind.repository;

import com.southwind.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User userlogin(String username,String password);
}
