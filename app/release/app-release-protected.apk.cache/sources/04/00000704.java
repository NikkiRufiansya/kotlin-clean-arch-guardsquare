package o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import o.AbstractC0315nc;

/* loaded from: classes.dex */
final class mP extends mK {
    private static final String[] setY = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public mP(Context context) {
        super(context);
    }

    @Override // o.mK, o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        Uri uri = mYVar.setZ;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // o.mK, o.AbstractC0315nc
    public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
        mP$MenuHostHelper$$ExternalSyntheticLambda1 mp_menuhosthelper__externalsyntheticlambda1;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.setX.getContentResolver();
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(contentResolver, mYVar.setZ);
        String type = contentResolver.getType(mYVar.setZ);
        boolean z = false;
        boolean z2 = type != null && type.startsWith("video/");
        if ((mYVar.setMaxEms == 0 && mYVar.setOnNavigationItemSelectedListener == 0) ? true : true) {
            int i2 = mYVar.setMaxEms;
            int i3 = mYVar.setOnNavigationItemSelectedListener;
            if (i2 <= mP$MenuHostHelper$$ExternalSyntheticLambda1.MICRO.setNavigationOnClickListener && i3 <= mP$MenuHostHelper$$ExternalSyntheticLambda1.MICRO.setY) {
                mp_menuhosthelper__externalsyntheticlambda1 = mP$MenuHostHelper$$ExternalSyntheticLambda1.MICRO;
            } else if (i2 <= mP$MenuHostHelper$$ExternalSyntheticLambda1.MINI.setNavigationOnClickListener && i3 <= mP$MenuHostHelper$$ExternalSyntheticLambda1.MINI.setY) {
                mp_menuhosthelper__externalsyntheticlambda1 = mP$MenuHostHelper$$ExternalSyntheticLambda1.MINI;
            } else {
                mp_menuhosthelper__externalsyntheticlambda1 = mP$MenuHostHelper$$ExternalSyntheticLambda1.FULL;
            }
            mP$MenuHostHelper$$ExternalSyntheticLambda1 mp_menuhosthelper__externalsyntheticlambda12 = mp_menuhosthelper__externalsyntheticlambda1;
            if (!z2 && mp_menuhosthelper__externalsyntheticlambda12 == mP$MenuHostHelper$$ExternalSyntheticLambda1.FULL) {
                return new AbstractC0315nc.setX(null, C0615xz.setY(this.setX.getContentResolver().openInputStream(mYVar.setZ)), mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK, MenuHostHelper$$ExternalSyntheticLambda1);
            }
            long parseId = ContentUris.parseId(mYVar.setZ);
            BitmapFactory.Options MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(mYVar);
            MenuHostHelper$$ExternalSyntheticLambda12.inJustDecodeBounds = true;
            MenuHostHelper$$ExternalSyntheticLambda1(mYVar.setMaxEms, mYVar.setOnNavigationItemSelectedListener, mp_menuhosthelper__externalsyntheticlambda12.setNavigationOnClickListener, mp_menuhosthelper__externalsyntheticlambda12.setY, MenuHostHelper$$ExternalSyntheticLambda12, mYVar);
            if (z2) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, mp_menuhosthelper__externalsyntheticlambda12 == mP$MenuHostHelper$$ExternalSyntheticLambda1.FULL ? 1 : mp_menuhosthelper__externalsyntheticlambda12.setX, MenuHostHelper$$ExternalSyntheticLambda12);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, mp_menuhosthelper__externalsyntheticlambda12.setX, MenuHostHelper$$ExternalSyntheticLambda12);
            }
            if (thumbnail != null) {
                return new AbstractC0315nc.setX(thumbnail, null, mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK, MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        return new AbstractC0315nc.setX(null, C0615xz.setY(this.setX.getContentResolver().openInputStream(mYVar.setZ)), mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK, MenuHostHelper$$ExternalSyntheticLambda1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int MenuHostHelper$$ExternalSyntheticLambda1(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = o.mP.setY     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L28
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L28
            if (r0 == 0) goto L22
            boolean r8 = r0.moveToFirst()     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L28
            if (r8 != 0) goto L16
            goto L22
        L16:
            int r8 = r0.getInt(r1)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L28
            if (r0 == 0) goto L1f
            r0.close()
        L1f:
            return r8
        L20:
            goto L2f
        L22:
            if (r0 == 0) goto L27
            r0.close()
        L27:
            return r1
        L28:
            r8 = move-exception
            if (r0 == 0) goto L2e
            r0.close()
        L2e:
            throw r8
        L2f:
            if (r0 == 0) goto L34
            r0.close()
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mP.MenuHostHelper$$ExternalSyntheticLambda1(android.content.ContentResolver, android.net.Uri):int");
    }
}