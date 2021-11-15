/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog.controllers;

import com.api.blog.dto.UserPostsDTO;
import com.api.blog.models.User;
import com.api.blog.repositories.UserJpaRepository;
import com.api.blog.services.UserPostsMapService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
@Api(tags = "USERS API")
public class UserController {public static class __CLR4_4_12g2gkvjhct7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,96,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private UserJpaRepository repository;

    @Autowired
    private UserPostsMapService service;

    @GetMapping
    @ApiOperation(value="Get all users or only users that contain the name in param")
    @ApiResponses(value = {
            @ApiResponse(code=200, message="Successfully!"),
            @ApiResponse(code=401, message="Successfully!")
    })

    public List<User> getUsers (@ApiParam(value="Name parameter if you want to search users by name, it is not required!", required = false)@RequestParam(required = false) String name ){try{__CLR4_4_12g2gkvjhct7d.R.inc(88);
        __CLR4_4_12g2gkvjhct7d.R.inc(89);if((((name != null)&&(__CLR4_4_12g2gkvjhct7d.R.iget(90)!=0|true))||(__CLR4_4_12g2gkvjhct7d.R.iget(91)==0&false))){{
        __CLR4_4_12g2gkvjhct7d.R.inc(92);return repository.findByNameContains(name);
        }
        }else {{
            __CLR4_4_12g2gkvjhct7d.R.inc(93);return repository.findAll();
        }
    }}finally{__CLR4_4_12g2gkvjhct7d.R.flushNeeded();}}

    @GetMapping("{id}")
    public User getOneUser (@PathVariable("id") Integer id){try{__CLR4_4_12g2gkvjhct7d.R.inc(94);
        __CLR4_4_12g2gkvjhct7d.R.inc(95);return repository.getById(id);
    }finally{__CLR4_4_12g2gkvjhct7d.R.flushNeeded();}}

   // @RequestMapping("/test")
   // @GetMapping
    //public List<UserPostsDTO> getUsersPosts(@RequestParam(required = false) Integer id){
      //  if(id!= null){
       //     return service.getUsersPosts(id);
     //   }
      ///  else{
     ///       return service.getAllUsersPosts();
     //   }
   // }
}
