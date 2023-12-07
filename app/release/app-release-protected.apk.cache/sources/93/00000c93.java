package o;

import android.content.Context;
import o.setImageResource;

/* loaded from: classes.dex */
public class setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1 {
    private Context MenuHostHelper$$ExternalSyntheticLambda0;
    public String MenuHostHelper$$ExternalSyntheticLambda1;
    public setImageResource.setY setIconTintList;
    private boolean setY;

    public final setImageResource.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1() {
        setImageResource.setY sety = this.setIconTintList;
        if (sety == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return new setImageResource.setIconTintList(context, this.MenuHostHelper$$ExternalSyntheticLambda1, sety, this.setY);
    }

    public setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
    }
}