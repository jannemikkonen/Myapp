package Myapp;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Import;

	@SpringBootApplication
	@Import (Swagger.class) //for Swagger documentation - Swagger home http://localhost:8080/swagger-ui.html
	public class Application {

		public static void main(String[] args) {
			SpringApplication.run(Application.class);
		}
	}

