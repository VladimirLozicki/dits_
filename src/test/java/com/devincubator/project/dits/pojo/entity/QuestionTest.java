package com.devincubator.project.dits.pojo.entity;

import com.devincubator.project.dits.config.WebAppConfig;
import com.devincubator.project.dits.service.AnswerService;
import com.devincubator.project.dits.service.QuestionService;
import com.devincubator.project.dits.service.TestService;
import com.devincubator.project.dits.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@ComponentScan(basePackages = "com.devincubator.project.dits")
@ContextConfiguration(classes = {WebAppConfig.class})
@PropertySource("classpath:database.properties")
@PropertySource("classpath:hibernate.properties")
@WebAppConfiguration
public class QuestionTest extends AbstractTestNGSpringContextTests {

    @Autowired
    QuestionService questionService;
    @Autowired
    AnswerService answerService;
    @Autowired
    TestService testService;
    @Autowired
    TopicService topicService;

    @Test
    public void testGetAnswer() {

    }

    @Test
    public void testSet() {

        // задаем тему
        Topic topic = new Topic();
        topic.setDescription("frontend");
        topic.setName("HTML+CSS");

        // задаем тест 1
        com.devincubator.project.dits.pojo.entity.Test test
                = new com.devincubator.project.dits.pojo.entity.Test();
        test.setDescription("basic tag for table");
        test.setName("table");
        test.setTopic(topic);

        // Вопросы для первого теста
        Question question = new Question();
        question.setDescription("What tag use for write string in table?");
        question.setTest(test);
        questionService.create(question);

        Question question1 = new Question();
        question1.setDescription("What tag use for block?");
        question1.setTest(test);
        questionService.create(question1);

        // ответы для первого теста
        List<Question> questionList = new ArrayList<>();
        questionList.add(question);
        questionList.add(question1);
        test.setQuestions(questionList);

        testService.create(test);

        List<Answer> answerList1 = new ArrayList<>();
        List<Answer> answerList2 = new ArrayList<>();

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);

        Answer answer1 = new Answer();
        answer1.setDescription("td");
        answer1.setCorrect(false);
        answer1.setQuestion(question);
        answerService.create(answer1);

        Answer answer2 = new Answer();
        answer2.setDescription("th");
        answer2.setCorrect(false);
        answer2.setQuestion(question);
        answerService.create(answer2);

        Answer answer3 = new Answer();
        answer3.setDescription("dd");
        answer3.setCorrect(false);
        answer3.setQuestion(question);
        answerService.create(answer3);

        Answer answer4 = new Answer();
        answer4.setDescription("tr");
        answer4.setCorrect(true);
        answer4.setQuestion(question);
        answerService.create(answer4);


        Answer answer5 = new Answer();
        answer5.setDescription("span");
        answer5.setCorrect(false);
        answer5.setQuestion(question1);
        answerService.create(answer5);

        Answer answer6 = new Answer();
        answer6.setDescription("li");
        answer6.setCorrect(false);
        answer6.setQuestion(question1);
        answerService.create(answer6);

        Answer answer7 = new Answer();
        answer7.setDescription("ol");
        answer7.setCorrect(false);
        answer7.setQuestion(question1);
        answerService.create(answer7);

        Answer answer8 = new Answer();
        answer8.setDescription("div");
        answer8.setCorrect(true);
        answer8.setQuestion(question1);
        answerService.create(answer8);


        answerList1.add(answer1);
        answerList1.add(answer2);
        answerList1.add(answer3);
        answerList1.add(answer4);

        answerList2.add(answer5);
        answerList2.add(answer6);
        answerList2.add(answer7);
        answerList2.add(answer7);

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);
        test.setQuestions(questionList);

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);
        testService.create(test);
        questionService.create(question);
        questionService.create(question1);
        topicService.create(topic);

    }

    @Test
    public void testSt() {

        // задаем тему
        Topic topic = new Topic();
        topic.setDescription("frontend");
        topic.setName("Java Core");

        // задаем тест 1
        com.devincubator.project.dits.pojo.entity.Test test
                = new com.devincubator.project.dits.pojo.entity.Test();
        test.setDescription("type");
        test.setName("primitive");
        test.setTopic(topic);

        // Вопросы для первого теста
        Question question = new Question();
        question.setDescription("How many bytes in int?");
        question.setTest(test);
        questionService.create(question);

        Question question1 = new Question();
        question1.setDescription("What tag use for block?");
        question1.setTest(test);
        questionService.create(question1);

        // ответы для первого теста
        List<Question> questionList = new ArrayList<>();
        questionList.add(question);
        questionList.add(question1);
        test.setQuestions(questionList);

        testService.create(test);

        List<Answer> answerList1 = new ArrayList<>();
        List<Answer> answerList2 = new ArrayList<>();

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);

        Answer answer1 = new Answer();
        answer1.setDescription("1");
        answer1.setCorrect(false);
        answer1.setQuestion(question);
        answerService.create(answer1);

        Answer answer2 = new Answer();
        answer2.setDescription("2");
        answer2.setCorrect(false);
        answer2.setQuestion(question);
        answerService.create(answer2);

        Answer answer3 = new Answer();
        answer3.setDescription("3");
        answer3.setCorrect(false);
        answer3.setQuestion(question);
        answerService.create(answer3);

        Answer answer4 = new Answer();
        answer4.setDescription("4");
        answer4.setCorrect(true);
        answer4.setQuestion(question);
        answerService.create(answer4);


//        Answer answer5 = new Answer();
//        answer5.setDescription("span");
//        answer5.setCorrect(false);
//        answer5.setQuestion(question1);
//        answerService.create(answer5);
//
//        Answer answer6 = new Answer();
//        answer6.setDescription("li");
//        answer6.setCorrect(false);
//        answer6.setQuestion(question1);
//        answerService.create(answer6);
//
//        Answer answer7 = new Answer();
//        answer7.setDescription("ol");
//        answer7.setCorrect(false);
//        answer7.setQuestion(question1);
//        answerService.create(answer7);
//
//        Answer answer8 = new Answer();
//        answer8.setDescription("div");
//        answer8.setCorrect(true);
//        answer8.setQuestion(question1);
//        answerService.create(answer8);


        answerList1.add(answer1);
        answerList1.add(answer2);
        answerList1.add(answer3);
        answerList1.add(answer4);

//        answerList2.add(answer5);
//        answerList2.add(answer6);
//        answerList2.add(answer7);
//        answerList2.add(answer7);

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);
        test.setQuestions(questionList);

        question.setAnswer(answerList1);
        question1.setAnswer(answerList2);
        testService.create(test);
        questionService.create(question);
        questionService.create(question1);
        topicService.create(topic);

    }


    @Test
    public void testGetDescription() {
        System.out.println();
    }


    public List<com.devincubator.project.dits.pojo.entity.Test> checkT(List<Topic> topics, String s) {
        for (Topic topic : topics) {
            if (s.equals(topic.getName())) {
                return topic.getTests();
            }
        }
        return null;
    }


    public Topic checkTopic(String s) {
        for (Topic topic : topicService.read()) {
            if (s.equals(topic.getName())) {
                return topic;
            }
        }
        return null;
    }

    public com.devincubator.project.dits.pojo.entity.Test checkTest(String s) {
        for (com.devincubator.project.dits.pojo.entity.Test test : testService.read()
        ) {
            if (s.equals(test.getName())) {
                return test;
            }
        }
        return null;
    }
}