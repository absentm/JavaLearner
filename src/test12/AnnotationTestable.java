package test12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AnnotationTestable
 * Created by dm on 16-8-26.
 */
// JDK element annotation
@Retention(RetentionPolicy.RUNTIME) // make AnnotationTestable resave to runningtime
@Target(ElementType.METHOD) // make Annotation only function to Method
public @interface AnnotationTestable {

}
