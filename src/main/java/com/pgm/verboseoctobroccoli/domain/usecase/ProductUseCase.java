package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IProductServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.*;
import com.pgm.verboseoctobroccoli.domain.model.Product;
import com.pgm.verboseoctobroccoli.domain.spi.IProductPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.repo.CategoryRepository;
import com.pgm.verboseoctobroccoli.domain.spi.repo.ProductRepository;
import com.pgm.verboseoctobroccoli.domain.util.ValidateProduct;

import java.util.List;

public class ProductUseCase implements IProductServicePort {

    private final IProductPersistencePort productPersistencePort;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductUseCase(IProductPersistencePort productPersistencePort, ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productPersistencePort = productPersistencePort;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        if (productRepository.existsByName(product.getName())) {
            throw new InvalidNameException();
        }
        if (!categoryRepository.existsById(product.getCategory())) {
            throw new InvalidCategoryException();
        }
        if (ValidateProduct.isValidReqBody(product)) {
            throw new RequestBodyInvalidException();
        }
        if (ValidateProduct.isValidPrice(product.getPrice())) {
            throw new InvalidPriceException();
        }
        if (ValidateProduct.isValidStock(product.getStock())) {
            throw new InvalidStockException();
        }

        return productPersistencePort.saveProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productPersistencePort.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
        return productPersistencePort.getProductById(id);
    }
}
