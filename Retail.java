public class Retail {
    public static void main(String[] args) {
        Business obj=new Business() {
            public void payLicense(int amount){
                System.out.println("The amount to be printed is: "+amount);
            }
        };
        obj.payLicense(5000);

        WholeSale obj2=new WholeSale(){
            public void buys(){
                System.out.println("business");
            }
        };
        obj2.buys();
    }
    
}
