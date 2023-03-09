package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
