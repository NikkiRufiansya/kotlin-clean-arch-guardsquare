package o;

import android.util.Log;
import o.lC;

/* loaded from: classes.dex */
public class aA$MenuHostHelper$$ExternalSyntheticLambda0 {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final aL<?> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aA$MenuHostHelper$$ExternalSyntheticLambda0(aL aLVar, boolean z, byte b) {
        this(aLVar, z);
    }

    private aA$MenuHostHelper$$ExternalSyntheticLambda0(aL<?> aLVar, boolean z) {
        this.setY = aLVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aA$MenuHostHelper$$ExternalSyntheticLambda0) {
            aA$MenuHostHelper$$ExternalSyntheticLambda0 aa_menuhosthelper__externalsyntheticlambda0 = (aA$MenuHostHelper$$ExternalSyntheticLambda0) obj;
            return aa_menuhosthelper__externalsyntheticlambda0.setY.equals(this.setY) && aa_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return false;
    }

    public int hashCode() {
        return ((this.setY.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1).hashCode();
    }

    public static void setIconTintList(long j, long j2) {
        String str;
        String str2;
        lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
        lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("root Detected", "");
        lC.setY = "root Detected";
        str = lC.setIconTintList;
        str2 = lC.setY;
        Log.d(str, str2);
    }
}