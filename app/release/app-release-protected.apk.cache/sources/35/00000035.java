package androidx.core.view;

import o.FullLifecycleObserverAdapter;
import o.registerIn;
import o.setCheckable;
import o.setMenuAlignmentMode;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda0 implements setCheckable {
    public final /* synthetic */ setMenuAlignmentMode MenuHostHelper$$ExternalSyntheticLambda1;
    public final /* synthetic */ FullLifecycleObserverAdapter setX;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.setX;
        setMenuAlignmentMode setmenualignmentmode = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setx == registerIn.setX.ON_DESTROY) {
            fullLifecycleObserverAdapter.setIconTintList(setmenualignmentmode);
        }
    }
}