package com.microser.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microser.stock.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer>{

}
