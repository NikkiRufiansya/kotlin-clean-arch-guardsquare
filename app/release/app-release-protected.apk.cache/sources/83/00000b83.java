package o;

import android.content.ClipData;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.ContentInfo;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final /* synthetic */ class setErrorIconDrawable {
    public static /* synthetic */ PrecomputedText.Params.Builder MenuHostHelper$$ExternalSyntheticLambda0(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PointerIcon MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        return obj instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ ContentInfo setIconTintList(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ContentInfo.Builder setX(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText setY(Object obj) {
        return (PrecomputedText) obj;
    }
}