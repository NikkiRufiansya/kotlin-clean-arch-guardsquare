package o;

import android.app.ActivityManager;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.setBoxBackgroundMode;
import o.setTextAppearance;

/* loaded from: classes.dex */
public abstract class MaterialCheckBox$SavedState$1 {
    @Deprecated
    public volatile setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0;
    private Executor setCenterIfNoTextEnabled;
    private Executor setChipCornerRadius;
    private boolean setIconSize;
    @Deprecated
    public List<setX> setIconTintList;
    public setImageResource setUiOptions;
    boolean setX;
    public setPasswordVisibilityToggleTintList setY;
    private static byte[] setOnNavigationItemSelectedListener = {54, -88, 36, -123, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setOnLongClickListener = 109;
    final ReentrantReadWriteLock MenuHostHelper$$ExternalSyntheticLambda1 = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> setTextAlignment = new ThreadLocal<>();
    private final Map<String, Object> setUnboundedRipple = Collections.synchronizedMap(new HashMap());
    private final setTextAppearance setLayoutAnimation = setX();
    private final Map<Class<?>, Object> ViewPager$SavedState$1 = new HashMap();
    private Map<Class<? extends setCheckedState>, setCheckedState> setNavigationOnClickListener = new HashMap();

    /* loaded from: classes.dex */
    public static class setIconTintList {
        HashMap<Integer, TreeMap<Integer, setSlideProgress>> setIconTintList = new HashMap<>();
    }

    /* loaded from: classes.dex */
    public interface setUiOptions {
    }

    /* loaded from: classes.dex */
    public static abstract class setX {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 13
            int r6 = r6 + 4
            int r7 = r7 * 7
            int r7 = r7 + 99
            byte[] r0 = o.MaterialCheckBox$SavedState$1.setOnNavigationItemSelectedListener
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r6
            goto L37
        L18:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L37:
            int r6 = r6 + r7
            int r6 = r6 + 2
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MaterialCheckBox$SavedState$1.a(short, int, byte, java.lang.Object[]):void");
    }

    protected abstract setImageResource setX(setSelectedTabIndicatorHeight setselectedtabindicatorheight);

    protected abstract setTextAppearance setX();

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setSelectedTabIndicatorHeight setselectedtabindicatorheight) {
        this.setUiOptions = setX(setselectedtabindicatorheight);
        Set<Class<? extends setCheckedState>> unboundedRipple = setUnboundedRipple();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends setCheckedState>> it = unboundedRipple.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends setCheckedState> next = it.next();
                int size = setselectedtabindicatorheight.setY.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(setselectedtabindicatorheight.setY.get(size).getClass())) {
                        bitSet.set(size);
                        i = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i < 0) {
                    StringBuilder sb = new StringBuilder("A required auto migration spec (");
                    sb.append(next.getCanonicalName());
                    sb.append(") is missing in the database configuration.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.setNavigationOnClickListener.put(next, setselectedtabindicatorheight.setY.get(i));
            } else {
                for (int size2 = setselectedtabindicatorheight.setY.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<setSlideProgress> it2 = setLayoutAnimation().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    setSlideProgress next2 = it2.next();
                    if (!Collections.unmodifiableMap(setselectedtabindicatorheight.setOnLongClickListener.setIconTintList).containsKey(Integer.valueOf(next2.setY))) {
                        setIconTintList seticontintlist = setselectedtabindicatorheight.setOnLongClickListener;
                        setSlideProgress[] setslideprogressArr = {next2};
                        for (int i2 = 0; i2 <= 0; i2++) {
                            setSlideProgress setslideprogress = setslideprogressArr[0];
                            int i3 = setslideprogress.setY;
                            int i4 = setslideprogress.MenuHostHelper$$ExternalSyntheticLambda1;
                            TreeMap<Integer, setSlideProgress> treeMap = seticontintlist.setIconTintList.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                treeMap = new TreeMap<>();
                                seticontintlist.setIconTintList.put(Integer.valueOf(i3), treeMap);
                            }
                            setSlideProgress setslideprogress2 = treeMap.get(Integer.valueOf(i4));
                            if (setslideprogress2 != null) {
                                StringBuilder sb2 = new StringBuilder("Overriding migration ");
                                sb2.append(setslideprogress2);
                                sb2.append(" with ");
                                sb2.append(setslideprogress);
                                Log.w("ROOM", sb2.toString());
                            }
                            treeMap.put(Integer.valueOf(i4), setslideprogress);
                        }
                    }
                }
                setItemActiveIndicatorWidth setitemactiveindicatorwidth = (setItemActiveIndicatorWidth) MenuHostHelper$$ExternalSyntheticLambda0(setItemActiveIndicatorWidth.class, this.setUiOptions);
                if (setitemactiveindicatorwidth != null) {
                    setitemactiveindicatorwidth.MenuHostHelper$$ExternalSyntheticLambda1 = setselectedtabindicatorheight;
                }
                setTransitioning settransitioning = (setTransitioning) MenuHostHelper$$ExternalSyntheticLambda0(setTransitioning.class, this.setUiOptions);
                if (settransitioning != null) {
                    setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = settransitioning.MenuHostHelper$$ExternalSyntheticLambda1;
                    this.setY = setpasswordvisibilitytoggletintlist;
                    final setTextAppearance settextappearance = this.setLayoutAnimation;
                    settextappearance.MenuHostHelper$$ExternalSyntheticLambda1 = setpasswordvisibilitytoggletintlist;
                    setpasswordvisibilitytoggletintlist.setLayoutAnimation = new Runnable() { // from class: o.setFallbackLineSpacing
                        @Override // java.lang.Runnable
                        public final void run() {
                            setTextAppearance settextappearance2 = setTextAppearance.this;
                            synchronized (settextappearance2) {
                                settextappearance2.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                                setTextAppearance.setIconTintList seticontintlist2 = settextappearance2.setUnboundedRipple;
                                synchronized (seticontintlist2) {
                                    Arrays.fill(seticontintlist2.setIconTintList, false);
                                    seticontintlist2.setY = true;
                                }
                            }
                        }
                    };
                }
                boolean z = setselectedtabindicatorheight.setUiOptions == setY.WRITE_AHEAD_LOGGING;
                this.setUiOptions.setY(z);
                this.setIconTintList = setselectedtabindicatorheight.MenuHostHelper$$ExternalSyntheticLambda0;
                this.setChipCornerRadius = setselectedtabindicatorheight.setTextAlignment;
                this.setCenterIfNoTextEnabled = new setIncludeFontPadding(setselectedtabindicatorheight.setOnNavigationItemSelectedListener);
                this.setX = setselectedtabindicatorheight.setX;
                this.setIconSize = z;
                if (setselectedtabindicatorheight.setChipCornerRadius != null) {
                    setTextAppearance settextappearance2 = this.setLayoutAnimation;
                    settextappearance2.setX = new setKeyframes(setselectedtabindicatorheight.setIconTintList, setselectedtabindicatorheight.setCenterIfNoTextEnabled, setselectedtabindicatorheight.setChipCornerRadius, settextappearance2, settextappearance2.setY.setChipCornerRadius);
                }
                Map<Class<?>, List<Class<?>>> onLongClickListener = setOnLongClickListener();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : onLongClickListener.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = setselectedtabindicatorheight.setTextScaleX.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(setselectedtabindicatorheight.setTextScaleX.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 < 0) {
                            StringBuilder sb3 = new StringBuilder("A required type converter (");
                            sb3.append(cls);
                            sb3.append(") for ");
                            sb3.append(key.getCanonicalName());
                            sb3.append(" is missing in the database configuration.");
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        this.ViewPager$SavedState$1.put(cls, setselectedtabindicatorheight.setTextScaleX.get(size3));
                    }
                }
                for (int size4 = setselectedtabindicatorheight.setTextScaleX.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        Object obj = setselectedtabindicatorheight.setTextScaleX.get(size4);
                        StringBuilder sb4 = new StringBuilder("Unexpected type converter ");
                        sb4.append(obj);
                        sb4.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                }
                return;
            }
        }
    }

    public List<setSlideProgress> setLayoutAnimation() {
        return Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Class<T> r2, o.setImageResource r3) {
        /*
            r1 = this;
        L0:
            boolean r0 = r2.isInstance(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = r3 instanceof o.setTextFuture
            if (r0 == 0) goto L12
            o.setTextFuture r3 = (o.setTextFuture) r3
            o.setImageResource r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1()
            goto L0
        L12:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MaterialCheckBox$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Class, o.setImageResource):java.lang.Object");
    }

    protected Map<Class<?>, List<Class<?>>> setOnLongClickListener() {
        return Collections.emptyMap();
    }

    public Set<Class<? extends setCheckedState>> setUnboundedRipple() {
        return Collections.emptySet();
    }

    public final boolean setUiOptions() {
        setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = this.setY;
        if (setpasswordvisibilitytoggletintlist == null) {
            setWindowCallback setwindowcallback = this.MenuHostHelper$$ExternalSyntheticLambda0;
            return setwindowcallback != null && setwindowcallback.setNavigationOnClickListener();
        }
        return !setpasswordvisibilitytoggletintlist.setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object setNavigationOnClickListener() {
        setTextAlignment();
        return null;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1();
        if (this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setUnboundedRipple()) {
            return;
        }
        setTextAppearance settextappearance = this.setLayoutAnimation;
        if (settextappearance.setLayoutAnimation.compareAndSet(false, true)) {
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = settextappearance.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setpasswordvisibilitytoggletintlist != null) {
                setpasswordvisibilitytoggletintlist.setX();
            }
            settextappearance.setY.setChipCornerRadius.execute(settextappearance.setNavigationOnClickListener);
        }
    }

    public final void setX(setWindowCallback setwindowcallback) {
        setTextAppearance settextappearance = this.setLayoutAnimation;
        synchronized (settextappearance) {
            if (settextappearance.MenuHostHelper$$ExternalSyntheticLambda0) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            setwindowcallback.setY("PRAGMA temp_store = MEMORY;");
            setwindowcallback.setY("PRAGMA recursive_triggers='ON';");
            setwindowcallback.setY("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            settextappearance.MenuHostHelper$$ExternalSyntheticLambda0(setwindowcallback);
            settextappearance.setIconTintList = setwindowcallback.setIconTintList("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            settextappearance.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
    }

    /* loaded from: classes.dex */
    public enum setY {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean setX(ActivityManager activityManager) {
            return setBoxBackgroundMode.setIconTintList.setY(activityManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList() {
        Thread thread = Looper.getMainLooper().getThread();
        try {
            byte b = setOnNavigationItemSelectedListener[15];
            Object[] objArr = new Object[1];
            a(setOnNavigationItemSelectedListener[22], b, b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = (byte) (-setOnNavigationItemSelectedListener[15]);
            byte b3 = (byte) (b2 + 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            return thread == cls.getMethod((String) objArr2[0], null).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void setTextAlignment() {
        if (this.setX || !setIconTintList()) {
            setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation()) {
                MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
                return;
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0.setX();
                return;
            }
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void setY() {
        if (!this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setUnboundedRipple() && this.setTextAlignment.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX || !setIconTintList()) {
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = this.setY;
            if (setpasswordvisibilitytoggletintlist == null) {
                setTextAlignment();
                return;
            } else {
                setpasswordvisibilitytoggletintlist.setY(new setIndeterminateDrawableTiled() { // from class: o.setLiftableOverrideEnabled
                    @Override // o.setIndeterminateDrawableTiled
                    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                        setWindowCallback setwindowcallback = (setWindowCallback) obj;
                        return MaterialCheckBox$SavedState$1.this.setNavigationOnClickListener();
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final Cursor MenuHostHelper$$ExternalSyntheticLambda1(setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal) {
        if (this.setX || !setIconTintList()) {
            setY();
            return this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setY(setrecycledviewpool);
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
}