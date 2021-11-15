/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.models;

import com.api.blog.controllers.UserController;
import com.api.blog.dto.UserPostsDTO;
import com.api.blog.repositories.UserJpaRepository;
import com.api.blog.services.UserPostsMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {static class __CLR4_4_18282kvjhctbg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941543001L,8589935092L,295,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @LocalServerPort
    private int port;

    @Autowired
    private UserJpaRepository repository;

    @Autowired
    private UserController uc;

    @Autowired
    private TestRestTemplate restTemplate;


    @Autowired
    private UserPostsMapService service;

    @Test
    public void getUsers() throws Exception{__CLR4_4_18282kvjhctbg.R.globalSliceStart(getClass().getName(),290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnnw6f82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18282kvjhctbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_18282kvjhctbg.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.UserTest.getUsers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnnw6f82() throws Exception{try{__CLR4_4_18282kvjhctbg.R.inc(290);
    __CLR4_4_18282kvjhctbg.R.inc(291);List<User> users = uc.getUsers("");

    __CLR4_4_18282kvjhctbg.R.inc(292);assertTrue(users.size() > 0);
    }finally{__CLR4_4_18282kvjhctbg.R.flushNeeded();}}


    @Test
    public void getOneUser() throws  Exception {__CLR4_4_18282kvjhctbg.R.globalSliceStart(getClass().getName(),293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3i1vi85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18282kvjhctbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_18282kvjhctbg.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.UserTest.getOneUser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3i1vi85() throws Exception{try{__CLR4_4_18282kvjhctbg.R.inc(293);

        __CLR4_4_18282kvjhctbg.R.inc(294);assertThat(restTemplate.getForObject("http://localhost:" + port +"/users/1" , User.class)).isNotNull();
    }finally{__CLR4_4_18282kvjhctbg.R.flushNeeded();}}
}
