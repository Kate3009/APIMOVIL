package com.irojas.demojwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irojas.demojwt.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
