package o;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.hz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227hz extends hP {
    private static int[] setLayoutAnimation;
    private static final Object setUiOptions;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    public Object[] setIconTintList;
    private String[] setNavigationOnClickListener;
    private int[] setOnLongClickListener;
    public static final byte[] $$g = {116, 39, -17, 64};
    public static final int $$h = 163;
    public static final byte[] $$d = {104, -68, 0, 44, -13, 16, -42, 27, 13, 0, -25, 22, 6, 7, -39, 30, 11, 2, -64, 63, -40};
    public static final int $$e = 222;
    public static final byte[] $$a = {10, Byte.MIN_VALUE, 49, 76, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 181;
    private static byte[] setUnboundedRipple = {122, 55, -29, -99, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setX = 204;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = 115 - r8
            int r7 = r7 * 36
            int r7 = 40 - r7
            byte[] r0 = o.C0227hz.$$a
            int r6 = r6 * 3
            int r6 = 7 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = 0
            r3 = r6
            goto L28
        L16:
            r3 = 0
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-13)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0227hz.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0227hz.setUnboundedRipple
            int r7 = 106 - r7
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 16 - r8
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r8 = r8 - r6
            int r6 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0227hz.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 111
            int r7 = r7 * 14
            int r7 = r7 + 4
            int r8 = r8 * 11
            int r8 = 15 - r8
            byte[] r0 = o.C0227hz.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = 0
            r3 = r7
            r9 = r8
            goto L2c
        L17:
            r3 = 0
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0227hz.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 2
            int r9 = r9 + 70
            byte[] r0 = o.C0227hz.$$g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L1a:
            r3 = 0
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r8 = -r8
            int r8 = r8 + r10
            int r9 = r9 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0227hz.e(int, int, short, java.lang.Object[]):void");
    }

    static void setMaxEms() {
        setLayoutAnimation = new int[]{1650524253, 1511200612, 1237252981, 1922561112, 1984580490, 307808195, -991948431, 98715669, -95795969, -1590949507, 699433934, 1814129910, 456086476, 943709036, -806416774, 2097064082, -1304540039, -1961405503};
    }

    static {
        setMaxEms();
        new Reader() { // from class: o.hz.1
            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) {
                throw new AssertionError();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw new AssertionError();
            }
        };
        setUiOptions = new Object();
    }

    @Override // o.hP
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setY(hO.BEGIN_ARRAY);
        setIconTintList(((gX) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).iterator());
        this.setOnLongClickListener[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1] = 0;
    }

    @Override // o.hP
    public final void setY() {
        setY(hO.END_ARRAY);
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = i - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        Object obj2 = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // o.hP
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        setY(hO.BEGIN_OBJECT);
        setIconTintList(((gZ) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).setIconTintList.entrySet().iterator());
    }

    @Override // o.hP
    public final void setX() {
        setY(hO.END_OBJECT);
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = i - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        Object obj2 = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // o.hP
    public final boolean setUiOptions() {
        hO centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        return (centerIfNoTextEnabled == hO.END_OBJECT || centerIfNoTextEnabled == hO.END_ARRAY) ? false : true;
    }

    @Override // o.hP
    public final hO setCenterIfNoTextEnabled() {
        while (true) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == 0) {
                return hO.END_DOCUMENT;
            }
            Object[] objArr = this.setIconTintList;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                boolean z = objArr[i - 2] instanceof gZ;
                Iterator it = (Iterator) obj;
                if (!it.hasNext()) {
                    return z ? hO.END_OBJECT : hO.END_ARRAY;
                } else if (z) {
                    return hO.NAME;
                } else {
                    setIconTintList(it.next());
                }
            } else if (obj instanceof gZ) {
                return hO.BEGIN_OBJECT;
            } else {
                if (obj instanceof gX) {
                    return hO.BEGIN_ARRAY;
                }
                if (obj instanceof C0202ha) {
                    C0202ha c0202ha = (C0202ha) obj;
                    if (c0202ha.MenuHostHelper$$ExternalSyntheticLambda0 instanceof String) {
                        return hO.STRING;
                    }
                    if (c0202ha.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Boolean) {
                        return hO.BOOLEAN;
                    }
                    if (c0202ha.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number) {
                        return hO.NUMBER;
                    }
                    throw new AssertionError();
                } else if (obj instanceof gW) {
                    return hO.NULL;
                } else {
                    if (obj == setUiOptions) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
    }

    public final void setY(hO hOVar) {
        if (setCenterIfNoTextEnabled() == hOVar) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(hOVar);
        sb.append(" but was ");
        sb.append(setCenterIfNoTextEnabled());
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(setIconTintList());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.hP
    public final String setTextAlignment() {
        setY(hO.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).next();
        String str = (String) entry.getKey();
        this.setNavigationOnClickListener[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1] = str;
        setIconTintList(entry.getValue());
        return str;
    }

    @Override // o.hP
    public final String setIconSize() {
        hO centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (centerIfNoTextEnabled != hO.STRING && centerIfNoTextEnabled != hO.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(hO.STRING);
            sb.append(" but was ");
            sb.append(centerIfNoTextEnabled);
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(setIconTintList());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        String onLongClickListener = ((C0202ha) obj).setOnLongClickListener();
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return onLongClickListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03f9  */
    @Override // o.hP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setUnboundedRipple() {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0227hz.setUnboundedRipple():boolean");
    }

    @Override // o.hP
    public final void ViewPager$SavedState$1() {
        setY(hO.NULL);
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // o.hP
    public final double setNavigationOnClickListener() {
        hO centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (centerIfNoTextEnabled != hO.NUMBER && centerIfNoTextEnabled != hO.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(hO.NUMBER);
            sb.append(" but was ");
            sb.append(centerIfNoTextEnabled);
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(setIconTintList());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
        double y = ((C0202ha) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).setY();
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0 && (Double.isNaN(y) || Double.isInfinite(y))) {
            StringBuilder sb3 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb3.append(y);
            throw new NumberFormatException(sb3.toString());
        }
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return y;
    }

    @Override // o.hP
    public final long setOnLongClickListener() {
        hO centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (centerIfNoTextEnabled != hO.NUMBER && centerIfNoTextEnabled != hO.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(hO.NUMBER);
            sb.append(" but was ");
            sb.append(centerIfNoTextEnabled);
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(setIconTintList());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
        long MenuHostHelper$$ExternalSyntheticLambda1 = ((C0202ha) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).MenuHostHelper$$ExternalSyntheticLambda1();
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.hP
    public final int setLayoutAnimation() {
        hO centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (centerIfNoTextEnabled != hO.NUMBER && centerIfNoTextEnabled != hO.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(hO.NUMBER);
            sb.append(" but was ");
            sb.append(centerIfNoTextEnabled);
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(setIconTintList());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
        int x = ((C0202ha) this.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).setX();
        Object[] objArr = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return x;
    }

    @Override // o.hP, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setIconTintList = new Object[]{setUiOptions};
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    }

    @Override // o.hP
    public final void setChipCornerRadius() {
        if (setCenterIfNoTextEnabled() == hO.NAME) {
            setTextAlignment();
            this.setNavigationOnClickListener[this.MenuHostHelper$$ExternalSyntheticLambda1 - 2] = "null";
        } else {
            Object[] objArr = this.setIconTintList;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            Object obj = objArr[i];
            objArr[i] = null;
            if (i > 0) {
                this.setNavigationOnClickListener[i - 1] = "null";
            }
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 > 0) {
            int[] iArr = this.setOnLongClickListener;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // o.hP
    public final String toString() {
        return getClass().getSimpleName();
    }

    public final void setIconTintList(Object obj) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        Object[] objArr = this.setIconTintList;
        if (i == objArr.length) {
            int i2 = i << 1;
            Object[] objArr2 = new Object[i2];
            int[] iArr = new int[i2];
            String[] strArr = new String[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.setOnLongClickListener, 0, iArr, 0, this.MenuHostHelper$$ExternalSyntheticLambda1);
            System.arraycopy(this.setNavigationOnClickListener, 0, strArr, 0, this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setIconTintList = objArr2;
            this.setOnLongClickListener = iArr;
            this.setNavigationOnClickListener = strArr;
        }
        Object[] objArr3 = this.setIconTintList;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3 + 1;
        objArr3[i3] = obj;
    }

    @Override // o.hP
    public final String setIconTintList() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            Object[] objArr = this.setIconTintList;
            Object obj = objArr[i];
            if (obj instanceof gX) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.setOnLongClickListener[i]);
                    sb.append(']');
                }
            } else if (obj instanceof gZ) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.setNavigationOnClickListener[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private static void b(int i, int[] iArr, Object[] objArr) {
        String str;
        int[] iArr2;
        String str2;
        int i2;
        jy jyVar = new jy();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = setLayoutAnimation;
        int i3 = 59782;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object obj = jC.setTextScaleX.get(-878021517);
                    if (obj == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 | 26), objArr3);
                        obj = ((Class) jC.setY(Color.green(i5) + 240, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + i3), (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj);
                    }
                    iArr4[i6] = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 59782;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = setLayoutAnimation;
        String str3 = "";
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                try {
                    Object[] objArr4 = new Object[i4];
                    objArr4[0] = Integer.valueOf(iArr6[i7]);
                    Object obj2 = jC.setTextScaleX.get(-878021517);
                    if (obj2 != null) {
                        iArr2 = iArr6;
                        str2 = str3;
                        i2 = length3;
                    } else {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        iArr2 = iArr6;
                        str2 = str3;
                        i2 = length3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 | 26), objArr5);
                        obj2 = ((Class) jC.setY(239 - TextUtils.lastIndexOf(str3, '0', 0), (char) (59782 - View.resolveSizeAndState(0, 0, 0)), 3 - MotionEvent.axisFromString(str3))).getMethod((String) objArr5[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj2);
                    }
                    iArr7[i7] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    i7++;
                    iArr6 = iArr2;
                    length3 = i2;
                    str3 = str2;
                    i4 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            str = str3;
            iArr6 = iArr7;
        } else {
            str = "";
        }
        char c = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        jyVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jyVar.MenuHostHelper$$ExternalSyntheticLambda0 < iArr.length) {
            cArr[c] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0] >> 16);
            cArr[1] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0];
            cArr[2] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] >> 16);
            cArr[3] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = (cArr[0] << 16) + cArr[1];
            jyVar.setY = (cArr[2] << 16) + cArr[3];
            jy.setY(iArr5);
            for (int i8 = 0; i8 < 16; i8++) {
                jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[i8];
                try {
                    Object[] objArr6 = {jyVar, Integer.valueOf(jy.setIconTintList(jyVar.MenuHostHelper$$ExternalSyntheticLambda1)), jyVar, jyVar};
                    Object obj3 = jC.setTextScaleX.get(-1199281727);
                    if (obj3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        Object[] objArr7 = new Object[1];
                        e(b5, b6, (byte) (b6 + 1), objArr7);
                        obj3 = ((Class) jC.setY((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 324, (char) (61128 - ExpandableListView.getPackedPositionChild(0L)), 4 - (Process.myPid() >> 22))).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        jC.setTextScaleX.put(-1199281727, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
                    jyVar.setY = intValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i9 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
            jyVar.setY = i9;
            jyVar.setY ^= iArr5[16];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[17];
            int i10 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            int i11 = jyVar.setY;
            cArr[0] = (char) (jyVar.MenuHostHelper$$ExternalSyntheticLambda1 >>> 16);
            cArr[1] = (char) jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            cArr[2] = (char) (jyVar.setY >>> 16);
            cArr[3] = (char) jyVar.setY;
            jy.setY(iArr5);
            cArr2[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2] = cArr[0];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 1] = cArr[1];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 2] = cArr[2];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 3] = cArr[3];
            try {
                Object[] objArr8 = {jyVar, jyVar};
                Object obj4 = jC.setTextScaleX.get(1491664993);
                if (obj4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    e(b7, b8, b8, objArr9);
                    obj4 = ((Class) jC.setY(261 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 17133), 3 - Process.getGidForName(str))).getMethod((String) objArr9[0], Object.class, Object.class);
                    jC.setTextScaleX.put(1491664993, obj4);
                }
                ((Method) obj4).invoke(null, objArr8);
                c = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}