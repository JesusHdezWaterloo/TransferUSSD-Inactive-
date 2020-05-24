package coder;

import coder.inner.ASIxjbfzGK;
import coder.inner.Lcb96Uk5Xjuflq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class TransferUSSDCoder {

    public static String code(String str) {
        return code(str, VersionCode.ACTUAL_VERSION);
    }

    public static String code(String str, VersionCode code) {
        List iBu38aCLWSsRGhH;
        String str2;

        //separa el String por los '*', EJ: "abc*123*def*456" → ["abc","123","def","456"]
        String[] split = str.split("\\*");
        int[] iArr = new int[split.length];
        //String str3 = BuildConfig.FLAVOR;
        boolean z = false;
        for (int i = 0; i < split.length; i++) {
            if (isInteger(String.valueOf(split[i]))) {//chequea que ese pedazo contenga solo digitos, para separar numeros de texto, ver metodo debajo
                iArr[i] = split[i].length();//si es entero va guardando el el size(length) en un arreglo
            } else {
                iArr[i] = 0;//si contiene letra pone como tamanno 0
                z = true;//guarda un flag para si hay al menos uno con tamaño 0
            }
        }
        //new ArrayList();
        List asList = Arrays.asList(split);//convierte el arreglo a lista, completamente innecesario en mi opinion, creo que porque debajo un metodo lo utiliza y requiere por parametros una lista
        ArrayList arrayList = new ArrayList();//para almacenar los split con letras
        ArrayList arrayList2 = new ArrayList();//para almacenar splits con numeros solamente
        List arrayList3 = new ArrayList();
        if (z) {//si existia algun split con digito:
            for (int i2 = 0; i2 < iArr.length; i2++) {//separa en 2 listas los que eran enteros y los que tenian letra
                if (iArr[i2] == 0) {//si tiene letra
                    arrayList.add(asList.get(i2));//lo agrego en la lista
                } else {
                    arrayList2.add(asList.get(i2));//si son solo numeros lo agrego en la lista2 
                }
            }
            //cosas chinas del inner que no se como funcionan bien, pero basicamente manda el VersionCode y la lista con solamente los numeros enteros y devuelve una lista 
            //cambia en cada iteracion con la misma entrada
            List iBu38aCLWSsRGhH2 = new Lcb96Uk5Xjuflq(code.getCode_version(), code.getCrude_code()).iBu38aCLWSsRGhH(arrayList2);

            //ternario, si el tamanno del elemento en la posicion 0 de la lista de arriba(iBu38aCLWSsRGhH2) en 1, str2 toma valor 0+ese elemento, sino solamente el elemento.
            //resumen, si el primer elemento tiene tamanno 1 se le agrega el 0 delante.
            //EJ: iBu38aCLWSsRGhH2.get(0) = "5" str2 = "05"
            //EJ: iBu38aCLWSsRGhH2.get(0) = "49" str2 = "49"
            str2 = ((String) iBu38aCLWSsRGhH2.get(0)).length() == 1 ? "0" + ((String) iBu38aCLWSsRGhH2.get(0)) : (String) iBu38aCLWSsRGhH2.get(0);

            //cosas chinas, algo con la lista que tiene solo los split con letras
            List codes = new ASIxjbfzGK().getCodes(arrayList);
            int i3 = 0;//para almacenar cuanto elementos hay con letras
            int i4 = 0;//para almacenar cuanto elementos hay con numeros solamente, absuro, podian tener uno solo y el otro sale por restar con el total, pero bueno

            //mueve de un arreglo para otro, ni idea de xq
            for (int i5 : iArr) {
                if (i5 == 0) {
                    arrayList3.add(codes.get(i3));
                    i3++;
                } else {
                    arrayList3.add(iBu38aCLWSsRGhH2.get(i4 + 1));
                    i4++;
                }
            }
            //sobreescribe el arreglo viejo por este con los elementos organizado a su parece, ni idea de xq
            iBu38aCLWSsRGhH = arrayList3;
        } else {// en caso de que todos los split sean con numeros solamente
            //reescribe el arreglo con lo mismo de arriba (linea 51)
            iBu38aCLWSsRGhH = new Lcb96Uk5Xjuflq(code.getCode_version(), code.getCrude_code()).iBu38aCLWSsRGhH(asList);
            //el str2 con igual significado que arriba (linea 57)
            str2 = ((String) iBu38aCLWSsRGhH.get(0)).length() == 1 ? "0" + ((String) iBu38aCLWSsRGhH.get(0)) : (String) iBu38aCLWSsRGhH.get(0);
        }
        //String str4 = BuildConfig.FLAVOR;
        //String str5 = BuildConfig.FLAVOR;
        //igual que str2, completa con 0 delante si la cant de digitos de iArr[0] es 1
        String valueOf = String.valueOf(iArr[0]).length() == 1 ? "0" + String.valueOf(iArr[0]) : String.valueOf(iArr[0]);
        if (z && arrayList2.isEmpty()) {//si hay algun elemento con letra y arrayList2 esta vacio(arrayList2 contiene los splits con numeros solamente), o sea si solo hay splits con letras. ninguno con numeros solamente
            str2 = "00" + valueOf + ((String) iBu38aCLWSsRGhH.get(0));//hace concatenaciones, pone "00" delate, valueOf en el medio y la posicion 0 de la lista iBu38aCLWSsRGhH
        } else if (z) {//si hay si hay algun elemento con letra, por el else if asumimos que si hay alguno con numeros solamente 
            str2 = str2 + valueOf + ((String) iBu38aCLWSsRGhH.get(0));// hace mas concatenaciones
        } else if (split.length <= 1) {//sino y el split tiene menos de 1 elemento, o sea tiene 1 o 0
            str2 = str2 + valueOf + ((String) iBu38aCLWSsRGhH.get(1));//en este caso la concatenacion coge el valor de la pos 1
        }
        if (split.length > 1) {// si el split tiene mas de 1 valor
            int i6 = 1;//contador para ver por que posicion voy de recorrer el arreglo mas adelante, se podia sustituir sin ningun problema por la clasica i en el for
            String r4;
            while (i6 < iBu38aCLWSsRGhH.size()) {//recorre la lista iBu38aCLWSsRGhH desde 1 hasta el size, ni idea de xq un while
                //String str6 = BuildConfig.FLAVOR;

                // si z== true, o sea, hay elementos en el split con alguna letra
                //valueOf2 toma el valor de iArr en la posicion i6, sino en la posicion i6-1
                String valueOf2 = z ? String.valueOf(iArr[i6]) : String.valueOf(iArr[i6 - 1]);

                //si el valor anterior tiene tamanno 1 se le agrega un 0 delante
                String valueOf3 = valueOf2.length() == 1 ? "0" + String.valueOf(valueOf2) : String.valueOf(valueOf2);

                //hace mas concatenaciones si se cumplen condiciones, no se como explicar esta cosas
                if (z) {//si z== true, o sea, hay elementos en el split con alguna letra
                    r4 = str2 + "*" + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6));
                } else {//si z== false, o sea, NO hay elementos en el split con alguna letra
                    if (i6 == 1) {//i6==1 o sea, estamos en la 1ra iteracion de la lista
                        r4 = str2 + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6));
                    } else {//si no hace esto
                        r4 = str2 + "*" + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6));
                    }
                }
                i6++;//aumenta el contadoe
                str2 = r4;//va acumulando los valores anteriores
            }
        }
        return str2;//devuelve srt2 con todas las cosas que fuimos concatenando
    }

    /**
     * Comprueba si un String solo contiene dígitos. EJ: "123456789" → return
     * true; EJ: "123a456" → return false, tiene 'a' en el medio; EJ: "abcdef" →
     * false;
     *
     * @param str
     * @return true
     */
    private static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
