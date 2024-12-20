package MainLesson.Lesson21;


import MainLesson.Lesson10.Moviecompanies.Companies;

import java.util.List;

public class SthWrite<T extends Companies> {//cannot write interface first and cannot implement anything
    private T sth;
  //  private H hl;

    public SthWrite(T sth) {
        this.sth = sth;
  //      this.hl = hl;
    }

    public void write() {
        System.out.println(sth);
        //       System.out.println(hl);
    }

    public static  void getList(List<? extends Companies> list){
        System.out.println(list);
    }
}
