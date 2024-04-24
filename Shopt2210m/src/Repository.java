import java.util.*;

public class Repository {
    List<Product> lp = new ArrayList();



    public Repository() {
        
        lp.add(new Product("01","Banh doraemon 3 vi",Category.FOOD,100,3500,20));
        lp.add(new Product("02","Banh dong xu",Category.FOOD,150,3500,12));
        lp.add(new Product("03","Banh gao nhat ban",Category.FOOD,100,5000,85));
        lp.add(new Product("04","Banh khoai mon",Category.FOOD,120,5000,57));
        lp.add(new Product("05","banh cay",Category.FOOD,100,3500,57));
        lp.add(new Product("06","thia inox",Category.HOUSEWARE,150,8000,7));
        lp.add(new Product("07","bat gom bat trang",Category.HOUSEWARE,120,3000,5));
        lp.add(new Product("08","muoi kim cuong",Category.HOUSEWARE,130,3100,10));
        lp.add(new Product("09","lo dung gia vi",Category.HOUSEWARE,140,3000,12));
        lp.add(new Product("010","ke dung gia vi",Category.HOUSEWARE,200,3400,15));
        lp.add(new Product("011","sia inox ma vang",Category.HOUSEWARE,170,3900,17));
        lp.add(new Product("012","nuoc hoa",Category.COSMETICS,100,3500,57));
        lp.add(new Product("013","dau goi dau",Category.COSMETICS,100,3500,57));
        lp.add(new Product("014","sua tam",Category.COSMETICS,100,3500,57));
        lp.add(new Product("015","kem duong gia",Category.COSMETICS,100,3500,57));
        lp.add(new Product("016","ao thun",Category.FASHION,100,3500,58));
        lp.add(new Product("017","ao polo",Category.FASHION,100,3500,57));
        lp.add(new Product("018","ao so mi",Category.FASHION,100,3500,57));
    }


    public void show(){
        lp.forEach(product -> System.out.println("ten san pham: "+product.getName()+"  gia: "+product.getPrice()));
    }

    public void add(Product p){lp.add(p);}


    public void remove(){
        boolean found = false;
        String id = "";
        for(Product p : lp){
           if(p.getId() == id){
               int choice;
               System.out.println("Are you sure you want to delete this product? (1.Yes 2.No)");
               choice = new Scanner(System.in).nextInt();
               if(choice == 1){
                   lp.remove(p);
               }
               found = true;
           }
        }
        if(found == false){
            System.out.println("Can not find product with id "+id);
        }
    }

    public void sortProductByName(){
        lp.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }

        });
    }
    public void countProductByAmountSale(){
        long count = lp.stream().
                filter(p -> p.getAmountSale() > 10)
                .count();
        System.out.println("So san pham ban duoc tu 10 tro len la: "+count);
    }
    public void filterProductByPrice(){
        lp.stream().filter(p -> p.getPrice() > 3000)
                .forEach(p -> System.out.println("ten san pham: "+p.getName()));
    }
    public void productByCategoryFood(){

        lp.stream().filter(p -> p.getCategory() == Category.FOOD)
                .forEach(p -> System.out.println("ten san pham: "+p.getName()+"  gia: "+p.getPrice()));

    }
    public void productByCategoryHouseware(){

        lp.stream().filter(p -> p.getCategory() == Category.HOUSEWARE)
                .forEach(p -> System.out.println("ten san pham: "+p.getName()+"  gia: "+p.getPrice()));
    }
    public void productByCategoryCosmetics(){

        lp.stream().filter(p -> p.getCategory() == Category.COSMETICS)
                .forEach(p -> System.out.println("ten san pham: "+p.getName()+"  gia: "+p.getPrice()));
    }
    public void productByCategoryFashion(){

        lp.stream().filter(p -> p.getCategory() == Category.FASHION)
                .forEach(p -> System.out.println("ten san pham: "+p.getName()+"  gia: "+p.getPrice()));

    }
    public  void productByAmountSale(){
        Product productWithMostSales = null;
        int maxSales = 0;

        for (Product product : lp) {
            if (product.getAmountSale() > maxSales) {
                maxSales = (int) product.getAmountSale();
                productWithMostSales = product;
            }
        }

        if (productWithMostSales != null) {

            printProductInfo(productWithMostSales);
        } else {
            System.out.println("No product found.");
        }
    }

    private void printProductInfo(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: " + product.getPrice());
        System.out.println();
    }

    public void sortByAmountSale() {
        Collections.sort(lp, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Long.compare(p2.getAmountSale(), p1.getAmountSale());
            }
        });
    }
    public void updateProduct() {
        for (Product product : lp) {
            if (product.getName().equals(product.getName())) {
                product.setAmount(product.getAmount());
                product.setPrice(product.getPrice());
                product.setAmountSale(product.getAmountSale());
                // Cập nhật thông tin của sản phẩm
                break;
            }
        }
    }
}
