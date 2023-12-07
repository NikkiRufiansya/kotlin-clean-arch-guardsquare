package o;

import android.widget.Checkable;
import o.unwrap;

/* loaded from: classes.dex */
public interface unwrap<T extends unwrap<T>> extends Checkable {

    /* loaded from: classes.dex */
    public interface setY<C> {
        void MenuHostHelper$$ExternalSyntheticLambda0(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(setY<T> sety);
}