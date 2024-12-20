package MentorLesson.Lesson7;

import MentorLesson.Lesson7.Traffic.TrafficStater;

public class MentorLesson7 {
    public static void main(String[] args) {
 /*       try(Resource resource = new Resource()){
            resource.useResource();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

        Counter counter = new Counter();
        Thread thread = new Thread(counter, "Our Counter");
        thread.start();

  */

        TrafficStater trafficStater = new TrafficStater();
        Thread thread = new Thread(trafficStater);
        thread.start();



    }
}
