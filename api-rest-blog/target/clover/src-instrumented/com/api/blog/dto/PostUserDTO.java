/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUserDTO {public static class __CLR4_4_13434kvjhct7s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("body")
    private String body;

    @JsonProperty("title")
    private String title;

    @JsonProperty("userId")
    private Integer userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    public Integer getId() {try{__CLR4_4_13434kvjhct7s.R.inc(112);
        __CLR4_4_13434kvjhct7s.R.inc(113);return id;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public String getBody() {try{__CLR4_4_13434kvjhct7s.R.inc(114);
        __CLR4_4_13434kvjhct7s.R.inc(115);return body;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_4_13434kvjhct7s.R.inc(116);
        __CLR4_4_13434kvjhct7s.R.inc(117);return title;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public Integer getUserId() {try{__CLR4_4_13434kvjhct7s.R.inc(118);
        __CLR4_4_13434kvjhct7s.R.inc(119);return userId;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public String getUsername() {try{__CLR4_4_13434kvjhct7s.R.inc(120);
        __CLR4_4_13434kvjhct7s.R.inc(121);return username;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_13434kvjhct7s.R.inc(122);
        __CLR4_4_13434kvjhct7s.R.inc(123);return name;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public String getEmail() {try{__CLR4_4_13434kvjhct7s.R.inc(124);
        __CLR4_4_13434kvjhct7s.R.inc(125);return email;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setId(Integer id) {try{__CLR4_4_13434kvjhct7s.R.inc(126);
        __CLR4_4_13434kvjhct7s.R.inc(127);this.id = id;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setBody(String body) {try{__CLR4_4_13434kvjhct7s.R.inc(128);
        __CLR4_4_13434kvjhct7s.R.inc(129);this.body = body;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_4_13434kvjhct7s.R.inc(130);
        __CLR4_4_13434kvjhct7s.R.inc(131);this.title = title;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setUserId(Integer userId) {try{__CLR4_4_13434kvjhct7s.R.inc(132);
        __CLR4_4_13434kvjhct7s.R.inc(133);this.userId = userId;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setUsername(String username) {try{__CLR4_4_13434kvjhct7s.R.inc(134);
        __CLR4_4_13434kvjhct7s.R.inc(135);this.username = username;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_4_13434kvjhct7s.R.inc(136);
        __CLR4_4_13434kvjhct7s.R.inc(137);this.name = name;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_4_13434kvjhct7s.R.inc(138);
        __CLR4_4_13434kvjhct7s.R.inc(139);this.email = email;
    }finally{__CLR4_4_13434kvjhct7s.R.flushNeeded();}}
}
