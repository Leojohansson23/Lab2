

public class  Main {

        public static void main(String[] args) {

                Saab95 saab1 = new Saab95();
                Saab95 saab2 = new Saab95();
                Volvo240 volvo1 = new Volvo240();
                Volvo240 volvo2 = new Volvo240();
                Cartransport cartransport1 = new Cartransport();
                Scania scania1 = new Scania();


                cartransport1.carrierLower();
                cartransport1.addcar(saab1);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);
                cartransport1.addcar(volvo2);


                cartransport1.addcar(scania1);
                System.out.println(cartransport1.ramparraylist);











        }
}