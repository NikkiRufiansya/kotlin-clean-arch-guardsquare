package o;

import java.util.HashSet;
import o.ComponentActivity$4;
import o.registerIn;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class ComponentActivity$4 {

    /* loaded from: classes.dex */
    public static final class setY implements setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0 {
        setY() {
        }

        @Override // o.setCompoundDrawablePadding$MenuHostHelper$$ExternalSyntheticLambda0
        public final void MenuHostHelper$$ExternalSyntheticLambda1(setFillViewport setfillviewport) {
            if (!(setfillviewport instanceof setPictureListener)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            setTabRippleColorResource unboundedRipple = ((setPictureListener) setfillviewport).setUnboundedRipple();
            final setCompoundDrawablePadding navigationOnClickListener = setfillviewport.setNavigationOnClickListener();
            for (String str : new HashSet(unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1.keySet())) {
                setTitleMarginTop MenuHostHelper$$ExternalSyntheticLambda0 = unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(str);
                final registerIn MenuHostHelper$$ExternalSyntheticLambda1 = setfillviewport.MenuHostHelper$$ExternalSyntheticLambda1();
                androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("androidx.lifecycle.savedstate.vm.tag");
                if (savedStateHandleController != null && !savedStateHandleController.MenuHostHelper$$ExternalSyntheticLambda0) {
                    if (savedStateHandleController.MenuHostHelper$$ExternalSyntheticLambda0) {
                        throw new IllegalStateException("Already attached to lifecycleOwner");
                    }
                    savedStateHandleController.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                    MenuHostHelper$$ExternalSyntheticLambda1.setY(savedStateHandleController);
                    navigationOnClickListener.setIconTintList(savedStateHandleController.MenuHostHelper$$ExternalSyntheticLambda1, savedStateHandleController.setY.setIconTintList);
                    registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda02 != registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED) {
                        if (!(MenuHostHelper$$ExternalSyntheticLambda02.compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED) >= 0)) {
                            MenuHostHelper$$ExternalSyntheticLambda1.setY(new setCheckable() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                                @Override // o.setCheckable
                                public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                                    if (setx == registerIn.setX.ON_START) {
                                        registerIn.this.MenuHostHelper$$ExternalSyntheticLambda1(this);
                                        navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(ComponentActivity$4.setY.class);
                                    }
                                }
                            });
                        }
                    }
                    navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(setY.class);
                }
            }
            if (new HashSet(unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1.keySet()).isEmpty()) {
                return;
            }
            navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(setY.class);
        }
    }
}