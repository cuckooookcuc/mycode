package annotation;

import java.lang.reflect.Field;

public class ControlTest {
    public static void main(String[] args) throws Exception  {
//        Annotation[] annotations = Class.forName("annotation.FirstTest").getAnnotations();
        Field[] fields=Class.forName("annotation.FirstTest").getFields();
        int sum = 0;
        for (Field field :
                fields) {
            if (field.isAnnotationPresent(FirstAnnotionTest.class)){

                sum +=field.getAnnotation(FirstAnnotionTest.class).age();
            }
        }
        System.out.println(sum);
        System.out.println(1);
    }
}
