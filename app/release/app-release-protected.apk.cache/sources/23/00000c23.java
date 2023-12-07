package o;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class setHelperText {
    private static setRendererPriorityPolicy setIconTintList = new setItemPaddingBottom();
    private static ThreadLocal<WeakReference<setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>>>> MenuHostHelper$$ExternalSyntheticLambda1 = new ThreadLocal<>();
    static ArrayList<ViewGroup> setY = new ArrayList<>();
    private setFabAnchorMode<setImageState, setRendererPriorityPolicy> setX = new setFabAnchorMode<>();
    private setFabAnchorMode<setImageState, setFabAnchorMode<setImageState, setRendererPriorityPolicy>> MenuHostHelper$$ExternalSyntheticLambda0 = new setFabAnchorMode<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>> setIconTintList() {
        setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>> setfabanchormode;
        WeakReference<setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>>> weakReference = MenuHostHelper$$ExternalSyntheticLambda1.get();
        if (weakReference == null || (setfabanchormode = weakReference.get()) == null) {
            setFabAnchorMode<ViewGroup, ArrayList<setRendererPriorityPolicy>> setfabanchormode2 = new setFabAnchorMode<>();
            MenuHostHelper$$ExternalSyntheticLambda1.set(new WeakReference<>(setfabanchormode2));
            return setfabanchormode2;
        }
        return setfabanchormode;
    }

    public static void setIconTintList(ViewGroup viewGroup, setRendererPriorityPolicy setrendererprioritypolicy) {
        if (setY.contains(viewGroup) || !setBaselineAlignBottom.setConstraintSet(viewGroup)) {
            return;
        }
        setY.add(viewGroup);
        if (setrendererprioritypolicy == null) {
            setrendererprioritypolicy = setIconTintList;
        }
        setRendererPriorityPolicy clone = setrendererprioritypolicy.clone();
        ArrayList<setRendererPriorityPolicy> arrayList = setIconTintList().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<setRendererPriorityPolicy> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setIconTintList((View) viewGroup);
            }
        }
        if (clone != null) {
            clone.MenuHostHelper$$ExternalSyntheticLambda1(viewGroup, true);
        }
        setImageState setimagestate = (setImageState) viewGroup.getTag(R.id.res_0x7f0a0203);
        if (setimagestate != null) {
            ViewGroup viewGroup2 = setimagestate.MenuHostHelper$$ExternalSyntheticLambda0;
            throw null;
        }
        viewGroup.setTag(R.id.res_0x7f0a0203, null);
        if (clone == null || viewGroup == null) {
            return;
        }
        setHelperText$MenuHostHelper$$ExternalSyntheticLambda1 sethelpertext_menuhosthelper__externalsyntheticlambda1 = new setHelperText$MenuHostHelper$$ExternalSyntheticLambda1(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(sethelpertext_menuhosthelper__externalsyntheticlambda1);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(sethelpertext_menuhosthelper__externalsyntheticlambda1);
    }
}