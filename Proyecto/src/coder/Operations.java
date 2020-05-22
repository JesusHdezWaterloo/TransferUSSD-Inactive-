package coder;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class Operations {

    public static final int MONEDA_CUP = 1;
    public static final int MONEDA_CUC = 2;
    public static final int MONEDA_USD = 3;

    public static final int ENVIAR_MI_MOVIL_SI = 1;
    public static final int ENVIAR_MI_MOVIL_NO = 0;

    public static String transferir(String cuentaDestino, String importe, int monedaImporte,
            int monedaTarjeta, String cuentaOrigen, String movilAConfirmar, int enviarMiMovil, String smsMiMovil) {
        String concat = cuentaDestino + "*" + importe + "*" + monedaImporte + "*" + monedaTarjeta + "*" + cuentaOrigen + "*" + enviarMiMovil + "*" + smsMiMovil;
        String texter = TransferUSSDCoder.code(concat);
        String ussdCode = "*" + "444" + "*" + "45" + "*" + texter + "*" + coder.VersionCode.TRANSFER_VERSION + Utils.encode("#");
        return ussdCode;
    }
}
