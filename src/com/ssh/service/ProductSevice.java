package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ProductDao;
import com.ssh.domain.Product;

@Transactional
public class ProductSevice {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		System.out.println("Sevice中的方法执行了。。。");
		productDao.save(product);
	}
	
}
