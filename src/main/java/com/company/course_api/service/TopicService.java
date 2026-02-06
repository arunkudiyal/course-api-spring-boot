package com.company.course_api.service;

import com.company.course_api.controller.Topic;
import com.company.course_api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(String id) {
        Optional<Topic> foundTopic = topicRepository.findById(id);
        if(foundTopic.isPresent()) return foundTopic.get();
        else return new Topic("N/A", "N/A", "N/A");
     }

    public void save(Topic topic) {
        topicRepository.save(topic);
    }
}
