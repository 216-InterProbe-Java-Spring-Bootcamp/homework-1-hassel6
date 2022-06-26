package com.example.odev1hassel6.controller;

import com.example.odev1hassel6.ents.ProductComment;
import com.example.odev1hassel6.service.ProductCommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ProductCommentController {

    private final ProductCommentEntityService productCommentEntityService;

    @GetMapping("/comments/product/{id}")
    public List<ProductComment> findAllByCommentProductID(@PathVariable Long id){
        return productCommentEntityService.findAllByCommentProductID(id);
    }

    @GetMapping("/comments/customer/{id}")
    public List<ProductComment> findAllByCommentCustomerID(@PathVariable Long id){
        return productCommentEntityService.findAllByCommentCustomerID(id);
    }

    @GetMapping("/comments/product/{id}/date_between/{startDate}/{endDate}")
    public List<ProductComment> getAllProductCommentsBetweenDates(@PathVariable Long id, @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date startDate, @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date endDate) {
        return productCommentEntityService.findAllByCommentProductIDAndDates( id, startDate, endDate );
    }

}
