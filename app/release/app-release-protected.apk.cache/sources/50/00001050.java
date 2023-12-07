package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import o.setStrokeAlpha;

/* loaded from: classes.dex */
public final class setTextIsSelectable {

    /* loaded from: classes.dex */
    public interface setX {
        boolean setIconTintList(setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, int i, Bundle bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean setY(String str, Bundle bundle, setX setx) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                r0 = setx.setIconTintList(new setVerticalScrollbarTrackDrawable(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r0, null);
            }
            return r0;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    @Deprecated
    public static InputConnection setY(InputConnection inputConnection, EditorInfo editorInfo, final setX setx) {
        setAllowStacking.setIconTintList(inputConnection, "inputConnection must be non-null");
        setAllowStacking.setIconTintList(editorInfo, "editorInfo must be non-null");
        setAllowStacking.setIconTintList(setx, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, false) { // from class: o.setTextIsSelectable.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                    if (setx.setIconTintList(setVerticalScrollbarTrackDrawable.MenuHostHelper$$ExternalSyntheticLambda0(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i, bundle);
                }
            };
        }
        return setOverflowReserved.MenuHostHelper$$ExternalSyntheticLambda1(editorInfo).length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection, false) { // from class: o.setTextIsSelectable.5
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                if (setTextIsSelectable.setY(str, bundle, setx)) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            }
        };
    }

    public static InputConnection setY(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return setY(inputConnection, editorInfo, setY(view));
    }

    private static setX setY(final View view) {
        return new setX() { // from class: o.setSupportButtonTintMode
            @Override // o.setTextIsSelectable.setX
            public final boolean setIconTintList(setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, int i, Bundle bundle) {
                return setTextIsSelectable.setY(view, setverticalscrollbartrackdrawable, i, bundle);
            }
        };
    }

    public static /* synthetic */ boolean setY(View view, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                setverticalscrollbartrackdrawable.setX();
                InputContentInfo iconTintList = setCradleVerticalOffset.setIconTintList(setverticalscrollbartrackdrawable.setY());
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", iconTintList);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(view, new setStrokeAlpha.setY(new ClipData(setverticalscrollbartrackdrawable.MenuHostHelper$$ExternalSyntheticLambda1(), new ClipData.Item(setverticalscrollbartrackdrawable.setIconTintList())), 2).MenuHostHelper$$ExternalSyntheticLambda1(setverticalscrollbartrackdrawable.MenuHostHelper$$ExternalSyntheticLambda0()).MenuHostHelper$$ExternalSyntheticLambda1(bundle).setX()) == null;
    }
}