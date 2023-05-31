package com.hjp.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author：hjp
 * @date: 2023-05-31
 * @Copyright： hjp
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}