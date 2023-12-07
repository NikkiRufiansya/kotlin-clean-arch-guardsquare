package o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
final class setCheckedIconMargin implements TransformationMethod {
    final TransformationMethod setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCheckedIconMargin(TransformationMethod transformationMethod) {
        this.setY = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.setY;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1() != 1) ? charSequence : setScrollContainer.setIconTintList().setIconTintList(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.setY;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}