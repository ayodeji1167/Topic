package com.course.service;

import com.course.data.Topic;
import com.course.dto.TopicDto;
import com.course.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TopicServiceImplementation implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private CourseServiceImplementation courseServiceImplementation;


    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicByName(String topicName) {
        for (Topic t : getTopics()) {
            if (t.getName().equals(topicName))
                return t;
        }

        throw new RuntimeException("Topic is not present");
    }



    public Topic addTopic(TopicDto topicDto) {
        return topicRepository.save(dtoTo_Topic(topicDto));
    }

    private Topic dtoTo_Topic(TopicDto topicDto) {
        Topic topic = new Topic();

        topic.setName(topicDto.getName());
        topic.setCourse(courseServiceImplementation.getByName(topicDto.getCourseName()));
        topic.setLectures(topicDto.getLectures());

        return topic;
    }

    public Topic updateTopic(String name, Topic topic) {
        topic.setName(name);
        return topicRepository.save(topic);
    }

    public void deleteTopic(String topicName) {

        topicRepository.deleteById(topicName);

    }
}
