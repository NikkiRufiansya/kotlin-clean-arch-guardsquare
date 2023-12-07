package androidx.core.view;

import o.FullLifecycleObserverAdapter;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCheckable;
import o.setMenuAlignmentMode;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements setCheckable {
    public final /* synthetic */ FullLifecycleObserverAdapter MenuHostHelper$$ExternalSyntheticLambda0;
    public final /* synthetic */ setMenuAlignmentMode MenuHostHelper$$ExternalSyntheticLambda1;
    public final /* synthetic */ registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setX;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.MenuHostHelper$$ExternalSyntheticLambda0;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = this.setX;
        setMenuAlignmentMode setmenualignmentmode = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setx != registerIn.setX.MenuHostHelper$$ExternalSyntheticLambda1(registerin_menuhosthelper__externalsyntheticlambda1)) {
            if (setx == registerIn.setX.ON_DESTROY) {
                fullLifecycleObserverAdapter.setIconTintList(setmenualignmentmode);
                return;
            } else if (setx == registerIn.setX.setIconTintList(registerin_menuhosthelper__externalsyntheticlambda1)) {
                fullLifecycleObserverAdapter.setY.remove(setmenualignmentmode);
                fullLifecycleObserverAdapter.MenuHostHelper$$ExternalSyntheticLambda0.run();
                return;
            } else {
                return;
            }
        }
        fullLifecycleObserverAdapter.setY.add(setmenualignmentmode);
        fullLifecycleObserverAdapter.MenuHostHelper$$ExternalSyntheticLambda0.run();
    }
}