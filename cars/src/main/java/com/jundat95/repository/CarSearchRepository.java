package com.jundat95.repository;

import com.jundat95.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by tinhngo on 2/6/17.
 */
@Repository
public class CarSearchRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public Collection searchCars(String text) {
        return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("description").regex(text, "i"),
                        Criteria.where("make").regex(text, "i"),
                        Criteria.where("model").regex(text, "i"))
        ), Car.class);
    }
}
