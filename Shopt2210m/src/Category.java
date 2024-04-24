public enum Category {
    FOOD("Thuc pham"),HOUSEWARE("Do Gia Dung"),COSMETICS("My Pham"),FASHION("Thoi trang");

    private String value;
    private Category(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
