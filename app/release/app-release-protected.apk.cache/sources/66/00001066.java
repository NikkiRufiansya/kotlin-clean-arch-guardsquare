package o;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class setTextStartPadding implements getRootAlpha {
    public final setUseCompatPadding MenuHostHelper$$ExternalSyntheticLambda0;
    public final Path.FillType MenuHostHelper$$ExternalSyntheticLambda1;
    public final String setIconTintList;
    private final boolean setOnLongClickListener;
    public final setFirstDayOfWeek setX;
    public final boolean setY;

    public setTextStartPadding(String str, boolean z, Path.FillType fillType, setUseCompatPadding setusecompatpadding, setFirstDayOfWeek setfirstdayofweek, boolean z2) {
        this.setIconTintList = str;
        this.setOnLongClickListener = z;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = fillType;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setusecompatpadding;
        this.setX = setfirstdayofweek;
        this.setY = z2;
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        return new setFontAssetDelegate(setpointericon, setendiconcheckable, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.setOnLongClickListener);
        sb.append('}');
        return sb.toString();
    }
}