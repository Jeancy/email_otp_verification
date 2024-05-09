package com.codewithsaurabh.email_otp_verification.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
// In this case, User class is marked with @Entity annotation,
// indicating that instances of this class will be persisted in a database.
// named "users"
// The @Id annotation marks the id field as the primary key of the corresponding
// database table.
// The @Entity annotation in Java is used in the context of Java Persistence API
//(JPA), particularly when working with frameworks like Hibernate, to mark 
// a Java class as an entity. An entity in JPA represents a table in a relational
// database. Each instance of an entity corresponds to a row in the table.

@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	private String username;
	private String email;
	private String otp;
	private boolean verified;
}
