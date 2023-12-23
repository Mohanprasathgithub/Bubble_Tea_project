package com.example.mohan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_repositry extends JpaRepository<Order_us, Integer>{

}
