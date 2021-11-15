/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.api.blog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {public static class __CLR4_4_122kvjhct6d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u0061\u0070\u0069\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0061\u0070\u0069\u002d\u0072\u0065\u0073\u0074\u002d\u0062\u006c\u006f\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635941542757L,8589935092L,35,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ApiKey apiKey() {try{__CLR4_4_122kvjhct6d.R.inc(2);
        __CLR4_4_122kvjhct6d.R.inc(3);return new ApiKey("JWT", "Authorization", "header");
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}

    private SecurityContext securityContext() {try{__CLR4_4_122kvjhct6d.R.inc(4);
        __CLR4_4_122kvjhct6d.R.inc(5);return SecurityContext.builder().securityReferences(defaultAuth()).build();
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}

    private List<SecurityReference> defaultAuth() {try{__CLR4_4_122kvjhct6d.R.inc(6);
        __CLR4_4_122kvjhct6d.R.inc(7);AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        __CLR4_4_122kvjhct6d.R.inc(8);AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        __CLR4_4_122kvjhct6d.R.inc(9);authorizationScopes[0] = authorizationScope;
        __CLR4_4_122kvjhct6d.R.inc(10);return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}


    @Bean
    public Docket swaggerConfiguration() {try{__CLR4_4_122kvjhct6d.R.inc(11);
        __CLR4_4_122kvjhct6d.R.inc(12);return new Docket(DocumentationType.SWAGGER_2) .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey())).
        select().
                paths(PathSelectors.any()).
                apis(RequestHandlerSelectors.basePackage("com.api.blog")).build();
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}

    @Bean
    public Docket swaggerPersonApi12() {try{__CLR4_4_122kvjhct6d.R.inc(13);
        __CLR4_4_122kvjhct6d.R.inc(14);return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api-1.2")
                .select()
                .apis(p -> {
                    __CLR4_4_122kvjhct6d.R.inc(15);if ((((p.produces() != null)&&(__CLR4_4_122kvjhct6d.R.iget(16)!=0|true))||(__CLR4_4_122kvjhct6d.R.iget(17)==0&false))) {{
                        __CLR4_4_122kvjhct6d.R.inc(18);for (MediaType mt : p.produces()) {{
                            __CLR4_4_122kvjhct6d.R.inc(19);if ((((mt.toString().equals("application/vnd.piomin.app-v1.2+json"))&&(__CLR4_4_122kvjhct6d.R.iget(20)!=0|true))||(__CLR4_4_122kvjhct6d.R.iget(21)==0&false))) {{
                                __CLR4_4_122kvjhct6d.R.inc(22);return true;
                            }
                        }}
                    }}
                    }__CLR4_4_122kvjhct6d.R.inc(23);return false;
                })
                .build()
                .produces(Collections.singleton("application/vnd.piomin.app-v1.2+json"))
                .apiInfo(new ApiInfoBuilder().version("1.2").title("Posts API").description("Documentation Person API v1.2").build());
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}

    @Bean
    public Docket swaggerPersonApi13() {try{__CLR4_4_122kvjhct6d.R.inc(24);
        __CLR4_4_122kvjhct6d.R.inc(25);return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api-1.3")
                .select()
                .apis(p -> {
                    __CLR4_4_122kvjhct6d.R.inc(26);if ((((p.produces() != null)&&(__CLR4_4_122kvjhct6d.R.iget(27)!=0|true))||(__CLR4_4_122kvjhct6d.R.iget(28)==0&false))) {{
                        __CLR4_4_122kvjhct6d.R.inc(29);for (MediaType mt : p.produces()) {{
                            __CLR4_4_122kvjhct6d.R.inc(30);if ((((mt.toString().equals("application/vnd.piomin.app-v1.3+json"))&&(__CLR4_4_122kvjhct6d.R.iget(31)!=0|true))||(__CLR4_4_122kvjhct6d.R.iget(32)==0&false))) {{
                                __CLR4_4_122kvjhct6d.R.inc(33);return true;
                            }
                        }}
                    }}
                    }__CLR4_4_122kvjhct6d.R.inc(34);return false;
                })
                .build()
                .produces(Collections.singleton("application/vnd.piomin.app-v1.3+json"))
                .apiInfo(new ApiInfoBuilder().version("1.3").title("POSTS v1.3").description("Documentation Posts API v1.3").build());
    }finally{__CLR4_4_122kvjhct6d.R.flushNeeded();}}

    
}
