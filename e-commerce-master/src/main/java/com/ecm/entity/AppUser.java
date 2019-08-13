package com.ecm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="app_users")
public class AppUser implements Serializable {

	private static final long serialVersionUID = -2054386655979281969L;
	 
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";
 
    
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
   
    @Id
    @Column(name = "User_Email", nullable = false)
    private String email;
   
    @Column(name = "User_Name", length = 20, nullable = false)
    private String userName;
 
    @Column(name = "Encryted_Password", length = 128, nullable = false)
    private String password;
 
	/*
	 * @Column(name = "Active", length = 1, nullable = false) private boolean
	 * active;
	 */
    @Column(name = "User_Role", length = 20, nullable = false)
    private String userRole;
    
    @Column(length=10,nullable=false)
    private String mobile;
    
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "cartId")
	 * 
	 * @JsonIgnore private Cart cart;
	 */
    
    @OneToMany(mappedBy = "appUser")
    private List<Role> roles;
    
	/*
	 * @OneToMany(mappedBy = "customer") private List<ProductComment>
	 * productComments;
	 */ 
    
    @OneToMany(mappedBy = "appUser", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<ShippingAddress> shippingAddresses;
    
    @OneToMany(mappedBy = "customer")
    private List<Code> codes;
    
}
  