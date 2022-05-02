package com.nike.entity;

import javax.persistence.*;

@Entity
public class UserEntity {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(nullable = false )
    private String id;

    private String password;

    private String email;

    private String reg_date;

    private String corr_date;

    private String role;

    private String mac_addr;

    private String refresh_key;
}

