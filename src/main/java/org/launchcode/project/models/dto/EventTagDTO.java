package org.launchcode.project.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.project.models.Event;
import org.launchcode.project.models.Tag;

public class EventTagDTO {
    @NotNull
    private Event event;
    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
