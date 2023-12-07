package o;

/* loaded from: classes.dex */
final class setClipChildren implements setChipDrawable {
    private static final setClipChildren setIconTintList = new setClipChildren();

    private setClipChildren() {
    }

    public static setClipChildren setX() {
        return setIconTintList;
    }

    @Override // o.setChipDrawable
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
        return setStartIconContentDescription.class.isAssignableFrom(cls);
    }

    @Override // o.setChipDrawable
    public final setFillColor setX(Class<?> cls) {
        if (!setStartIconContentDescription.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            return (setFillColor) setStartIconContentDescription.setIconTintList((Class<setStartIconContentDescription>) cls.asSubclass(setStartIconContentDescription.class)).setLayoutAnimation();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}