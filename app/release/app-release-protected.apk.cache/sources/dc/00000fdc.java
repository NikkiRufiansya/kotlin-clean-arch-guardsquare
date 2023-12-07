package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import o.setStrokeAlpha;

/* loaded from: classes.dex */
final class setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda1 implements setStrokeAlpha.setIconTintList {
    Bundle MenuHostHelper$$ExternalSyntheticLambda0;
    ClipData MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setX;
    Uri setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStrokeAlpha$MenuHostHelper$$ExternalSyntheticLambda1(ClipData clipData, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = clipData;
        this.setX = i;
    }

    @Override // o.setStrokeAlpha.setIconTintList
    public final void setIconTintList(int i) {
        this.setIconTintList = i;
    }

    @Override // o.setStrokeAlpha.setIconTintList
    public final void setY(Uri uri) {
        this.setY = uri;
    }

    @Override // o.setStrokeAlpha.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = bundle;
    }

    @Override // o.setStrokeAlpha.setIconTintList
    public final setStrokeAlpha setIconTintList() {
        return new setStrokeAlpha(new setStrokeAlpha.setLayoutAnimation(this));
    }
}