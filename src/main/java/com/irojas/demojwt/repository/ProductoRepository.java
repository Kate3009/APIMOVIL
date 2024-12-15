package com.irojas.demojwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irojas.demojwt.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {

}
