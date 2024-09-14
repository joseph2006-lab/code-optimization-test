public class Store {
    public static void main(String[] args) {

        int  []amound = {15,10,5};
        int []price = {2,3,4};

        int totalSales = 0;
        final int MINIMO_VENTA = 50;
        int acumulado =0;

        for(int i =0;i<amound.length;i++){
            
               totalSales = amound[i] * price[i];
               System.out.println("El precio de la venta numero "+ i + "es de :"+ totalSales);
               acumulado = acumulado + totalSales;
               totalSales = 0;
               System.out.println("-------------------------------------"); 
                      
        }
        if (acumulado > MINIMO_VENTA ) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
