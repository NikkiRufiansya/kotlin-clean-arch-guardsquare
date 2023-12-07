package o;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.setOnApplyWindowInsetsListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setChipCornerRadiusResource {
    static final setDividerHeight<String, ArrayList<getGroupName<setX>>> MenuHostHelper$$ExternalSyntheticLambda0;
    static final Object setIconTintList;
    private static final ExecutorService setX;
    private static setStepSize<String, Typeface> setY = new setStepSize<>(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory("fonts-androidx", 10) { // from class: o.setOnApplyWindowInsetsListener$MenuHostHelper$$ExternalSyntheticLambda1
            private int MenuHostHelper$$ExternalSyntheticLambda1 = 10;
            private String setY;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.setY = r1;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                final String str = this.setY;
                final int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
                return new Thread(runnable, str, i) { // from class: o.setOnApplyWindowInsetsListener$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda0
                    private final int MenuHostHelper$$ExternalSyntheticLambda0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(this.MenuHostHelper$$ExternalSyntheticLambda0);
                        super.run();
                    }
                };
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        setX = threadPoolExecutor;
        setIconTintList = new Object();
        MenuHostHelper$$ExternalSyntheticLambda0 = new setDividerHeight<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface setIconTintList(final Context context, final setMarqueeRepeatLimit setmarqueerepeatlimit, setEmptyVisibility setemptyvisibility, final int i, int i2) {
        final String y = setY(setmarqueerepeatlimit, i);
        Typeface y2 = setY.setY(y);
        if (y2 != null) {
            setemptyvisibility.setIconTintList(new setX(y2));
            return y2;
        } else if (i2 == -1) {
            setX x = setX(y, context, setmarqueerepeatlimit, i);
            setemptyvisibility.setIconTintList(x);
            return x.setY;
        } else {
            try {
                setX setx = (setX) setOnApplyWindowInsetsListener.MenuHostHelper$$ExternalSyntheticLambda1(setX, new Callable<setX>() { // from class: o.setChipCornerRadiusResource.4
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ setX call() {
                        return setChipCornerRadiusResource.setX(y, context, setmarqueerepeatlimit, i);
                    }
                }, i2);
                setemptyvisibility.setIconTintList(setx);
                return setx.setY;
            } catch (InterruptedException unused) {
                setemptyvisibility.setIconTintList(new setX(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface setY(final Context context, final setMarqueeRepeatLimit setmarqueerepeatlimit, final int i, final setEmptyVisibility setemptyvisibility) {
        Handler handler;
        final String y = setY(setmarqueerepeatlimit, i);
        Typeface y2 = setY.setY(y);
        if (y2 != null) {
            setemptyvisibility.setIconTintList(new setX(y2));
            return y2;
        }
        getGroupName<setX> getgroupname = new getGroupName<setX>() { // from class: o.setChipCornerRadiusResource.3
            @Override // o.getGroupName
            public final /* synthetic */ void setY(setX setx) {
                setX setx2 = setx;
                if (setx2 == null) {
                    setx2 = new setX(-3);
                }
                setEmptyVisibility.this.setIconTintList(setx2);
            }
        };
        synchronized (setIconTintList) {
            setDividerHeight<String, ArrayList<getGroupName<setX>>> setdividerheight = MenuHostHelper$$ExternalSyntheticLambda0;
            ArrayList<getGroupName<setX>> arrayList = setdividerheight.get(y);
            if (arrayList != null) {
                arrayList.add(getgroupname);
                return null;
            }
            ArrayList<getGroupName<setX>> arrayList2 = new ArrayList<>();
            arrayList2.add(getgroupname);
            setdividerheight.put(y, arrayList2);
            Callable<setX> callable = new Callable<setX>() { // from class: o.setChipCornerRadiusResource.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
                public setX call() {
                    try {
                        return setChipCornerRadiusResource.setX(y, context, setmarqueerepeatlimit, i);
                    } catch (Throwable unused) {
                        return new setX(-3);
                    }
                }
            };
            ExecutorService executorService = setX;
            getGroupName<setX> getgroupname2 = new getGroupName<setX>() { // from class: o.setChipCornerRadiusResource.5
                @Override // o.getGroupName
                public final /* synthetic */ void setY(setX setx) {
                    setX setx2 = setx;
                    synchronized (setChipCornerRadiusResource.setIconTintList) {
                        ArrayList<getGroupName<setX>> arrayList3 = setChipCornerRadiusResource.MenuHostHelper$$ExternalSyntheticLambda0.get(y);
                        if (arrayList3 == null) {
                            return;
                        }
                        setChipCornerRadiusResource.MenuHostHelper$$ExternalSyntheticLambda0.remove(y);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            arrayList3.get(i2).setY(setx2);
                        }
                    }
                }
            };
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            executorService.execute(new setOnApplyWindowInsetsListener.setY(handler, callable, getgroupname2));
            return null;
        }
    }

    private static String setY(setMarqueeRepeatLimit setmarqueerepeatlimit, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(setmarqueerepeatlimit.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.setChipCornerRadiusResource.setX setX(java.lang.String r8, android.content.Context r9, o.setMarqueeRepeatLimit r10, int r11) {
        /*
            o.setStepSize<java.lang.String, android.graphics.Typeface> r0 = o.setChipCornerRadiusResource.setY
            java.lang.Object r1 = r0.setY(r8)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            o.setChipCornerRadiusResource$setX r8 = new o.setChipCornerRadiusResource$setX
            r8.<init>(r1)
            return r8
        L10:
            r1 = 0
            o.SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 r10 = o.setOnFitSystemWindowsListener.setIconTintList(r9, r10, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            int r2 = r10.setY()
            r3 = -3
            r4 = 1
            if (r2 == 0) goto L27
            int r2 = r10.setY()
            if (r2 == r4) goto L25
        L23:
            r2 = -3
            goto L48
        L25:
            r2 = -2
            goto L48
        L27:
            o.SingleGeneratedAdapterObserver$setX[] r2 = r10.setIconTintList()
            r5 = 0
            if (r2 == 0) goto L47
            int r6 = r2.length
            if (r6 != 0) goto L32
            goto L47
        L32:
            int r4 = r2.length
            r6 = 0
        L34:
            if (r6 >= r4) goto L46
            r7 = r2[r6]
            int r7 = r7.MenuHostHelper$$ExternalSyntheticLambda0()
            if (r7 == 0) goto L43
            if (r7 >= 0) goto L41
            goto L23
        L41:
            r2 = r7
            goto L48
        L43:
            int r6 = r6 + 1
            goto L34
        L46:
            r4 = 0
        L47:
            r2 = r4
        L48:
            if (r2 == 0) goto L50
            o.setChipCornerRadiusResource$setX r8 = new o.setChipCornerRadiusResource$setX
            r8.<init>(r2)
            return r8
        L50:
            o.SingleGeneratedAdapterObserver$setX[] r10 = r10.setIconTintList()
            android.graphics.Typeface r9 = o.copyRootViewBounds.MenuHostHelper$$ExternalSyntheticLambda0(r9, r1, r10, r11)
            if (r9 == 0) goto L63
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r8, r9)
            o.setChipCornerRadiusResource$setX r8 = new o.setChipCornerRadiusResource$setX
            r8.<init>(r9)
            return r8
        L63:
            o.setChipCornerRadiusResource$setX r8 = new o.setChipCornerRadiusResource$setX
            r8.<init>(r3)
            return r8
        L69:
            o.setChipCornerRadiusResource$setX r8 = new o.setChipCornerRadiusResource$setX
            r9 = -1
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setChipCornerRadiusResource.setX(java.lang.String, android.content.Context, o.setMarqueeRepeatLimit, int):o.setChipCornerRadiusResource$setX");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX {
        final int MenuHostHelper$$ExternalSyntheticLambda0;
        final Typeface setY;

        setX(int i) {
            this.setY = null;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        }

        setX(Typeface typeface) {
            this.setY = typeface;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        }
    }
}