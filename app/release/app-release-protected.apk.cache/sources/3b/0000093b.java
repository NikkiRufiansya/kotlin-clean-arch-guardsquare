package o;

import android.os.Bundle;
import java.util.Map;
import o.setCompoundDrawablePadding;

/* loaded from: classes.dex */
public final class setAllCaps implements setCompoundDrawablePadding.setX {
    public final nP MenuHostHelper$$ExternalSyntheticLambda0;
    public Bundle MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    public final setCompoundDrawablePadding setX;

    public setAllCaps(setCompoundDrawablePadding setcompounddrawablepadding, setPictureListener setpicturelistener) {
        pN.setY(setcompounddrawablepadding, "");
        pN.setY(setpicturelistener, "");
        this.setX = setcompounddrawablepadding;
        setX setx = new setX(setpicturelistener);
        pN.setY(setx, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new nS(setx);
    }

    @Override // o.setCompoundDrawablePadding.setX
    public final Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, getCallingUidOrThrow> entry : ((setVerticalScrollBarEnabled) this.MenuHostHelper$$ExternalSyntheticLambda0.setY()).setY.entrySet()) {
            String key = entry.getKey();
            Bundle MenuHostHelper$$ExternalSyntheticLambda1 = entry.getValue().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
            if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, Bundle.EMPTY)) {
                bundle.putBundle(key, MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        this.setIconTintList = false;
        return bundle;
    }

    /* loaded from: classes.dex */
    static final class setX extends pO implements InterfaceC0376pj<setVerticalScrollBarEnabled> {
        final /* synthetic */ setPictureListener MenuHostHelper$$ExternalSyntheticLambda1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(setPictureListener setpicturelistener) {
            super(0);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setpicturelistener;
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ setVerticalScrollBarEnabled setIconTintList() {
            return TimeModel$1.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }
}