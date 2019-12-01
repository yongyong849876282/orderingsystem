package com.southwind.repository;

import com.southwind.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TypeRepository {
    public List<Type> findAll();
}
