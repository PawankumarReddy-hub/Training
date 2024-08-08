package com.example.springbootmysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootmysql.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
