package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o.pN;
import o.setCompoundDrawablePadding;

/* loaded from: classes.dex */
public final class Recreator$MenuHostHelper$$ExternalSyntheticLambda1 implements setCompoundDrawablePadding.setX {
    public final Set<String> setIconTintList;

    public Recreator$MenuHostHelper$$ExternalSyntheticLambda1(setCompoundDrawablePadding setcompounddrawablepadding) {
        pN.setY(setcompounddrawablepadding, "");
        this.setIconTintList = new LinkedHashSet();
        setcompounddrawablepadding.setIconTintList("androidx.savedstate.Restarter", this);
    }

    @Override // o.setCompoundDrawablePadding.setX
    public final Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.setIconTintList));
        return bundle;
    }
}