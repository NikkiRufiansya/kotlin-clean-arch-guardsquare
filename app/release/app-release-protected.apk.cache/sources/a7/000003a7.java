package o;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class dG {
    public static InputStream setIconTintList(eC eCVar, C0126eg c0126eg, eA eAVar) {
        long micros;
        eAVar.MenuHostHelper$$ExternalSyntheticLambda0 = eA.setIconTintList();
        micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
        eAVar.setX = micros;
        long j = eAVar.MenuHostHelper$$ExternalSyntheticLambda0;
        dA x = dA.setX(c0126eg);
        try {
            URLConnection openConnection = eCVar.setX.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new dH((HttpsURLConnection) openConnection, eAVar, x).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new dI((HttpURLConnection) openConnection, eAVar, x).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            x.setIconTintList(j);
            x.setY(new eA().setX - eAVar.setX);
            x.setY(eCVar.toString());
            dN.setX(x);
            throw e;
        }
    }
}