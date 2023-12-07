package o;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0 implements setTextSelectHandleRight {
    final ArrayList<Object> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
    final String setX;
    private final setPasswordVisibilityToggleTintList setY;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0(String str, setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist) {
        this.setX = str;
        this.setY = setpasswordvisibilitytoggletintlist;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
            for (int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size(); size <= i2; size++) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.add(null);
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(i2, obj);
    }

    @Override // o.setTextSelectHandleRight
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return ((Integer) this.setY.setY(new setPlaceholderText(this, new setIndeterminateDrawableTiled() { // from class: o.setTextSize
            @Override // o.setIndeterminateDrawableTiled
            public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                return Integer.valueOf(((setTextSelectHandleRight) obj).MenuHostHelper$$ExternalSyntheticLambda1());
            }
        }))).intValue();
    }

    @Override // o.setTextSelectHandleRight
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return ((Long) this.setY.setY(new setPlaceholderText(this, new setIndeterminateDrawableTiled() { // from class: o.setStatusBarBackgroundColor
            @Override // o.setIndeterminateDrawableTiled
            public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                return Long.valueOf(((setTextSelectHandleRight) obj).MenuHostHelper$$ExternalSyntheticLambda0());
            }
        }))).longValue();
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setIconTintList(int i) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, null);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, long j) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, Long.valueOf(j));
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setX(int i, double d) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, Double.valueOf(d));
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, String str) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, str);
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, byte[] bArr) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, bArr);
    }
}