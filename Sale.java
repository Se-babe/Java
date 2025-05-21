public class Sale {
    public static void main(String[] args) {
        Product obj =new Product() {
            public void printAmount(double price,int Quantity){
                System.out.println("the amount of the sale is  "+price * Quantity);
            }
        };
        obj.printAmount(10000, 50);
    }
}
