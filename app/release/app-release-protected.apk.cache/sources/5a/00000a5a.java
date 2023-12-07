package o;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class setCloseIconStartPadding extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> MenuHostHelper$$ExternalSyntheticLambda1 = new setCloseIconStartPadding("childrenAlpha");

    @Override // android.util.Property
    public final /* synthetic */ Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.res_0x7f0a013d);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(R.id.res_0x7f0a013d, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }

    private setCloseIconStartPadding(String str) {
        super(Float.class, str);
    }
}