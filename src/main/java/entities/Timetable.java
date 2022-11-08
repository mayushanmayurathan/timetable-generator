package entities;

import java.util.HashSet;

/**
 * This dataclass stores the information for a given timetable.
 */

public class Timetable {
    private final Meeting[] meetings;
    private final HashSet<String> tags;

    /**
     * Construct a Timetable, setting the meetings, and the tags.
     * @param meetings an array of meetings (Lectures/Tutorials) belonging to the course
     * @param tags an array of Strings containing various tags that we will use to filter timetables.
     */
    public Timetable(Meeting[] meetings, HashSet<String> tags) {
        this.meetings = meetings;
        this.tags = tags;
    }

    /**
     * A getter for the meetings.
     * @return the course meetings as a Meeting array
     */
    public Meeting[] getMeetings() {
        return meetings;
    }

    /**
     * A getter for the tags
     * @return the tags as a String array
     */
    public HashSet<String> getTags() {
        return tags;
    }
}
