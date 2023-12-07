package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import o.setStrokeAlpha;

/* loaded from: classes.dex */
final class setFocusableInTouchMode {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || setBaselineAlignBottom.setMaxEms(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(textView, new setStrokeAlpha.setY(primaryClip, 1).setX(i != 16908322 ? 1 : 0).setX());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && setBaselineAlignBottom.setMaxEms(view) != null) {
            Activity MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(view);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                StringBuilder sb = new StringBuilder("Can't handle drop: no activity: view=");
                sb.append(view);
                Log.i("ReceiveContent", sb.toString());
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return setIconTintList.setX(dragEvent, (TextView) view, MenuHostHelper$$ExternalSyntheticLambda0);
                    }
                    return setIconTintList.setY(dragEvent, view, MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        }
        return false;
    }

    /* loaded from: classes.dex */
    static final class setIconTintList {
        static boolean setX(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(textView, new setStrokeAlpha.setY(dragEvent.getClipData(), 3).setX());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean setY(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(view, new setStrokeAlpha.setY(dragEvent.getClipData(), 3).setX());
            return true;
        }
    }

    static Activity MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}