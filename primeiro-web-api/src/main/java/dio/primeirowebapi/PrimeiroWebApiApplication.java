package dio.primeirowebapi;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title ="Web API Test",
		version = "2.0",
		description = "Estudando o desenvolvimento de  APIs com SpingBoot e documentando com Swagger"))
public class PrimeiroWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroWebApiApplication.class, args);
    }

}
