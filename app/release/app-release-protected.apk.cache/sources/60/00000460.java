package o;

import android.content.SharedPreferences;
import java.util.Date;
import o.C0177gc;
import o.fA;

/* loaded from: classes.dex */
public final class fZ {
    public final SharedPreferences setX;
    static final Date MenuHostHelper$$ExternalSyntheticLambda1 = new Date(-1);
    static final Date MenuHostHelper$$ExternalSyntheticLambda0 = new Date(-1);
    final Object setY = new Object();
    private final Object setIconTintList = new Object();
    private final Object setNavigationOnClickListener = new Object();

    public fZ(SharedPreferences sharedPreferences) {
        this.setX = sharedPreferences;
    }

    public final InterfaceC0165fs setX() {
        C0177gc c0177gc;
        synchronized (this.setY) {
            long j = this.setX.getLong("last_fetch_time_in_millis", -1L);
            int i = this.setX.getInt("last_fetch_status", 0);
            fA.setY sety = new fA.setY();
            long j2 = this.setX.getLong("fetch_timeout_in_seconds", 60L);
            if (j2 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
            }
            sety.MenuHostHelper$$ExternalSyntheticLambda0 = j2;
            long j3 = this.setX.getLong("minimum_fetch_interval_in_seconds", fN.setY);
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder("Minimum interval between fetches has to be a non-negative number. ");
                sb.append(j3);
                sb.append(" is an invalid argument");
                throw new IllegalArgumentException(sb.toString());
            }
            sety.setY = j3;
            fA fAVar = new fA(sety, (byte) 0);
            C0177gc.setX setx = new C0177gc.setX((byte) 0);
            setx.setX = i;
            setx.setY = j;
            setx.setIconTintList = fAVar;
            c0177gc = new C0177gc(setx.setY, setx.setX, setx.setIconTintList, (byte) 0);
        }
        return c0177gc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        synchronized (this.setY) {
            this.setX.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(long j) {
        synchronized (this.setY) {
            this.setX.edit().putLong("last_template_version", j).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fZ$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList() {
        fZ$MenuHostHelper$$ExternalSyntheticLambda0 fz_menuhosthelper__externalsyntheticlambda0;
        synchronized (this.setIconTintList) {
            fz_menuhosthelper__externalsyntheticlambda0 = new fZ$MenuHostHelper$$ExternalSyntheticLambda0(this.setX.getInt("num_failed_fetches", 0), new Date(this.setX.getLong("backoff_end_time_in_millis", -1L)));
        }
        return fz_menuhosthelper__externalsyntheticlambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, Date date) {
        synchronized (this.setIconTintList) {
            this.setX.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fZ$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        fZ$MenuHostHelper$$ExternalSyntheticLambda1 fz_menuhosthelper__externalsyntheticlambda1;
        synchronized (this.setNavigationOnClickListener) {
            fz_menuhosthelper__externalsyntheticlambda1 = new fZ$MenuHostHelper$$ExternalSyntheticLambda1(this.setX.getInt("num_failed_realtime_streams", 0), new Date(this.setX.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return fz_menuhosthelper__externalsyntheticlambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i, Date date) {
        synchronized (this.setNavigationOnClickListener) {
            this.setX.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}