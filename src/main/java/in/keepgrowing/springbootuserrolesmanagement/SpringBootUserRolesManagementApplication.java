package in.keepgrowing.springbootuserrolesmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootUserRolesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserRolesManagementApplication.class, args);
	}

}
