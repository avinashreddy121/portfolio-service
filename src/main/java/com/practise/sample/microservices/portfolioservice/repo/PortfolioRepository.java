package com.practise.sample.microservices.portfolioservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.sample.microservices.portfolioservice.pojo.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

	public Portfolio findById(long id);
	
	public Portfolio findByStockName(String name);
}
