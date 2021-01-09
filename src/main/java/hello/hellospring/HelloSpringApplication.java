package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// 스프링 어플리케이션런에 실행하고자 하는 클래스를 넣어주면 실행가능
		// @SpringBootApplication은 세가지 특징을 제공
		// @EnableAutoConfiguration : 스프링부트의 자동화 기능(Spring)설정을 활성화 시켜줌
		// @ComponentScan : 패키지내 application 컴포넌트가 어디에 위치해 있는지 검사( 빈 검색 )
		// @Configuration : 빈에 대해서 Context에 추가하거나 특정 클래스를 참조해 올 수 있음//
		// 스프링 어플리케이션은 이 세가지 어노테이션을 하나로 통합한 기능
		// xml에 componentScan 속성을 사용하여 빈을 따로 등록해줄 필요가 없음.

		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
