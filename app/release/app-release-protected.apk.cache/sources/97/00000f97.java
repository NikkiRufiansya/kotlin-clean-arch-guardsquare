package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
class setSingleLine {
    private final TextView MenuHostHelper$$ExternalSyntheticLambda0;
    private final ActivityResultRegistry$1 MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSingleLine(TextView textView) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = textView;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new ActivityResultRegistry$1(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.MenuHostHelper$$ExternalSyntheticLambda0.getContext().obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setRevealInfo, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(setAnimationFromJson.setY.RemoteActionCompatParcelizer) ? obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.RemoteActionCompatParcelizer, true) : true;
            obtainStyledAttributes.recycle();
            MenuHostHelper$$ExternalSyntheticLambda1(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] setY(InputFilter[] inputFilterArr) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.setY(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.setX(z);
    }
}