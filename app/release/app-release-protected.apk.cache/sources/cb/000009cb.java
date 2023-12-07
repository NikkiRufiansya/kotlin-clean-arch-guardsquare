package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class setCenterIfNoTextEnabled {
    public Random setUnboundedRipple = new Random();
    public final Map<Integer, String> setUiOptions = new HashMap();
    public final Map<String, Integer> setIconTintList = new HashMap();
    private final Map<String, setY> setY = new HashMap();
    public ArrayList<String> setX = new ArrayList<>();
    public final transient Map<String, setX<?>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap();
    public final Map<String, Object> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    public final Bundle setNavigationOnClickListener = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        final ArrayList<setCheckable> MenuHostHelper$$ExternalSyntheticLambda0;
        final registerIn MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final void setY(String str) {
        Integer remove;
        if (!this.setX.contains(str) && (remove = this.setIconTintList.remove(str)) != null) {
            this.setUiOptions.remove(remove);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove(str);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(str)) {
            StringBuilder sb = new StringBuilder("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            this.MenuHostHelper$$ExternalSyntheticLambda0.remove(str);
        }
        if (this.setNavigationOnClickListener.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.setNavigationOnClickListener.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            this.setNavigationOnClickListener.remove(str);
        }
        setY sety = this.setY.get(str);
        if (sety != null) {
            Iterator<setCheckable> it = sety.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it.hasNext()) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(it.next());
            }
            sety.MenuHostHelper$$ExternalSyntheticLambda0.clear();
            this.setY.remove(str);
        }
    }

    public final boolean setY(int i, int i2, Intent intent) {
        String str = this.setUiOptions.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(str, i2, intent, this.MenuHostHelper$$ExternalSyntheticLambda1.get(str));
        return true;
    }

    private <O> void MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, Intent intent, setX<O> setx) {
        if (setx != null && setx.MenuHostHelper$$ExternalSyntheticLambda1 != null && this.setX.contains(str)) {
            setx.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i, intent));
            this.setX.remove(str);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(str);
        this.setNavigationOnClickListener.putParcelable(str, new ViewPager$SavedState$1(i, intent));
    }

    private int setIconTintList() {
        int nextInt = this.setUnboundedRipple.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.setUiOptions.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.setUnboundedRipple.nextInt(2147418112);
        }
    }

    public final void setX(int i, String str) {
        this.setUiOptions.put(Integer.valueOf(i), str);
        this.setIconTintList.put(str, Integer.valueOf(i));
    }

    /* loaded from: classes.dex */
    public static class setX<O> {
        final setChipCornerRadius<O> MenuHostHelper$$ExternalSyntheticLambda1;
        final setZ<?, O> setIconTintList;

        public setX(setChipCornerRadius<O> setchipcornerradius, setZ<?, O> setz) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setchipcornerradius;
            this.setIconTintList = setz;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> setIconSize<I> setIconTintList(final String str, final setZ<I, O> setz, setChipCornerRadius<O> setchipcornerradius) {
        if (this.setIconTintList.get(str) == null) {
            setX(setIconTintList(), str);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.put(str, new setX<>(setchipcornerradius, setz));
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(str)) {
            Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0.get(str);
            this.MenuHostHelper$$ExternalSyntheticLambda0.remove(str);
            setchipcornerradius.MenuHostHelper$$ExternalSyntheticLambda0(obj);
        }
        ViewPager$SavedState$1 viewPager$SavedState$1 = (ViewPager$SavedState$1) this.setNavigationOnClickListener.getParcelable(str);
        if (viewPager$SavedState$1 != null) {
            this.setNavigationOnClickListener.remove(str);
            setchipcornerradius.MenuHostHelper$$ExternalSyntheticLambda0(setz.MenuHostHelper$$ExternalSyntheticLambda1(viewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1, viewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0));
        }
        return new setIconSize<I>() { // from class: o.setCenterIfNoTextEnabled.4
            @Override // o.setIconSize
            public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                setCenterIfNoTextEnabled.this.setY(str);
            }
        };
    }
}