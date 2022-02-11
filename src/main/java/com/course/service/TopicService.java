package com.course.service;

import com.course.data.Topic;
import com.course.dto.TopicDto;

import java.util.List;

public interface TopicService {

    List<Topic> getTopics();

    Topic getTopicByName(String topicName);

    Topic addTopic(TopicDto topicDto);

    Topic updateTopic(String name, Topic  topic);

    void deleteTopic(String topicName);


}
