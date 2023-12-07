package o;

import android.os.Bundle;
import androidx.savedstate.Recreator$MenuHostHelper$$ExternalSyntheticLambda1;
import java.util.Map;
import o.pN;
import o.registerIn;
import o.setCompoundDrawablePadding;
import o.setCounterEnabled;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class setCompoundDrawablePadding {
    private Recreator$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private Bundle setLayoutAnimation;
    private boolean setX;
    public final setCounterEnabled<String, setX> MenuHostHelper$$ExternalSyntheticLambda0 = new setCounterEnabled<>();
    public boolean setY = true;

    /* loaded from: classes.dex */
    public interface setX {
        Bundle MenuHostHelper$$ExternalSyntheticLambda1();
    }

    static {
        new setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    }

    public final Bundle MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        pN.setY(str, "");
        if (!this.setIconTintList) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.setLayoutAnimation;
        if (bundle != null) {
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.setLayoutAnimation;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.setLayoutAnimation;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.setLayoutAnimation = null;
            }
            return bundle2;
        }
        return null;
    }

    public final void setIconTintList(String str, setX setx) {
        pN.setY(str, "");
        pN.setY(setx, "");
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda0.setX(str, setx) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Class<? extends setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0> cls) {
        pN.setY(cls, "");
        if (!this.setY) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator$MenuHostHelper$$ExternalSyntheticLambda1 recreator$MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (recreator$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            recreator$MenuHostHelper$$ExternalSyntheticLambda1 = new Recreator$MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = recreator$MenuHostHelper$$ExternalSyntheticLambda1;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator$MenuHostHelper$$ExternalSyntheticLambda1 recreator$MenuHostHelper$$ExternalSyntheticLambda12 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (recreator$MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                String name = cls.getName();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, "");
                pN.setY(name, "");
                recreator$MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList.add(name);
            }
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(cls.getSimpleName());
            sb.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(registerIn registerin) {
        pN.setY(registerin, "");
        if (!(!this.setX)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        registerin.setY(new setCheckable() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            @Override // o.setCheckable
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                setCompoundDrawablePadding setcompounddrawablepadding = setCompoundDrawablePadding.this;
                pN.setY(setcompounddrawablepadding, "");
                pN.setY(settouchdelegate, "");
                pN.setY(setx, "");
                if (setx == registerIn.setX.ON_START) {
                    setcompounddrawablepadding.setY = true;
                } else if (setx == registerIn.setX.ON_STOP) {
                    setcompounddrawablepadding.setY = false;
                }
            }
        });
        this.setX = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Bundle bundle) {
        if (!this.setX) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.setLayoutAnimation = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.setIconTintList = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        pN.setY(bundle, "");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.setLayoutAnimation;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        setCounterEnabled<String, setX> setcounterenabled = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setCounterEnabled.setY sety = new setCounterEnabled.setY();
        setcounterenabled.setX.put(sety, Boolean.FALSE);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sety, "");
        setCounterEnabled.setY sety2 = sety;
        while (sety2.hasNext()) {
            Map.Entry next = sety2.next();
            bundle2.putBundle((String) next.getKey(), ((setX) next.getValue()).MenuHostHelper$$ExternalSyntheticLambda1());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}