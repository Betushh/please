package MentorLesson.Lesson7.Traffic;

public class TrafficStater implements Runnable{
    Trafficlighter state;
    public TrafficStater(){
        this.state = Trafficlighter.RED;
    }



    public void changeState(){

        switch (state){
            case RED:
                state = Trafficlighter.YELLOW;
                break;
            case YELLOW:
                state = Trafficlighter.GREEN;
                break;
            case GREEN:
                state = Trafficlighter.RED;

        }
        System.out.println(state);


    }

    @Override
    public void run() {
        while(true) {
            System.out.println("--------");
            changeState();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

    }
}
