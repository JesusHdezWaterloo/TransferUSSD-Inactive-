package cu.arrowtech.tranferussd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MainActivity extends AppCompatActivity {

    static String KEY_PASS = "mysupersecretpasssword";
    static ProgressDialog bar;
    static String code_version = "11811022182382";
    static Context contextoFile;
    static String crude_code = "00011000000011111001011010000000000001110100011000100001111101010011000100000111000101001010110100011011001010100100100000101001011010000011010100000001000000101000000110010110100010110100010101000110000100101110010100011001000111100000100100101101000011101010101111001000010110010110100010011001001011110000100110010110000101101000100001001000001000101011010010010101010001010011100000000001001011010010010100100101100010010111110101101001000100010011110000011010000011110101011010000110010010101110000011110011010101001110010100010100000010000010110100101101001000101010100010001101011010001001010100110010000011011000100010010110100100001100101010100101110100101000010101011001000111000001001110101101001010011010101010001001000101010110100000110001001000000010010000000101110101101000110001000111111000000100000110100101001101010011101100100111001011010010010110100001110010000000110101101001000010010000101100000100100101110001011010001101110010001110000110000011001101001001000101000000001011001010110100001000101011000000100000100001011010010011110101100011001010000001011011";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.texter);
        final String texter = code("9204129972669206*1*58310867");
//        texter = texter + "\n";
//        texter = texter + code("9204129974100937*1*1*1*0000*54657592*0*0000");

        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED
                ||ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE,Manifest.permission.READ_PHONE_STATE},1);
        }

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ussdCode = "*"+"444"+"*"+"45"+"*"+ texter +"*"+"1181102"+ Uri.encode("#");
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:" + ussdCode)));
            }
        });
//        texter = texter + "\n";
//
//        try {
//            texter = texter + EncryptionUtils.decrypt("YourSecKey","0833015045");
//        } catch (IllegalBlockSizeException e) {
//            e.printStackTrace();
//        } catch (InvalidKeyException e) {
//            e.printStackTrace();
//        } catch (BadPaddingException e) {
//            e.printStackTrace();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (NoSuchPaddingException e) {
//            e.printStackTrace();
//        }

        tv.setText(texter);
    }

    public String code(String str) {
        List iBu38aCLWSsRGhH;
        String str2;
        String[] split = str.split("\\*");
        int[] iArr = new int[split.length];
        String str3 = BuildConfig.FLAVOR;
        boolean z = false;
        for (int i = 0; i < split.length; i++) {
            if (esEntero(String.valueOf(split[i]))) {
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
            List iBu38aCLWSsRGhH2 = new Lcb96Uk5Xjuflq(this.code_version, this.crude_code).iBu38aCLWSsRGhH(arrayList2);
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
            iBu38aCLWSsRGhH = new Lcb96Uk5Xjuflq(this.code_version, this.crude_code).iBu38aCLWSsRGhH(asList);
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

    public boolean esEntero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
