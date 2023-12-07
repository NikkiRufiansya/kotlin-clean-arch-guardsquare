package o;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
final class linkToDeath extends InputConnectionWrapper {
    private final TextView setIconTintList;
    private final linkToDeath$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public linkToDeath(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new linkToDeath$MenuHostHelper$$ExternalSyntheticLambda0());
    }

    private linkToDeath(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, linkToDeath$MenuHostHelper$$ExternalSyntheticLambda0 linktodeath_menuhosthelper__externalsyntheticlambda0) {
        super(inputConnection, false);
        this.setIconTintList = textView;
        this.setX = linktodeath_menuhosthelper__externalsyntheticlambda0;
        linktodeath_menuhosthelper__externalsyntheticlambda0.setIconTintList(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return this.setX.setX(this, this.setIconTintList.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.setX.setX(this, this.setIconTintList.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}