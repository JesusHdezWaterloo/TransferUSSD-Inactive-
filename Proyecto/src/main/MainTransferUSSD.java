package main;

import coder.Operations;
import coder.TransferUSSDCoder;
import coder.Utils;

public class MainTransferUSSD {

    public static void main(String[] args) {
        //mia para luisito
        /*String cuentaLuisito = "9204129972669206";
         String miCuenta = "9224959870189170";
         String importe = "1";
         String movil = "58310867";

         for (int i = 0; i < 10; i++) {
         String ussdCode = Operations.transferir(cuentaLuisito, importe, Operations.MONEDA_CUP,
         Operations.MONEDA_CUP, miCuenta, movil, Operations.ENVIAR_MI_MOVIL_SI, "0000");
         System.out.println(ussdCode);
         System.out.println("");
         }*/

        //mia para ariel
        String destino = "9204129974100937";
        String origen = "9224959870189170";
        String importe = "1";
        String movil = "54657592";

        for (int i = 0; i < 10; i++) {
            String ussdCode = Operations.transferir(destino, importe, Operations.MONEDA_CUP,
                    Operations.MONEDA_CUP, origen, movil, Operations.ENVIAR_MI_MOVIL_SI, "0000");
            System.out.println(ussdCode);
            System.out.println("");
        }
    }

}
