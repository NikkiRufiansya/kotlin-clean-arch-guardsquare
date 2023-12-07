package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import o.setChipIconEnabled;

/* loaded from: classes.dex */
public abstract class setMaxEms {

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        public abstract View MenuHostHelper$$ExternalSyntheticLambda0();

        public abstract CharSequence setIconTintList();

        public abstract Drawable setX();

        public abstract CharSequence setY();
    }

    /* loaded from: classes.dex */
    public interface setX {
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0();

    public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return false;
    }

    public Context setIconTintList() {
        return null;
    }

    public void setIconTintList(CharSequence charSequence) {
    }

    public boolean setLayoutAnimation() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNavigationOnClickListener() {
    }

    public boolean setUnboundedRipple() {
        return false;
    }

    public setChipIconEnabled setX(setChipIconEnabled.setY sety) {
        return null;
    }

    public void setX(boolean z) {
    }

    public boolean setX() {
        return false;
    }

    public boolean setX(KeyEvent keyEvent) {
        return false;
    }

    public abstract int setY();

    public void setY(Configuration configuration) {
    }

    public void setY(boolean z) {
    }

    public boolean setY(int i, KeyEvent keyEvent) {
        return false;
    }

    public void setOnLongClickListener() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void setX(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}