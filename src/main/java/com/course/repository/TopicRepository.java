package com.course.repository;

import com.course.data.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

    Topic getTopicByName(String topicName);
}
