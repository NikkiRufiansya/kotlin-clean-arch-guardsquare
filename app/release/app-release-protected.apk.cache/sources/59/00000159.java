package o;

import java.util.Locale;
import o.setContentPadding;

/* loaded from: classes.dex */
public final class BaseTransientBottomBar$Behavior {
    public static final setBackgroundTint setIconTintList = new setIconTintList(null, false) { // from class: o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda1
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    };
    public static final setBackgroundTint setUiOptions = new setIconTintList(null, true) { // from class: o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda1
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    };
    public static final setBackgroundTint MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList(setY.MenuHostHelper$$ExternalSyntheticLambda0, false) { // from class: o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda1
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    };
    public static final setBackgroundTint setY = new setIconTintList(setY.MenuHostHelper$$ExternalSyntheticLambda0, true) { // from class: o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda1
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    };
    public static final setBackgroundTint MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList(setX.setIconTintList, false) { // from class: o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda1
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    };
    public static final setBackgroundTint setX = setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0;

    static int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    static int setIconTintList(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setIconTintList implements setBackgroundTint {
        private final BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;

        protected abstract boolean MenuHostHelper$$ExternalSyntheticLambda1();

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0 baseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = baseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // o.setBackgroundTint
        public boolean MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                return MenuHostHelper$$ExternalSyntheticLambda1();
            }
            return setY(charSequence, i, i2);
        }

        private boolean setY(CharSequence charSequence, int i, int i2) {
            int y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(charSequence, i, i2);
            if (y != 0) {
                if (y != 1) {
                    return MenuHostHelper$$ExternalSyntheticLambda1();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class setY implements BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0 {
        static final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY();

        @Override // o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0
        public int setY(CharSequence charSequence, int i, int i2) {
            int i3 = 2;
            for (int i4 = i; i4 < i2 + i && i3 == 2; i4++) {
                i3 = BaseTransientBottomBar$Behavior.MenuHostHelper$$ExternalSyntheticLambda0(Character.getDirectionality(charSequence.charAt(i4)));
            }
            return i3;
        }

        private setY() {
        }
    }

    /* loaded from: classes.dex */
    static class setX implements BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0 {
        static final setX setIconTintList = new setX(true);
        private final boolean setY;

        @Override // o.BaseTransientBottomBar$Behavior$MenuHostHelper$$ExternalSyntheticLambda0
        public int setY(CharSequence charSequence, int i, int i2) {
            boolean z = false;
            for (int i3 = i; i3 < i2 + i; i3++) {
                int iconTintList = BaseTransientBottomBar$Behavior.setIconTintList(Character.getDirectionality(charSequence.charAt(i3)));
                if (iconTintList != 0) {
                    if (iconTintList != 1) {
                        continue;
                    } else if (!this.setY) {
                        return 1;
                    }
                } else if (this.setY) {
                    return 0;
                }
                z = true;
            }
            if (z) {
                return this.setY ? 1 : 0;
            }
            return 2;
        }

        private setX(boolean z) {
            this.setY = z;
        }
    }

    /* loaded from: classes.dex */
    static class setNavigationOnClickListener extends setIconTintList {
        static final setNavigationOnClickListener MenuHostHelper$$ExternalSyntheticLambda0 = new setNavigationOnClickListener();

        setNavigationOnClickListener() {
            super(null);
        }

        @Override // o.BaseTransientBottomBar$Behavior.setIconTintList
        protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            int iconTintList;
            iconTintList = setContentPadding.setX.setIconTintList(Locale.getDefault());
            return iconTintList == 1;
        }
    }
}