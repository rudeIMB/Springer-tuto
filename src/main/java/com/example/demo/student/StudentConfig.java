package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student itadori = new Student(
				
				"Itadori",
				"Itadori@jjk.jp",
				LocalDate.of(2004,Month.JANUARY,5)
		
			);
            Student megumi = new Student(
				
				"Megumi",
				"Megumi@jjk.jp",
				LocalDate.of(2003,Month.JANUARY,5)
		
			);

            repository.saveAll(List.of(itadori,megumi)); 
        };
    }
}
