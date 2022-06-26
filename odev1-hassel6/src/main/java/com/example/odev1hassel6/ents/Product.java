package com.example.odev1hassel6.ents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name="PRODUCTS" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue( generator = "Product", strategy = GenerationType.SEQUENCE )
    @SequenceGenerator( name = "Product", sequenceName = "PRODUCTS_ID_SEQ" )
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)

    @Column( name = "PRODUCT_NAME", nullable = false )
    private String productName;

    @Column( name = "PRODUCT_PRICE", length = 50, nullable = false )
    private Long productPrice;

    @Column( name = "PRODUCT_EXPIRE_DATE" )
    @Temporal( TemporalType.TIMESTAMP )
    private Date productExpireDate;
}
