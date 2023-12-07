package o;

import android.util.DisplayMetrics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTranslationY extends androidx.recyclerview.widget.LinearLayoutManager {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setTranslationY(int i, boolean z) {
        super(i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
        setActiveIndicatorResizeable setactiveindicatorresizeable = new setActiveIndicatorResizeable(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getContext()) { // from class: o.setTranslationY.5
            @Override // o.setActiveIndicatorResizeable
            public final float setIconTintList(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        setactiveindicatorresizeable.setLayoutAnimation = i;
        MenuHostHelper$$ExternalSyntheticLambda0(setactiveindicatorresizeable);
    }
}