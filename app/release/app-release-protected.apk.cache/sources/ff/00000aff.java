package o;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class setDividerPadding implements setRecycledViewPool, setOnQueryTextFocusChangeListener {
    private static TreeMap<Integer, setDividerPadding> setLayoutAnimation = new TreeMap<>();
    public final int[] MenuHostHelper$$ExternalSyntheticLambda0;
    final double[] MenuHostHelper$$ExternalSyntheticLambda1;
    final int setIconTintList;
    private volatile String setOnLongClickListener;
    private int setUiOptions;
    public final String[] setUnboundedRipple;
    final long[] setX;
    final byte[][] setY;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public static setDividerPadding MenuHostHelper$$ExternalSyntheticLambda1(String str, int i) {
        TreeMap<Integer, setDividerPadding> treeMap = setLayoutAnimation;
        synchronized (treeMap) {
            Map.Entry<Integer, setDividerPadding> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                setDividerPadding value = ceilingEntry.getValue();
                value.setOnLongClickListener = str;
                value.setUiOptions = i;
                return value;
            }
            setDividerPadding setdividerpadding = new setDividerPadding(i);
            setdividerpadding.setOnLongClickListener = str;
            setdividerpadding.setUiOptions = i;
            return setdividerpadding;
        }
    }

    private setDividerPadding(int i) {
        this.setIconTintList = i;
        int i2 = i + 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new int[i2];
        this.setX = new long[i2];
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new double[i2];
        this.setUnboundedRipple = new String[i2];
        this.setY = new byte[i2];
    }

    public final void setX() {
        TreeMap<Integer, setDividerPadding> treeMap = setLayoutAnimation;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.setIconTintList), this);
            TreeMap<Integer, setDividerPadding> treeMap2 = setLayoutAnimation;
            if (treeMap2.size() > 15) {
                Iterator<Integer> it = treeMap2.descendingKeySet().iterator();
                for (int size = treeMap2.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }

    @Override // o.setRecycledViewPool
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setOnLongClickListener;
    }

    @Override // o.setRecycledViewPool
    public final void setX(setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        for (int i = 1; i <= this.setUiOptions; i++) {
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
            if (i2 == 1) {
                setonquerytextfocuschangelistener.setIconTintList(i);
            } else if (i2 == 2) {
                setonquerytextfocuschangelistener.setY(i, this.setX[i]);
            } else if (i2 == 3) {
                setonquerytextfocuschangelistener.setX(i, this.MenuHostHelper$$ExternalSyntheticLambda1[i]);
            } else if (i2 == 4) {
                setonquerytextfocuschangelistener.setY(i, this.setUnboundedRipple[i]);
            } else if (i2 == 5) {
                setonquerytextfocuschangelistener.setY(i, this.setY[i]);
            }
        }
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setIconTintList(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 1;
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 2;
        this.setX[i] = j;
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setX(int i, double d) {
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 3;
        this.MenuHostHelper$$ExternalSyntheticLambda1[i] = d;
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 4;
        this.setUnboundedRipple[i] = str;
    }

    @Override // o.setOnQueryTextFocusChangeListener
    public final void setY(int i, byte[] bArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = 5;
        this.setY[i] = bArr;
    }
}