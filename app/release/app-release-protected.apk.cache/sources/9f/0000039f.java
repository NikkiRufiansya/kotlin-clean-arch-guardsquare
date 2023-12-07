package o;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092cz {
    private static final String[] setY = {"*", "FCM", "GCM", ""};
    private final String setIconTintList;
    private final SharedPreferences setX;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r6.isEmpty() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0092cz(com.google.firebase.FirebaseApp r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.setUiOptions
            boolean r0 = r0.get()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "FirebaseApp was deleted"
            if (r0 == 0) goto L6f
            android.content.Context r0 = r6.setIconTintList
            r3 = 0
            java.lang.String r4 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r3)
            r5.setX = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.setUiOptions
            boolean r0 = r0.get()
            r0 = r0 ^ r1
            if (r0 == 0) goto L69
            o.U r0 = r6.setNavigationOnClickListener
            java.lang.String r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            r3 = 0
            if (r0 == 0) goto L2b
            goto L60
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.setUiOptions
            boolean r0 = r0.get()
            r0 = r0 ^ r1
            if (r0 == 0) goto L63
            o.U r6 = r6.setNavigationOnClickListener
            java.lang.String r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            java.lang.String r0 = "1:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "2:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L49
            goto L4b
        L49:
            r0 = r6
            goto L60
        L4b:
            java.lang.String r0 = ":"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r2 = 4
            if (r0 == r2) goto L57
        L55:
            r0 = r3
            goto L60
        L57:
            r6 = r6[r1]
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L49
            goto L55
        L60:
            r5.setIconTintList = r0
            return
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L69:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0092cz.<init>(com.google.firebase.FirebaseApp):void");
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        String[] strArr;
        synchronized (this.setX) {
            for (String str : setY) {
                String str2 = this.setIconTintList;
                StringBuilder sb = new StringBuilder("|T|");
                sb.append(str2);
                sb.append("|");
                sb.append(str);
                String string = this.setX.getString(sb.toString(), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = MenuHostHelper$$ExternalSyntheticLambda1(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this.setX) {
            String x = setX();
            if (x != null) {
                return x;
            }
            return setIconTintList();
        }
    }

    private String setX() {
        String string;
        synchronized (this.setX) {
            string = this.setX.getString("|S|id", null);
        }
        return string;
    }

    private String setIconTintList() {
        synchronized (this.setX) {
            String string = this.setX.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(string);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                return null;
            }
            return setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    private static String setIconTintList(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private static PublicKey MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder("Invalid key stored ");
            sb.append(e);
            Log.w("ContentValues", sb.toString());
            return null;
        }
    }
}