package o;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.Locale;
import o.C0530v;
import o.N;

/* loaded from: classes.dex */
final class I implements C0530v.setX, N.setY, N$MenuHostHelper$$ExternalSyntheticLambda1, v$MenuHostHelper$$ExternalSyntheticLambda1, G {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    private final N setLayoutAnimation;
    private float setNavigationOnClickListener;
    private float setOnLongClickListener;
    final D setX;
    private static final String[] MenuHostHelper$$ExternalSyntheticLambda0 = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] setY = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    private static final String[] setIconTintList = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public I(N n, D d) {
        this.setLayoutAnimation = n;
        this.setX = d;
        if (d.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            this.setLayoutAnimation.setLayoutAnimation.setVisibility(0);
        }
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1.setX.add(this);
        this.setLayoutAnimation.setUiOptions = this;
        this.setLayoutAnimation.setX = this;
        this.setLayoutAnimation.setOnActionUpListener(this);
        String[] strArr = MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = D.setX(this.setLayoutAnimation.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = setY;
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            strArr2[i2] = D.setX(this.setLayoutAnimation.getResources(), strArr2[i2], "%d");
        }
        String[] strArr3 = setIconTintList;
        for (int i3 = 0; i3 < strArr3.length; i3++) {
            strArr3[i3] = D.setX(this.setLayoutAnimation.getResources(), strArr3[i3], "%02d");
        }
        setY();
    }

    @Override // o.G
    public final void setY() {
        this.setNavigationOnClickListener = this.setX.MenuHostHelper$$ExternalSyntheticLambda0() * (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 == 1 ? 15 : 30);
        this.setOnLongClickListener = this.setX.setY * 6;
        setX(this.setX.setUnboundedRipple, false);
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.G
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setLayoutAnimation.setVisibility(0);
    }

    @Override // o.G
    public final void setX() {
        this.setLayoutAnimation.setVisibility(8);
    }

    @Override // o.C0530v.setX
    public final void MenuHostHelper$$ExternalSyntheticLambda0(float f, boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        int i = this.setX.setIconTintList;
        int i2 = this.setX.setY;
        int round = Math.round(f);
        if (this.setX.setUnboundedRipple == 12) {
            this.setX.setY = ((round + 3) / 6) % 60;
            this.setOnLongClickListener = (float) Math.floor(this.setX.setY * 6);
        } else {
            int i3 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0 == 1 ? 15 : 30;
            D d = this.setX;
            d.setY((round + (i3 / 2)) / (d.MenuHostHelper$$ExternalSyntheticLambda0 == 1 ? 15 : 30));
            this.setNavigationOnClickListener = this.setX.MenuHostHelper$$ExternalSyntheticLambda0() * (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 != 1 ? 30 : 15);
        }
        if (z) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        if (this.setX.setY == i2 && this.setX.setIconTintList == i) {
            return;
        }
        this.setLayoutAnimation.performHapticFeedback(4);
    }

    @Override // o.N.setY
    public final void setX(int i) {
        setX(i, true);
    }

    @Override // o.N$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setIconTintList(int i) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    private void setX(int i, boolean z) {
        String[] strArr;
        boolean z2 = i == 12;
        this.setLayoutAnimation.setAnimateOnTouchUp(z2);
        this.setX.setUnboundedRipple = i;
        N n = this.setLayoutAnimation;
        if (z2) {
            strArr = setIconTintList;
        } else {
            strArr = this.setX.MenuHostHelper$$ExternalSyntheticLambda0 == 1 ? setY : MenuHostHelper$$ExternalSyntheticLambda0;
        }
        n.setValues(strArr, z2 ? R.string.res_0x7f140057 : R.string.res_0x7f140055);
        this.setLayoutAnimation.setHandRotation(z2 ? this.setOnLongClickListener : this.setNavigationOnClickListener, z);
        this.setLayoutAnimation.setActiveSelection(i);
        N n2 = this.setLayoutAnimation;
        n2.setMinuteHourDelegate(new C0587x(n2.getContext(), R.string.res_0x7f140054) { // from class: o.I.5
            @Override // o.C0587x, o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(view.getResources().getString(R.string.res_0x7f140055, String.valueOf(I.this.setX.MenuHostHelper$$ExternalSyntheticLambda0())));
            }
        });
        N n3 = this.setLayoutAnimation;
        n3.setHourClickDelegate(new C0587x(n3.getContext(), R.string.res_0x7f140056) { // from class: o.I.4
            @Override // o.C0587x, o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(view.getResources().getString(R.string.res_0x7f140057, String.valueOf(I.this.setX.setY)));
            }
        });
    }

    @Override // o.v$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setX(float f, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        int i = this.setX.setY;
        int i2 = this.setX.setIconTintList;
        if (this.setX.setUnboundedRipple == 10) {
            this.setLayoutAnimation.setHandRotation(this.setNavigationOnClickListener, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) setLineHeight.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                setX(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.setX.setY = (((round + 15) / 30) * 5) % 60;
                this.setOnLongClickListener = this.setX.setY * 6;
            }
            this.setLayoutAnimation.setHandRotation(this.setOnLongClickListener, z);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        MenuHostHelper$$ExternalSyntheticLambda0();
        if (this.setX.setY == i && this.setX.setIconTintList == i2) {
            return;
        }
        this.setLayoutAnimation.performHapticFeedback(4);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        N n = this.setLayoutAnimation;
        int i = this.setX.setOnLongClickListener;
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        int i2 = this.setX.setY;
        n.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(i == 1 ? R.id.res_0x7f0a0118 : R.id.res_0x7f0a0117, true);
        Locale locale = n.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i2));
        String format2 = String.format(locale, "%02d", Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda02));
        if (!TextUtils.equals(n.setIconTintList.getText(), format)) {
            n.setIconTintList.setText(format);
        }
        if (TextUtils.equals(n.setY.getText(), format2)) {
            return;
        }
        n.setY.setText(format2);
    }
}