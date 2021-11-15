/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.services;

import com.api.blog.dto.CreatePostDTO;
import com.api.blog.dto.PostUserDTO;
import com.api.blog.models.Posts;
import com.api.blog.repositories.PostsJpaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePostMapService {public static class __CLR4_4_16i6ikvjhct92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,244,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private PostsJpaRepository postsJpaRepository;

    @Autowired
    private ModelMapper modelMapper;


    public Posts createPost(CreatePostDTO post) {try{__CLR4_4_16i6ikvjhct92.R.inc(234);
        __CLR4_4_16i6ikvjhct92.R.inc(235);Posts newPost = convertDtoToPost(post);
      __CLR4_4_16i6ikvjhct92.R.inc(236);return  postsJpaRepository.saveAndFlush(newPost);
    }finally{__CLR4_4_16i6ikvjhct92.R.flushNeeded();}}

    public Posts createPost2(CreatePostDTO post) {try{__CLR4_4_16i6ikvjhct92.R.inc(237);
        __CLR4_4_16i6ikvjhct92.R.inc(238);Posts newPost = convertDtoToPost(post);
      __CLR4_4_16i6ikvjhct92.R.inc(239);return  postsJpaRepository.saveAndFlush(newPost);
    }finally{__CLR4_4_16i6ikvjhct92.R.flushNeeded();}}



    private Posts convertDtoToPost(CreatePostDTO postDTO){try{__CLR4_4_16i6ikvjhct92.R.inc(240);
        __CLR4_4_16i6ikvjhct92.R.inc(241);modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        __CLR4_4_16i6ikvjhct92.R.inc(242);Posts post = modelMapper
                .map(postDTO, Posts.class);
        __CLR4_4_16i6ikvjhct92.R.inc(243);return post;
    }finally{__CLR4_4_16i6ikvjhct92.R.flushNeeded();}}

}
