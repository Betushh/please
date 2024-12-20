package MainLesson.Lesson19;

public enum Weekdays {
    MONDAY(1, "MON", Day.WEEKDAY),
    TUESDAY(2, "TUE", Day.WEEKDAY),
    WEDNESDAY(3, "WED", Day.WEEKDAY),
    THURSDAY(4, "THU", Day.WEEKDAY),
    FRIDAY(5, "FRI", Day.WEEKDAY),
    SATURDAY(6, "SAT", Day.WEEKEND),
    SUNDAY(7, "SUN", Day.WEEKEND);

    private int index;
    private String nickName;
    private Day day;

    Weekdays(int index, String nickName, Day day){
        this.index = index;
        this.nickName = nickName;
        this.day = day;

    }

    public int getIndex(){
        return this.index;
    }

    public String getNickName(){
        return this.nickName;
    }

    public Day getDay(){
        return this.day;
    }
}
