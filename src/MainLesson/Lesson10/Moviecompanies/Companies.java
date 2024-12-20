package MainLesson.Lesson10.Moviecompanies;

  public class Companies {
    public String name = "Film name";
     String type;
     int numberofBranch;
     private String nameofshareHolders = "Someone";
     protected int numberOfShareholders = 5;

      protected void getInfo(String name, String type, int numberofBranch ){
          this.name = name;
          this.type = type;
          this.numberofBranch = numberofBranch;
         System.out.print("our Movie info is:"+name+" "+type+" "+numberofBranch);
         String info = nameofshareHolders;
     }

     protected void getGeneralthinks() {
         System.out.println("All movies are here");
     }



}
