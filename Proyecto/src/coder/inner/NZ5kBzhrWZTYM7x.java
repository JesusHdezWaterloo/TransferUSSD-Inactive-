package coder.inner;

import coder.BuildConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class NZ5kBzhrWZTYM7x {
    String iBu38aCLWSsRGhH = BuildConfig.FLAVOR;

    /* renamed from: iBu38aCLWSsRGhH reason: collision with other field name */
    List f2375iBu38aCLWSsRGhH = new ArrayList();

    /* renamed from: iBu38aCLWSsRGhH reason: collision with other field name */
    int[][] f2376iBu38aCLWSsRGhH = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{10, 10}));

    public NZ5kBzhrWZTYM7x() {
        iBu38aCLWSsRGhH("1160428");
    }

    public NZ5kBzhrWZTYM7x(String str, String str2) {
        this.iBu38aCLWSsRGhH = str;
        iBu38aCLWSsRGhH(str2);
    }

    public List iBu38aCLWSsRGhH() {
        return this.f2375iBu38aCLWSsRGhH;
    }

    public void iBu38aCLWSsRGhH(String str) {
        String str2 = this.iBu38aCLWSsRGhH;
        int length = this.iBu38aCLWSsRGhH.length();
        int i = 0;
        while (length > 0) {
            String substring = str2.substring(Character.getNumericValue(str.charAt(i)), str2.length());
            String substring2 = substring.substring(0, 8);
            String substring3 = substring.substring(8, substring.length());
            int length2 = substring3.length();
            this.f2375iBu38aCLWSsRGhH.add(Integer.valueOf(Integer.parseInt(substring2, 2)));
            i = i == str.length() + -1 ? 0 : i + 1;
            length = length2;
            str2 = substring3;
        }
    }
}
