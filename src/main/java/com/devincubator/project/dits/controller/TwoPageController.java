package com.devincubator.project.dits.controller;

import com.devincubator.project.dits.pojo.entity.Question;
import com.devincubator.project.dits.pojo.entity.Test;
import com.devincubator.project.dits.pojo.entity.Topic;
import com.devincubator.project.dits.service.QuestionService;
import com.devincubator.project.dits.service.TestService;
import com.devincubator.project.dits.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.devincubator.project.dits.controller.MainController.getPrincipal;

@Controller
public class TwoPageController {

    public TopicService getTopicService() {
        return topicService;
    }

    public TestService getTestService() {
        return testService;
    }

    public QuestionService getQuestionService() {
        return questionService;
    }

    private TopicService topicService;

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    private TestService testService;

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    private QuestionService questionService;

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    String topic_name;

    @GetMapping(value = "/chooseTopic")
    public String logoutPage(Model model) {
        model.addAttribute("topic", topicService.read());
        model.addAttribute("user", getPrincipal());
        return "user/two";
    }
    
    @GetMapping(value = "/two")
    @ResponseBody
    public String l(@RequestParam String topic, Model model) {
        topic_name = topic;
        model.addAttribute("test", checkT(topicService.read(), topic));
        model.addAttribute("user", getPrincipal());
        return "user/two";
    }

    @GetMapping(value = "/map")
    public String lp(@RequestParam("test") String test, Model model) {
        Test test1 = checkTest(test);
        model.addAttribute("user", getPrincipal());
        model.addAttribute("question", checkTopic(topic_name).getTests().get(0).getDescription());
        model.addAttribute("answers", test1.getQuestions().get(0).getAnswer());
        return "user/three";
    }

     List<Test> checkT(List<Topic> topics, String s) {
        for (Topic topic : topics) {
            if (s.equals(topic.getName())) {
                return topic.getTests();
            }
        }
        return null;
    }

     Topic checkTopic(String s) {
        for (Topic topic : topicService.read()
        ) {
            if (s.equals(topic.getName())) {
                return topic;
            }
        }
        return null;
    }

     Test checkTest(String s) {
        for (Test test : testService.read()
        ) {
            if (s.equals(test.getName())) {
                return test;
            }
        }
        return null;
    }

     Question checkQuestion(String s) {
        for (Question question : questionService.read()
        ) {
            if (s.equals(question)) {
                return question;
            }
        }
        return null;
    }


}
