package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class hR implements Closeable, Flushable {
    private static final String[] MenuHostHelper$$ExternalSyntheticLambda1 = new String[128];
    private static final String[] setIconTintList;
    public String MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean setLayoutAnimation;
    public String setOnLongClickListener;
    private String setUiOptions;
    private final Writer setUnboundedRipple;
    public boolean setX;
    public boolean setY;
    private int[] setNavigationOnClickListener = new int[32];
    private int setChipCornerRadius = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            MenuHostHelper$$ExternalSyntheticLambda1[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = MenuHostHelper$$ExternalSyntheticLambda1;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        setIconTintList = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public hR(Writer writer) {
        setIconTintList(6);
        this.setOnLongClickListener = ":";
        this.setLayoutAnimation = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.setUnboundedRipple = writer;
    }

    public hR MenuHostHelper$$ExternalSyntheticLambda0() {
        setUnboundedRipple();
        setLayoutAnimation();
        setIconTintList(1);
        this.setUnboundedRipple.write("[");
        return this;
    }

    public hR setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda0(1, 2, "]");
    }

    public hR MenuHostHelper$$ExternalSyntheticLambda1() {
        setUnboundedRipple();
        setLayoutAnimation();
        setIconTintList(3);
        this.setUnboundedRipple.write("{");
        return this;
    }

    public hR setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0(3, 5, "}");
    }

    private void setIconTintList(int i) {
        int i2 = this.setChipCornerRadius;
        int[] iArr = this.setNavigationOnClickListener;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.setNavigationOnClickListener = iArr2;
        }
        int[] iArr3 = this.setNavigationOnClickListener;
        int i3 = this.setChipCornerRadius;
        this.setChipCornerRadius = i3 + 1;
        iArr3[i3] = i;
    }

    public hR setIconTintList(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.setUiOptions != null) {
            throw new IllegalStateException();
        }
        if (this.setChipCornerRadius == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.setUiOptions = str;
        return this;
    }

    private void setUnboundedRipple() {
        if (this.setUiOptions != null) {
            int i = this.setChipCornerRadius;
            if (i == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            int i2 = this.setNavigationOnClickListener[i - 1];
            if (i2 == 5) {
                this.setUnboundedRipple.write(44);
            } else if (i2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            setNavigationOnClickListener();
            this.setNavigationOnClickListener[this.setChipCornerRadius - 1] = 4;
            MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions);
            this.setUiOptions = null;
        }
    }

    public hR setY(String str) {
        if (str == null) {
            return setY();
        }
        setUnboundedRipple();
        setLayoutAnimation();
        MenuHostHelper$$ExternalSyntheticLambda0(str);
        return this;
    }

    public hR setY() {
        if (this.setUiOptions != null) {
            if (this.setLayoutAnimation) {
                setUnboundedRipple();
            } else {
                this.setUiOptions = null;
                return this;
            }
        }
        setLayoutAnimation();
        this.setUnboundedRipple.write("null");
        return this;
    }

    public hR MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        setUnboundedRipple();
        setLayoutAnimation();
        this.setUnboundedRipple.write(z ? "true" : "false");
        return this;
    }

    public hR MenuHostHelper$$ExternalSyntheticLambda0(Boolean bool) {
        if (bool == null) {
            return setY();
        }
        setUnboundedRipple();
        setLayoutAnimation();
        this.setUnboundedRipple.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public hR setX(long j) {
        setUnboundedRipple();
        setLayoutAnimation();
        this.setUnboundedRipple.write(Long.toString(j));
        return this;
    }

    public hR setIconTintList(Number number) {
        if (number == null) {
            return setY();
        }
        setUnboundedRipple();
        String obj = number.toString();
        if (!this.setX && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
            sb.append(number);
            throw new IllegalArgumentException(sb.toString());
        }
        setLayoutAnimation();
        this.setUnboundedRipple.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.setChipCornerRadius == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.setUnboundedRipple.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.setUnboundedRipple.close();
        int i = this.setChipCornerRadius;
        if (i > 1 || (i == 1 && this.setNavigationOnClickListener[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.setChipCornerRadius = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.setY
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o.hR.setIconTintList
            goto L9
        L7:
            java.lang.String[] r0 = o.hR.MenuHostHelper$$ExternalSyntheticLambda1
        L9:
            java.io.Writer r1 = r8.setUnboundedRipple
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.setUnboundedRipple
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.setUnboundedRipple
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.setUnboundedRipple
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.setUnboundedRipple
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hR.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String):void");
    }

    private void setNavigationOnClickListener() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return;
        }
        this.setUnboundedRipple.write("\n");
        int i = this.setChipCornerRadius;
        for (int i2 = 1; i2 < i; i2++) {
            this.setUnboundedRipple.write(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    private void setLayoutAnimation() {
        int i = this.setChipCornerRadius;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int[] iArr = this.setNavigationOnClickListener;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
            setNavigationOnClickListener();
        } else if (i2 == 2) {
            this.setUnboundedRipple.append(',');
            setNavigationOnClickListener();
        } else if (i2 == 4) {
            this.setUnboundedRipple.append((CharSequence) this.setOnLongClickListener);
            this.setNavigationOnClickListener[this.setChipCornerRadius - 1] = 5;
        } else {
            if (i2 != 6) {
                if (i2 == 7) {
                    if (!this.setX) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            this.setNavigationOnClickListener[this.setChipCornerRadius - 1] = 7;
        }
    }

    private hR MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, String str) {
        int i3 = this.setChipCornerRadius;
        if (i3 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i4 = this.setNavigationOnClickListener[i3 - 1];
        if (i4 != i2 && i4 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.setUiOptions != null) {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.setUiOptions);
            throw new IllegalStateException(sb.toString());
        }
        this.setChipCornerRadius--;
        if (i4 == i2) {
            setNavigationOnClickListener();
        }
        this.setUnboundedRipple.write(str);
        return this;
    }
}