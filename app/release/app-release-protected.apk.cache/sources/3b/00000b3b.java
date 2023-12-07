package o;

import android.graphics.Typeface;
import android.os.Handler;
import o.SingleGeneratedAdapterObserver;
import o.setChipCornerRadiusResource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setEmptyVisibility {
    private final Handler MenuHostHelper$$ExternalSyntheticLambda1;
    private final SingleGeneratedAdapterObserver.setY setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEmptyVisibility(SingleGeneratedAdapterObserver.setY sety, Handler handler) {
        this.setY = sety;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(setChipCornerRadiusResource.setX setx) {
        if (setx.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            final Typeface typeface = setx.setY;
            final SingleGeneratedAdapterObserver.setY sety = this.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda1.post(new Runnable() { // from class: o.setEmptyVisibility.2
                @Override // java.lang.Runnable
                public final void run() {
                    sety.setX(typeface);
                }
            });
            return;
        }
        final int i = setx.MenuHostHelper$$ExternalSyntheticLambda0;
        final SingleGeneratedAdapterObserver.setY sety2 = this.setY;
        this.MenuHostHelper$$ExternalSyntheticLambda1.post(new Runnable() { // from class: o.setEmptyVisibility.5
            @Override // java.lang.Runnable
            public final void run() {
                sety2.setX(i);
            }
        });
    }
}