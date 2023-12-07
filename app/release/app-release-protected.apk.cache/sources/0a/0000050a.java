package o;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class getTappableElementInsets extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> MenuHostHelper$$ExternalSyntheticLambda0 = new getTappableElementInsets();
    private final WeakHashMap<Drawable, Integer> MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }

    private getTappableElementInsets() {
        super(Integer.class, "drawableAlphaCompat");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new WeakHashMap<>();
    }
}