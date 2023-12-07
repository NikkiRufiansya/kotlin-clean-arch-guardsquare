package o;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.Permission;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class dP {
    private static final C0106dm setY = C0106dm.setY();
    final eA MenuHostHelper$$ExternalSyntheticLambda0;
    final dA MenuHostHelper$$ExternalSyntheticLambda1;
    private long setIconTintList = -1;
    private long setUiOptions = -1;
    final HttpURLConnection setX;

    public dP(HttpURLConnection httpURLConnection, eA eAVar, dA dAVar) {
        this.setX = httpURLConnection;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = dAVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = eAVar;
        dAVar.setY(httpURLConnection.getURL().toString());
    }

    public final void setX() {
        long micros;
        if (this.setIconTintList == -1) {
            eA eAVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            eAVar.MenuHostHelper$$ExternalSyntheticLambda0 = eA.setIconTintList();
            micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
            eAVar.setX = micros;
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(j);
        }
        try {
            this.setX.connect();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        dA dAVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        dAVar.setY.setY(this.setX.getResponseCode());
        try {
            Object content = this.setX.getContent();
            if (content instanceof InputStream) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setX.getContentType());
                return new dK((InputStream) content, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setX.getContentType());
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.setX.getContentLength());
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            return content;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final Object setX(Class[] clsArr) {
        MenuHostHelper$$ExternalSyntheticLambda1();
        dA dAVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        dAVar.setY.setY(this.setX.getResponseCode());
        try {
            Object content = this.setX.getContent(clsArr);
            if (content instanceof InputStream) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setX.getContentType());
                return new dK((InputStream) content, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setX.getContentType());
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.setX.getContentLength());
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            return content;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final InputStream setY() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setY(this.setX.getResponseCode());
        this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setX.getContentType());
        try {
            InputStream inputStream = this.setX.getInputStream();
            return inputStream != null ? new dK(inputStream, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0) : inputStream;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final OutputStream setLayoutAnimation() {
        try {
            OutputStream outputStream = this.setX.getOutputStream();
            return outputStream != null ? new dJ(outputStream, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0) : outputStream;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final Permission setUnboundedRipple() {
        try {
            return this.setX.getPermission();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final int setNavigationOnClickListener() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        if (this.setUiOptions == -1) {
            long j = new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
            this.setUiOptions = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setOnLongClickListener(j);
        }
        try {
            int responseCode = this.setX.getResponseCode();
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setY(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final String setUiOptions() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        if (this.setUiOptions == -1) {
            long j = new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
            this.setUiOptions = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setOnLongClickListener(j);
        }
        try {
            String responseMessage = this.setX.getResponseMessage();
            dA dAVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            dAVar.setY.setY(this.setX.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.setX.equals(obj);
    }

    public final InputStream setIconTintList() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setY(this.setX.getResponseCode());
        } catch (IOException unused) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("IOException thrown trying to obtain the response code");
            }
        }
        InputStream errorStream = this.setX.getErrorStream();
        return errorStream != null ? new dK(errorStream, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0) : errorStream;
    }

    public final int hashCode() {
        return this.setX.hashCode();
    }

    public final String toString() {
        return this.setX.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        long micros;
        if (this.setIconTintList == -1) {
            eA eAVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            eAVar.MenuHostHelper$$ExternalSyntheticLambda0 = eA.setIconTintList();
            micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
            eAVar.setX = micros;
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(j);
        }
        String requestMethod = this.setX.getRequestMethod();
        if (requestMethod != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(requestMethod);
        } else if (this.setX.getDoOutput()) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0("POST");
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0("GET");
        }
    }
}