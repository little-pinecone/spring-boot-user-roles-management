package in.keepgrowing.springbootuserrolesmanagement.testing.annotations;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(roles = "CHIEF_OPERATING_OFFICER")
public @interface WithMockChiefOperationOfficer {
}
