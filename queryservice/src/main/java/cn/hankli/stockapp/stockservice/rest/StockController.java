package cn.hankli.stockapp.stockservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.data.Stock;
import cn.hankli.stockapp.data.StockRepository;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StockRepository stockRepository;
	
	
	@GetMapping(produces="application/json")
	public ResponseEntity<List<Stock>> getAllStock() {
		
		List<Stock> stockList;
		HttpStatus status;
		
		stockList = stockRepository.findAll();
		
		if(stockList.size() == 0) {
			
			status = HttpStatus.NOT_FOUND;
			
		} else {
			
			status = HttpStatus.OK;
		}
		
		return new ResponseEntity<List<Stock>>(stockList, status);
		
	}
	
	@GetMapping(produces="application/json", path="/{code}")
	public ResponseEntity<Stock> getJson(@PathVariable String code) {
	
		Stock stock;
		HttpStatus status;
		
		
		stock = stockRepository.findByCode(code); 
		
		if(stock == null) {
			status = HttpStatus.NOT_FOUND;
		} else {
			status = HttpStatus.OK;
		}
		
		return new ResponseEntity<Stock>(stock, status);
	}
	
/*	
	@GetMapping(produces="application/xml", path="/stock/{code}")
	public @ResponseBody Stock getXml(@PathVariable String code) {
		
		
	}
*/
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Stock saveStock(@RequestBody Stock stock) {
		
		return stockRepository.save(stock);
	}
	

	@PutMapping()
	public Stock updateStock(@RequestBody Stock stock) {
		
		return stockRepository.save(stock);
	}
	
	
	
	@DeleteMapping(consumes="application/json", produces="application/json")
	public void deletStock(@PathVariable String code) {
		
		Stock stock;
		
		stock = stockRepository.findByCode(code);
		stockRepository.delete(stock);
		
	}
	
}
