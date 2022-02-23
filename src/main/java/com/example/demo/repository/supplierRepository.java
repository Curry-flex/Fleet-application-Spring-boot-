package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Supplier;

public interface supplierRepository extends JpaRepository<Supplier, Integer> {

}
