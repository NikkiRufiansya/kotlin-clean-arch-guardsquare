package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setActiveIndicatorMarginHorizontal implements setTranslateY {
    private static final setChipDrawable setIconTintList = new setChipDrawable() { // from class: o.setActiveIndicatorMarginHorizontal.2
        @Override // o.setChipDrawable
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
            return false;
        }

        @Override // o.setChipDrawable
        public final setFillColor setX(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final setChipDrawable setX;

    private setActiveIndicatorMarginHorizontal(setChipDrawable setchipdrawable) {
        this.setX = (setChipDrawable) setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(setchipdrawable, "messageInfoFactory");
    }

    @Override // o.setTranslateY
    public final <T> setValues<T> MenuHostHelper$$ExternalSyntheticLambda1(Class<T> cls) {
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1;
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$12;
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$13;
        setRotationX.setIconTintList((Class<?>) cls);
        setFillColor x = this.setX.setX(cls);
        if (x.setY()) {
            if (setStartIconContentDescription.class.isAssignableFrom(cls)) {
                legacySavedStateHandleController$13 = setRotationX.setIconTintList;
                return new setCounterOverflowTextAppearance(legacySavedStateHandleController$13, setChipSpacingResource.setY(), x.MenuHostHelper$$ExternalSyntheticLambda0());
            }
            return new setCounterOverflowTextAppearance(setRotationX.setY(), setChipSpacingResource.MenuHostHelper$$ExternalSyntheticLambda1(), x.MenuHostHelper$$ExternalSyntheticLambda0());
        }
        if (setStartIconContentDescription.class.isAssignableFrom(cls)) {
            if (x.setX() == setEms.PROTO2) {
                getInsetsForType iconTintList = setMinDate.setIconTintList();
                setStatusBarScrim y = setStatusBarScrim.setY();
                legacySavedStateHandleController$12 = setRotationX.setIconTintList;
                return setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(x, iconTintList, y, legacySavedStateHandleController$12, setChipSpacingResource.setY(), setDefaultFocusHighlightEnabled.setX());
            }
            getInsetsForType iconTintList2 = setMinDate.setIconTintList();
            setStatusBarScrim y2 = setStatusBarScrim.setY();
            legacySavedStateHandleController$1 = setRotationX.setIconTintList;
            return setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(x, iconTintList2, y2, legacySavedStateHandleController$1, null, setDefaultFocusHighlightEnabled.setX());
        }
        if (x.setX() == setEms.PROTO2) {
            return setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(x, setMinDate.setX(), setStatusBarScrim.setIconTintList(), setRotationX.setY(), setChipSpacingResource.MenuHostHelper$$ExternalSyntheticLambda1(), setDefaultFocusHighlightEnabled.setY());
        }
        return setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(x, setMinDate.setX(), setStatusBarScrim.setIconTintList(), setRotationX.setIconTintList(), null, setDefaultFocusHighlightEnabled.setY());
    }

    /* loaded from: classes.dex */
    static class setY implements setChipDrawable {
        private setChipDrawable[] setIconTintList;

        setY(setChipDrawable... setchipdrawableArr) {
            this.setIconTintList = setchipdrawableArr;
        }

        @Override // o.setChipDrawable
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
            for (setChipDrawable setchipdrawable : this.setIconTintList) {
                if (setchipdrawable.MenuHostHelper$$ExternalSyntheticLambda1(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.setChipDrawable
        public final setFillColor setX(Class<?> cls) {
            setChipDrawable[] setchipdrawableArr;
            for (setChipDrawable setchipdrawable : this.setIconTintList) {
                if (setchipdrawable.MenuHostHelper$$ExternalSyntheticLambda1(cls)) {
                    return setchipdrawable.setX(cls);
                }
            }
            StringBuilder sb = new StringBuilder("No factory is available for message type: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    private static setChipDrawable MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return (setChipDrawable) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return setIconTintList;
        }
    }

    public setActiveIndicatorMarginHorizontal() {
        this(new setY(setClipChildren.setX(), MenuHostHelper$$ExternalSyntheticLambda0()));
    }
}