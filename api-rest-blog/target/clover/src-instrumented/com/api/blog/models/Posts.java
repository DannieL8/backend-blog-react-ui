/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description="This is the Post Model!")
public class Posts {public static class __CLR4_4_14848kvjhct88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "This represents unique id. It is auto increment.")
    private Integer Id;

    @Column(name = "title")
    private String title;

    @Column(name="body")
    private String body;

    @Column(name="userid")
    private Integer userid;

    public Integer getUserid() {try{__CLR4_4_14848kvjhct88.R.inc(152);
        __CLR4_4_14848kvjhct88.R.inc(153);return userid;
    }finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public void setUserid(Integer userid) {try{__CLR4_4_14848kvjhct88.R.inc(154);
        __CLR4_4_14848kvjhct88.R.inc(155);this.userid = userid;
    }finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    @JsonIgnore
    private User user;


    public Integer getId() {try{__CLR4_4_14848kvjhct88.R.inc(156); __CLR4_4_14848kvjhct88.R.inc(157);return Id;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_4_14848kvjhct88.R.inc(158); __CLR4_4_14848kvjhct88.R.inc(159);return title;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}
    public void setTitle(String title) {try{__CLR4_4_14848kvjhct88.R.inc(160);__CLR4_4_14848kvjhct88.R.inc(161);this.title= title;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public String getBody() {try{__CLR4_4_14848kvjhct88.R.inc(162); __CLR4_4_14848kvjhct88.R.inc(163);return body;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}
    public void setBody(String body) {try{__CLR4_4_14848kvjhct88.R.inc(164);__CLR4_4_14848kvjhct88.R.inc(165);this.body = body;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public User getUser(){try{__CLR4_4_14848kvjhct88.R.inc(166);__CLR4_4_14848kvjhct88.R.inc(167);return user;}finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public void setId(Integer id) {try{__CLR4_4_14848kvjhct88.R.inc(168);
        __CLR4_4_14848kvjhct88.R.inc(169);this.Id = id;
    }finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}

    public void setUser(User user) {try{__CLR4_4_14848kvjhct88.R.inc(170);
        __CLR4_4_14848kvjhct88.R.inc(171);this.user = user;
    }finally{__CLR4_4_14848kvjhct88.R.flushNeeded();}}
}