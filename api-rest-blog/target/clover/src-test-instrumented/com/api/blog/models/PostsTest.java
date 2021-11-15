/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.models;
import com.api.blog.controllers.PostsController;
import com.api.blog.dto.CreatePostDTO;
import com.api.blog.repositories.PostsJpaRepository;

import com.api.blog.services.CreatePostMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;;

@SpringBootTest
public class PostsTest {static class __CLR4_4_17i7ikvjhctb9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941543001L,8589935092L,290,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private CreatePostMapService createPostMapService;

    @Autowired
    private PostsJpaRepository repository;

    @Autowired
    private PostsController postsController;


    @Test
    public void getAllPosts() throws Exception{__CLR4_4_17i7ikvjhctb9.R.globalSliceStart(getClass().getName(),270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1upr5ox7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17i7ikvjhctb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_17i7ikvjhctb9.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.PostsTest.getAllPosts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1upr5ox7i() throws Exception{try{__CLR4_4_17i7ikvjhctb9.R.inc(270);
        __CLR4_4_17i7ikvjhctb9.R.inc(271);List<Posts> posts = repository.findAll();
        __CLR4_4_17i7ikvjhctb9.R.inc(272);assertTrue(posts.size()>0);
    }finally{__CLR4_4_17i7ikvjhctb9.R.flushNeeded();}}

    @Test
    public void getPostsPage() throws Exception{__CLR4_4_17i7ikvjhctb9.R.globalSliceStart(getClass().getName(),273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17j72st7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17i7ikvjhctb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_17i7ikvjhctb9.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.PostsTest.getPostsPage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17j72st7l() throws Exception{try{__CLR4_4_17i7ikvjhctb9.R.inc(273);
        __CLR4_4_17i7ikvjhctb9.R.inc(274);Page<Posts> page = repository.getPostsPage(PageRequest.of(1,6, Sort.by(Sort.Direction.DESC, "title")));
        __CLR4_4_17i7ikvjhctb9.R.inc(275);assertTrue(page.getTotalElements()>0);
    }finally{__CLR4_4_17i7ikvjhctb9.R.flushNeeded();}}

    @Test
    @Transactional
    public void createPost() throws  Exception{__CLR4_4_17i7ikvjhctb9.R.globalSliceStart(getClass().getName(),276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w22bnh7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17i7ikvjhctb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_17i7ikvjhctb9.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.PostsTest.createPost",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w22bnh7o() throws Exception{try{__CLR4_4_17i7ikvjhctb9.R.inc(276);
        __CLR4_4_17i7ikvjhctb9.R.inc(277);CreatePostDTO postDTO = new CreatePostDTO();

        __CLR4_4_17i7ikvjhctb9.R.inc(278);postDTO.setTitle("TEST TITLE");
        __CLR4_4_17i7ikvjhctb9.R.inc(279);postDTO.setBody("BODY TEST");
        __CLR4_4_17i7ikvjhctb9.R.inc(280);postDTO.setUserid(4);

        __CLR4_4_17i7ikvjhctb9.R.inc(281);Posts newPost = createPostMapService.createPost(postDTO);

        __CLR4_4_17i7ikvjhctb9.R.inc(282);assertEquals("TEST TITLE", newPost.getTitle());

        __CLR4_4_17i7ikvjhctb9.R.inc(283);repository.deleteById(newPost.getId());
    }finally{__CLR4_4_17i7ikvjhctb9.R.flushNeeded();}}

    @Test
    public void getPosts() throws Exception {__CLR4_4_17i7ikvjhctb9.R.globalSliceStart(getClass().getName(),284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppicas7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17i7ikvjhctb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_17i7ikvjhctb9.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.PostsTest.getPosts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppicas7w() throws Exception{try{__CLR4_4_17i7ikvjhctb9.R.inc(284);
        //Get all posts
    __CLR4_4_17i7ikvjhctb9.R.inc(285);List<Posts>  posts =  postsController.getPosts("");

    __CLR4_4_17i7ikvjhctb9.R.inc(286);assertTrue(posts.size() > 0 );
    }finally{__CLR4_4_17i7ikvjhctb9.R.flushNeeded();}}

    @Test
    public void getPostsByTitle() throws Exception {__CLR4_4_17i7ikvjhctb9.R.globalSliceStart(getClass().getName(),287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibgje37z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17i7ikvjhctb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_17i7ikvjhctb9.R.globalSliceEnd(getClass().getName(),"com.api.blog.models.PostsTest.getPostsByTitle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibgje37z() throws Exception{try{__CLR4_4_17i7ikvjhctb9.R.inc(287);
        //Get all posts
    __CLR4_4_17i7ikvjhctb9.R.inc(288);List<Posts>  posts =  postsController.getPosts("sunt");

    __CLR4_4_17i7ikvjhctb9.R.inc(289);assertTrue(posts.size() > 0);
    }finally{__CLR4_4_17i7ikvjhctb9.R.flushNeeded();}}

}
