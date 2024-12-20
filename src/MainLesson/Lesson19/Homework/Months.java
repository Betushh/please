package MainLesson.Lesson19.Homework;

public enum Months {

    JANUARY(1, "JAN", Season.WINTER),
    FEBRUARY(2, "FEB", Season.WINTER),
    MARCH(3, "MAR", Season.SPRING),
    APRIL(4, "APR", Season.SPRING),
    MAY(5, "MY", Season.SPRING),
    JUNE(6, "JUN", Season.SUMMER),
    JULY(7, "JUL", Season.SUMMER),
    AUGUST(8, "AUG", Season.SUMMER),
    SEPTEMBER(9, "SEP", Season.AUTUMN),
    OCTOBER(10, "OCT", Season.AUTUMN),
    NOVEMBER(11, "NOV", Season.AUTUMN),
    DECEMBER(12, "DEC", Season.WINTER);


    Months(int no, String shortie, Season season) {
        this.no = no;
        this.shortie = shortie;
        this.season = season;
    }

    private int no;
    private String shortie;
    private Season season;

    public int getNo() {
        return this.no;
    }

    public String getShortie() {
        return this.shortie;
    }

    public Season getSeason() {
        return season;
    }

    public static void getData() {
        for (int i = 0; i < values().length; i++) {
            print(values()[i]);
        }
    }

    private static void print(Months months) {
        System.out.println("Our month: "+ months+"\nNO: "+months.getNo()+"\nIts Short name:  "+months.getShortie()+"\nIts season: "+months.getSeason()
                +"\nIts season NO: "+months.getSeason().getNo()+"\n----------------------");
    }
}
