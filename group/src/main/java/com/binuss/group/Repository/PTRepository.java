package com.binuss.group.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binuss.group.Entity.PT;

@Repository
public interface PTRepository extends JpaRepository<PT, Long> {
    
}
