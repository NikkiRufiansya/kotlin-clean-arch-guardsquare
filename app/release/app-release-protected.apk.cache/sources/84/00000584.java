package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class hP implements Closeable {
    private static final char[] setX = ")]}'\n".toCharArray();
    private final Reader MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private String setCenterIfNoTextEnabled;
    private long setChipCornerRadius;
    private int[] setTextAlignment;
    private String[] setUiOptions;
    private int[] setUnboundedRipple;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    private final char[] setIconTintList = new char[1024];
    private int setIconSize = 0;
    private int setOnLongClickListener = 0;
    private int setNavigationOnClickListener = 0;
    private int setLayoutAnimation = 0;
    int setY = 0;
    private int setZ = 1;

    static {
        AbstractC0219hr.setIconTintList = new AbstractC0219hr() { // from class: o.hP.2
            @Override // o.AbstractC0219hr
            public final void setIconTintList(hP hPVar) {
                if (hPVar instanceof C0227hz) {
                    C0227hz c0227hz = (C0227hz) hPVar;
                    c0227hz.setY(hO.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) c0227hz.setIconTintList[c0227hz.MenuHostHelper$$ExternalSyntheticLambda1 - 1]).next();
                    c0227hz.setIconTintList(entry.getValue());
                    c0227hz.setIconTintList(new C0202ha((String) entry.getKey()));
                    return;
                }
                int i = hPVar.setY;
                if (i == 0) {
                    i = hPVar.setOnNavigationItemSelectedListener();
                }
                if (i == 13) {
                    hPVar.setY = 9;
                } else if (i == 12) {
                    hPVar.setY = 8;
                } else if (i == 14) {
                    hPVar.setY = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(hPVar.setCenterIfNoTextEnabled());
                    sb.append(hPVar.setTextScaleX());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    public hP(Reader reader) {
        int[] iArr = new int[32];
        this.setTextAlignment = iArr;
        iArr[0] = 6;
        this.setUiOptions = new String[32];
        this.setUnboundedRipple = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = reader;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 3) {
            setY(1);
            this.setUnboundedRipple[this.setZ - 1] = 0;
            this.setY = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append(setTextScaleX());
        throw new IllegalStateException(sb.toString());
    }

    public void setY() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 4) {
            int i2 = this.setZ - 1;
            this.setZ = i2;
            int[] iArr = this.setUnboundedRipple;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.setY = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append(setTextScaleX());
        throw new IllegalStateException(sb.toString());
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 1) {
            setY(3);
            this.setY = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append(setTextScaleX());
        throw new IllegalStateException(sb.toString());
    }

    public void setX() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 2) {
            int i2 = this.setZ - 1;
            this.setZ = i2;
            this.setUiOptions[i2] = null;
            int[] iArr = this.setUnboundedRipple;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.setY = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append(setTextScaleX());
        throw new IllegalStateException(sb.toString());
    }

    public boolean setUiOptions() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public hO setCenterIfNoTextEnabled() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        switch (i) {
            case 1:
                return hO.BEGIN_OBJECT;
            case 2:
                return hO.END_OBJECT;
            case 3:
                return hO.BEGIN_ARRAY;
            case 4:
                return hO.END_ARRAY;
            case 5:
            case 6:
                return hO.BOOLEAN;
            case 7:
                return hO.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return hO.STRING;
            case 12:
            case 13:
            case 14:
                return hO.NAME;
            case 15:
            case 16:
                return hO.NUMBER;
            case 17:
                return hO.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    final int setOnNavigationItemSelectedListener() {
        int x;
        int[] iArr = this.setTextAlignment;
        int i = this.setZ - 1;
        int i2 = iArr[i];
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int x2 = setX(true);
            if (x2 != 44) {
                if (x2 != 59) {
                    if (x2 == 93) {
                        this.setY = 4;
                        return 4;
                    }
                    throw setY("Unterminated array");
                } else if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i] = 4;
            if (i2 == 5 && (x = setX(true)) != 44) {
                if (x != 59) {
                    if (x == 125) {
                        this.setY = 2;
                        return 2;
                    }
                    throw setY("Unterminated object");
                } else if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
            int x3 = setX(true);
            if (x3 == 34) {
                this.setY = 13;
                return 13;
            } else if (x3 == 39) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    this.setY = 12;
                    return 12;
                }
                throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (x3 == 125) {
                if (i2 != 5) {
                    this.setY = 2;
                    return 2;
                }
                throw setY("Expected name");
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setIconSize--;
                if (setY((char) x3)) {
                    this.setY = 14;
                    return 14;
                }
                throw setY("Expected name");
            } else {
                throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (i2 == 4) {
            iArr[i] = 5;
            int x4 = setX(true);
            if (x4 != 58) {
                if (x4 != 61) {
                    throw setY("Expected ':'");
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    if (this.setIconSize < this.setOnLongClickListener || MenuHostHelper$$ExternalSyntheticLambda1(1)) {
                        char[] cArr = this.setIconTintList;
                        int i3 = this.setIconSize;
                        if (cArr[i3] == '>') {
                            this.setIconSize = i3 + 1;
                        }
                    }
                } else {
                    throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
        } else if (i2 == 6) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                setAnimationFromJson();
            }
            this.setTextAlignment[this.setZ - 1] = 7;
        } else if (i2 == 7) {
            if (setX(false) == -1) {
                this.setY = 17;
                return 17;
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setIconSize--;
            } else {
                throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int x5 = setX(true);
        if (x5 == 34) {
            this.setY = 9;
            return 9;
        } else if (x5 == 39) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setY = 8;
                return 8;
            }
            throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else {
            if (x5 != 44 && x5 != 59) {
                if (x5 == 91) {
                    this.setY = 3;
                    return 3;
                } else if (x5 != 93) {
                    if (x5 == 123) {
                        this.setY = 1;
                        return 1;
                    }
                    this.setIconSize--;
                    int maxEms = setMaxEms();
                    if (maxEms != 0) {
                        return maxEms;
                    }
                    int textAppearanceResource = setTextAppearanceResource();
                    if (textAppearanceResource != 0) {
                        return textAppearanceResource;
                    }
                    if (!setY(this.setIconTintList[this.setIconSize])) {
                        throw setY("Expected value");
                    }
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        this.setY = 10;
                        return 10;
                    }
                    throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                } else if (i2 == 1) {
                    this.setY = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw setY("Unexpected value");
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setIconSize--;
                this.setY = 7;
                return 7;
            }
            throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int setMaxEms() {
        int i;
        String str;
        String str2;
        char c = this.setIconTintList[this.setIconSize];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.setIconSize + i2 >= this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(i2 + 1)) {
                return 0;
            }
            char c2 = this.setIconTintList[this.setIconSize + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.setIconSize + length < this.setOnLongClickListener || MenuHostHelper$$ExternalSyntheticLambda1(length + 1)) && setY(this.setIconTintList[this.setIconSize + length])) {
            return 0;
        }
        this.setIconSize += length;
        this.setY = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        if (setY(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0099, code lost:
        if (r12 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (r11 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
        if (r12 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
        if (r11 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
        if (r11 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
        r18.setChipCornerRadius = r12;
        r18.setIconSize += r8;
        r18.setY = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b4, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b7, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ba, code lost:
        if (r9 == 7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00be, code lost:
        r18.ViewPager$SavedState$1 = r8;
        r18.setY = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int setTextAppearanceResource() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hP.setTextAppearanceResource():int");
    }

    public String setTextAlignment() {
        String x;
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 14) {
            x = setZ();
        } else if (i == 12) {
            x = setX('\'');
        } else if (i == 13) {
            x = setX('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(setCenterIfNoTextEnabled());
            sb.append(setTextScaleX());
            throw new IllegalStateException(sb.toString());
        }
        this.setY = 0;
        this.setUiOptions[this.setZ - 1] = x;
        return x;
    }

    public String setIconSize() {
        String str;
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 10) {
            str = setZ();
        } else if (i == 8) {
            str = setX('\'');
        } else if (i == 9) {
            str = setX('\"');
        } else if (i == 11) {
            str = this.setCenterIfNoTextEnabled;
            this.setCenterIfNoTextEnabled = null;
        } else if (i == 15) {
            str = Long.toString(this.setChipCornerRadius);
        } else if (i == 16) {
            str = new String(this.setIconTintList, this.setIconSize, this.ViewPager$SavedState$1);
            this.setIconSize += this.ViewPager$SavedState$1;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(setCenterIfNoTextEnabled());
            sb.append(setTextScaleX());
            throw new IllegalStateException(sb.toString());
        }
        this.setY = 0;
        int[] iArr = this.setUnboundedRipple;
        int i2 = this.setZ - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean setUnboundedRipple() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 5) {
            this.setY = 0;
            int[] iArr = this.setUnboundedRipple;
            int i2 = this.setZ - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.setY = 0;
            int[] iArr2 = this.setUnboundedRipple;
            int i3 = this.setZ - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(setCenterIfNoTextEnabled());
            sb.append(setTextScaleX());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void ViewPager$SavedState$1() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 7) {
            this.setY = 0;
            int[] iArr = this.setUnboundedRipple;
            int i2 = this.setZ - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append(setTextScaleX());
        throw new IllegalStateException(sb.toString());
    }

    public double setNavigationOnClickListener() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 15) {
            this.setY = 0;
            int[] iArr = this.setUnboundedRipple;
            int i2 = this.setZ - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.setChipCornerRadius;
        }
        if (i == 16) {
            this.setCenterIfNoTextEnabled = new String(this.setIconTintList, this.setIconSize, this.ViewPager$SavedState$1);
            this.setIconSize += this.ViewPager$SavedState$1;
        } else if (i == 8 || i == 9) {
            this.setCenterIfNoTextEnabled = setX(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.setCenterIfNoTextEnabled = setZ();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(setCenterIfNoTextEnabled());
            sb.append(setTextScaleX());
            throw new IllegalStateException(sb.toString());
        }
        this.setY = 11;
        double parseDouble = Double.parseDouble(this.setCenterIfNoTextEnabled);
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(setTextScaleX());
            throw new hW(sb2.toString());
        }
        this.setCenterIfNoTextEnabled = null;
        this.setY = 0;
        int[] iArr2 = this.setUnboundedRipple;
        int i3 = this.setZ - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long setOnLongClickListener() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 15) {
            this.setY = 0;
            int[] iArr = this.setUnboundedRipple;
            int i2 = this.setZ - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.setChipCornerRadius;
        }
        if (i == 16) {
            this.setCenterIfNoTextEnabled = new String(this.setIconTintList, this.setIconSize, this.ViewPager$SavedState$1);
            this.setIconSize += this.ViewPager$SavedState$1;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.setCenterIfNoTextEnabled = setZ();
            } else {
                this.setCenterIfNoTextEnabled = setX(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.setCenterIfNoTextEnabled);
                this.setY = 0;
                int[] iArr2 = this.setUnboundedRipple;
                int i3 = this.setZ - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(setCenterIfNoTextEnabled());
            sb.append(setTextScaleX());
            throw new IllegalStateException(sb.toString());
        }
        this.setY = 11;
        double parseDouble = Double.parseDouble(this.setCenterIfNoTextEnabled);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            StringBuilder sb2 = new StringBuilder("Expected a long but was ");
            sb2.append(this.setCenterIfNoTextEnabled);
            sb2.append(setTextScaleX());
            throw new NumberFormatException(sb2.toString());
        }
        this.setCenterIfNoTextEnabled = null;
        this.setY = 0;
        int[] iArr3 = this.setUnboundedRipple;
        int i4 = this.setZ - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) << 1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r1.append(r0, r2, r4 - r2);
        r9.setIconSize = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String setX(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.setIconTintList
            r1 = 0
        L3:
            int r2 = r9.setIconSize
            int r3 = r9.setOnLongClickListener
        L7:
            r4 = r2
        L8:
            r5 = 16
            r6 = 1
            if (r4 >= r3) goto L59
            int r7 = r4 + 1
            char r4 = r0[r4]
            if (r4 != r10) goto L27
            r9.setIconSize = r7
            int r7 = r7 - r2
            int r7 = r7 - r6
            if (r1 != 0) goto L1f
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r2, r7)
            return r10
        L1f:
            r1.append(r0, r2, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L27:
            r8 = 92
            if (r4 != r8) goto L4c
            r9.setIconSize = r7
            int r7 = r7 - r2
            int r7 = r7 - r6
            if (r1 != 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r7 + 1
            int r3 = r3 << r6
            int r3 = java.lang.Math.max(r3, r5)
            r1.<init>(r3)
        L3d:
            r1.append(r0, r2, r7)
            char r2 = r9.setCheckedIconEnabled()
            r1.append(r2)
            int r2 = r9.setIconSize
            int r3 = r9.setOnLongClickListener
            goto L7
        L4c:
            r5 = 10
            if (r4 != r5) goto L57
            int r4 = r9.setNavigationOnClickListener
            int r4 = r4 + r6
            r9.setNavigationOnClickListener = r4
            r9.setLayoutAnimation = r7
        L57:
            r4 = r7
            goto L8
        L59:
            if (r1 != 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r4 - r2
            int r3 = r3 << r6
            int r3 = java.lang.Math.max(r3, r5)
            r1.<init>(r3)
        L67:
            int r3 = r4 - r2
            r1.append(r0, r2, r3)
            r9.setIconSize = r4
            boolean r2 = r9.MenuHostHelper$$ExternalSyntheticLambda1(r6)
            if (r2 == 0) goto L75
            goto L3
        L75:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.setY(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hP.setX(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
        if (r5.MenuHostHelper$$ExternalSyntheticLambda0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String setZ() {
        /*
            r5 = this;
            r0 = 0
        L1:
            r1 = 0
            r2 = 0
        L3:
            int r3 = r5.setIconSize
            int r3 = r3 + r2
            int r4 = r5.setOnLongClickListener
            if (r3 >= r4) goto L54
            char[] r4 = r5.setIconTintList
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L61
            r4 = 10
            if (r3 == r4) goto L61
            r4 = 12
            if (r3 == r4) goto L61
            r4 = 13
            if (r3 == r4) goto L61
            r4 = 32
            if (r3 == r4) goto L61
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L61
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L61
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L61
            r4 = 58
            if (r3 == r4) goto L61
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L61;
                case 92: goto L48;
                case 93: goto L61;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            boolean r1 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            if (r1 == 0) goto L4d
            goto L61
        L4d:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r5.setY(r0)
            throw r0
        L54:
            char[] r3 = r5.setIconTintList
            int r3 = r3.length
            if (r2 >= r3) goto L63
            int r3 = r2 + 1
            boolean r3 = r5.MenuHostHelper$$ExternalSyntheticLambda1(r3)
            if (r3 != 0) goto L3
        L61:
            r1 = r2
            goto L83
        L63:
            if (r0 != 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L70:
            char[] r3 = r5.setIconTintList
            int r4 = r5.setIconSize
            r0.append(r3, r4, r2)
            int r3 = r5.setIconSize
            int r3 = r3 + r2
            r5.setIconSize = r3
            r2 = 1
            boolean r2 = r5.MenuHostHelper$$ExternalSyntheticLambda1(r2)
            if (r2 != 0) goto L1
        L83:
            if (r0 != 0) goto L8f
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.setIconTintList
            int r3 = r5.setIconSize
            r0.<init>(r2, r3, r1)
            goto L9a
        L8f:
            char[] r2 = r5.setIconTintList
            int r3 = r5.setIconSize
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L9a:
            int r2 = r5.setIconSize
            int r2 = r2 + r1
            r5.setIconSize = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hP.setZ():java.lang.String");
    }

    private void setIconTintList(char c) {
        char[] cArr = this.setIconTintList;
        while (true) {
            int i = this.setIconSize;
            int i2 = this.setOnLongClickListener;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.setIconSize = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.setIconSize = i3;
                        setCheckedIconEnabled();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.setNavigationOnClickListener++;
                            this.setLayoutAnimation = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.setIconSize = i;
                    if (!MenuHostHelper$$ExternalSyntheticLambda1(1)) {
                        throw setY("Unterminated string");
                    }
                }
            }
        }
    }

    public int setLayoutAnimation() {
        int i = this.setY;
        if (i == 0) {
            i = setOnNavigationItemSelectedListener();
        }
        if (i == 15) {
            long j = this.setChipCornerRadius;
            int i2 = (int) j;
            if (j != i2) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(this.setChipCornerRadius);
                sb.append(setTextScaleX());
                throw new NumberFormatException(sb.toString());
            }
            this.setY = 0;
            int[] iArr = this.setUnboundedRipple;
            int i3 = this.setZ - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.setCenterIfNoTextEnabled = new String(this.setIconTintList, this.setIconSize, this.ViewPager$SavedState$1);
            this.setIconSize += this.ViewPager$SavedState$1;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.setCenterIfNoTextEnabled = setZ();
            } else {
                this.setCenterIfNoTextEnabled = setX(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.setCenterIfNoTextEnabled);
                this.setY = 0;
                int[] iArr2 = this.setUnboundedRipple;
                int i4 = this.setZ - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(setCenterIfNoTextEnabled());
            sb2.append(setTextScaleX());
            throw new IllegalStateException(sb2.toString());
        }
        this.setY = 11;
        double parseDouble = Double.parseDouble(this.setCenterIfNoTextEnabled);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(this.setCenterIfNoTextEnabled);
            sb3.append(setTextScaleX());
            throw new NumberFormatException(sb3.toString());
        }
        this.setCenterIfNoTextEnabled = null;
        this.setY = 0;
        int[] iArr3 = this.setUnboundedRipple;
        int i6 = this.setZ - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.setY = 0;
        this.setTextAlignment[0] = 8;
        this.setZ = 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:
        if (r10.MenuHostHelper$$ExternalSyntheticLambda0 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00aa, code lost:
        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChipCornerRadius() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hP.setChipCornerRadius():void");
    }

    private void setY(int i) {
        int i2 = this.setZ;
        int[] iArr = this.setTextAlignment;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.setUnboundedRipple, 0, iArr3, 0, this.setZ);
            System.arraycopy(this.setUiOptions, 0, strArr, 0, this.setZ);
            this.setTextAlignment = iArr2;
            this.setUnboundedRipple = iArr3;
            this.setUiOptions = strArr;
        }
        int[] iArr4 = this.setTextAlignment;
        int i4 = this.setZ;
        this.setZ = i4 + 1;
        iArr4[i4] = i;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int i2;
        int i3;
        char[] cArr = this.setIconTintList;
        int i4 = this.setLayoutAnimation;
        int i5 = this.setIconSize;
        this.setLayoutAnimation = i4 - i5;
        int i6 = this.setOnLongClickListener;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.setOnLongClickListener = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.setOnLongClickListener = 0;
        }
        this.setIconSize = 0;
        do {
            Reader reader = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i8 = this.setOnLongClickListener;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.setOnLongClickListener + read;
            this.setOnLongClickListener = i2;
            if (this.setNavigationOnClickListener == 0 && (i3 = this.setLayoutAnimation) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.setIconSize++;
                this.setLayoutAnimation = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private int setX(boolean z) {
        char[] cArr = this.setIconTintList;
        int i = this.setIconSize;
        int i2 = this.setOnLongClickListener;
        while (true) {
            if (i == i2) {
                this.setIconSize = i;
                if (!MenuHostHelper$$ExternalSyntheticLambda1(1)) {
                    if (z) {
                        StringBuilder sb = new StringBuilder("End of input");
                        sb.append(setTextScaleX());
                        throw new EOFException(sb.toString());
                    }
                    return -1;
                }
                i = this.setIconSize;
                i2 = this.setOnLongClickListener;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.setNavigationOnClickListener++;
                this.setLayoutAnimation = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.setIconSize = i3;
                    if (i3 == i2) {
                        this.setIconSize = i3 - 1;
                        boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(2);
                        this.setIconSize++;
                        if (!MenuHostHelper$$ExternalSyntheticLambda1) {
                            return c;
                        }
                    }
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        int i4 = this.setIconSize;
                        char c2 = cArr[i4];
                        if (c2 == '*') {
                            this.setIconSize = i4 + 1;
                            if (!setX("*/")) {
                                throw setY("Unterminated comment");
                            }
                            i = this.setIconSize + 2;
                            i2 = this.setOnLongClickListener;
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.setIconSize = i4 + 1;
                            setLayoutDirection();
                            i = this.setIconSize;
                            i2 = this.setOnLongClickListener;
                        }
                    } else {
                        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                } else if (c == '#') {
                    this.setIconSize = i3;
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        setLayoutDirection();
                        i = this.setIconSize;
                        i2 = this.setOnLongClickListener;
                    } else {
                        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                } else {
                    this.setIconSize = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void setLayoutDirection() {
        char c;
        do {
            if (this.setIconSize >= this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(1)) {
                return;
            }
            char[] cArr = this.setIconTintList;
            int i = this.setIconSize;
            int i2 = i + 1;
            this.setIconSize = i2;
            c = cArr[i];
            if (c == '\n') {
                this.setNavigationOnClickListener++;
                this.setLayoutAnimation = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean setX(String str) {
        int length = str.length();
        while (true) {
            if (this.setIconSize + length > this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(length)) {
                return false;
            }
            char[] cArr = this.setIconTintList;
            int i = this.setIconSize;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.setIconTintList[this.setIconSize + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.setNavigationOnClickListener++;
            this.setLayoutAnimation = i + 1;
            this.setIconSize++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(setTextScaleX());
        return sb.toString();
    }

    final String setTextScaleX() {
        int i = this.setNavigationOnClickListener;
        int i2 = this.setIconSize;
        int i3 = this.setLayoutAnimation;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(setIconTintList());
        return sb.toString();
    }

    public String setIconTintList() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.setZ;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.setTextAlignment[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.setUnboundedRipple[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.setUiOptions[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    private char setCheckedIconEnabled() {
        int i;
        int i2;
        if (this.setIconSize == this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(1)) {
            throw setY("Unterminated escape sequence");
        }
        char[] cArr = this.setIconTintList;
        int i3 = this.setIconSize;
        int i4 = i3 + 1;
        this.setIconSize = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.setNavigationOnClickListener++;
            this.setLayoutAnimation = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(4)) {
                                        throw setY("Unterminated escape sequence");
                                    }
                                    int i5 = this.setIconSize;
                                    char c2 = 0;
                                    for (int i6 = i5; i6 < i5 + 4; i6++) {
                                        char c3 = this.setIconTintList[i6];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                throw new NumberFormatException("\\u".concat(new String(this.setIconTintList, this.setIconSize, 4)));
                                            } else {
                                                i = c3 - 'A';
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = c3 - '0';
                                        }
                                        c2 = (char) (c4 + i2);
                                    }
                                    this.setIconSize += 4;
                                    return c2;
                                }
                                throw setY("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    private IOException setY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(setTextScaleX());
        throw new hW(sb.toString());
    }

    private void setAnimationFromJson() {
        setX(true);
        int i = this.setIconSize - 1;
        this.setIconSize = i;
        char[] cArr = setX;
        if (i + cArr.length > this.setOnLongClickListener && !MenuHostHelper$$ExternalSyntheticLambda1(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = setX;
            if (i2 < cArr2.length) {
                if (this.setIconTintList[this.setIconSize + i2] != cArr2[i2]) {
                    return;
                }
                i2++;
            } else {
                this.setIconSize += cArr2.length;
                return;
            }
        }
    }

    private boolean setY(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return false;
        }
        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}