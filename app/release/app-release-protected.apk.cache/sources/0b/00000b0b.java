package o;

/* loaded from: classes.dex */
public final class setDropDownAnchor implements setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 {
    private final setCheckedSlideWidth<?>[] setX;

    @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
    public final /* synthetic */ setTitleMarginTop setIconTintList(Class cls) {
        return setSubtitleTextColor.setX(cls);
    }

    public setDropDownAnchor(setCheckedSlideWidth<?>... setcheckedslidewidthArr) {
        pN.setY(setcheckedslidewidthArr, "");
        this.setX = setcheckedslidewidthArr;
    }

    @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
    public final <T extends setTitleMarginTop> T setIconTintList(Class<T> cls, setPlaceholderTextColor setplaceholdertextcolor) {
        setCheckedSlideWidth<?>[] setcheckedslidewidthArr;
        pN.setY(cls, "");
        pN.setY(setplaceholdertextcolor, "");
        T t = null;
        for (setCheckedSlideWidth<?> setcheckedslidewidth : this.setX) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(setcheckedslidewidth.setIconTintList, cls)) {
                Object x = setcheckedslidewidth.MenuHostHelper$$ExternalSyntheticLambda0.setX(setplaceholdertextcolor);
                t = x instanceof setTitleMarginTop ? (T) x : null;
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("No initializer set for given class ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}