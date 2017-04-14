package com.ssh.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ssh.domain.Product;

public class ProductDao{

	private HibernateTemplate hibernateTemplate;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public void save(Product product){
		hibernateTemplate.save(product);
		System.out.println("Dao中的方法执行了。。。");
	}
}
