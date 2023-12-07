package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.lang.ref.WeakReference;
import o.setScrollCaptureCallback;

/* loaded from: classes.dex */
public final class setSelectionFromTop {
    private static setSelectionFromTop setIconTintList;
    private static final PorterDuff.Mode setY = PorterDuff.Mode.SRC_IN;
    private setScrollCaptureCallback MenuHostHelper$$ExternalSyntheticLambda0;

    public static void MenuHostHelper$$ExternalSyntheticLambda1() {
        synchronized (setSelectionFromTop.class) {
            if (setIconTintList == null) {
                setSelectionFromTop setselectionfromtop = new setSelectionFromTop();
                setIconTintList = setselectionfromtop;
                setselectionfromtop.MenuHostHelper$$ExternalSyntheticLambda0 = setScrollCaptureCallback.setX();
                setScrollCaptureCallback setscrollcapturecallback = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                setScrollCaptureCallback.setLayoutAnimation setlayoutanimation = new setScrollCaptureCallback.setLayoutAnimation() { // from class: o.setSelectionFromTop.3
                    private final int[] MenuHostHelper$$ExternalSyntheticLambda0 = {R.drawable.res_0x7f08006e, R.drawable.res_0x7f08006c, R.drawable.res_0x7f080022};
                    private final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {R.drawable.res_0x7f08003a, R.drawable.res_0x7f08005d, R.drawable.res_0x7f080041, R.drawable.res_0x7f08003c, R.drawable.res_0x7f08003d, R.drawable.res_0x7f080040, R.drawable.res_0x7f08003f};
                    private final int[] setIconTintList = {R.drawable.res_0x7f08006b, R.drawable.res_0x7f08006d, R.drawable.res_0x7f080033, R.drawable.res_0x7f080067, R.drawable.res_0x7f080068, R.drawable.res_0x7f080069, R.drawable.res_0x7f08006a};
                    private final int[] setX = {R.drawable.res_0x7f080053, R.drawable.res_0x7f080031, R.drawable.res_0x7f080052};
                    private final int[] setNavigationOnClickListener = {R.drawable.res_0x7f080065, R.drawable.res_0x7f08006f};
                    private final int[] setY = {R.drawable.res_0x7f080025, R.drawable.res_0x7f08002b, R.drawable.res_0x7f080026, R.drawable.res_0x7f08002c};

                    private ColorStateList MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
                        return setY(context, setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e1));
                    }

                    private ColorStateList setY(Context context) {
                        return setY(context, 0);
                    }

                    private ColorStateList setIconTintList(Context context) {
                        return setY(context, setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400df));
                    }

                    private ColorStateList setY(Context context, int i) {
                        int iconTintList = setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e4);
                        return new ColorStateList(new int[][]{setCompatPressedTranslationZ.setIconTintList, setCompatPressedTranslationZ.setX, setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1, setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda0}, new int[]{setCompatPressedTranslationZ.setX(context, R.attr.res_0x7f0400e1), setExtended.setY(iconTintList, i), setExtended.setY(iconTintList, i), i});
                    }

                    private ColorStateList setX(Context context) {
                        int[][] iArr = new int[3];
                        int[] iArr2 = new int[3];
                        ColorStateList MenuHostHelper$$ExternalSyntheticLambda0 = setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda0(context, R.attr.res_0x7f040104);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda0.isStateful()) {
                            int[] iArr3 = setCompatPressedTranslationZ.setIconTintList;
                            iArr[0] = iArr3;
                            iArr2[0] = MenuHostHelper$$ExternalSyntheticLambda0.getColorForState(iArr3, 0);
                            iArr[1] = setCompatPressedTranslationZ.setY;
                            iArr2[1] = setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e3);
                            iArr[2] = setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda0;
                            iArr2[2] = MenuHostHelper$$ExternalSyntheticLambda0.getDefaultColor();
                        } else {
                            iArr[0] = setCompatPressedTranslationZ.setIconTintList;
                            iArr2[0] = setCompatPressedTranslationZ.setX(context, R.attr.res_0x7f040104);
                            iArr[1] = setCompatPressedTranslationZ.setY;
                            iArr2[1] = setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e3);
                            iArr[2] = setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda0;
                            iArr2[2] = setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f040104);
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    @Override // o.setScrollCaptureCallback.setLayoutAnimation
                    public Drawable setIconTintList(setScrollCaptureCallback setscrollcapturecallback2, Context context, int i) {
                        if (i == R.drawable.res_0x7f080032) {
                            return new LayerDrawable(new Drawable[]{setscrollcapturecallback2.MenuHostHelper$$ExternalSyntheticLambda1(context, R.drawable.res_0x7f080031), setscrollcapturecallback2.MenuHostHelper$$ExternalSyntheticLambda1(context, R.drawable.res_0x7f080033)});
                        }
                        if (i == R.drawable.res_0x7f080055) {
                            return setY(setscrollcapturecallback2, context, R.dimen.res_0x7f07003b);
                        }
                        if (i == R.drawable.res_0x7f080054) {
                            return setY(setscrollcapturecallback2, context, R.dimen.res_0x7f07003c);
                        }
                        if (i == R.drawable.res_0x7f080056) {
                            return setY(setscrollcapturecallback2, context, R.dimen.res_0x7f07003d);
                        }
                        return null;
                    }

                    private LayerDrawable setY(setScrollCaptureCallback setscrollcapturecallback2, Context context, int i) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                        Drawable MenuHostHelper$$ExternalSyntheticLambda1 = setscrollcapturecallback2.MenuHostHelper$$ExternalSyntheticLambda1(context, R.drawable.res_0x7f080061);
                        Drawable MenuHostHelper$$ExternalSyntheticLambda12 = setscrollcapturecallback2.MenuHostHelper$$ExternalSyntheticLambda1(context, R.drawable.res_0x7f080062);
                        if ((MenuHostHelper$$ExternalSyntheticLambda1 instanceof BitmapDrawable) && MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicWidth() == dimensionPixelSize && MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) MenuHostHelper$$ExternalSyntheticLambda1;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            MenuHostHelper$$ExternalSyntheticLambda1.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            MenuHostHelper$$ExternalSyntheticLambda1.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((MenuHostHelper$$ExternalSyntheticLambda12 instanceof BitmapDrawable) && MenuHostHelper$$ExternalSyntheticLambda12.getIntrinsicWidth() == dimensionPixelSize && MenuHostHelper$$ExternalSyntheticLambda12.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) MenuHostHelper$$ExternalSyntheticLambda12;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            MenuHostHelper$$ExternalSyntheticLambda12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            MenuHostHelper$$ExternalSyntheticLambda12.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }

                    private void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable, int i, PorterDuff.Mode mode) {
                        setCheckMarkDrawable.setY();
                        Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = setSelectionFromTop.setY;
                        }
                        mutate.setColorFilter(setSelectionFromTop.setX(i, mode));
                    }

                    @Override // o.setScrollCaptureCallback.setLayoutAnimation
                    public boolean setY(Context context, int i, Drawable drawable) {
                        if (i == R.drawable.res_0x7f08005e) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable.findDrawableByLayerId(16908288), setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e5), setSelectionFromTop.setY);
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable.findDrawableByLayerId(16908303), setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e5), setSelectionFromTop.setY);
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable.findDrawableByLayerId(16908301), setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e3), setSelectionFromTop.setY);
                            return true;
                        } else if (i == R.drawable.res_0x7f080055 || i == R.drawable.res_0x7f080054 || i == R.drawable.res_0x7f080056) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable2.findDrawableByLayerId(16908288), setCompatPressedTranslationZ.setX(context, R.attr.res_0x7f0400e5), setSelectionFromTop.setY);
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable2.findDrawableByLayerId(16908303), setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e3), setSelectionFromTop.setY);
                            MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable2.findDrawableByLayerId(16908301), setCompatPressedTranslationZ.setIconTintList(context, (int) R.attr.res_0x7f0400e3), setSelectionFromTop.setY);
                            return true;
                        } else {
                            return false;
                        }
                    }

                    private boolean setY(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // o.setScrollCaptureCallback.setLayoutAnimation
                    public ColorStateList setX(Context context, int i) {
                        if (i == R.drawable.res_0x7f080036) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060015);
                        }
                        if (i == R.drawable.res_0x7f080064) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060018);
                        }
                        if (i == R.drawable.res_0x7f080063) {
                            return setX(context);
                        }
                        if (i == R.drawable.res_0x7f08002a) {
                            return MenuHostHelper$$ExternalSyntheticLambda0(context);
                        }
                        if (i == R.drawable.res_0x7f080024) {
                            return setY(context);
                        }
                        if (i == R.drawable.res_0x7f080029) {
                            return setIconTintList(context);
                        }
                        if (i == R.drawable.res_0x7f08005f || i == R.drawable.res_0x7f080060) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060017);
                        }
                        if (setY(this.MenuHostHelper$$ExternalSyntheticLambda1, i)) {
                            return setCompatPressedTranslationZ.MenuHostHelper$$ExternalSyntheticLambda0(context, R.attr.res_0x7f0400e5);
                        }
                        if (setY(this.setNavigationOnClickListener, i)) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060014);
                        }
                        if (setY(this.setY, i)) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060013);
                        }
                        if (i == R.drawable.res_0x7f08005c) {
                            return setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(context, R.color.res_0x7f060016);
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
                    @Override // o.setScrollCaptureCallback.setLayoutAnimation
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean MenuHostHelper$$ExternalSyntheticLambda1(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = o.setSelectionFromTop.MenuHostHelper$$ExternalSyntheticLambda0()
                            int[] r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                            boolean r1 = r6.setY(r1, r8)
                            r2 = 0
                            r3 = 1
                            r4 = -1
                            if (r1 == 0) goto L13
                            r8 = 2130968805(0x7f0400e5, float:1.7546274E38)
                            goto L46
                        L13:
                            int[] r1 = r6.setIconTintList
                            boolean r1 = r6.setY(r1, r8)
                            if (r1 == 0) goto L1f
                            r8 = 2130968803(0x7f0400e3, float:1.754627E38)
                            goto L46
                        L1f:
                            int[] r1 = r6.setX
                            boolean r1 = r6.setY(r1, r8)
                            if (r1 == 0) goto L2a
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L43
                        L2a:
                            r1 = 2131230791(0x7f080047, float:1.8077645E38)
                            if (r8 != r1) goto L3a
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            r1 = 16842800(0x1010030, float:2.3693693E-38)
                            goto L48
                        L3a:
                            r1 = 2131230773(0x7f080035, float:1.8077608E38)
                            if (r8 == r1) goto L43
                            r8 = -1
                            r1 = 0
                            r5 = 0
                            goto L49
                        L43:
                            r8 = 16842801(0x1010031, float:2.3693695E-38)
                        L46:
                            r1 = r8
                            r8 = -1
                        L48:
                            r5 = 1
                        L49:
                            if (r5 == 0) goto L63
                            o.setCheckMarkDrawable.setY()
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                            int r7 = o.setCompatPressedTranslationZ.setIconTintList(r7, r1)
                            android.graphics.PorterDuffColorFilter r7 = o.setSelectionFromTop.setX(r7, r0)
                            r9.setColorFilter(r7)
                            if (r8 == r4) goto L62
                            r9.setAlpha(r8)
                        L62:
                            return r3
                        L63:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.setSelectionFromTop.AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // o.setScrollCaptureCallback.setLayoutAnimation
                    public PorterDuff.Mode setIconTintList(int i) {
                        if (i == R.drawable.res_0x7f080063) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }
                };
                synchronized (setscrollcapturecallback) {
                    setscrollcapturecallback.MenuHostHelper$$ExternalSyntheticLambda0 = setlayoutanimation;
                }
            }
        }
    }

    public static setSelectionFromTop setIconTintList() {
        setSelectionFromTop setselectionfromtop;
        synchronized (setSelectionFromTop.class) {
            if (setIconTintList == null) {
                MenuHostHelper$$ExternalSyntheticLambda1();
            }
            setselectionfromtop = setIconTintList;
        }
        return setselectionfromtop;
    }

    public final Drawable MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        Drawable MenuHostHelper$$ExternalSyntheticLambda1;
        synchronized (this) {
            MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(context, i);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable setY(Context context, int i, boolean z) {
        Drawable iconTintList;
        synchronized (this) {
            iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(context, i, z);
        }
        return iconTintList;
    }

    public final void setX(Context context) {
        synchronized (this) {
            setScrollCaptureCallback setscrollcapturecallback = this.MenuHostHelper$$ExternalSyntheticLambda0;
            synchronized (setscrollcapturecallback) {
                setPrefixTextAppearance<WeakReference<Drawable.ConstantState>> setprefixtextappearance = setscrollcapturecallback.setX.get(context);
                if (setprefixtextappearance != null) {
                    setprefixtextappearance.setX();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ColorStateList setIconTintList(Context context, int i) {
        ColorStateList y;
        synchronized (this) {
            y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(context, i);
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(Drawable drawable, setStripEnabled setstripenabled, int[] iArr) {
        setScrollCaptureCallback.setY(drawable, setstripenabled, iArr);
    }

    public static PorterDuffColorFilter setX(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter x;
        synchronized (setSelectionFromTop.class) {
            x = setScrollCaptureCallback.setX(i, mode);
        }
        return x;
    }
}