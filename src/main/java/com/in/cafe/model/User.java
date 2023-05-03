package com.in.cafe.model;


import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
@NamedQuery(name = "User.findByEmailId",query = "select u from User u where u.email=:email")
@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class User implements Serializable {

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactNumner;
    private String email;
    private String password;
    private String status;
    private String role;
}
