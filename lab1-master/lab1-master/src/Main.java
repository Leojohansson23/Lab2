

public class  Main {

        public static void main(String[] args) {

                Saab95 saab1 = new Saab95();
                Saab95 saab2 = new Saab95();
                Volvo240 volvo1 = new Volvo240();
                Volvo240 volvo2 = new Volvo240();
                Cartransport cartransport1 = new Cartransport();
                Scania scania1 = new Scania();

                cartransport1.startEngine();
                cartransport1.gas(1);
                cartransport1.carrierLower();
                cartransport1.addcar(cartransport1);
                cartransport1.addcar(saab1);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.carrierHigher();
                cartransport1.move();
                cartransport1.carrierLower();
                cartransport1.removecar();
                cartransport1.move();
                cartransport1.move();
                cartransport1.move();

                System.out.println(volvo2.getYpos());
                System.out.println(cartransport1.getYpos());
                System.out.println(cartransport1.getRamparraylist());


                SaabWorkshop SaabWOrk1 = new SaabWorkshop();
                SaabWOrk1.SaabWorkshop(saab1);
                //System.out.println(WorkshopListSaab);

                System.out.println(cartransport1.getRamparraylist());


                SaabWOrk1.SaabWorkshop(saab1);










        }
}