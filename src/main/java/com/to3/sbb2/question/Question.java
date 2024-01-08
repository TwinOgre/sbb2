package com.to3.sbb2.question;

import com.to3.sbb2.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id//pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// long 도 많이 씀
    @Column(length = 200)
    private String subject;
    @Column(columnDefinition = "text")
    private String content;
    @CreatedDate
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
