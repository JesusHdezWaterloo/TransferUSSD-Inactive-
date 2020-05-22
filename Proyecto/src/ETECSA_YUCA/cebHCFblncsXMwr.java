package cu.arrowtech.tranferussd;

import cu.arrowtech.tranferussd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class cebHCFblncsXMwr {
    String P5TrFEz5WQQhKQQ = BuildConfig.FLAVOR;
    int iBu38aCLWSsRGhH = 0;

    /* renamed from: iBu38aCLWSsRGhH  reason: collision with other field name */
    List f490iBu38aCLWSsRGhH = new ArrayList();

    /* renamed from: iBu38aCLWSsRGhH  reason: collision with other field name */
    int[] f491iBu38aCLWSsRGhH = new int[10];

    public cebHCFblncsXMwr() {
        iBu38aCLWSsRGhH();
        this.f490iBu38aCLWSsRGhH = new NZ5kBzhrWZTYM7x().iBu38aCLWSsRGhH();
    }

    public cebHCFblncsXMwr(int i, NZ5kBzhrWZTYM7x nZ5kBzhrWZTYM7x) {
        this.iBu38aCLWSsRGhH = i;
        this.f490iBu38aCLWSsRGhH = nZ5kBzhrWZTYM7x.iBu38aCLWSsRGhH();
    }

    private String P5TrFEz5WQQhKQQ(String str) {
        int intValue = ((Integer) this.f490iBu38aCLWSsRGhH.get(Integer.parseInt(str.substring(0, 1) + str.substring(1)))).intValue();
        return String.valueOf(intValue).length() == 1 ? intValue == 0 ? "00" : "0" + String.valueOf(intValue) : String.valueOf(intValue);
    }

    private void P5TrFEz5WQQhKQQ() {
        int i = 0;
        Iterator it = this.f490iBu38aCLWSsRGhH.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num.intValue() < 10) {
                    this.f491iBu38aCLWSsRGhH[i2] = num.intValue();
                    i = i2 + 1;
                } else {
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    private String Wl8Ic4zkd3L4rK(String str) {
        return String.valueOf(this.f491iBu38aCLWSsRGhH[Integer.parseInt(str)]);
    }

    private void iBu38aCLWSsRGhH() {
        this.iBu38aCLWSsRGhH = new Random().nextInt(100);
    }

    public String iBu38aCLWSsRGhH(String str) {
        int i = 0;
        this.P5TrFEz5WQQhKQQ = BuildConfig.FLAVOR;
        if (str.length() % 2 == 0) {
            while (i < str.length()) {
                this.P5TrFEz5WQQhKQQ += P5TrFEz5WQQhKQQ(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1)));
                i += 2;
            }
        } else {
            P5TrFEz5WQQhKQQ();
            str.length();
            String Wl8Ic4zkd3L4rK = Wl8Ic4zkd3L4rK(String.valueOf(str.charAt(str.length() - 1)));
            String substring = str.substring(0, str.length() - 1);
            while (i < substring.length()) {
                this.P5TrFEz5WQQhKQQ += P5TrFEz5WQQhKQQ(String.valueOf(substring.charAt(i)) + String.valueOf(substring.charAt(i + 1)));
                i += 2;
            }
            String str2 = this.P5TrFEz5WQQhKQQ + Wl8Ic4zkd3L4rK;
            this.P5TrFEz5WQQhKQQ = str2;
            this.P5TrFEz5WQQhKQQ = str2;
        }
        return this.P5TrFEz5WQQhKQQ;
    }
}
