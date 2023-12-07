package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface getTrimPathOffset extends Animatable {

    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        Animatable2.AnimationCallback setIconTintList;

        public void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Animatable2.AnimationCallback setX() {
            if (this.setIconTintList == null) {
                this.setIconTintList = new Animatable2.AnimationCallback() { // from class: o.getTrimPathOffset.setIconTintList.3
                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(Drawable drawable) {
                        setIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda0(drawable);
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(Drawable drawable) {
                        setIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
                    }
                };
            }
            return this.setIconTintList;
        }
    }
}