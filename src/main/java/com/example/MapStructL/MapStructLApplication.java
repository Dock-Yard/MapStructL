package com.example.MapStructL;

import com.example.MapStructL.mapper.IMyMapper;
import com.example.MapStructL.mapper.POJO.Person1;
import com.example.MapStructL.mapper.POJO.Person2;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapStructLApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapStructLApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(){
		return (arg) -> {
			try {
				System.out.println("totttttt");
				IMyMapper iMyMapper = Mappers.getMapper(IMyMapper.class);

				Person2 person2 = new Person2("person2", "field2", "samefff");
				System.out.println("person2=" + person2.toString());
				Person1 person1 = iMyMapper.toPerson1(person2);
				System.out.println("person1=" + person1);

				System.out.println("-----------------");

				Person1 person1New = new Person1("person1", "field1", "samefff");
				System.out.println("person2=" + person1New.toString());
				Person2 person2New = iMyMapper.toPerson2(person1New);
				System.out.println("person1=" + person2New);
			} catch (Exception e) {
				e.printStackTrace();
			}

		};
	}
}
