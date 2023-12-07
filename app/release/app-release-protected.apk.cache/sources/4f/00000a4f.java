package o;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class setCloseIconEnabledResource {
    public static boolean setIconTintList(AccessibilityManager accessibilityManager, setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1) {
        return setY.setX(accessibilityManager, setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX implements AccessibilityManager.TouchExplorationStateChangeListener {
        final setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;

        setX(setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1;
        }

        public final int hashCode() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof setX) {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.equals(((setX) obj).MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean setY(AccessibilityManager accessibilityManager, setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new setX(setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1));
        }

        static boolean setX(AccessibilityManager accessibilityManager, setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new setX(setcloseiconenabledresource_menuhosthelper__externalsyntheticlambda1));
        }
    }
}