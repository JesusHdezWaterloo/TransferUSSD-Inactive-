package coder.inner;

import coder.BuildConfig;
import coder.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ASIxjbfzGK {

    x2NavyAl6Xi dictionaryCodePhone = new x2NavyAl6Xi();

    public String coding_message(String str) {
        boolean z = false;
        String str2 = BuildConfig.FLAVOR;
        int i = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                str2 = (i == 0 || !Character.isDigit(str.charAt(i + -1))) ? str2 + Utils.encode("#") + Character.toString(str.charAt(i)) : (i + 1 == str.length() || !Character.isDigit(str.charAt(i + 1))) ? str2 + Character.toString(str.charAt(i)) + Utils.encode("#") : str2 + Character.toString(str.charAt(i));
            } else if (this.dictionaryCodePhone.getCode(Character.toString(str.charAt(i))) != null) {
                str2 = str2 + this.dictionaryCodePhone.getCode(Character.toString(str.charAt(i)));
            } else {
                z = true;
            }
            i++;
        }
        return !z ? str2 : "ERROR";
    }

    public List getCodes(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = BuildConfig.FLAVOR;
            for (int i = 0; i < str.length(); i++) {
                str2 = str2 + this.dictionaryCodePhone.getCode(Character.toString(str.charAt(i)));
            }
            arrayList.add(str2);
        }
        return arrayList;
    }
}
