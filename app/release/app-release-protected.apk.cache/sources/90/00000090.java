package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
import o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1;
import o.clearCallingWorkSource;
import o.setEditableFactory;
import o.setLengthCounter;
import o.setStackedBackground;
import o.setTickMark;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    private static short[] setLayoutAnimation;
    public static final byte[] $$g = {117, -10, 119, -11};
    public static final int $$h = 103;
    public static final byte[] $$d = {11, 29, 107, 8, -65, 64, -29, -65, 57, -35, -32, 41, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -48, -14, 15, -27, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, -14, 15, -28, -65, 62, -41, -65, 69, -14, 15, -32, 17, 19, -4, -48, 33, 7, -7, 2, -6, 19, -15, -65, 17, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -53, -29, 79, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, -65, 72, -4, -78, 41, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 51, -32, -29, 41, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49};
    public static final int $$e = 195;
    public static final byte[] $$a = {71, 31, 113, 39, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 84;
    private static byte[] setNavigationOnClickListener = {51, -70, 75, 72, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12, -2, -19, 47, -51, -4, 0, -1, 2, -2, -23, 7, -10, -3, 33, -41, 4, -13};
    public static final int setX = 210;
    private static int MenuHostHelper$$ExternalSyntheticLambda1 = 1437176389;
    private static int setY = -529977538;
    private static byte[] setIconTintList = {-19, -7, -26, -52, -101, -19, -12, -28, -1, -53, -56, -66, -23, 36, -81, -2, -1, -32, -45, -5, -48, -3, -23, -8, -19, -18, -31, -42, -13, -30, -9, -26, -46, -8, -22, -127, -104, -111, -122, -16, -71, -125, -119, -111, -117, -109, -113, -2, -15, 90, -100, -115, -47, 70, -103, -106, -101, -118, -110, -117, 7, 12, 29, 123, 4, 0, 5, 2, 6, 87, 53, 12, 113, 27, 6, 5, 120, 49, 49, 49, 49};
    private static int MenuHostHelper$$ExternalSyntheticLambda0 = 1468773231;

    private static void a(byte b, short s, int i, Object[] objArr) {
        int i2 = 115 - (i * 38);
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = 40 - b;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            i2 = (i3 + i2) - 13;
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i7 = i3 + 1;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i7]) - 13;
                i3 = i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.setNavigationOnClickListener
            int r6 = r6 + 4
            int r7 = 23 - r7
            int r8 = 106 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = 0
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r9 = r9 - r7
            int r7 = r9 + (-4)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 115 - r8
            int r6 = 45 - r6
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$d
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L33
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r8 = r8 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.d(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$g
            int r7 = r7 + 4
            int r6 = r6 + 113
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.e(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0439 A[Catch: Exception -> 0x0788, TRY_LEAVE, TryCatch #8 {Exception -> 0x0788, blocks: (B:57:0x03fa, B:59:0x0439), top: B:116:0x03fa }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0568 A[Catch: all -> 0x0776, TryCatch #4 {all -> 0x0776, blocks: (B:65:0x054a, B:69:0x05b8, B:68:0x0568), top: B:108:0x054a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x076f A[ORIG_RETURN, RETURN] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06eb A[Catch: Exception -> 0x11e3, TRY_LEAVE, TryCatch #10 {Exception -> 0x11e3, blocks: (B:98:0x06a5, B:100:0x06eb), top: B:296:0x06a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x07b1 A[Catch: all -> 0x11cf, TryCatch #19 {all -> 0x11cf, blocks: (B:106:0x0793, B:110:0x0802, B:109:0x07b1), top: B:314:0x0793 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x09a2 A[Catch: Exception -> 0x11c3, TRY_LEAVE, TryCatch #29 {Exception -> 0x11c3, blocks: (B:124:0x095a, B:126:0x09a2), top: B:334:0x095a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0e1c A[Catch: Exception -> 0x11bd, TRY_LEAVE, TryCatch #23 {Exception -> 0x11bd, blocks: (B:193:0x0dd6, B:195:0x0e1c), top: B:322:0x0dd6 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0fd3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b18 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x060e  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 4611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.onCreate():void");
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        setLengthCounter.setY(getApplicationContext());
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda12 = StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setIconTintList().setIconTintList(string).MenuHostHelper$$ExternalSyntheticLambda1(setTickMark.setY(i));
        if (string2 != null) {
            MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0(Base64.decode(string2, 0));
        }
        setStackedBackground setstackedbackground = setLengthCounter.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setstackedbackground == null) {
            throw new IllegalStateException("Not initialized!");
        }
        setEditableFactory seteditablefactory = setstackedbackground.setY().setX;
        seteditablefactory.setUiOptions.execute(new clearCallingWorkSource(seteditablefactory, MenuHostHelper$$ExternalSyntheticLambda12.setY(), i2, new Runnable() { // from class: o.setTextEndPaddingResource
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        }));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r19, int r20, int r21, int r22, byte r23, java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.b(short, int, int, int, byte, java.lang.Object[]):void");
    }
}