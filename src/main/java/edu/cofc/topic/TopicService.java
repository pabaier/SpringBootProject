package edu.cofc.topic;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),   
            new Topic("java", "java framework", "java framework description"),   
            new Topic("javascript", "javascript framework", "javascript framework description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        try {
            return topics.stream()
                 .filter(t -> t.getId().equals(id))
                 .findFirst()
                 .get();
        }
        catch(Exception e) {
            return topics.get(0);
        }
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

}