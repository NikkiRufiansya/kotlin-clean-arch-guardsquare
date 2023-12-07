package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

/* renamed from: o.ln  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274ln {
    public final setScrimVisibleHeightTrigger MenuHostHelper$$ExternalSyntheticLambda1;
    public final CheckBox setX;

    private C0274ln(setScrimVisibleHeightTrigger setscrimvisibleheighttrigger, CheckBox checkBox) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setscrimvisibleheighttrigger;
        this.setX = checkBox;
    }

    public static C0274ln setX(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.res_0x7f0d003f, viewGroup, false);
        CheckBox checkBox = (CheckBox) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a007a);
        if (checkBox != null) {
            return new C0274ln((setScrimVisibleHeightTrigger) inflate, checkBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.res_0x7f0a007a)));
    }
}