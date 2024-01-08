package com.to3.sbb2.answer;

import com.to3.sbb2.question.Question;
import com.to3.sbb2.question.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;
    @PostMapping("/create/{id}")
    public String create(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm, BindingResult bindingResult){
        Question question = questionService.getQuestion(id);
        if(bindingResult.hasErrors()){
            model.addAttribute("question",question);
            return "question_detail";
        }

        this.answerService.create(question, answerForm.getContent());
        return String.format("redirect:/question/detail/%d", id);
    }
}
