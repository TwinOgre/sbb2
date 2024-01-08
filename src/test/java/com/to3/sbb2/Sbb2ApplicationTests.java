package com.to3.sbb2;

import com.to3.sbb2.question.Question;
import com.to3.sbb2.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Sbb2ApplicationTests {

	@Autowired
	QuestionRepository questionRepository;
	@Test
	void contextLoads() {
		Question q = new Question();
		q.setSubject("123");
		q.setContent("12345");
		q.setCreateDate(LocalDateTime.now());

		this.questionRepository.save(q);
	}


}
