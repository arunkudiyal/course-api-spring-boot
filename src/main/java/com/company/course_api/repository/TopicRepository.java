package com.company.course_api.repository;

import com.company.course_api.controller.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends MongoRepository<Topic, String> { }

//public interface TopicRepository extends CrudRepository<Topic, String> {
//}
