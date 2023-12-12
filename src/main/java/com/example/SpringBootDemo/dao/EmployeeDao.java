package com.example.SpringBootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository <Employee,Integer>{

}
