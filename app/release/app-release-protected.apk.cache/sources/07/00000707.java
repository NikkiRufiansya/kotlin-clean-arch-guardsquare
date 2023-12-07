package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class mR extends mH<ImageView> {
    private mG setChipCornerRadius;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mR(mU mUVar, ImageView imageView, mY mYVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, mG mGVar, boolean z) {
        super(mUVar, imageView, mYVar, i, i2, i3, drawable, str, obj, z);
        this.setChipCornerRadius = mGVar;
    }

    @Override // o.mH
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Bitmap bitmap, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.setIconSize.get();
        if (imageView == null) {
            return;
        }
        C0313na.setIconTintList(imageView, this.setUnboundedRipple.setIconTintList, bitmap, mu_menuhosthelper__externalsyntheticlambda1, this.setLayoutAnimation, this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // o.mH
    public final void setY() {
        ImageView imageView = (ImageView) this.setIconSize.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        if (this.setIconTintList != 0) {
            imageView.setImageResource(this.setIconTintList);
        } else if (this.setX != null) {
            imageView.setImageDrawable(this.setX);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.mH
    public final void setIconTintList() {
        super.setIconTintList();
        if (this.setChipCornerRadius != null) {
            this.setChipCornerRadius = null;
        }
    }
}