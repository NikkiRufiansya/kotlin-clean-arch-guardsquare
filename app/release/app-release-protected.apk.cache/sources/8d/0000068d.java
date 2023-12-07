package o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260l extends AbstractC0201h {
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private final View.OnClickListener setIconTintList;
    EditText setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setCenterIfNoTextEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int setX() {
        return R.string.res_0x7f1400a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0260l(C0174g c0174g, int i) {
        super(c0174g);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = R.drawable.res_0x7f08007e;
        this.setIconTintList = new View.OnClickListener() { // from class: o.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0260l c0260l = C0260l.this;
                EditText editText = c0260l.setX;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = c0260l.setX;
                    if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c0260l.setX.setTransformationMethod(null);
                    } else {
                        c0260l.setX.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        c0260l.setX.setSelection(selectionEnd);
                    }
                    c0260l.setUiOptions.setX(false);
                }
            }
        };
        if (i != 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUnboundedRipple() {
        EditText editText = this.setX;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.setX.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUiOptions() {
        EditText editText = this.setX;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnClickListener setNavigationOnClickListener() {
        return this.setIconTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setIconTintList(EditText editText) {
        this.setX = editText;
        setOnNavigationItemSelectedListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setTextScaleX() {
        setOnNavigationItemSelectedListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setTextAlignment() {
        EditText editText = this.setX;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }
}