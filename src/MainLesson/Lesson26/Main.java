package MainLesson.Lesson26;

public class Main {
    public static void main(String[] args) {

        /*
      jdbc- java database connectivity-an api,  is used for connect ,change etc.. the data.

         */

        DbOperation operation = new DbOperation();
        //    operation.drop("hello");
        TableOperation tableOperation = new TableOperation();
        CrudOperation crudOperation = new CrudOperation();
        //   crudOperation.insert("Eshref", "Qafarov");
        //  crudOperation.update("UNEC", 2300,13);
        // crudOperation.delete(14);
        crudOperation.select("Narmin");
//        crudOperation.injection("'Narmin' or 1=1");
    }
}
