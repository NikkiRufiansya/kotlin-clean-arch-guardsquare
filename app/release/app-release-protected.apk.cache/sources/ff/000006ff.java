package o;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* loaded from: classes.dex */
final class mM extends AbstractC0315nc {
    private static final UriMatcher setX;
    private final Context MenuHostHelper$$ExternalSyntheticLambda0;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        setX = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mM(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
    }

    @Override // o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        Uri uri = mYVar.setZ;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && setX.match(mYVar.setZ) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // o.AbstractC0315nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(o.mY r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.setZ
            android.content.UriMatcher r0 = o.mM.setX
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L35
            r3 = 2
            if (r0 == r3) goto L30
            r3 = 3
            if (r0 == r3) goto L3d
            r2 = 4
            if (r0 != r2) goto L1c
            goto L30
        L1c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid uri: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L30:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L41
        L35:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L3d
            r5 = r1
            goto L41
        L3d:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L41:
            if (r5 != 0) goto L44
            return r1
        L44:
            o.nc$setX r6 = new o.nc$setX
            o.xJ r5 = o.C0615xz.setY(r5)
            o.mU$MenuHostHelper$$ExternalSyntheticLambda1 r0 = o.mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mM.MenuHostHelper$$ExternalSyntheticLambda0(o.mY, int):o.nc$setX");
    }
}