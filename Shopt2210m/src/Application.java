import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repo = new Repository();
        Scanner sc = new Scanner(System.in);

        Menu.mainMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("THONG TIN SAN PHAM");
                repo.show();
                break;
            case 2:
                System.out.println("Cac san pham gia tren 3000: ");
                repo.filterProductByPrice();
                break;
            case 3:
                repo.countProductByAmountSale();
                break;
            case 4:
                Menu.choiceCategory();
                System.out.println("Lua chon cua ban la: ");
                int a = sc.nextInt();
                if (a == 1) {
                    repo.productByCategoryFood();
                } else if (a == 2) {
                    repo.productByCategoryHouseware();
                } else if (a == 3) {
                    repo.productByCategoryCosmetics();
                } else if (a == 4) {
                    repo.productByCategoryFashion();
                }
                break;
            case 5:
                repo.sortByAmountSale();
                break;
            case 6:
                System.out.println("San pham duoc ban nhieu nhat: ");
                repo.productByAmountSale();
                break;
            case 7:
                repo.sortProductByName();
                System.out.println("San pham sau khi duoc sap xep: ");
                repo.show();
                break;
            case 8:
                Menu.secondMenu();
                int c = sc.nextInt();
                if (c == 1) {
                    repo.updateProduct();
                } else if (c == 2) {
                    deleteProduct();
                }
                break;
            case 9:
                System.exit(0);

                break;
        }
    }

        private static void deleteProduct() {

            Repository repo = new Repository();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap id: ");
            int a = sc.nextInt();
            repo.remove();
        }

}
