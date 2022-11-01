package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 Aplicação de cadastro de cliente, endereço com inserção de CEP que busca de logradouro.
 Utilizando padrões de projeto tipo Facade, Strategy e Singleton.
 Projeto gerado com Spring Boot Inicializr contendo Spring Data JPA, Spring WEB, H2 Database e OpenFeign.
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
