package o;

import android.animation.ArgbEvaluator;
import android.graphics.Paint;

/* renamed from: o.np  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0328np implements InterfaceC0331ns {
    private ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda0;
    private Paint MenuHostHelper$$ExternalSyntheticLambda1;
    private final setY setIconTintList;
    private float setUnboundedRipple;
    private C0337ny setX;
    private float setY;

    static {
        new setX((byte) 0);
    }

    public AbstractC0328np(C0337ny c0337ny) {
        pN.setX(c0337ny, "");
        this.setX = c0337ny;
        Paint paint = new Paint();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = paint;
        paint.setAntiAlias(true);
        this.setIconTintList = new setY();
        if (this.setX.setLayoutAnimation == 4 || this.setX.setLayoutAnimation == 5) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArgbEvaluator();
        }
    }

    public final C0337ny MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    public final float setIconTintList() {
        return this.setY;
    }

    public final float setY() {
        return this.setUnboundedRipple;
    }

    public final Paint setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final ArgbEvaluator MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* renamed from: o.np$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean setUnboundedRipple() {
        return this.setX.setOnLongClickListener == this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.InterfaceC0331ns
    public final setY MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        float f = this.setX.setOnLongClickListener;
        float f2 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
        if (f < f2) {
            f = f2;
        }
        this.setY = f;
        float f3 = this.setX.setOnLongClickListener;
        float f4 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
        if (f3 > f4) {
            f3 = f4;
        }
        this.setUnboundedRipple = f3;
        if (this.setX.setUnboundedRipple == 1) {
            setY sety = this.setIconTintList;
            int uiOptions = setUiOptions();
            int navigationOnClickListener = setNavigationOnClickListener();
            sety.setX = uiOptions;
            sety.setY = navigationOnClickListener;
        } else {
            setY sety2 = this.setIconTintList;
            int navigationOnClickListener2 = setNavigationOnClickListener();
            int uiOptions2 = setUiOptions();
            sety2.setX = navigationOnClickListener2;
            sety2.setY = uiOptions2;
        }
        return this.setIconTintList;
    }

    protected int setUiOptions() {
        C0337ny c0337ny = this.setX;
        float f = c0337ny.setCenterIfNoTextEnabled;
        if (f <= 0.0f) {
            f = c0337ny.setOnLongClickListener / 2.0f;
        }
        return ((int) f) + 3;
    }

    private final int setNavigationOnClickListener() {
        float f = this.setX.setUiOptions - 1;
        return ((int) ((this.setX.ViewPager$SavedState$1 * f) + this.setY + (f * this.setUnboundedRipple))) + 6;
    }

    /* renamed from: o.np$setY */
    /* loaded from: classes.dex */
    public final class setY {
        public int setX;
        public int setY;

        public setY() {
        }
    }
}