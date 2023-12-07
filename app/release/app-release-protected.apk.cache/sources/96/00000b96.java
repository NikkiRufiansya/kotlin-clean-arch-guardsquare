package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
class setExpandedFormat$MenuHostHelper$$ExternalSyntheticLambda1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ParcelFileDescriptor setY(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}