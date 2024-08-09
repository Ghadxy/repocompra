package com.repocompra.Controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repocompra.Services.ProductosServiceImpl;
import com.repocompra.dto.Product;

@RestController
@RequestMapping("api/products")
public class ProductosController {
	
	 private final ProductosServiceImpl productservice;
	 
	 public ProductosController(ProductosServiceImpl productservice) {
	        this.productservice = productservice;
	    }	
	 
	
	 @GetMapping("/all")
	    public ResponseEntity<List<Product>> getAll(){
	        return new ResponseEntity<>(productservice.getProductos(), HttpStatus.OK);
	    }
}
