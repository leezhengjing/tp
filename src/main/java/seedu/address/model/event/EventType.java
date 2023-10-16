package seedu.address.model.event;

/**
 * Represents the type of event in the address book.
 */
public class EventType {
    private final String eventType;

    /**
     * Constructor for the event type
     * @param eventType type of the event
     */
    public EventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return this.eventType;
    }
}