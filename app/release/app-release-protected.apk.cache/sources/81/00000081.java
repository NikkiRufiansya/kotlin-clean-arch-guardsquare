package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import o.pN;
import o.registerIn;
import o.setCheckable;
import o.setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0;
import o.setFillViewport;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class Recreator implements setCheckable {
    private final setFillViewport setIconTintList;

    static {
        new setY((byte) 0);
    }

    public Recreator(setFillViewport setfillviewport) {
        pN.setY(setfillviewport, "");
        this.setIconTintList = setfillviewport;
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        pN.setY(settouchdelegate, "");
        pN.setY(setx, "");
        if (setx != registerIn.setX.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        Bundle MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda0("androidx.savedstate.Restarter");
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return;
        }
        ArrayList<String> stringArrayList = MenuHostHelper$$ExternalSyntheticLambda0.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0.class);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asSubclass, "");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0(newInstance, "");
                        ((setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0) newInstance).MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("Failed to instantiate ");
                        sb.append(str);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sb2 = new StringBuilder("Class ");
                    sb2.append(asSubclass.getSimpleName());
                    sb2.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sb2.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                StringBuilder sb3 = new StringBuilder("Class ");
                sb3.append(str);
                sb3.append(" wasn't found");
                throw new RuntimeException(sb3.toString(), e3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }
}