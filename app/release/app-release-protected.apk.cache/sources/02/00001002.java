package o;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class setSuggestionsAdapter implements setScaleY<Integer> {
    public static final setSuggestionsAdapter setX = new setSuggestionsAdapter();

    private setSuggestionsAdapter() {
    }

    @Override // o.setScaleY
    public final /* synthetic */ Integer setX(setMeasureAllChildren setmeasureallchildren, float f) {
        boolean z = setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY;
        if (z) {
            setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        double navigationOnClickListener = setmeasureallchildren.setNavigationOnClickListener();
        double navigationOnClickListener2 = setmeasureallchildren.setNavigationOnClickListener();
        double navigationOnClickListener3 = setmeasureallchildren.setNavigationOnClickListener();
        double navigationOnClickListener4 = setmeasureallchildren.setNavigationOnClickListener();
        if (z) {
            setmeasureallchildren.setY();
        }
        if (navigationOnClickListener <= 1.0d && navigationOnClickListener2 <= 1.0d && navigationOnClickListener3 <= 1.0d) {
            navigationOnClickListener *= 255.0d;
            navigationOnClickListener2 *= 255.0d;
            navigationOnClickListener3 *= 255.0d;
            if (navigationOnClickListener4 <= 1.0d) {
                navigationOnClickListener4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) navigationOnClickListener4, (int) navigationOnClickListener, (int) navigationOnClickListener2, (int) navigationOnClickListener3));
    }
}