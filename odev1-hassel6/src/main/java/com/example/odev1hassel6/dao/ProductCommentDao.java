package com.example.odev1hassel6.dao;

import com.example.odev1hassel6.ents.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductCommentDao extends JpaRepository<ProductComment, Long> {

    List<ProductComment> findAllByCommentCustomerID(Long id);

    List<ProductComment> findAllByCommentProductID(Long id);

    List<ProductComment> findAllByCommentProductIDAndDates( Long id, Date startDate, Date endDate );

    List<ProductComment> findAllByCommentCustomerIDAndDates( Long id, Date startDate, Date endDate );
}
