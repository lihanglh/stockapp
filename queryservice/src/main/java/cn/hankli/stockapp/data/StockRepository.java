package cn.hankli.stockapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	Stock findByCode(String code);
	Stock findByName(String name);

}
