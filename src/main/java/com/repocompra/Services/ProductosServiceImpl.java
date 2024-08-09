package com.repocompra.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.repocompra.dto.Product;


@Service
public class ProductosServiceImpl {
	
	 @Value("${fakestoreapi.external.service.base-url}")
	    private String basePath;

	    private final RestTemplate restTemplate;
	    
	    public ProductosServiceImpl(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }
	    
	    public List<Product> getProductos(){
	    	Product[] response = restTemplate.getForObject(basePath+"products", Product[].class);
	        return Arrays.asList(response);
	    }

}
