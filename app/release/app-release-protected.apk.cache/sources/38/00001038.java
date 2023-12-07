package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class setTextAppearance {
    private static final String[] setChipCornerRadius = {"UPDATE", "DELETE", "INSERT"};
    private Map<String, Set<String>> ViewPager$SavedState$1;
    final String[] setIconSize;
    volatile setTextSelectHandleRight setIconTintList;
    private final IconCompatParcelizer setTextAlignment;
    setIconTintList setUnboundedRipple;
    setKeyframes setX;
    final MaterialCheckBox$SavedState$1 setY;
    setPasswordVisibilityToggleTintList MenuHostHelper$$ExternalSyntheticLambda1 = null;
    AtomicBoolean setLayoutAnimation = new AtomicBoolean(false);
    volatile boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    final setCounterEnabled<setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1, setY> setOnLongClickListener = new setCounterEnabled<>();
    Runnable setNavigationOnClickListener = new Runnable() { // from class: o.setTextAppearance.4
        /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
            if (r11.setY.MenuHostHelper$$ExternalSyntheticLambda1 != null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
            if (r11.setY.MenuHostHelper$$ExternalSyntheticLambda1 != null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
            r11.setY.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
            if (r5 == null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
            if (r5.isEmpty() != false) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
            r0 = r11.setY.setOnLongClickListener;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
            r4 = r11.setY.setOnLongClickListener.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00e8, code lost:
            if (r4.hasNext() == false) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ea, code lost:
            r6 = r4.next().getValue();
            r7 = r6.MenuHostHelper$$ExternalSyntheticLambda1.length;
            r9 = null;
            r8 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
            if (r8 >= r7) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0109, code lost:
            if (r5.contains(java.lang.Integer.valueOf(r6.MenuHostHelper$$ExternalSyntheticLambda1[r8])) == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
            if (r7 != 1) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
            r9 = r6.MenuHostHelper$$ExternalSyntheticLambda0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0110, code lost:
            if (r9 != null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0112, code lost:
            r9 = new java.util.HashSet<>(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0117, code lost:
            r9.add(r6.setIconTintList[r8]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x011e, code lost:
            r8 = r8 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0121, code lost:
            if (r9 == null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0123, code lost:
            r6.setX.setY(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x012e, code lost:
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: all -> 0x00b0, SQLiteException | IllegalStateException -> 0x00b3, IllegalStateException -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:3:0x0010, B:19:0x0047, B:25:0x0062, B:31:0x0083, B:34:0x0097, B:54:0x00b8, B:42:0x00a8, B:43:0x00ab, B:6:0x001c, B:8:0x0020, B:9:0x0027, B:11:0x002b), top: B:89:0x0010 }] */
        /* JADX WARN: Type inference failed for: r5v10, types: [o.setImageResource] */
        /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTextAppearance.AnonymousClass4.run():void");
        }

        private Set<Integer> MenuHostHelper$$ExternalSyntheticLambda1() {
            HashSet hashSet = new HashSet();
            Cursor MenuHostHelper$$ExternalSyntheticLambda1 = setTextAppearance.this.setY.MenuHostHelper$$ExternalSyntheticLambda1(new FragmentManagerState$1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (MenuHostHelper$$ExternalSyntheticLambda1.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1.getInt(0)));
                } catch (Throwable th) {
                    MenuHostHelper$$ExternalSyntheticLambda1.close();
                    throw th;
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1.close();
            if (!hashSet.isEmpty()) {
                setTextAppearance.this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            return hashSet;
        }
    };
    final HashMap<String, Integer> setUiOptions = new HashMap<>();

    public setTextAppearance(MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.setY = materialCheckBox$SavedState$1;
        this.setUnboundedRipple = new setIconTintList(strArr.length);
        this.ViewPager$SavedState$1 = map2;
        this.setTextAlignment = new IconCompatParcelizer(materialCheckBox$SavedState$1);
        int length = strArr.length;
        this.setIconSize = new String[2];
        for (int i = 0; i < 2; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.setUiOptions.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.setIconSize[i] = str.toLowerCase(Locale.US);
            } else {
                this.setIconSize[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.setUiOptions.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.setUiOptions;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private void setY(setWindowCallback setwindowcallback, int i) {
        String[] strArr;
        String str = this.setIconSize[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : setChipCornerRadius) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            MenuHostHelper$$ExternalSyntheticLambda1(sb, str, str2);
            setwindowcallback.setY(sb.toString());
        }
    }

    private void setX(setWindowCallback setwindowcallback, int i) {
        String[] strArr;
        StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        setwindowcallback.setY(sb.toString());
        String str = this.setIconSize[i];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : setChipCornerRadius) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            MenuHostHelper$$ExternalSyntheticLambda1(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            setwindowcallback.setY(sb2.toString());
        }
    }

    public final void setX(setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1 settextappearance_menuhosthelper__externalsyntheticlambda1) {
        setY x;
        String[] strArr = settextappearance_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.ViewPager$SavedState$1.containsKey(lowerCase)) {
                hashSet.addAll(this.ViewPager$SavedState$1.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.setUiOptions.get(strArr2[i].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(strArr2[i]);
                throw new IllegalArgumentException(sb.toString());
            }
            iArr[i] = num.intValue();
        }
        setY sety = new setY(settextappearance_menuhosthelper__externalsyntheticlambda1, iArr, strArr2);
        synchronized (this.setOnLongClickListener) {
            x = this.setOnLongClickListener.setX(settextappearance_menuhosthelper__externalsyntheticlambda1, sety);
        }
        if (x == null && this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(iArr) && this.setY.setUiOptions()) {
            MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setWindowCallback setwindowcallback) {
        if (setwindowcallback.setUnboundedRipple()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.readLock();
                readLock.lock();
                try {
                    int[] x = this.setUnboundedRipple.setX();
                    if (x == null) {
                        return;
                    }
                    int length = x.length;
                    if (setwindowcallback.setLayoutAnimation()) {
                        setwindowcallback.setIconTintList();
                    } else {
                        setwindowcallback.setX();
                    }
                    for (int i = 0; i < length; i++) {
                        int i2 = x[i];
                        if (i2 == 1) {
                            setX(setwindowcallback, i);
                        } else if (i2 == 2) {
                            setY(setwindowcallback, i);
                        }
                    }
                    setwindowcallback.setOnLongClickListener();
                    setwindowcallback.MenuHostHelper$$ExternalSyntheticLambda1();
                    setIconTintList seticontintlist = this.setUnboundedRipple;
                    synchronized (seticontintlist) {
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    static class setY {
        final Set<String> MenuHostHelper$$ExternalSyntheticLambda0;
        final int[] MenuHostHelper$$ExternalSyntheticLambda1;
        final String[] setIconTintList;
        final setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1 setX;

        setY(setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1 settextappearance_menuhosthelper__externalsyntheticlambda1, int[] iArr, String[] strArr) {
            this.setX = settextappearance_menuhosthelper__externalsyntheticlambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            this.setIconTintList = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        final int[] MenuHostHelper$$ExternalSyntheticLambda0;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final boolean[] setIconTintList;
        final long[] setX;
        boolean setY;

        setIconTintList(int i) {
            long[] jArr = new long[i];
            this.setX = jArr;
            boolean[] zArr = new boolean[i];
            this.setIconTintList = zArr;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        final boolean MenuHostHelper$$ExternalSyntheticLambda1(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.setX;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.setY = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean setIconTintList(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.setX;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.setY = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        final int[] setX() {
            synchronized (this) {
                if (this.setY && !this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    int length = this.setX.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            boolean z = this.setX[i] > 0;
                            boolean[] zArr = this.setIconTintList;
                            if (z != zArr[i]) {
                                this.MenuHostHelper$$ExternalSyntheticLambda0[i] = z ? 1 : 2;
                            } else {
                                this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        } else {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                            this.setY = false;
                            return this.MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                    }
                }
                return null;
            }
        }
    }
}