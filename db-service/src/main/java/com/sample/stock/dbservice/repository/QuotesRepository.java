package com.sample.stock.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.stock.dbservice.model.Quote;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);
}
