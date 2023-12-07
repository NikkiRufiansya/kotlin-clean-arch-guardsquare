package o;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;
import o.SingleGeneratedAdapterObserver;

/* loaded from: classes.dex */
public final class setOnFitSystemWindowsListener {
    private static final Comparator<byte[]> MenuHostHelper$$ExternalSyntheticLambda1 = new Comparator() { // from class: o.setFastScrollAlwaysVisible
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return setOnFitSystemWindowsListener.setY((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:74:0x0092 A[LOOP:1: B:59:0x004d->B:74:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0096 A[EDGE_INSN: B:86:0x0096->B:76:0x0096 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(android.content.Context r11, o.setMarqueeRepeatLimit r12, android.os.CancellationSignal r13) {
        /*
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.content.res.Resources r1 = r11.getResources()
            java.lang.String r2 = r12.setIconTintList
            r3 = 0
            android.content.pm.ProviderInfo r4 = r0.resolveContentProvider(r2, r3)
            if (r4 == 0) goto Lc6
            java.lang.String r5 = r4.packageName
            java.lang.String r6 = r12.setY
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto La8
            java.lang.String r2 = r4.packageName
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r5)
            android.content.pm.Signature[] r0 = r0.signatures
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r5 = r0.length
            r6 = 0
        L2c:
            if (r6 >= r5) goto L3a
            r7 = r0[r6]
            byte[] r7 = r7.toByteArray()
            r2.add(r7)
            int r6 = r6 + 1
            goto L2c
        L3a:
            java.util.Comparator<byte[]> r0 = o.setOnFitSystemWindowsListener.MenuHostHelper$$ExternalSyntheticLambda1
            java.util.Collections.sort(r2, r0)
            java.util.List<java.util.List<byte[]>> r0 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            if (r0 == 0) goto L46
            java.util.List<java.util.List<byte[]>> r0 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            goto L4c
        L46:
            int r0 = r12.setX
            java.util.List r0 = o.setTextMetricsParams.MenuHostHelper$$ExternalSyntheticLambda1(r1, r0)
        L4c:
            r1 = 0
        L4d:
            int r5 = r0.size()
            r6 = 0
            r7 = 1
            if (r1 >= r5) goto L95
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Object r8 = r0.get(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            r5.<init>(r8)
            java.util.Comparator<byte[]> r8 = o.setOnFitSystemWindowsListener.MenuHostHelper$$ExternalSyntheticLambda1
            java.util.Collections.sort(r5, r8)
            int r8 = r2.size()
            int r9 = r5.size()
            if (r8 == r9) goto L71
        L6f:
            r5 = 0
            goto L8f
        L71:
            r8 = 0
        L72:
            int r9 = r2.size()
            if (r8 >= r9) goto L8e
            java.lang.Object r9 = r2.get(r8)
            byte[] r9 = (byte[]) r9
            java.lang.Object r10 = r5.get(r8)
            byte[] r10 = (byte[]) r10
            boolean r9 = java.util.Arrays.equals(r9, r10)
            if (r9 != 0) goto L8b
            goto L6f
        L8b:
            int r8 = r8 + 1
            goto L72
        L8e:
            r5 = 1
        L8f:
            if (r5 == 0) goto L92
            goto L96
        L92:
            int r1 = r1 + 1
            goto L4d
        L95:
            r4 = r6
        L96:
            if (r4 != 0) goto L9d
            o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 r11 = o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(r7, r6)
            return r11
        L9d:
            java.lang.String r0 = r4.authority
            o.SingleGeneratedAdapterObserver$setX[] r11 = setX(r11, r12, r0, r13)
            o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 r11 = o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(r3, r11)
            return r11
        La8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Found content provider "
            r11.<init>(r13)
            r11.append(r2)
            java.lang.String r13 = ", but package was not "
            r11.append(r13)
            java.lang.String r12 = r12.setY
            r11.append(r12)
            android.content.pm.PackageManager$NameNotFoundException r12 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        Lc6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "No package found for authority: "
            r11.<init>(r12)
            r11.append(r2)
            android.content.pm.PackageManager$NameNotFoundException r12 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnFitSystemWindowsListener.setIconTintList(android.content.Context, o.setMarqueeRepeatLimit, android.os.CancellationSignal):o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1");
    }

    private static SingleGeneratedAdapterObserver.setX[] setX(Context context, setMarqueeRepeatLimit setmarqueerepeatlimit, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri withAppendedId;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{setmarqueerepeatlimit.setNavigationOnClickListener}, null, cancellationSignal);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            arrayList2.add(SingleGeneratedAdapterObserver.setX.MenuHostHelper$$ExternalSyntheticLambda1(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return (SingleGeneratedAdapterObserver.setX[]) arrayList.toArray(new SingleGeneratedAdapterObserver.setX[0]);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public static /* synthetic */ int setY(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}