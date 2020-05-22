package coder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class Utils {

    public static String encode(String str) {//TODO: una de las adaptaciones
        try {
            return URLEncoder.encode("#", "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return "#";
        }
    }
}
