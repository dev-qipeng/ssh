package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.Product;
import com.ssh.service.ProductSevice;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	
	Product product = new Product();

	@Override
	public Product getModel() {
		return product;
	}

	private ProductSevice productSevice;

	public void setProductSevice(ProductSevice productSevice) {
		this.productSevice = productSevice;
	}
	
	public String save(){
		System.out.println("Action中的方法执行了。。。");
		productSevice.save(product);
		return NONE;
	}

}
