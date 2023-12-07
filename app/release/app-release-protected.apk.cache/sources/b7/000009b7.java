package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class setBreakStrategy {
    public final AssetManager MenuHostHelper$$ExternalSyntheticLambda0;
    public setInputMethodMode MenuHostHelper$$ExternalSyntheticLambda1;
    public final inset<String> setUnboundedRipple = new inset<>();
    public final Map<inset<String>, Typeface> setIconTintList = new HashMap();
    public final Map<String, Typeface> setX = new HashMap();
    public String setY = ".ttf";

    public setBreakStrategy(Drawable.Callback callback, setInputMethodMode setinputmethodmode) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setinputmethodmode;
        if (!(callback instanceof View)) {
            setDrawingCacheEnabled.setIconTintList("LottieDrawable must be inside of a view for images to work.");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = ((View) callback).getContext().getAssets();
    }
}