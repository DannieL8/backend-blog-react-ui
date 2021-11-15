package com.api.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "users")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description="This is the Post Model!")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "username", nullable = false, length = 80)
    private String username;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "address_street", length = 60)
    private String addressStreet;

    @Column(name = "address_suite", length = 60)
    private String addressSuite;

    @Column(name = "address_city", length = 60)
    private String addressCity;

    @Column(name = "address_zipcode", length = 60)
    private String addressZipcode;

    @Column(name = "address_geo_lat", precision = 60, scale = 4)
    private BigDecimal addressGeoLat;

    @Column(name = "address_geo_lng", precision = 60, scale = 4)
    private BigDecimal addressGeoLng;

    @Column(name = "phone", length = 60)
    private String phone;

    @Column(name = "website", length = 60)
    private String website;

    @Column(name = "company_name", length = 60)
    private String companyName;

    @Column(name = "company_catchphrase", length = 60)
    private String companyCatchphrase;

    @Column(name = "company_bs", length = 60)
    private String companyBs;

    @OneToMany(mappedBy = "user")
    private List<Posts> userPosts;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
    public List<Posts> getUserPosts() { return userPosts;}

    public String getCompanyBs() {
        return companyBs;
    }

    public void setCompanyBs(String companyBs) {
        this.companyBs = companyBs;
    }

    public String getCompanyCatchphrase() {
        return companyCatchphrase;
    }

    public void setCompanyCatchphrase(String companyCatchphrase) {
        this.companyCatchphrase = companyCatchphrase;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getAddressGeoLng() {
        return addressGeoLng;
    }

    public void setAddressGeoLng(BigDecimal addressGeoLng) {
        this.addressGeoLng = addressGeoLng;
    }

    public BigDecimal getAddressGeoLat() {
        return addressGeoLat;
    }

    public void setAddressGeoLat(BigDecimal addressGeoLat) {
        this.addressGeoLat = addressGeoLat;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSuite() {
        return addressSuite;
    }

    public void setAddressSuite(String addressSuite) {
        this.addressSuite = addressSuite;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}