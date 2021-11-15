/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.models;

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
public class User {public static class __CLR4_4_14s4skvjhct8l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public List<Posts> getUserPosts() {try{__CLR4_4_14s4skvjhct8l.R.inc(172); __CLR4_4_14s4skvjhct8l.R.inc(173);return userPosts;}finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getCompanyBs() {try{__CLR4_4_14s4skvjhct8l.R.inc(174);
        __CLR4_4_14s4skvjhct8l.R.inc(175);return companyBs;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setCompanyBs(String companyBs) {try{__CLR4_4_14s4skvjhct8l.R.inc(176);
        __CLR4_4_14s4skvjhct8l.R.inc(177);this.companyBs = companyBs;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getCompanyCatchphrase() {try{__CLR4_4_14s4skvjhct8l.R.inc(178);
        __CLR4_4_14s4skvjhct8l.R.inc(179);return companyCatchphrase;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setCompanyCatchphrase(String companyCatchphrase) {try{__CLR4_4_14s4skvjhct8l.R.inc(180);
        __CLR4_4_14s4skvjhct8l.R.inc(181);this.companyCatchphrase = companyCatchphrase;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getCompanyName() {try{__CLR4_4_14s4skvjhct8l.R.inc(182);
        __CLR4_4_14s4skvjhct8l.R.inc(183);return companyName;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setCompanyName(String companyName) {try{__CLR4_4_14s4skvjhct8l.R.inc(184);
        __CLR4_4_14s4skvjhct8l.R.inc(185);this.companyName = companyName;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getWebsite() {try{__CLR4_4_14s4skvjhct8l.R.inc(186);
        __CLR4_4_14s4skvjhct8l.R.inc(187);return website;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setWebsite(String website) {try{__CLR4_4_14s4skvjhct8l.R.inc(188);
        __CLR4_4_14s4skvjhct8l.R.inc(189);this.website = website;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getPhone() {try{__CLR4_4_14s4skvjhct8l.R.inc(190);
        __CLR4_4_14s4skvjhct8l.R.inc(191);return phone;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setPhone(String phone) {try{__CLR4_4_14s4skvjhct8l.R.inc(192);
        __CLR4_4_14s4skvjhct8l.R.inc(193);this.phone = phone;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public BigDecimal getAddressGeoLng() {try{__CLR4_4_14s4skvjhct8l.R.inc(194);
        __CLR4_4_14s4skvjhct8l.R.inc(195);return addressGeoLng;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressGeoLng(BigDecimal addressGeoLng) {try{__CLR4_4_14s4skvjhct8l.R.inc(196);
        __CLR4_4_14s4skvjhct8l.R.inc(197);this.addressGeoLng = addressGeoLng;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public BigDecimal getAddressGeoLat() {try{__CLR4_4_14s4skvjhct8l.R.inc(198);
        __CLR4_4_14s4skvjhct8l.R.inc(199);return addressGeoLat;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressGeoLat(BigDecimal addressGeoLat) {try{__CLR4_4_14s4skvjhct8l.R.inc(200);
        __CLR4_4_14s4skvjhct8l.R.inc(201);this.addressGeoLat = addressGeoLat;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getAddressZipcode() {try{__CLR4_4_14s4skvjhct8l.R.inc(202);
        __CLR4_4_14s4skvjhct8l.R.inc(203);return addressZipcode;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressZipcode(String addressZipcode) {try{__CLR4_4_14s4skvjhct8l.R.inc(204);
        __CLR4_4_14s4skvjhct8l.R.inc(205);this.addressZipcode = addressZipcode;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getAddressCity() {try{__CLR4_4_14s4skvjhct8l.R.inc(206);
        __CLR4_4_14s4skvjhct8l.R.inc(207);return addressCity;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressCity(String addressCity) {try{__CLR4_4_14s4skvjhct8l.R.inc(208);
        __CLR4_4_14s4skvjhct8l.R.inc(209);this.addressCity = addressCity;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getAddressSuite() {try{__CLR4_4_14s4skvjhct8l.R.inc(210);
        __CLR4_4_14s4skvjhct8l.R.inc(211);return addressSuite;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressSuite(String addressSuite) {try{__CLR4_4_14s4skvjhct8l.R.inc(212);
        __CLR4_4_14s4skvjhct8l.R.inc(213);this.addressSuite = addressSuite;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getAddressStreet() {try{__CLR4_4_14s4skvjhct8l.R.inc(214);
        __CLR4_4_14s4skvjhct8l.R.inc(215);return addressStreet;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setAddressStreet(String addressStreet) {try{__CLR4_4_14s4skvjhct8l.R.inc(216);
        __CLR4_4_14s4skvjhct8l.R.inc(217);this.addressStreet = addressStreet;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getEmail() {try{__CLR4_4_14s4skvjhct8l.R.inc(218);
        __CLR4_4_14s4skvjhct8l.R.inc(219);return email;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_4_14s4skvjhct8l.R.inc(220);
        __CLR4_4_14s4skvjhct8l.R.inc(221);this.email = email;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getUsername() {try{__CLR4_4_14s4skvjhct8l.R.inc(222);
        __CLR4_4_14s4skvjhct8l.R.inc(223);return username;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setUsername(String username) {try{__CLR4_4_14s4skvjhct8l.R.inc(224);
        __CLR4_4_14s4skvjhct8l.R.inc(225);this.username = username;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_14s4skvjhct8l.R.inc(226);
        __CLR4_4_14s4skvjhct8l.R.inc(227);return name;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_4_14s4skvjhct8l.R.inc(228);
        __CLR4_4_14s4skvjhct8l.R.inc(229);this.name = name;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public Integer getId() {try{__CLR4_4_14s4skvjhct8l.R.inc(230);
        __CLR4_4_14s4skvjhct8l.R.inc(231);return id;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}

    public void setId(Integer id) {try{__CLR4_4_14s4skvjhct8l.R.inc(232);
        __CLR4_4_14s4skvjhct8l.R.inc(233);this.id = id;
    }finally{__CLR4_4_14s4skvjhct8l.R.flushNeeded();}}
}