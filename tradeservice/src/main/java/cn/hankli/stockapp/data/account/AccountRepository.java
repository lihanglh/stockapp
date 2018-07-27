package cn.hankli.stockapp.data.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	public Account findByIdNo(String idNo);

}
