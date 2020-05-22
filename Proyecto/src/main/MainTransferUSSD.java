package main;

import coder.TransferUSSDCoder;
import coder.Utils;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class MainTransferUSSD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            final String texter = TransferUSSDCoder.code("9204129972669206*1*58310867");
            String ussdCode = "*" + "444" + "*" + "45" + "*" + texter + "*" + "1181102" + Utils.encode("#");
            System.out.println(ussdCode);
            System.out.println("");
        }
    }

}
