package com.example.demosoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demosoa.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
