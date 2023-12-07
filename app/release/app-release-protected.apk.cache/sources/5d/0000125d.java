package o;

import android.text.Editable;
import android.text.TextUtils;

/* loaded from: classes.dex */
class w$MenuHostHelper$$ExternalSyntheticLambda0 extends setOnShow {
    private /* synthetic */ C0559w setX;

    private w$MenuHostHelper$$ExternalSyntheticLambda0(C0559w c0559w) {
        this.setX = c0559w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ w$MenuHostHelper$$ExternalSyntheticLambda0(C0559w c0559w, byte b) {
        this(c0559w);
    }

    @Override // o.setOnShow, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            this.setX.setX.setText(D.setX(this.setX.getResources(), "00", "%02d"));
        } else {
            this.setX.setX.setText(D.setX(this.setX.getResources(), editable, "%02d"));
        }
    }
}