package com.example.ShopApp.service;

import com.example.ShopApp.model.Product;
import com.example.ShopApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo pr;
    
    public Product getProductById(int id) {
       return pr.findById(id).orElse(null) ;
    }

    public List<Product> getAllProducts() {
        return pr.findAll();
    }

    public void addProduct(Product product) {
        pr.save(product);
    }

    public Product addProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return pr.save(product);

    }

    public void deleteProduct(int id) {
        pr.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return pr.findByProductNameContaining(keyword);
    }
}
