package amit.springframework.amitjokeapp_UsingXMLConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class AmitJokeappUsingXmlConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmitJokeappUsingXmlConfigurationApplication.class, args);
	}

}
