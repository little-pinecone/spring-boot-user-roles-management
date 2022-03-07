package in.keepgrowing.springboottypesafeuserroles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootTypeSafeUserRolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTypeSafeUserRolesApplication.class, args);
	}

}
