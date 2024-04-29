package com.cyb.spring.account;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/** action-mybatis.xml <tx:annotation~~ > **/
@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {
	private AccountDAO accDAO;

	 /** 생성자 누락 **/
	public AccountService() {
		System.out.println("Service");
	}
	
	public void setAccDAO(AccountDAO accDAO) {
		this.accDAO = accDAO;
	}

	public void sendMoney() throws Exception {
		accDAO.updateBalance1();
		accDAO.updateBalance2();
	}
}
