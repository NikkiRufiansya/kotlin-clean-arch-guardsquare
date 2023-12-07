package o;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class setChipIconTintResource extends setAlignmentMode {
    @Override // o.setAlignmentMode
    public Dialog setIconTintList(Bundle bundle) {
        return new setHasDecor(setCheckedIconEnabled(), setUiOptions());
    }

    @Override // o.setAlignmentMode
    public void setIconTintList(Dialog dialog, int i) {
        if (dialog instanceof setHasDecor) {
            setHasDecor sethasdecor = (setHasDecor) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            sethasdecor.MenuHostHelper$$ExternalSyntheticLambda0(1);
            return;
        }
        super.setIconTintList(dialog, i);
    }
}