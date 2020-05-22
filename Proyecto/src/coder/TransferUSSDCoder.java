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
        String[] split = str.split("\\*");
        int[] iArr = new int[split.length];
        String str3 = BuildConfig.FLAVOR;
        boolean z = false;
        for (int i = 0; i < split.length; i++) {
            if (isInteger(String.valueOf(split[i]))) {
                iArr[i] = split[i].length();
            } else {
                iArr[i] = 0;
                z = true;
            }
        }
        new ArrayList();
        List asList = Arrays.asList(split);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        if (z) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] == 0) {
                    arrayList.add(asList.get(i2));
                } else {
                    arrayList2.add(asList.get(i2));
                }
            }
            List iBu38aCLWSsRGhH2 = new Lcb96Uk5Xjuflq(code.getCode_version(), code.getCrude_code()).iBu38aCLWSsRGhH(arrayList2);
            str2 = ((String) iBu38aCLWSsRGhH2.get(0)).length() == 1 ? "0" + ((String) iBu38aCLWSsRGhH2.get(0)) : (String) iBu38aCLWSsRGhH2.get(0);
            List codes = new ASIxjbfzGK().getCodes(arrayList);
            int i3 = 0;
            int i4 = 0;
            for (int i5 : iArr) {
                if (i5 == 0) {
                    arrayList3.add(codes.get(i3));
                    i3++;
                } else {
                    arrayList3.add(iBu38aCLWSsRGhH2.get(i4 + 1));
                    i4++;
                }
            }
            iBu38aCLWSsRGhH = arrayList3;
        } else {
            iBu38aCLWSsRGhH = new Lcb96Uk5Xjuflq(code.getCode_version(), code.getCrude_code()).iBu38aCLWSsRGhH(asList);
            str2 = ((String) iBu38aCLWSsRGhH.get(0)).length() == 1 ? "0" + ((String) iBu38aCLWSsRGhH.get(0)) : (String) iBu38aCLWSsRGhH.get(0);
        }
        String str4 = BuildConfig.FLAVOR;
        String str5 = BuildConfig.FLAVOR;
        String valueOf = String.valueOf(iArr[0]).length() == 1 ? "0" + String.valueOf(iArr[0]) : String.valueOf(iArr[0]);
        if (z && arrayList2.size() == 0) {
            str2 = "00" + valueOf + ((String) iBu38aCLWSsRGhH.get(0));
        } else if (z) {
            str2 = str2 + valueOf + ((String) iBu38aCLWSsRGhH.get(0));
        } else if (split.length <= 1) {
            str2 = str2 + valueOf + ((String) iBu38aCLWSsRGhH.get(1));
        }
        if (split.length > 1) {
            int i6 = 1;
            String r4;
            while (i6 < iBu38aCLWSsRGhH.size()) {
                String str6 = BuildConfig.FLAVOR;
                String valueOf2 = z ? String.valueOf(iArr[i6]) : String.valueOf(iArr[i6 - 1]);
                String valueOf3 = valueOf2.length() == 1 ? "0" + String.valueOf(valueOf2) : String.valueOf(valueOf2);
                r4 = z ? str2 + "*" + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6)) : i6 == 1 ? str2 + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6)) : str2 + "*" + valueOf3 + ((String) iBu38aCLWSsRGhH.get(i6));
                i6++;
                str2 = r4;
            }
        }
        return str2;
    }

    /**
     * Comprueba si un String solo contiene dígitos.
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
