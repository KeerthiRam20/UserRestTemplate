package com.example.UserRestTemplate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String id;

	public User(){

	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(int userid, String firstName, String lastName, String email, String id) {
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"userid=" + userid +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", id='" + id + '\'' +
				'}';
	}
}
