/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.controllers;

import com.api.blog.dto.CreatePostDTO;
import com.api.blog.dto.PostUserDTO;
import com.api.blog.dto.UserPostsDTO;
import com.api.blog.models.Posts;
import com.api.blog.repositories.PostsJpaRepository;
import com.api.blog.services.CreatePostMapService;
import com.api.blog.services.PostUserMapService;
import io.swagger.annotations.*;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin
@RequestMapping("/posts")

@Api(tags = "POSTS API")
public class PostsController {public static class __CLR4_4_11616kvjhct73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,88,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

   @Autowired
   private PostUserMapService postUserMapService;

   @Autowired
   private CreatePostMapService createPostMapService;

    @Autowired
    private PostsJpaRepository repository;

    @GetMapping
    public List<Posts> getPosts(@RequestParam(required = false) String title_like){try{__CLR4_4_11616kvjhct73.R.inc(42);
        __CLR4_4_11616kvjhct73.R.inc(43);if((((title_like != null)&&(__CLR4_4_11616kvjhct73.R.iget(44)!=0|true))||(__CLR4_4_11616kvjhct73.R.iget(45)==0&false))){{
            __CLR4_4_11616kvjhct73.R.inc(46);return repository.findByTitleContains(title_like);
        }
        }else {__CLR4_4_11616kvjhct73.R.inc(47);if((((title_like.contains(""))&&(__CLR4_4_11616kvjhct73.R.iget(48)!=0|true))||(__CLR4_4_11616kvjhct73.R.iget(49)==0&false))){{
            __CLR4_4_11616kvjhct73.R.inc(50);return repository.findAll();
        }
        }else{{
            __CLR4_4_11616kvjhct73.R.inc(51);return repository.findAll();
        }
    }}}finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    @RequestMapping("/page")
    @GetMapping
    @ResponseHeader(name= "Posts page response test", description = "This is posts page response description")
    public Page<Posts> getPostsPage(@RequestParam(required = true) Integer page, Integer size){try{__CLR4_4_11616kvjhct73.R.inc(52);
        __CLR4_4_11616kvjhct73.R.inc(53);return repository.getPostsPage(PageRequest.of(page,size, Sort.by("id").ascending()));
    }finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    @GetMapping("{id}")
    @ApiParam(name = "Path variable param.", defaultValue = "nulll")

    public Posts getPost(@PathVariable("id") Integer id){try{__CLR4_4_11616kvjhct73.R.inc(54);
     //   return "Id " + id;
     __CLR4_4_11616kvjhct73.R.inc(55);return repository.getById(id);
    }finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    // Varianta cu query
    @RequestMapping("/userposts/{id}")
    @GetMapping
    public List<?> getUserPosts(@PathVariable Integer id) {try{__CLR4_4_11616kvjhct73.R.inc(56);
        __CLR4_4_11616kvjhct73.R.inc(57);return repository.getUserPosts(id);
    }finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    // Varianta cu DTO
    @RequestMapping("/userandpost/{id}")
    @GetMapping
    public PostUserDTO getUserAndPostDto(@PathVariable Integer id) {try{__CLR4_4_11616kvjhct73.R.inc(58);
      __CLR4_4_11616kvjhct73.R.inc(59);return  postUserMapService.getPostAndUser(id);
    }finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}


    @PostMapping(path = "/create", produces = "application/vnd.piomin.app-v1.2+json",consumes = "application/vnd.piomin.app-v1.2+json")
    @Deprecated
    @ApiOperation(value = "Create a post v1.2")
    public ResponseEntity<Posts> createPost(@RequestBody final CreatePostDTO newPost) throws ServerException {try{__CLR4_4_11616kvjhct73.R.inc(60);
        __CLR4_4_11616kvjhct73.R.inc(61);Posts post = createPostMapService.createPost(newPost);

        __CLR4_4_11616kvjhct73.R.inc(62);if((((post == null )&&(__CLR4_4_11616kvjhct73.R.iget(63)!=0|true))||(__CLR4_4_11616kvjhct73.R.iget(64)==0&false))){{
            __CLR4_4_11616kvjhct73.R.inc(65);String err = "Server error! Try again!";
            __CLR4_4_11616kvjhct73.R.inc(66);throw new ServerException(err);
        }
        }else{{
            __CLR4_4_11616kvjhct73.R.inc(67);return new ResponseEntity<Posts>(post, HttpStatus.CREATED);
        }
    }}finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    @PostMapping(path = "/create/v1.3", produces = "application/vnd.piomin.app-v1.3+json",consumes = "application/vnd.piomin.app-v1.3+json")
    @ApiOperation(value = "Create a post v1.3")
    public ResponseEntity<Posts> createPostV13(@RequestBody final CreatePostDTO newPost) throws ServerException {try{__CLR4_4_11616kvjhct73.R.inc(68);
        __CLR4_4_11616kvjhct73.R.inc(69);Posts post = createPostMapService.createPost2(newPost);

        __CLR4_4_11616kvjhct73.R.inc(70);if((((post == null )&&(__CLR4_4_11616kvjhct73.R.iget(71)!=0|true))||(__CLR4_4_11616kvjhct73.R.iget(72)==0&false))){{
            __CLR4_4_11616kvjhct73.R.inc(73);String err = "Server error! Try again!";
            __CLR4_4_11616kvjhct73.R.inc(74);throw new ServerException(err);
        }
        }else{{
            __CLR4_4_11616kvjhct73.R.inc(75);return new ResponseEntity<Posts>(post, HttpStatus.CREATED);
        }
    }}finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

    @PutMapping(path = "/update")
    public ResponseEntity<String> updatePost(@RequestBody final Posts updatePost)  {try{__CLR4_4_11616kvjhct73.R.inc(76);
        __CLR4_4_11616kvjhct73.R.inc(77);String message = "";
        __CLR4_4_11616kvjhct73.R.inc(78);Posts post = repository.getById(updatePost.getId());

        __CLR4_4_11616kvjhct73.R.inc(79);if((((post != null)&&(__CLR4_4_11616kvjhct73.R.iget(80)!=0|true))||(__CLR4_4_11616kvjhct73.R.iget(81)==0&false))){{
            __CLR4_4_11616kvjhct73.R.inc(82);post.setBody(updatePost.getBody());
            __CLR4_4_11616kvjhct73.R.inc(83);post.setTitle(updatePost.getTitle());
            __CLR4_4_11616kvjhct73.R.inc(84);repository.save(post);
            __CLR4_4_11616kvjhct73.R.inc(85);message = "I have found post with title: " + post.getTitle() + " and the id of the post is: " + post.getId();
        }
        }else{{
            __CLR4_4_11616kvjhct73.R.inc(86);message = "Nothing found";
        }

        }__CLR4_4_11616kvjhct73.R.inc(87);return new ResponseEntity<String>(message, HttpStatus.OK);
    }finally{__CLR4_4_11616kvjhct73.R.flushNeeded();}}

}
