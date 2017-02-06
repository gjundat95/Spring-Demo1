package com.jundat95.repository;

import com.jundat95.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tinhngo on 2/6/17.
 */
public interface CarMongoRepository  extends CrudRepository<Car,String> {
}
