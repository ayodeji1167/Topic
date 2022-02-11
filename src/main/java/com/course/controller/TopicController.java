package com.course.controller;

import com.course.data.Topic;
import com.course.dto.TopicDto;
import com.course.service.TopicServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicServiceImplementation topicServiceImplementation;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicServiceImplementation.getTopics();
    }

    @GetMapping("/topics/{name}")
    public Topic getTopicByName(@PathVariable String name){
        return topicServiceImplementation.getTopicByName(name);
    }

    @PostMapping("/topics")
    public Topic addNewTopic(@RequestBody TopicDto topicDto){
        return topicServiceImplementation.addTopic(topicDto);
    }

    @PutMapping("/topics/{name}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String name) {
        return topicServiceImplementation.updateTopic(name, topic);

    }

    @DeleteMapping("/topics/{name}")
    public void deleteTopic(@PathVariable String name){
        topicServiceImplementation.deleteTopic(name);

    }

}
