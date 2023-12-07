package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class setOnQueryTextListener extends Drawable implements FragmentManager$LaunchedFragmentInfo$1, setButtonDrawable {
    private setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList;

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setOnQueryTextListener(setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0 setonquerytextlistener_menuhosthelper__externalsyntheticlambda0, byte b) {
        this(setonquerytextlistener_menuhosthelper__externalsyntheticlambda0);
    }

    public setOnQueryTextListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this(new setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0(new setWebViewClient(setscrollbardefaultdelaybeforefade)));
    }

    private setOnQueryTextListener(setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0 setonquerytextlistener_menuhosthelper__externalsyntheticlambda0) {
        this.setIconTintList = setonquerytextlistener_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setTintList(colorStateList);
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public final void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setState(iArr)) {
            onStateChange = true;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = setChipText.MenuHostHelper$$ExternalSyntheticLambda0(iArr);
        if (this.setIconTintList.setX != MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setIconTintList.setX = MenuHostHelper$$ExternalSyntheticLambda0;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.setIconTintList.setX) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.setIconTintList;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final /* synthetic */ Drawable mutate() {
        this.setIconTintList = new setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList);
        return this;
    }
}