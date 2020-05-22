package main;

import coder.Operations;

public class MainTransferUSSD {

    public static void main(String[] args) {
        String cuentaLuisito = "9204129972669206";
        String miCuenta = "9224959870189170";
        String importe = "1";
        String movil = "58310867";
        
        for (int i = 0; i < 10; i++) {
            String ussdCode = Operations.transferir(cuentaLuisito, importe, Operations.MONEDA_CUP,
                    Operations.MONEDA_CUP, miCuenta, movil, Operations.ENVIAR_MI_MOVIL_SI, "hello world");
            System.out.println(ussdCode);
            System.out.println("");
        }
    }

}
