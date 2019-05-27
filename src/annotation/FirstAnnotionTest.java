package annotation;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotionTest  {
    String name() default "xiaojie";
    int age() default 25;
}
