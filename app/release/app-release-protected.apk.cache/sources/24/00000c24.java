package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setHelperText$MenuHostHelper$$ExternalSyntheticLambda1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    ViewGroup setX;
    private setRendererPriorityPolicy setY;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setHelperText$MenuHostHelper$$ExternalSyntheticLambda1(setRendererPriorityPolicy setrendererprioritypolicy, ViewGroup viewGroup) {
        this.setY = setrendererprioritypolicy;
        this.setX = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.setX.getViewTreeObserver().removeOnPreDrawListener(this);
        this.setX.removeOnAttachStateChangeListener(this);
        if (setHelperText.setY.remove(this.setX)) {
            final setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>> iconTintList = setHelperText.setIconTintList();
            ArrayList<setRendererPriorityPolicy> arrayList = iconTintList.get(this.setX);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                iconTintList.put(this.setX, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.setY);
            this.setY.setY(new setBoxBackgroundColor() { // from class: o.setHelperText$MenuHostHelper$$ExternalSyntheticLambda1.2
                @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                    ((ArrayList) iconTintList.get(setHelperText$MenuHostHelper$$ExternalSyntheticLambda1.this.setX)).remove(setrendererprioritypolicy);
                    setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
                }
            });
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((setRendererPriorityPolicy) it.next()).MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
                }
            }
            this.setY.setIconTintList(this.setX);
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.setX.getViewTreeObserver().removeOnPreDrawListener(this);
        this.setX.removeOnAttachStateChangeListener(this);
        setHelperText.setY.remove(this.setX);
        ArrayList<setRendererPriorityPolicy> arrayList = setHelperText.setIconTintList().get(this.setX);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<setRendererPriorityPolicy> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            }
        }
        this.setY.setIconTintList(true);
    }
}