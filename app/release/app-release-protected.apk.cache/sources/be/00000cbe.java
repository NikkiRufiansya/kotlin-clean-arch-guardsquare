package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class setInlineLabel<E> extends getInsets {
    final Handler MenuHostHelper$$ExternalSyntheticLambda0;
    private final Activity MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setIconTintList;
    final ParcelImpl setX;
    final Context setY;

    public abstract E setIconTintList();

    public void setOnLongClickListener() {
    }

    @Override // o.getInsets
    public View setY(int i) {
        return null;
    }

    @Override // o.getInsets
    public boolean setY() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setInlineLabel(setEndIconContentDescription setendiconcontentdescription) {
        this(setendiconcontentdescription, setendiconcontentdescription, new Handler());
    }

    private setInlineLabel(Activity activity, Context context, Handler handler) {
        this.setX = new openContextMenu();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = activity;
        if (context != null) {
            this.setY = context;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = handler;
            this.setIconTintList = 0;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public LayoutInflater setLayoutAnimation() {
        return LayoutInflater.from(this.setY);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setDropDownBackgroundResource setdropdownbackgroundresource, Intent intent, int i, Bundle bundle) {
        this.setY.startActivity(intent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Activity setUiOptions() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context setNavigationOnClickListener() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Handler setChipCornerRadius() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }
}