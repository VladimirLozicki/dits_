package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Topic;
import com.devincubator.zamoiski.dits.repository.query.Query;
import com.devincubator.zamoiski.dits.util.HibernateUtilTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RepositoryTest {

    @Test
    public void testCreate() {
        Topic topic = new Topic();
        topic.setDescription("Some description");
        topic.setName("Some name");

        TopicRepository topicRepository = new TopicRepository();
        topicRepository.create(topic, HibernateUtilTest.getInstance().getSession());

        assertNotNull(HibernateUtilTest
                        .getInstance()
                        .getSession()
                        .createQuery(Query.SELECT_TOPIC.getQuery())
                        .getSingleResult());
    }

    @Test
    public void testUpdate(){
        Topic topic = HibernateUtilTest
                            .getInstance()
                            .getSession()
                            .createQuery("from Topic Where topicId = 1", Topic.class)
                            .list()
                            .get(0);

        topic.setName("Some Another Value");
        TopicRepository topicRepository = new TopicRepository();
        topicRepository.update(topic, HibernateUtilTest
                                            .getInstance()
                                            .getSession());

        assertEquals(topic, HibernateUtilTest
                            .getInstance()
                            .getSession()
                            .createQuery("from Topic Where topicId = 1", Topic.class)
                            .list()
                            .get(0));
    }

    @Test(expectedExceptions = {IndexOutOfBoundsException.class})
    public void delete(){

        Topic topic = HibernateUtilTest
                .getInstance()
                .getSession()
                .createQuery("from Topic Where topicId = 1", Topic.class)
                .list()
                .get(0);

        TopicRepository topicRepository = new TopicRepository();
        topicRepository.delete(topic, HibernateUtilTest
                                            .getInstance()
                                            .getSession());
        //REBUILD
        assertNull(topicRepository
                    .read(HibernateUtilTest.getInstance().getSession())
                    .get(0));
    }
}