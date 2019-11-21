package com.devincubator.project.dits.service;

import com.devincubator.project.dits.pojo.entity.Topic;
import com.devincubator.project.dits.repository.TopicRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    @Transactional
    public void create(Topic topic){
        topicRepository.create(topic);
    }

    @Transactional
    public List<Topic> read() {
        return topicRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
