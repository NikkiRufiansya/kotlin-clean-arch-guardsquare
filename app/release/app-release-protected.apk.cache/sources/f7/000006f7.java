package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o.mW;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class mI {
    final List<mE> MenuHostHelper$$ExternalSyntheticLambda0;
    final Context MenuHostHelper$$ExternalSyntheticLambda1;
    private setY setAnimationFromJson;
    final Set<Object> setCenterIfNoTextEnabled;
    final boolean setIconSize;
    boolean setIconTintList;
    final Map<String, mE> setLayoutAnimation;
    private C0318nf setMaxEms;
    final Handler setNavigationOnClickListener;
    final Map<Object, mH> setOnLongClickListener;
    private setX setOnNavigationItemSelectedListener;
    final ExecutorService setTextAlignment;
    final Map<Object, mH> setUiOptions;
    final Handler setUnboundedRipple;
    final mD setX;
    final mL setY;
    public static final byte[] $$a = {65, 51, -100, -34};
    public static final int $$b = 235;
    public static final byte[] setChipCornerRadius = {11, 41, -68, -59, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
    public static final int ViewPager$SavedState$1 = 55;
    private static int setTextScaleX = 851212115;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 7
            int r7 = r7 + 16
            int r8 = r8 + 4
            int r9 = 106 - r9
            byte[] r0 = o.mI.setChipCornerRadius
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            r8 = r7
            goto L34
        L16:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L34:
            int r7 = r7 - r9
            int r7 = r7 + (-4)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mI.b(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = o.mI.$$a
            int r8 = r8 * 2
            int r8 = 104 - r8
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L38
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L38:
            int r9 = -r9
            int r7 = r7 + r9
            int r8 = r8 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mI.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mI(Context context, ExecutorService executorService, Handler handler, mL mLVar, mD mDVar, C0318nf c0318nf) {
        setX setx = new setX();
        this.setOnNavigationItemSelectedListener = setx;
        setx.start();
        C0321ni.MenuHostHelper$$ExternalSyntheticLambda0(setx.getLooper());
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
        this.setTextAlignment = executorService;
        this.setLayoutAnimation = new LinkedHashMap();
        this.setUiOptions = new WeakHashMap();
        this.setOnLongClickListener = new WeakHashMap();
        this.setCenterIfNoTextEnabled = new LinkedHashSet();
        this.setNavigationOnClickListener = new setIconTintList(setx.getLooper(), this);
        this.setY = mLVar;
        this.setUnboundedRipple = handler;
        this.setX = mDVar;
        this.setMaxEms = c0318nf;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList(4);
        this.setIconTintList = C0321ni.setIconTintList(context);
        this.setIconSize = C0321ni.setY(context, "android.permission.ACCESS_NETWORK_STATE");
        setY sety = new setY(this);
        this.setAnimationFromJson = sety;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (sety.setIconTintList.setIconSize) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        sety.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.registerReceiver(sety, intentFilter);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(mH mHVar, boolean z) {
        if (this.setCenterIfNoTextEnabled.contains(mHVar.setNavigationOnClickListener)) {
            Map<Object, mH> map = this.setOnLongClickListener;
            Reference reference = mHVar.setIconSize;
            map.put(reference != null ? reference.get() : null, mHVar);
            if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                String iconTintList = mHVar.setOnLongClickListener.setIconTintList();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(mHVar.setNavigationOnClickListener);
                sb.append("' is paused");
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "paused", iconTintList, sb.toString());
                return;
            }
            return;
        }
        mE mEVar = this.setLayoutAnimation.get(mHVar.setY);
        if (mEVar != null) {
            mEVar.setY(mHVar);
        } else if (this.setTextAlignment.isShutdown()) {
            if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "ignored", mHVar.setOnLongClickListener.setIconTintList(), "because shut down");
            }
        } else {
            mE MenuHostHelper$$ExternalSyntheticLambda1 = mE.MenuHostHelper$$ExternalSyntheticLambda1(mHVar.setUnboundedRipple, this, this.setX, this.setMaxEms, mHVar);
            MenuHostHelper$$ExternalSyntheticLambda1.setX = this.setTextAlignment.submit(MenuHostHelper$$ExternalSyntheticLambda1);
            this.setLayoutAnimation.put(mHVar.setY, MenuHostHelper$$ExternalSyntheticLambda1);
            if (z) {
                Map<Object, mH> map2 = this.setUiOptions;
                Reference reference2 = mHVar.setIconSize;
                map2.remove(reference2 != null ? reference2.get() : null);
            }
            if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "enqueued", mHVar.setOnLongClickListener.setIconTintList(), "");
            }
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends Handler {
        private final mI setY;

        setIconTintList(Looper looper, mI mIVar) {
            super(looper);
            this.setY = mIVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            String x;
            boolean MenuHostHelper$$ExternalSyntheticLambda1;
            String x2;
            String x3;
            String x4;
            switch (message.what) {
                case 1:
                    this.setY.MenuHostHelper$$ExternalSyntheticLambda1((mH) message.obj, true);
                    return;
                case 2:
                    mH mHVar = (mH) message.obj;
                    mI mIVar = this.setY;
                    String str = mHVar.setY;
                    mE mEVar = mIVar.setLayoutAnimation.get(str);
                    if (mEVar != null) {
                        mEVar.MenuHostHelper$$ExternalSyntheticLambda0(mHVar);
                        if (mEVar.MenuHostHelper$$ExternalSyntheticLambda0()) {
                            mIVar.setLayoutAnimation.remove(str);
                            if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "canceled", mHVar.setOnLongClickListener.setIconTintList(), "");
                            }
                        }
                    }
                    if (mIVar.setCenterIfNoTextEnabled.contains(mHVar.setNavigationOnClickListener)) {
                        Map<Object, mH> map = mIVar.setOnLongClickListener;
                        Reference reference = mHVar.setIconSize;
                        map.remove(reference == null ? null : reference.get());
                        if (mHVar.setUnboundedRipple.setOnLongClickListener) {
                            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "canceled", mHVar.setOnLongClickListener.setIconTintList(), "because paused request got canceled");
                        }
                    }
                    Map<Object, mH> map2 = mIVar.setUiOptions;
                    Reference reference2 = mHVar.setIconSize;
                    mH remove = map2.remove(reference2 == null ? null : reference2.get());
                    if (remove == null || !remove.setUnboundedRipple.setOnLongClickListener) {
                        return;
                    }
                    C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "canceled", remove.setOnLongClickListener.setIconTintList(), "from replaying");
                    return;
                case 3:
                case 8:
                default:
                    mU.setY.post(new Runnable() { // from class: o.mI.setIconTintList.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
                case 4:
                    mE mEVar2 = (mE) message.obj;
                    mI mIVar2 = this.setY;
                    if (mT.MenuHostHelper$$ExternalSyntheticLambda0(mEVar2.setOnLongClickListener)) {
                        mIVar2.setX.setIconTintList(mEVar2.setLayoutAnimation, mEVar2.setTextAlignment);
                    }
                    mIVar2.setLayoutAnimation.remove(mEVar2.setLayoutAnimation);
                    mIVar2.setY(mEVar2);
                    if (mEVar2.setUiOptions.setOnLongClickListener) {
                        x = C0321ni.setX(mEVar2, "");
                        C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "batched", x, "for completion");
                        return;
                    }
                    return;
                case 5:
                    mE mEVar3 = (mE) message.obj;
                    mI mIVar3 = this.setY;
                    Future<?> future = mEVar3.setX;
                    if (future != null && future.isCancelled()) {
                        return;
                    }
                    if (mIVar3.setTextAlignment.isShutdown()) {
                        mIVar3.setIconTintList(mEVar3, false);
                        return;
                    }
                    NetworkInfo activeNetworkInfo = mIVar3.setIconSize ? ((ConnectivityManager) C0321ni.MenuHostHelper$$ExternalSyntheticLambda0(mIVar3.MenuHostHelper$$ExternalSyntheticLambda1, "connectivity")).getActiveNetworkInfo() : null;
                    boolean z = mIVar3.setIconTintList;
                    int i = mEVar3.ViewPager$SavedState$1;
                    if (i > 0) {
                        mEVar3.ViewPager$SavedState$1 = i - 1;
                        MenuHostHelper$$ExternalSyntheticLambda1 = mEVar3.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(activeNetworkInfo);
                    } else {
                        MenuHostHelper$$ExternalSyntheticLambda1 = false;
                    }
                    if (MenuHostHelper$$ExternalSyntheticLambda1) {
                        if (mEVar3.setUiOptions.setOnLongClickListener) {
                            x2 = C0321ni.setX(mEVar3, "");
                            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "retrying", x2, "");
                        }
                        if (mEVar3.setY instanceof mW.setY) {
                            mEVar3.setUnboundedRipple |= mV.NO_CACHE.MenuHostHelper$$ExternalSyntheticLambda1;
                        }
                        mEVar3.setX = mIVar3.setTextAlignment.submit(mEVar3);
                        return;
                    }
                    boolean z2 = mIVar3.setIconSize && mEVar3.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
                    mIVar3.setIconTintList(mEVar3, z2);
                    if (z2) {
                        mH mHVar2 = mEVar3.setIconTintList;
                        if (mHVar2 != null) {
                            mIVar3.MenuHostHelper$$ExternalSyntheticLambda1(mHVar2);
                        }
                        List<mH> list = mEVar3.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (list != null) {
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                mIVar3.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i2));
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    this.setY.setIconTintList((mE) message.obj, false);
                    return;
                case 7:
                    mI mIVar4 = this.setY;
                    ArrayList<mE> arrayList = new ArrayList(mIVar4.MenuHostHelper$$ExternalSyntheticLambda0);
                    mIVar4.MenuHostHelper$$ExternalSyntheticLambda0.clear();
                    Handler handler = mIVar4.setUnboundedRipple;
                    handler.sendMessage(handler.obtainMessage(8, arrayList));
                    if (arrayList.isEmpty() || !((mE) arrayList.get(0)).setUiOptions.setOnLongClickListener) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (mE mEVar4 : arrayList) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        x3 = C0321ni.setX(mEVar4, "");
                        sb.append(x3);
                    }
                    C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "delivered", sb.toString(), "");
                    return;
                case 9:
                    NetworkInfo networkInfo = (NetworkInfo) message.obj;
                    mI mIVar5 = this.setY;
                    ExecutorService executorService = mIVar5.setTextAlignment;
                    if (executorService instanceof C0314nb) {
                        C0314nb c0314nb = (C0314nb) executorService;
                        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                            int type = networkInfo.getType();
                            if (type == 0) {
                                int subtype = networkInfo.getSubtype();
                                switch (subtype) {
                                    case 1:
                                    case 2:
                                        c0314nb.setCorePoolSize(1);
                                        c0314nb.setMaximumPoolSize(1);
                                        break;
                                    default:
                                        switch (subtype) {
                                            case 12:
                                                break;
                                            case 13:
                                            case 14:
                                            case 15:
                                                c0314nb.setCorePoolSize(3);
                                                c0314nb.setMaximumPoolSize(3);
                                                break;
                                            default:
                                                c0314nb.setCorePoolSize(3);
                                                c0314nb.setMaximumPoolSize(3);
                                                break;
                                        }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        c0314nb.setCorePoolSize(2);
                                        c0314nb.setMaximumPoolSize(2);
                                        break;
                                }
                            } else if (type == 1 || type == 6 || type == 9) {
                                c0314nb.setCorePoolSize(4);
                                c0314nb.setMaximumPoolSize(4);
                            }
                        }
                        c0314nb.setCorePoolSize(3);
                        c0314nb.setMaximumPoolSize(3);
                    }
                    if (networkInfo == null || !networkInfo.isConnected() || mIVar5.setUiOptions.isEmpty()) {
                        return;
                    }
                    Iterator<mH> it = mIVar5.setUiOptions.values().iterator();
                    while (it.hasNext()) {
                        mH next = it.next();
                        it.remove();
                        if (next.setUnboundedRipple.setOnLongClickListener) {
                            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "replaying", next.setOnLongClickListener.setIconTintList(), "");
                        }
                        mIVar5.MenuHostHelper$$ExternalSyntheticLambda1(next, false);
                    }
                    return;
                case 10:
                    this.setY.setIconTintList = message.arg1 == 1;
                    return;
                case 11:
                    Object obj = message.obj;
                    mI mIVar6 = this.setY;
                    if (mIVar6.setCenterIfNoTextEnabled.add(obj)) {
                        Iterator<mE> it2 = mIVar6.setLayoutAnimation.values().iterator();
                        while (it2.hasNext()) {
                            mE next2 = it2.next();
                            boolean z3 = next2.setUiOptions.setOnLongClickListener;
                            mH mHVar3 = next2.setIconTintList;
                            List<mH> list2 = next2.MenuHostHelper$$ExternalSyntheticLambda0;
                            boolean z4 = (list2 == null || list2.isEmpty()) ? false : true;
                            if (mHVar3 != null || z4) {
                                if (mHVar3 != null && mHVar3.setNavigationOnClickListener.equals(obj)) {
                                    next2.MenuHostHelper$$ExternalSyntheticLambda0(mHVar3);
                                    Map<Object, mH> map3 = mIVar6.setOnLongClickListener;
                                    Reference reference3 = mHVar3.setIconSize;
                                    map3.put(reference3 == null ? null : reference3.get(), mHVar3);
                                    if (z3) {
                                        String iconTintList = mHVar3.setOnLongClickListener.setIconTintList();
                                        StringBuilder sb2 = new StringBuilder("because tag '");
                                        sb2.append(obj);
                                        sb2.append("' was paused");
                                        C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "paused", iconTintList, sb2.toString());
                                    }
                                }
                                if (z4) {
                                    for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                                        mH mHVar4 = list2.get(size2);
                                        if (mHVar4.setNavigationOnClickListener.equals(obj)) {
                                            next2.MenuHostHelper$$ExternalSyntheticLambda0(mHVar4);
                                            Map<Object, mH> map4 = mIVar6.setOnLongClickListener;
                                            Reference reference4 = mHVar4.setIconSize;
                                            map4.put(reference4 == null ? null : reference4.get(), mHVar4);
                                            if (z3) {
                                                String iconTintList2 = mHVar4.setOnLongClickListener.setIconTintList();
                                                StringBuilder sb3 = new StringBuilder("because tag '");
                                                sb3.append(obj);
                                                sb3.append("' was paused");
                                                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "paused", iconTintList2, sb3.toString());
                                            }
                                        }
                                    }
                                }
                                if (next2.MenuHostHelper$$ExternalSyntheticLambda0()) {
                                    it2.remove();
                                    if (z3) {
                                        x4 = C0321ni.setX(next2, "");
                                        C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "canceled", x4, "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    mI mIVar7 = this.setY;
                    if (mIVar7.setCenterIfNoTextEnabled.remove(obj2)) {
                        Iterator<mH> it3 = mIVar7.setOnLongClickListener.values().iterator();
                        ArrayList arrayList2 = null;
                        while (it3.hasNext()) {
                            mH next3 = it3.next();
                            if (next3.setNavigationOnClickListener.equals(obj2)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(next3);
                                it3.remove();
                            }
                        }
                        if (arrayList2 != null) {
                            Handler handler2 = mIVar7.setUnboundedRipple;
                            handler2.sendMessage(handler2.obtainMessage(13, arrayList2));
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    static class setX extends HandlerThread {
        setX() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* loaded from: classes.dex */
    static class setY extends BroadcastReceiver {
        final mI setIconTintList;
        public static final byte[] $$g = {112, -20, -94, -81};
        public static final int $$h = 82;
        public static final byte[] $$d = {14, -73, -90, 103, -55, 69, 27, -76, 51, 34, 19, 17, -35, 49, 14, 11, -34, 39, 17, 14, -1, 23, -68, 10, 43, 61, 6, -5, 23, 6, -3, 21, -15, 48, -1, 16, -2, 7, 25, -1, 4, -13, 31, 22, -1, 12, 7, -38, -55, 74, -19, -55, 67, -25, -22, 51, 34, 19, 17, -35, 49, 14, 11, -34, 39, 17, 14, -1, 23, -68, 10, 43, 61, 6, -5, 23, 6, -3, 21, -15, 48, -1, 16, -2, 7, 25, -1, 4, -13, 31, 22, -1, 12, 7, -38, -4, 25, -17, -4, 25, -33, 36, 22, 9, -16, 31, 15, 16, -30, 39, 20, 11, -4, 25, -18, -55, 72, -31, 34, 19, 17, -35, 49, 14, 11, -34, 39, 17, 14, -1, 23, -68, 10, 43, 61, 6, -5, 23, 6, -3, 21, -15, 48, -1, 16, -2, 7, 25, -1, 4, -13, 31, 22, -1, 12, 7, -39, -55, 75, -32};
        public static final int $$e = 193;
        public static final byte[] $$a = {15, -40, -114, -21, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
        public static final int $$b = 202;
        private static byte[] setUnboundedRipple = {97, -108, 86, -98, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 60;
        private static char[] MenuHostHelper$$ExternalSyntheticLambda1 = {34062, 34073, 34051, 34077, 34072, 34054, 34265, 34076, 34300, 34070, 34067, 34050, 34074, 34284, 34075, 34060, 34052, 34079, 34301};
        private static boolean setY = true;
        private static boolean setNavigationOnClickListener = true;
        private static int setX = -1400797777;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                byte[] r0 = o.mI.setY.$$a
                int r8 = r8 * 38
                int r8 = 115 - r8
                int r6 = r6 + 4
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L34
            L18:
                r3 = 0
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r6 = r6 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
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
            L34:
                int r9 = r9 + r7
                int r7 = r9 + (-13)
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mI.setY.b(short, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 97
                byte[] r0 = o.mI.setY.setUnboundedRipple
                int r7 = 41 - r7
                int r8 = r8 * 7
                int r8 = 23 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r9 = r7
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r8
                goto L2e
            L16:
                r3 = 0
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r7]
                r6 = r10
                r10 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L2e:
                int r7 = r7 + 1
                int r9 = r9 + r8
                int r9 = r9 + (-4)
                r8 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mI.setY.c(short, int, byte, java.lang.Object[]):void");
        }

        private static void d(int i, byte b, byte b2, Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = 45 - b2;
            int i3 = (b * 2) + 77;
            int i4 = i + 4;
            byte[] bArr2 = new byte[i2];
            int i5 = -1;
            int i6 = i2 - 1;
            if (bArr == null) {
                int i7 = (i6 + i4) - 10;
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = -1;
                i3 = i7;
                i4 = i4;
            }
            while (true) {
                int i8 = i5 + 1;
                bArr2[i8] = (byte) i3;
                int i9 = i4 + 1;
                if (i8 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b3 = bArr[i9];
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = i8;
                i3 = (i3 + b3) - 10;
                i4 = i9;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 66
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r0 = o.mI.setY.$$g
                int r9 = r9 * 4
                int r9 = r9 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L1a
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L34
            L1a:
                r3 = 0
            L1b:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r9]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L34:
                int r7 = -r7
                int r7 = r7 + r8
                int r8 = r10 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mI.setY.e(byte, int, int, java.lang.Object[]):void");
        }

        setY(mI mIVar) {
            this.setIconTintList = mIVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x082b  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x09c3 A[Catch: Exception -> 0x0c78, TRY_LEAVE, TryCatch #2 {Exception -> 0x0c78, blocks: (B:147:0x097f, B:149:0x09c3), top: B:227:0x097f }] */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0a22  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0a27  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0a2a  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0b9e  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0c2c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0c2d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x03aa A[Catch: Exception -> 0x0c9c, TRY_LEAVE, TryCatch #11 {Exception -> 0x0c9c, blocks: (B:59:0x0368, B:61:0x03aa), top: B:245:0x0368 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0472  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0473 A[Catch: all -> 0x0c8a, TryCatch #4 {all -> 0x0c8a, blocks: (B:68:0x0458, B:72:0x04c2, B:71:0x0473), top: B:231:0x0458 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0566  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0658 A[Catch: Exception -> 0x0c7e, TRY_LEAVE, TryCatch #9 {Exception -> 0x0c7e, blocks: (B:86:0x060c, B:88:0x0658), top: B:241:0x060c }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x06b7  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x06bc  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x06bf  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r26, android.content.Intent r27) {
            /*
                Method dump skipped, instructions count: 3268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mI.setY.onReceive(android.content.Context, android.content.Intent):void");
        }

        private static void a(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
            jt jtVar = new jt();
            char[] cArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
            long j = 0;
            char c = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i2 = 0;
                while (i2 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Integer.valueOf(cArr2[i2]);
                        Object obj = jC.setTextScaleX.get(-2024796271);
                        if (obj == null) {
                            byte b = (byte) 1;
                            byte b2 = (byte) (b - 1);
                            Object[] objArr3 = new Object[1];
                            e(b, b2, b2, objArr3);
                            obj = ((Class) jC.setY(TextUtils.indexOf("", "") + 232, (char) (Process.myTid() >> 22), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 3)).getMethod((String) objArr3[0], Integer.TYPE);
                            jC.setTextScaleX.put(-2024796271, obj);
                        }
                        cArr3[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i2++;
                        j = 0;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(setX)};
                Object obj2 = jC.setTextScaleX.get(-192560398);
                if (obj2 == null) {
                    obj2 = ((Class) jC.setY(357 - ExpandableListView.getPackedPositionGroup(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31790), View.resolveSize(0, 0) + 4)).getMethod("C", Integer.TYPE);
                    jC.setTextScaleX.put(-192560398, obj2);
                }
                int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                if (setNavigationOnClickListener) {
                    jtVar.setIconTintList = bArr.length;
                    char[] cArr4 = new char[jtVar.setIconTintList];
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                    while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                        cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                        try {
                            Object[] objArr5 = {jtVar, jtVar};
                            Object obj3 = jC.setTextScaleX.get(258277102);
                            if (obj3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                Object[] objArr6 = new Object[1];
                                e(b3, b4, b4, objArr6);
                                obj3 = ((Class) jC.setY(211 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) Color.alpha(0), 4 - View.getDefaultSize(0, 0))).getMethod((String) objArr6[0], Object.class, Object.class);
                                jC.setTextScaleX.put(258277102, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr5);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new String(cArr4);
                } else if (setY) {
                    jtVar.setIconTintList = cArr.length;
                    char[] cArr5 = new char[jtVar.setIconTintList];
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                    while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                        cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                        try {
                            Object[] objArr7 = {jtVar, jtVar};
                            Object obj4 = jC.setTextScaleX.get(258277102);
                            if (obj4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                Object[] objArr8 = new Object[1];
                                e(b5, b6, b6, objArr8);
                                obj4 = ((Class) jC.setY(AndroidCharacter.getMirror('0') + 162, (char) (ViewConfiguration.getTouchSlop() >> 8), 4 - Drawable.resolveOpacity(0, 0))).getMethod((String) objArr8[0], Object.class, Object.class);
                                jC.setTextScaleX.put(258277102, obj4);
                            }
                            ((Method) obj4).invoke(null, objArr7);
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    objArr[0] = new String(cArr5);
                } else {
                    int i3 = 0;
                    jtVar.setIconTintList = iArr.length;
                    char[] cArr6 = new char[jtVar.setIconTintList];
                    while (true) {
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
                        if (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                            i3 = jtVar.MenuHostHelper$$ExternalSyntheticLambda1 + 1;
                        } else {
                            objArr[0] = new String(cArr6);
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
    }

    final void setY(mE mEVar) {
        Future<?> future = mEVar.setX;
        if (future != null && future.isCancelled()) {
            return;
        }
        if (mEVar.setTextAlignment != null) {
            mEVar.setTextAlignment.prepareToDraw();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.add(mEVar);
        if (this.setNavigationOnClickListener.hasMessages(7)) {
            return;
        }
        this.setNavigationOnClickListener.sendEmptyMessageDelayed(7, 200L);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(mH mHVar) {
        Reference reference = mHVar.setIconSize;
        Object obj = reference == null ? null : reference.get();
        if (obj != null) {
            mHVar.setCenterIfNoTextEnabled = true;
            this.setUiOptions.put(obj, mHVar);
        }
    }

    final void setIconTintList(mE mEVar, boolean z) {
        String x;
        if (mEVar.setUiOptions.setOnLongClickListener) {
            x = C0321ni.setX(mEVar, "");
            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Dispatcher", "batched", x, "for error".concat(z ? " (will replay)" : ""));
        }
        this.setLayoutAnimation.remove(mEVar.setLayoutAnimation);
        setY(mEVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
        ju juVar = new ju();
        char[] cArr2 = new char[i];
        juVar.setX = 0;
        while (juVar.setX < i) {
            juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
            cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
            int i4 = juVar.setX;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(setTextScaleX)};
                Object obj = jC.setTextScaleX.get(-1875803360);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    c(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(341 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.green(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                    jC.setTextScaleX.put(-1875803360, obj);
                }
                cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {juVar, juVar};
                    Object obj2 = jC.setTextScaleX.get(-257319855);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        c(b3, b4, (byte) (b4 - 1), objArr5);
                        obj2 = ((Class) jC.setY(206 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (65234 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 4 - KeyEvent.getDeadChar(0, 0))).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            juVar.setIconTintList = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
            System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
        }
        if (z) {
            char[] cArr4 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                try {
                    Object[] objArr6 = {juVar, juVar};
                    Object obj3 = jC.setTextScaleX.get(-257319855);
                    if (obj3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        Object[] objArr7 = new Object[1];
                        c(b5, b6, (byte) (b6 - 1), objArr7);
                        obj3 = ((Class) jC.setY(View.MeasureSpec.getSize(0) + 206, (char) (ImageFormat.getBitsPerPixel(0) + 65234), TextUtils.getOffsetAfter("", 0) + 4)).getMethod((String) objArr7[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}