package o;

import android.app.job.JobInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class setCompatPressedTranslationZResource {

    /* loaded from: classes.dex */
    public enum setIconTintList {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* loaded from: classes.dex */
    public static class setX {
        public setSearchableInfo MenuHostHelper$$ExternalSyntheticLambda1;
        public Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> setY = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> setIconTintList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract setSearchableInfo setX();

    public final long setY(isBinderAlive isbinderalive, long j, int i) {
        long y = setX().setY();
        setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1 setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1 = setIconTintList().get(isbinderalive);
        return Math.min(Math.max(setY(i, setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0()), j - y), setcompatpressedtranslationzresource_menuhosthelper__externalsyntheticlambda1.setY());
    }

    private static long setY(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public final JobInfo.Builder MenuHostHelper$$ExternalSyntheticLambda0(JobInfo.Builder builder, isBinderAlive isbinderalive, long j, int i) {
        builder.setMinimumLatency(setY(isbinderalive, j, i));
        setY(builder, setIconTintList().get(isbinderalive).MenuHostHelper$$ExternalSyntheticLambda1());
        return builder;
    }

    private static void setY(JobInfo.Builder builder, Set<setIconTintList> set) {
        if (set.contains(setIconTintList.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(setIconTintList.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(setIconTintList.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}