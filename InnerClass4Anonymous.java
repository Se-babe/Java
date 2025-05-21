public class InnerClass4Anonymous {
    
    void show(){
        System.out.println("this is the outer method of the anonymous");
                }
                                }

    class Flower{

        static InnerClass4Anonymous obj=new InnerClass4Anonymous(){

            void show(){

                super.show();

                System.out.println("this is the inner class of the anonymous");
            }
                                                                    };
        public static void main(String[] args) {

            obj.show();
        }
                }




