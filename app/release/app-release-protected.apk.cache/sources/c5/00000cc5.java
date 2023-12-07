package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class setInsetBottom {
    private TextView MenuHostHelper$$ExternalSyntheticLambda1;
    private TextClassifier setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setInsetBottom(TextView textView) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = textView;
    }

    public final void setY(TextClassifier textClassifier) {
        this.setY = textClassifier;
    }

    public final TextClassifier setY() {
        TextClassifier textClassifier = this.setY;
        return textClassifier == null ? setY.setY(this.MenuHostHelper$$ExternalSyntheticLambda1) : textClassifier;
    }

    /* loaded from: classes.dex */
    static final class setY {
        static TextClassifier setY(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }
}