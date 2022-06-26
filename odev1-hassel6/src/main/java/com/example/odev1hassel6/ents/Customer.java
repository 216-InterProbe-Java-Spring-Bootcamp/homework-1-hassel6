package com.example.odev1hassel6.ents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table( name = "CUSTOMERS" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue( generator = "Customer", strategy = GenerationType.SEQUENCE )
    @SequenceGenerator( name = "Customer", sequenceName = "CUSTOMERS_ID_SEQ" )
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)

    @Column( name = "NAME", length = 50, nullable = false )
    private String userName;

    @Column( name = "SURNAME", length = 50, nullable = false )
    private String userSurname;

    @Email
    @Column( name = "EMAIL", length = 50, nullable = false )
    private String userEMail;

    @Column( name = "PHONE", length = 15, nullable = false )
    private String userPhone;



}
