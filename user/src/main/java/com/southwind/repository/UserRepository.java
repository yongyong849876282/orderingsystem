package com.southwind.repository;

import com.southwind.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
