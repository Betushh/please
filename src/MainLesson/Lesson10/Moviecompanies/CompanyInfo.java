package MainLesson.Lesson10.Moviecompanies;

import MainLesson.Lesson10.Films.FilmOwners;

class CompanyInfo {
    public static void main(String[] args) {
        Companies companies = new Companies();
        companies.getInfo("Disney", "entertainment", 5);

        FilmOwners filmOwners = new FilmOwners();
        int number = filmOwners.numberOfShareholders;
        System.out.println("our number of shareholders "+number);

    }
}
