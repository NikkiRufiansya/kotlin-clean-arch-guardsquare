package o;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.setCompoundDrawablePadding;
import o.setPlaceholderTextColor;

/* loaded from: classes.dex */
public final class TimeModel$1 {
    public static final setPlaceholderTextColor.setY<setFillViewport> MenuHostHelper$$ExternalSyntheticLambda0 = new setPlaceholderTextColor.setY<setFillViewport>() { // from class: o.TimeModel$1$MenuHostHelper$$ExternalSyntheticLambda1
    };
    public static final setPlaceholderTextColor.setY<setPictureListener> setX = new setIconTintList();
    public static final setPlaceholderTextColor.setY<Bundle> setY = new setPlaceholderTextColor.setY<Bundle>() { // from class: o.TimeModel$1$MenuHostHelper$$ExternalSyntheticLambda0
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends setFillViewport & setPictureListener> void MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        setCompoundDrawablePadding.setX setx;
        pN.setY(t, "");
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda02 = t.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda02, "");
        if (!(MenuHostHelper$$ExternalSyntheticLambda02 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED || MenuHostHelper$$ExternalSyntheticLambda02 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setCompoundDrawablePadding navigationOnClickListener = t.setNavigationOnClickListener();
        pN.setY("androidx.lifecycle.internal.SavedStateHandlesProvider", "");
        Iterator<Map.Entry<String, setCompoundDrawablePadding.setX>> it = navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (true) {
            if (!it.hasNext()) {
                setx = null;
                break;
            }
            Map.Entry<String, setCompoundDrawablePadding.setX> next = it.next();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) next, "");
            setx = next.getValue();
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) next.getKey(), (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (setx == null) {
            setAllCaps setallcaps = new setAllCaps(t.setNavigationOnClickListener(), t);
            t.setNavigationOnClickListener().setIconTintList("androidx.lifecycle.internal.SavedStateHandlesProvider", setallcaps);
            t.MenuHostHelper$$ExternalSyntheticLambda1().setY(new androidx.lifecycle.SavedStateHandleAttacher(setallcaps));
        }
    }

    /* loaded from: classes.dex */
    static final class setY extends pO implements InterfaceC0377pk<setPlaceholderTextColor, setVerticalScrollBarEnabled> {
        public static final setY setIconTintList = new setY();

        setY() {
            super(1);
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ setVerticalScrollBarEnabled setX(setPlaceholderTextColor setplaceholdertextcolor) {
            pN.setY(setplaceholdertextcolor, "");
            return new setVerticalScrollBarEnabled();
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList implements setPlaceholderTextColor.setY<setPictureListener> {
        setIconTintList() {
        }
    }

    public static final setVerticalScrollBarEnabled setX(setPictureListener setpicturelistener) {
        pN.setY(setpicturelistener, "");
        setDownloadListener setdownloadlistener = new setDownloadListener();
        setY sety = setY.setIconTintList;
        InterfaceC0410qq y = C0394qa.setY(setVerticalScrollBarEnabled.class);
        pN.setY(y, "");
        pN.setY(sety, "");
        List<setCheckedSlideWidth<?>> list = setdownloadlistener.setY;
        pN.setY(y, "");
        Class<?> y2 = ((pL) y).setY();
        pN.setX(y2);
        list.add(new setCheckedSlideWidth<>(y2, sety));
        Object[] array = setdownloadlistener.setY.toArray(new setCheckedSlideWidth[0]);
        if (array != null) {
            setCheckedSlideWidth[] setcheckedslidewidthArr = (setCheckedSlideWidth[]) array;
            return (setVerticalScrollBarEnabled) new setEndIconTintMode(setpicturelistener, new setDropDownAnchor((setCheckedSlideWidth[]) Arrays.copyOf(setcheckedslidewidthArr, setcheckedslidewidthArr.length))).setIconTintList("androidx.lifecycle.internal.SavedStateHandlesVM", setVerticalScrollBarEnabled.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}