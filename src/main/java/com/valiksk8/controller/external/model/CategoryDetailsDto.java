package com.valiksk8.controller.external.model;

import com.valiksk8.model.Category;
import com.valiksk8.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDetailsDto extends CategoryDto {

    private List<ProductDto> productList;

    public List<ProductDto> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDto> productList) {
        this.productList = productList;
    }

    public static CategoryDetailsDto of(Category category) {
        CategoryDetailsDto categoryDetailsDto = new CategoryDetailsDto();
        categoryDetailsDto.setId(category.getId());
        categoryDetailsDto.setCategoryName(category.getCategoryName());
        categoryDetailsDto.setProductList(makeProductDtoList(category.getProductList()));
        return categoryDetailsDto;
    }

    private static List<ProductDto> makeProductDtoList(List<Product> products){
        return products.stream().map(ProductDto::of).collect(Collectors.toList());
    }


}
