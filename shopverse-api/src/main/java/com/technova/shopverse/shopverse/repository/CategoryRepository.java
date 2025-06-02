package com.technova.shopverse.shopverse.repository;

import com.technova.shopverse.shopverse.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository

public interface CategoryRepository extends JpaRepository<Category, Long> {

}