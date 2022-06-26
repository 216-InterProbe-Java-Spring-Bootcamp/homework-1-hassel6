package com.example.odev1hassel6.service;

import com.example.odev1hassel6.dao.ProductCommentDao;
import com.example.odev1hassel6.ents.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCommentEntityService {
    private final ProductCommentDao productCommentDao;
    //private final CustomerDao customerDao;
    //private final ProductDao productDao;

    public List<ProductComment> findAllByCommentProductID(Long id) {
        return productCommentDao.findAllByCommentProductID( id );
    }

    public List<ProductComment> findAllByCommentCustomerID(Long id) {
        return productCommentDao.findAllByCommentCustomerID(id);
    }

    public List<ProductComment> findAllByCommentProductIDAndDates(Long id, Date startDate, Date endDate) {
        return productCommentDao.findAllByCommentProductIDAndDates( id, startDate, endDate );
    }

    public List<ProductComment> findAllByCommentCustomerIDAndDates( Long id, Date startDate, Date endDate ) {
        return productCommentDao.findAllByCommentCustomerIDAndDates( id, startDate, endDate );
    }
}
