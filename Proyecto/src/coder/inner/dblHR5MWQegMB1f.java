package cu.arrowtech.tranferussd;

import cu.arrowtech.tranferussd.BuildConfig;
import java.util.List;

class dblHR5MWQegMB1f {
    private int P5TrFEz5WQQhKQQ;

    /* renamed from: P5TrFEz5WQQhKQQ  reason: collision with other field name */
    int[] f497P5TrFEz5WQQhKQQ;
    cebHCFblncsXMwr iBu38aCLWSsRGhH;

    public dblHR5MWQegMB1f() {
        this.P5TrFEz5WQQhKQQ = 0;
        this.P5TrFEz5WQQhKQQ = this.iBu38aCLWSsRGhH.iBu38aCLWSsRGhH;
        this.iBu38aCLWSsRGhH = new cebHCFblncsXMwr();
    }

    public dblHR5MWQegMB1f(int i, NZ5kBzhrWZTYM7x nZ5kBzhrWZTYM7x) {
        this.P5TrFEz5WQQhKQQ = 0;
        this.P5TrFEz5WQQhKQQ = i;
        this.iBu38aCLWSsRGhH = new cebHCFblncsXMwr(i, nZ5kBzhrWZTYM7x);
    }

    private void iBu38aCLWSsRGhH(int i) {
        int i2;
        int i3 = this.iBu38aCLWSsRGhH.iBu38aCLWSsRGhH;
        List list = this.iBu38aCLWSsRGhH.f490iBu38aCLWSsRGhH;
        this.f497P5TrFEz5WQQhKQQ = new int[i];
        int i4 = 0;
        while (i4 < i) {
            if (i3 == list.size() - 1) {
                this.f497P5TrFEz5WQQhKQQ[i4] = ((Integer) list.get(0)).intValue();
                i2 = 1;
            } else if (i3 >= 0 || i3 < list.size()) {
                this.f497P5TrFEz5WQQhKQQ[i4] = ((Integer) list.get(i3)).intValue();
                i2 = i3 + 1;
            } else {
                i2 = i3;
            }
            i4++;
            i3 = i2;
        }
    }

    private String pQE369dujkiIuKR(String str) {
        String str2 = BuildConfig.FLAVOR;
        int[] iArr = this.f497P5TrFEz5WQQhKQQ;
        for (int i=0; i<iArr.length; i++){
            str2 = str2 + String.valueOf(iArr[i]);
        }
//        int i = 0;
//        while (i < iArr.length) {
//            i++;
//            str2 = str2 + String.valueOf(iArr[i]);
//        }
        if (str2.length() > str.length()) {
            str2 = str2.substring(0, str.length());
        }
        Long valueOf = Long.valueOf(Long.parseLong(str2));
        return String.valueOf(Long.valueOf(Long.valueOf(Long.parseLong(str)).longValue() ^ valueOf.longValue()));
    }

    public String OV7PRsmadvLVQeZ(String str) {
        iBu38aCLWSsRGhH(str.length());
        return pQE369dujkiIuKR(this.iBu38aCLWSsRGhH.iBu38aCLWSsRGhH(str));
    }

    public int iBu38aCLWSsRGhH() {
        return this.P5TrFEz5WQQhKQQ;
    }
}
