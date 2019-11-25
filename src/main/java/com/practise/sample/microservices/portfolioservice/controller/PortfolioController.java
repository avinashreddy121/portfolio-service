package com.practise.sample.microservices.portfolioservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.sample.microservices.portfolioservice.pojo.Portfolio;
import com.practise.sample.microservices.portfolioservice.repo.PortfolioRepository;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

	@Autowired
	private PortfolioRepository portfolioRepo;
	
	@Value("${server.port}")
	private String portNumber;
	
	@GetMapping("/getValuesById/{id}")
	public Portfolio getShareValuesByid(@PathVariable long id) {
		Portfolio portfolio=portfolioRepo.findById(id);
		portfolio.setPort(Integer.parseInt(portNumber));
		return portfolio;
	}
	
	@GetMapping("/getValuesByName/{name}")
	public Portfolio getShareValuesByName(@PathVariable String name) {
		Portfolio portfolio=portfolioRepo.findByStockName(name);
		portfolio.setPort(Integer.parseInt(portNumber));
		return portfolio;
	}
}
