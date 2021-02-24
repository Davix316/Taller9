package com.example.demosoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demosoa.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{

}
