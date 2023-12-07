package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class setReferencedIds {
    WeakReference<setY> MenuHostHelper$$ExternalSyntheticLambda0;
    public setHeight setIconTintList;
    public float setX;
    public final TextPaint setY = new TextPaint(1);
    public final setNumStars MenuHostHelper$$ExternalSyntheticLambda1 = new setNumStars() { // from class: o.setReferencedIds.1
        @Override // o.setNumStars
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            setReferencedIds.this.setOnLongClickListener = true;
            setY sety = setReferencedIds.this.MenuHostHelper$$ExternalSyntheticLambda0.get();
            if (sety != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }

        @Override // o.setNumStars
        public final void setX(int i) {
            setReferencedIds.this.setOnLongClickListener = true;
            setY sety = setReferencedIds.this.MenuHostHelper$$ExternalSyntheticLambda0.get();
            if (sety != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    };
    public boolean setOnLongClickListener = true;

    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda1();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public setReferencedIds(setY sety) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new WeakReference<>(null);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new WeakReference<>(sety);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setHeight setheight, Context context) {
        if (this.setIconTintList != setheight) {
            this.setIconTintList = setheight;
            if (setheight != null) {
                TextPaint textPaint = this.setY;
                setNumStars setnumstars = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int i = setheight.setY;
                if ((i != 0 ? setTextStartPaddingResource.setX(context, i) : null) != null) {
                    setheight.setX(context, textPaint, setheight.setIconTintList(context));
                } else {
                    setheight.setY(context, textPaint, setnumstars);
                }
                setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0.get();
                if (sety != null) {
                    this.setY.drawableState = sety.getState();
                }
                setheight.setX(context, this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.setOnLongClickListener = true;
            }
            setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get();
            if (sety2 != null) {
                sety2.MenuHostHelper$$ExternalSyntheticLambda1();
                sety2.onStateChange(sety2.getState());
            }
        }
    }
}