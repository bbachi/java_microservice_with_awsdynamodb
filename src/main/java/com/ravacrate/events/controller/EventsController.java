package com.ravacrate.events.controller;

import com.ravacrate.events.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsController {

    @GetMapping("/events")
    List<Event> allEvents() {
        List<Event> events = new ArrayList<>();
        Event event = new Event("1", "evtname", "09/09/9999", "plca1");
        events.add(event);
        return events;
    }

}
