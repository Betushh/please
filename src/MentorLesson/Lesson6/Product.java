package MentorLesson.Lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Discountable {
    static int id;
    private String name;
    private double price;
    private double stock;

    List<Product> productLists = new ArrayList<>();
    static Product[] productlist = new Product[100];////Main methoda kececek

    public Product(String telephone, int i) {

    }

    public Product(String name, double price, double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 5) {
            this.stock = stock;
        } else {
            stock += 5;
            this.stock = stock;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return (this.id == 0 && product.id == 0 || this.id == product.id);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (id != 0) {
            result = 31 * result + Integer.valueOf(id).hashCode();
        }

        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                "}";
    }

    @Override
    public void applyDiscount(int rate) {
        if (rate < 0 || rate > 100) {
            throw new IllegalArgumentException("Argument is wrong");
        }

        double discount = (getPrice() * rate) / 100;
        double newPrice = getPrice() - discount;
        setPrice(newPrice);
        System.out.println("Our discount:" + discount);
        System.out.println("Our new Price: " + newPrice);
    }

    public void getData(Product product) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please add Product:");
        String name = scanner.next();
        product.setName(name);

        System.out.println("please add Product's Price:");
        int price = scanner.nextInt();
        product.setPrice(price);

        System.out.println("Please add stock of Product:");
        int stock = scanner.nextInt();
        product.setStock(stock);


        System.out.println("Please add rating");
        int rating = scanner.nextInt();
        product.applyDiscount(rating);
        productlist[id] = new Product(product.name, product.price, product.stock);
        id++;


        productLists.add(productlist[id]);



      //  System.out.println(" Product[" + id + "] = " + "Product name: " + product.getName() + ", Product price: " + product.getPrice() + ", Product stock:  " + product.getStock());
    }

    public void getDatas(){

        System.out.println( productLists.stream().filter(product1 -> product1.price>100).toList());
    }

    ////Min
    public String getMinPrice(Product product) {
        double min = productlist[0].getPrice();
        String cheaperOne = productlist[0].name;
        for (int i = 0; i < id; i++) {
            if (min > productlist[i].getPrice()) {
                min = productlist[i].getPrice();
                cheaperOne = productlist[i].name;
            }
        }
        return "Our cheaper product is: " + cheaperOne + " " + min;
    }

    /////Max
    public String getMaxPrice(Product product) {
        double max = productlist[0].getPrice();
        String expensiverOne = productlist[0].name;
        for (int i = 0; i < id; i++) {
            if (max < productlist[i].getPrice()) {
                max = productlist[i].getPrice();
                expensiverOne = productlist[i].name;
            }
        }
        return "Our expensive product is: " + expensiverOne + " " + max;
    }


}
