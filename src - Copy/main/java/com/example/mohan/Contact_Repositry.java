package com.example.mohan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact_Repositry extends JpaRepository<Contact_us, Long> {

}
