package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VentaDetalle;

@Repository
public interface IVentaDetalle extends CrudRepository<VentaDetalle, Integer> {

}
