package com.tutorial.crudmongoback.CRUD.controller;

import com.tutorial.crudmongoback.CRUD.dto.ProductDto;
import com.tutorial.crudmongoback.CRUD.entity.Product;
import com.tutorial.crudmongoback.CRUD.service.ProductService;
import com.tutorial.crudmongoback.global.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getOne(@PathVariable("id") int id) throws ResourceNotFoundException {
        return ResponseEntity.ok(productService.getOne(id));
    }

    @PostMapping
    public ResponseEntity<Product> save(@Valid @RequestBody ProductDto dto) {
        return ResponseEntity.ok(productService.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable("id") int id, @RequestBody @Valid ProductDto dto) throws ResourceNotFoundException {
        return ResponseEntity.ok(productService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        return ResponseEntity.ok(productService.delete(id));
    }

    @GetMapping("/mostExpensive/{category}")
    public ResponseEntity<Product> getMostExpensiveProductByCategory(@PathVariable("category") String category) throws ResourceNotFoundException {
        return ResponseEntity.ok(productService.getMostExpensiveProductByCategory(category));
    }




}
