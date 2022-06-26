package com.example.odev1hassel6.ents;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "COMMENTS" )
@Getter
@Setter

public class ProductComment {
    @Id
    @GeneratedValue( generator = "Comment", strategy = GenerationType.SEQUENCE )
    @SequenceGenerator( name = "Comment", sequenceName = "COMMENTS_ID_SEQ" )
    private Long Id;

   //@ManyToOne(fetch = FetchType.LAZY)

    @Column( name = "COMMENT", length = 500, nullable = false )
    private String comment;

    @Column( name = "COMMENT_DATE", nullable = false )
    @Temporal( TemporalType.DATE )
    private Date commentDate;

    @Column( name = "PRODUCT_ID", nullable = false )
    private Long CommentProductID;

    @Column( name = "CUSTOMER_ID" )
    private Long CommentCustomerID;


}
