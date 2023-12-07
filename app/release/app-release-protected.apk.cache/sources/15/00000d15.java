package o;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class setLayoutMode {
    protected int setX;
    HashMap<String, setActiveIndicatorDrawable> setY;
    int setIconTintList = -1;
    int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
    String MenuHostHelper$$ExternalSyntheticLambda0 = null;

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(HashMap<String, FirebasePerfKtxRegistrar> hashMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(HashSet<String> hashSet);

    @Override // 
    /* renamed from: setIconTintList */
    public abstract setLayoutMode clone();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setIconTintList(Context context, AttributeSet attributeSet);

    public void setY(HashMap<String, Integer> hashMap) {
    }

    public setLayoutMode setX(setLayoutMode setlayoutmode) {
        this.setIconTintList = setlayoutmode.setIconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setlayoutmode.MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setlayoutmode.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setX = setlayoutmode.setX;
        this.setY = setlayoutmode.setY;
        return this;
    }
}