package o;

import java.util.List;
import java.util.Map;
import o.jj;

/* renamed from: o.ib  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0230ib implements jj {
    private final hX MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0230ib(hX hXVar) {
        hX hXVar2 = (hX) C0243ip.setX(hXVar, "output");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = hXVar2;
        hXVar2.MenuHostHelper$$ExternalSyntheticLambda1 = this;
    }

    @Override // o.jj
    public final jj.setY setY() {
        return jj.setY.ASCENDING;
    }

    @Override // o.jj
    public final void setY(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, j);
    }

    @Override // o.jj
    public final void setX(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, j);
    }

    @Override // o.jj
    public final void setX(int i, float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.floatToRawIntBits(f));
    }

    @Override // o.jj
    public final void setX(int i, double d) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, Double.doubleToRawLongBits(d));
    }

    @Override // o.jj
    public final void setX(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(i, i2);
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, j);
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(i, i2);
    }

    @Override // o.jj
    public final void setIconTintList(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, j);
    }

    @Override // o.jj
    public final void setIconTintList(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
    }

    @Override // o.jj
    public final void setX(int i, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, z);
    }

    @Override // o.jj
    public final void setIconTintList(int i, String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, str);
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, hY hYVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, hYVar);
    }

    @Override // o.jj
    public final void setUnboundedRipple(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(i, i2);
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(i, (i2 << 1) ^ (i2 >> 31));
    }

    @Override // o.jj
    public final void setY(int i, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, (j << 1) ^ (j >> 63));
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, Object obj, iY iYVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i, (iJ) obj, iYVar);
    }

    @Override // o.jj
    public final void setX(int i, Object obj, iY iYVar) {
        hX hXVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        hXVar.setUiOptions(i, 3);
        iYVar.MenuHostHelper$$ExternalSyntheticLambda1((iJ) obj, hXVar.MenuHostHelper$$ExternalSyntheticLambda1);
        hXVar.setUiOptions(i, 4);
    }

    @Override // o.jj
    @Deprecated
    public final void setY(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 3);
    }

    @Override // o.jj
    @Deprecated
    public final void setX(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 4);
    }

    @Override // o.jj
    public final void setX(int i, Object obj) {
        if (obj instanceof hY) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, (hY) obj);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(i, (iJ) obj);
        }
    }

    @Override // o.jj
    public final void setNavigationOnClickListener(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.setLayoutAnimation(list.get(i4).intValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setY(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setLayoutAnimation(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.MenuHostHelper$$ExternalSyntheticLambda0(list.get(i4).longValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setTextAlignment(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.setX(list.get(i4).longValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setOnLongClickListener(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.setUnboundedRipple();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    @Override // o.jj
    public final void setIconTintList(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.setX();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Override // o.jj
    public final void setX(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i4).intValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.setY();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof InterfaceC0249iv) {
            InterfaceC0249iv interfaceC0249iv = (InterfaceC0249iv) list;
            while (i2 < list.size()) {
                Object iconTintList = interfaceC0249iv.setIconTintList(i2);
                if (iconTintList instanceof String) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, (String) iconTintList);
                } else {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, (hY) iconTintList);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, list.get(i2));
            i2++;
        }
    }

    @Override // o.jj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<hY> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2));
        }
    }

    @Override // o.jj
    public final void setChipCornerRadius(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.setChipCornerRadius(list.get(i4).intValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setUiOptions(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.setLayoutAnimation();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void setUnboundedRipple(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += hX.setOnLongClickListener();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // o.jj
    public final void ViewPager$SavedState$1(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.setIconSize(list.get(i4).intValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                hX hXVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
                int intValue = list.get(i2).intValue();
                hXVar.setMaxEms((intValue << 1) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            hX hXVar2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int intValue2 = list.get(i2).intValue();
            hXVar2.setNavigationOnClickListener(i, (intValue2 << 1) ^ (intValue2 >> 31));
            i2++;
        }
    }

    @Override // o.jj
    public final void setCenterIfNoTextEnabled(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hX.setY(list.get(i4).longValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(i3);
            while (i2 < list.size()) {
                hX hXVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
                long longValue = list.get(i2).longValue();
                hXVar.setIconTintList((longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            hX hXVar2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            long longValue2 = list.get(i2).longValue();
            hXVar2.MenuHostHelper$$ExternalSyntheticLambda1(i, (longValue2 << 1) ^ (longValue2 >> 63));
            i2++;
        }
    }

    @Override // o.jj
    public final void setX(int i, List<?> list, iY iYVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i, (iJ) list.get(i2), iYVar);
        }
    }

    @Override // o.jj
    public final void setIconTintList(int i, List<?> list, iY iYVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            setX(i, list.get(i2), iYVar);
        }
    }

    @Override // o.jj
    public final <K, V> void setY(int i, C0251iw$MenuHostHelper$$ExternalSyntheticLambda0<K, V> c0251iw$MenuHostHelper$$ExternalSyntheticLambda0, Map<K, V> map) {
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(i, 2);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms(C0237ij.setX(c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, 1, entry.getKey()) + C0237ij.setX(c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.setX, 2, entry.getValue()));
            hX hXVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            K key = entry.getKey();
            V value = entry.getValue();
            C0237ij.MenuHostHelper$$ExternalSyntheticLambda0(hXVar, c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, 1, key);
            C0237ij.MenuHostHelper$$ExternalSyntheticLambda0(hXVar, c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.setX, 2, value);
        }
    }
}