package o;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: o.nm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325nm extends AbstractC0328np {
    private final RectF MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0325nm(C0337ny c0337ny) {
        super(c0337ny);
        pN.setX(c0337ny, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new RectF();
    }

    @Override // o.AbstractC0328np
    protected final int setUiOptions() {
        return ((int) setIconTintList()) + 6;
    }

    @Override // o.InterfaceC0331ns
    public final void setX(Canvas canvas) {
        Object evaluate;
        float f;
        pN.setX(canvas, "");
        if (MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions <= 1) {
            boolean z = MenuHostHelper$$ExternalSyntheticLambda0().setNavigationOnClickListener;
            return;
        }
        float f2 = MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener;
        setX().setColor(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1);
        int i = MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions;
        for (int i2 = 0; i2 < i; i2++) {
            nA nAVar = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            float MenuHostHelper$$ExternalSyntheticLambda0 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), i2);
            nA nAVar2 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            canvas.drawCircle(MenuHostHelper$$ExternalSyntheticLambda0 + 3.0f, nA.setX(setIconTintList()) + 3.0f, f2 / 2.0f, setX());
        }
        setX().setColor(MenuHostHelper$$ExternalSyntheticLambda0().setX);
        int i3 = MenuHostHelper$$ExternalSyntheticLambda0().setLayoutAnimation;
        if (i3 == 0 || i3 == 2) {
            int i4 = MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList;
            nA nAVar3 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            float MenuHostHelper$$ExternalSyntheticLambda02 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), i4);
            nA nAVar4 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            float MenuHostHelper$$ExternalSyntheticLambda03 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), (i4 + 1) % MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions);
            float f3 = MenuHostHelper$$ExternalSyntheticLambda0().setIconSize;
            nA nAVar5 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            canvas.drawCircle(MenuHostHelper$$ExternalSyntheticLambda02 + ((MenuHostHelper$$ExternalSyntheticLambda03 - MenuHostHelper$$ExternalSyntheticLambda02) * f3) + 3.0f, nA.setX(setIconTintList()) + 3.0f, MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0 / 2.0f, setX());
            return;
        }
        if (i3 == 3) {
            float f4 = MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener;
            float f5 = MenuHostHelper$$ExternalSyntheticLambda0().setIconSize;
            int i5 = MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList;
            float f6 = MenuHostHelper$$ExternalSyntheticLambda0().ViewPager$SavedState$1 + MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener;
            nA nAVar6 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
            float MenuHostHelper$$ExternalSyntheticLambda04 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), i5);
            float f7 = (f5 - 0.5f) * f6 * 2.0f;
            float f8 = f7 >= 0.0f ? f7 : 0.0f;
            float f9 = MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f;
            float f10 = f5 * f6 * 2.0f;
            if (f10 <= f6) {
                f6 = f10;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.set(((f8 + MenuHostHelper$$ExternalSyntheticLambda04) - f9) + 3.0f, 3.0f, MenuHostHelper$$ExternalSyntheticLambda04 + f6 + (MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f) + 3.0f, f4 + 3.0f);
            canvas.drawRoundRect(this.MenuHostHelper$$ExternalSyntheticLambda0, f4, f4, setX());
            return;
        }
        if (i3 != 4) {
            if (i3 == 5) {
                int i6 = MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList;
                float f11 = MenuHostHelper$$ExternalSyntheticLambda0().setIconSize;
                nA nAVar7 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
                float MenuHostHelper$$ExternalSyntheticLambda05 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), i6);
                nA nAVar8 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
                float x = nA.setX(setIconTintList());
                ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
                Object evaluate2 = MenuHostHelper$$ExternalSyntheticLambda1 != null ? MenuHostHelper$$ExternalSyntheticLambda1.evaluate(f11, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().setX), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1)) : null;
                Paint x2 = setX();
                if (evaluate2 == null) {
                    throw new nY("null cannot be cast to non-null type kotlin.Int");
                }
                x2.setColor(((Integer) evaluate2).intValue());
                float f12 = x + 3.0f;
                canvas.drawCircle(MenuHostHelper$$ExternalSyntheticLambda05 + 3.0f, f12, MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f, setX());
                ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
                evaluate = MenuHostHelper$$ExternalSyntheticLambda12 != null ? MenuHostHelper$$ExternalSyntheticLambda12.evaluate(1.0f - f11, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().setX), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1)) : null;
                Paint x3 = setX();
                if (evaluate == null) {
                    throw new nY("null cannot be cast to non-null type kotlin.Int");
                }
                x3.setColor(((Integer) evaluate).intValue());
                if (i6 == MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions - 1) {
                    nA nAVar9 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
                    f = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), 0);
                } else {
                    f = MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener + MenuHostHelper$$ExternalSyntheticLambda05 + MenuHostHelper$$ExternalSyntheticLambda0().ViewPager$SavedState$1;
                }
                canvas.drawCircle(f + 3.0f, f12, MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0 / 2.0f, setX());
                return;
            }
            return;
        }
        int i7 = MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList;
        float f13 = MenuHostHelper$$ExternalSyntheticLambda0().setIconSize;
        nA nAVar10 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
        float MenuHostHelper$$ExternalSyntheticLambda06 = nA.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), setIconTintList(), i7);
        nA nAVar11 = nA.MenuHostHelper$$ExternalSyntheticLambda0;
        float x4 = nA.setX(setIconTintList());
        if (f13 < 1.0f) {
            ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1();
            Object evaluate3 = MenuHostHelper$$ExternalSyntheticLambda13 != null ? MenuHostHelper$$ExternalSyntheticLambda13.evaluate(f13, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().setX), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1)) : null;
            Paint x5 = setX();
            if (evaluate3 == null) {
                throw new nY("null cannot be cast to non-null type kotlin.Int");
            }
            x5.setColor(((Integer) evaluate3).intValue());
            canvas.drawCircle(MenuHostHelper$$ExternalSyntheticLambda06 + 3.0f, x4 + 3.0f, (MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0 / 2.0f) - (((MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0 / 2.0f) - (MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f)) * f13), setX());
        }
        if (i7 == MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions - 1) {
            ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda1();
            evaluate = MenuHostHelper$$ExternalSyntheticLambda14 != null ? MenuHostHelper$$ExternalSyntheticLambda14.evaluate(f13, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().setX)) : null;
            Paint x6 = setX();
            if (evaluate == null) {
                throw new nY("null cannot be cast to non-null type kotlin.Int");
            }
            x6.setColor(((Integer) evaluate).intValue());
            canvas.drawCircle((setIconTintList() / 2.0f) + 3.0f, x4 + 3.0f, (setY() / 2.0f) + (((setIconTintList() / 2.0f) - (setY() / 2.0f)) * f13), setX());
        } else if (f13 > 0.0f) {
            ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda15 = MenuHostHelper$$ExternalSyntheticLambda1();
            evaluate = MenuHostHelper$$ExternalSyntheticLambda15 != null ? MenuHostHelper$$ExternalSyntheticLambda15.evaluate(f13, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0().setX)) : null;
            Paint x7 = setX();
            if (evaluate == null) {
                throw new nY("null cannot be cast to non-null type kotlin.Int");
            }
            x7.setColor(((Integer) evaluate).intValue());
            canvas.drawCircle(MenuHostHelper$$ExternalSyntheticLambda06 + MenuHostHelper$$ExternalSyntheticLambda0().ViewPager$SavedState$1 + MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener + 3.0f, x4 + 3.0f, (MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f) + (((MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0 / 2.0f) - (MenuHostHelper$$ExternalSyntheticLambda0().setOnLongClickListener / 2.0f)) * f13), setX());
        }
    }
}