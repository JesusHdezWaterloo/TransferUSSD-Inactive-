package coder.inner;

import java.util.HashMap;
import java.util.Map;

/* renamed from: cu.etecsa.cubacel.tr.tm.EwFlR5uX8QJ.x2NavyAl6Xi */
public class x2NavyAl6Xi {

    Map dictionaryCode = new HashMap();

    x2NavyAl6Xi() {
        this.dictionaryCode.put(".", "04");
        this.dictionaryCode.put("-", "74");
        this.dictionaryCode.put("_", "77");
        this.dictionaryCode.put("0", "91");
        this.dictionaryCode.put("/", "34");
        this.dictionaryCode.put(",", "87");
        this.dictionaryCode.put("%", "81");
        this.dictionaryCode.put("&", "54");
        this.dictionaryCode.put("a", "67");
        this.dictionaryCode.put("b", "38");
        this.dictionaryCode.put("c", "08");
        this.dictionaryCode.put("1", "58");
        this.dictionaryCode.put("A", "98");
        this.dictionaryCode.put("B", "42");
        this.dictionaryCode.put("C", "72");
        this.dictionaryCode.put("á", "66");
        this.dictionaryCode.put("@", "68");
        this.dictionaryCode.put("d", "96");
        this.dictionaryCode.put("e", "21");
        this.dictionaryCode.put("h", "20");
        this.dictionaryCode.put("2", "73");
        this.dictionaryCode.put("D", "26");
        this.dictionaryCode.put("E", "32");
        this.dictionaryCode.put("F", "50");
        this.dictionaryCode.put("é", "01");
        this.dictionaryCode.put("#", "83");
        this.dictionaryCode.put("g", "51");
        this.dictionaryCode.put("f", "29");
        this.dictionaryCode.put("i", "78");
        this.dictionaryCode.put("3", "94");
        this.dictionaryCode.put("G", "05");
        this.dictionaryCode.put("H", "03");
        this.dictionaryCode.put("I", "02");
        this.dictionaryCode.put("í", "37");
        this.dictionaryCode.put(";", "43");
        this.dictionaryCode.put("j", "57");
        this.dictionaryCode.put("k", "97");
        this.dictionaryCode.put("l", "48");
        this.dictionaryCode.put("4", "75");
        this.dictionaryCode.put("J", "82");
        this.dictionaryCode.put("K", "19");
        this.dictionaryCode.put("L", "79");
        this.dictionaryCode.put("ó", "70");
        this.dictionaryCode.put("m", "62");
        this.dictionaryCode.put("n", "53");
        this.dictionaryCode.put("o", "07");
        this.dictionaryCode.put("ñ", "27");
        this.dictionaryCode.put("5", "52");
        this.dictionaryCode.put("M", "35");
        this.dictionaryCode.put("N", "39");
        this.dictionaryCode.put("O", "60");
        this.dictionaryCode.put("Ñ", "15");
        this.dictionaryCode.put("p", "69");
        this.dictionaryCode.put("q", "24");
        this.dictionaryCode.put("r", "92");
        this.dictionaryCode.put("6", "46");
        this.dictionaryCode.put("P", "22");
        this.dictionaryCode.put("Q", "12");
        this.dictionaryCode.put("R", "89");
        this.dictionaryCode.put("ú", "41");
        this.dictionaryCode.put("s", "25");
        this.dictionaryCode.put("t", "44");
        this.dictionaryCode.put("u", "40");
        this.dictionaryCode.put("7", "85");
        this.dictionaryCode.put("S", "36");
        this.dictionaryCode.put("T", "09");
        this.dictionaryCode.put("U", "59");
        this.dictionaryCode.put("v", "55");
        this.dictionaryCode.put("w", "93");
        this.dictionaryCode.put("x", "13");
        this.dictionaryCode.put("8", "00");
        this.dictionaryCode.put("V", "45");
        this.dictionaryCode.put("W", "31");
        this.dictionaryCode.put("X", "17");
        this.dictionaryCode.put("y", "18");
        this.dictionaryCode.put("z", "30");
        this.dictionaryCode.put(" ", "76");
        this.dictionaryCode.put("9", "28");
        this.dictionaryCode.put("Y", "86");
        this.dictionaryCode.put("Z", "95");
        this.dictionaryCode.put("Á", "99");
        this.dictionaryCode.put("É", "33");
        this.dictionaryCode.put("Í", "63");
        this.dictionaryCode.put("Ó", "06");
        this.dictionaryCode.put("Ú", "65");
        this.dictionaryCode.put("ü", "47");
        this.dictionaryCode.put("Ü", "61");
    }

    public String getCode(String str) {
        return (String) this.dictionaryCode.get(str);
    }
}
