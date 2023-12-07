package o;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.setItemOnTouchListener;

/* loaded from: classes.dex */
public final class setKeepScreenOn {
    final setSubtitle MenuHostHelper$$ExternalSyntheticLambda0;
    ArrayList<setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0> setX;
    HashSet<View> setY;
    ArrayList<setOnItemSelectedListener> setIconTintList = new ArrayList<>();
    private String setOnLongClickListener = "ViewTransitionController";
    ArrayList<setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();

    public setKeepScreenOn(setSubtitle setsubtitle) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsubtitle;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setOnItemSelectedListener setonitemselectedlistener, View... viewArr) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setonitemselectedlistener.setLayoutAnimation == 2) {
            setonitemselectedlistener.MenuHostHelper$$ExternalSyntheticLambda0(this, this.MenuHostHelper$$ExternalSyntheticLambda0, i, null, viewArr);
        } else if (i == -1) {
            String str = this.setOnLongClickListener;
            StringBuilder sb = new StringBuilder("No support for ViewTransition within transition yet. Currently: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.toString());
            Log.w(str, sb.toString());
        } else {
            setOnRatingBarChangeListener setonratingbarchangelistener = this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 x = setonratingbarchangelistener == null ? null : setonratingbarchangelistener.setX(i);
            if (x == null) {
                return;
            }
            setonitemselectedlistener.MenuHostHelper$$ExternalSyntheticLambda0(this, this.MenuHostHelper$$ExternalSyntheticLambda0, i, x, viewArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<setOnItemSelectedListener> it = this.setIconTintList.iterator();
        setOnItemSelectedListener setonitemselectedlistener = null;
        while (it.hasNext()) {
            setOnItemSelectedListener next = it.next();
            if (next.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
                int length = viewArr.length;
                for (int i2 = 0; i2 <= 0; i2++) {
                    View view = viewArr[i2];
                    if (next.setY(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    MenuHostHelper$$ExternalSyntheticLambda1(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                setonitemselectedlistener = next;
            }
        }
        if (setonitemselectedlistener == null) {
            Log.e(this.setOnLongClickListener, " Could not find ViewTransition");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(final setOnItemSelectedListener setonitemselectedlistener, final boolean z) {
        final int i = setonitemselectedlistener.setIconTintList;
        final int i2 = setonitemselectedlistener.setOnLongClickListener;
        setMIndicatorOptions.MenuHostHelper$$ExternalSyntheticLambda0().setX(setonitemselectedlistener.setIconTintList, new setItemOnTouchListener.setX() { // from class: o.setKeepScreenOn.2
        });
    }
}