package org.launchcode.project.data;

import org.launchcode.project.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}

//public class MyRepository implements EventRepository {}
