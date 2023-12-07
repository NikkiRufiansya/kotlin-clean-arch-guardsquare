package o;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o.nR;
import o.pY;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gH implements gB {
    final C0181gg MenuHostHelper$$ExternalSyntheticLambda0;
    private final oM MenuHostHelper$$ExternalSyntheticLambda1;
    final String setY;

    static {
        new setY((byte) 0);
    }

    public /* synthetic */ gH(C0181gg c0181gg, oM oMVar) {
        this(c0181gg, oMVar, "firebase-settings.crashlytics.com");
    }

    private gH(C0181gg c0181gg, oM oMVar, String str) {
        pN.setY(c0181gg, "");
        pN.setY(oMVar, "");
        pN.setY(str, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0181gg;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = oMVar;
        this.setY = str;
    }

    @Override // o.gB
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Map<String, String> map, InterfaceC0389pw<? super JSONObject, ? super oK<? super nX>, ? extends Object> interfaceC0389pw, InterfaceC0389pw<? super String, ? super oK<? super nX>, ? extends Object> interfaceC0389pw2, oK<? super nX> oKVar) {
        Object y = C0435ro.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, new setIconTintList(map, interfaceC0389pw, interfaceC0389pw2, null), oKVar);
        return y == oJ.COROUTINE_SUSPENDED ? y : nX.setX;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        private /* synthetic */ InterfaceC0389pw<JSONObject, oK<? super nX>, Object> MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ InterfaceC0389pw<String, oK<? super nX>, Object> setIconTintList;
        private int setX;
        private /* synthetic */ Map<String, String> setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        setIconTintList(Map<String, String> map, InterfaceC0389pw<? super JSONObject, ? super oK<? super nX>, ? extends Object> interfaceC0389pw, InterfaceC0389pw<? super String, ? super oK<? super nX>, ? extends Object> interfaceC0389pw2, oK<? super setIconTintList> oKVar) {
            super(2, oKVar);
            this.setY = map;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0389pw;
            this.setIconTintList = interfaceC0389pw2;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            return new setIconTintList(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, oKVar);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
            return new setIconTintList(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, oKVar).setY(nX.setX);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            int i = this.setX;
            try {
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        if (obj instanceof nR.setX) {
                            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        if (obj instanceof nR.setX) {
                            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                    }
                } else if (!(obj instanceof nR.setX)) {
                    gH gHVar = gH.this;
                    URLConnection openConnection = new URL(new Uri.Builder().scheme("https").authority(gHVar.setY).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(gHVar.MenuHostHelper$$ExternalSyntheticLambda0.setX).appendPath("settings").appendQueryParameter("build_version", gHVar.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0).appendQueryParameter("display_version", gHVar.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setY).build().toString()).openConnection();
                    pN.setX(openConnection);
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.setY.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        pY.setX setx = new pY.setX();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            setx.setX = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb.append((String) setx.setX);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        InterfaceC0389pw<JSONObject, oK<? super nX>, Object> interfaceC0389pw = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        this.setX = 1;
                        if (interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0(jSONObject, this) == oJVar) {
                            return oJVar;
                        }
                    } else {
                        InterfaceC0389pw<String, oK<? super nX>, Object> interfaceC0389pw2 = this.setIconTintList;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bad response code: ");
                        sb2.append(responseCode);
                        String obj2 = sb2.toString();
                        this.setX = 2;
                        if (interfaceC0389pw2.MenuHostHelper$$ExternalSyntheticLambda0(obj2, this) == oJVar) {
                            return oJVar;
                        }
                    }
                } else {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } catch (Exception e) {
                InterfaceC0389pw<String, oK<? super nX>, Object> interfaceC0389pw3 = this.setIconTintList;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.setX = 3;
                if (interfaceC0389pw3.MenuHostHelper$$ExternalSyntheticLambda0(message, this) == oJVar) {
                    return oJVar;
                }
            }
            return nX.setX;
        }
    }
}