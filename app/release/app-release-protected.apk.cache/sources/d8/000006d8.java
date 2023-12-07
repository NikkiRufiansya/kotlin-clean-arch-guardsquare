package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import o.onActivityStopped;
import o.setInlineLabelResource;
import o.setTabRippleColor;

/* renamed from: o.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0286m extends setTabRippleColor {

    /* renamed from: o.m$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface AnonymousClass2 extends setMinimumWidth {
        Set<attachInterface> MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* renamed from: o.m$6  reason: invalid class name */
    /* loaded from: classes.dex */
    abstract class AnonymousClass6 {
        public abstract StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 MenuHostHelper$$ExternalSyntheticLambda0();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract setChecked<?, byte[]> MenuHostHelper$$ExternalSyntheticLambda1();

        public abstract attachInterface setIconTintList();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract setBottomEdgeEffectColor<?> setX();

        public abstract String setY();
    }

    /* renamed from: o.m$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 {
        private final byte[] MenuHostHelper$$ExternalSyntheticLambda0;
        private final String setIconTintList;
        private final isBinderAlive setX;

        /* synthetic */ AnonymousClass4(String str, byte[] bArr, isBinderAlive isbinderalive, byte b) {
            this(str, bArr, isbinderalive);
        }

        private AnonymousClass4(String str, byte[] bArr, isBinderAlive isbinderalive) {
            this.setIconTintList = str;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
            this.setX = isbinderalive;
        }

        @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
        public final String setX() {
            return this.setIconTintList;
        }

        @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
        public final byte[] setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
        public final isBinderAlive MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setX;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1) {
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1) obj;
                if (this.setIconTintList.equals(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setX())) {
                    if (Arrays.equals(this.MenuHostHelper$$ExternalSyntheticLambda0, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 instanceof AnonymousClass4 ? ((AnonymousClass4) staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1).MenuHostHelper$$ExternalSyntheticLambda0 : staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY()) && this.setX.equals(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.MenuHostHelper$$ExternalSyntheticLambda0())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.setIconTintList.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.MenuHostHelper$$ExternalSyntheticLambda0)) * 1000003) ^ this.setX.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.m$4$setX */
        /* loaded from: classes.dex */
        public static final class setX extends StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 {
            private byte[] MenuHostHelper$$ExternalSyntheticLambda0;
            isBinderAlive MenuHostHelper$$ExternalSyntheticLambda1;
            private String setX;

            @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1
            public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(String str) {
                if (str == null) {
                    throw new NullPointerException("Null backendName");
                }
                this.setX = str;
                return this;
            }

            @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1
            public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
                return this;
            }

            @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1
            public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(isBinderAlive isbinderalive) {
                if (isbinderalive == null) {
                    throw new NullPointerException("Null priority");
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = isbinderalive;
                return this;
            }

            @Override // o.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1
            public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setY() {
                String str = this.setX == null ? " backendName" : "";
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" priority");
                    str = sb.toString();
                }
                if (!str.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("Missing required properties:");
                    sb2.append(str);
                    throw new IllegalStateException(sb2.toString());
                }
                return new AnonymousClass4(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, (byte) 0);
            }
        }
    }

    /* renamed from: o.m$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract class AnonymousClass3 {
        public static final bN setIconTintList;

        public abstract setAccessibilityClassName setIconTintList();

        private AnonymousClass3() {
        }

        static {
            bN$MenuHostHelper$$ExternalSyntheticLambda0 bn_menuhosthelper__externalsyntheticlambda0 = new bN$MenuHostHelper$$ExternalSyntheticLambda0();
            setDropDownHeight.setY.MenuHostHelper$$ExternalSyntheticLambda0(bn_menuhosthelper__externalsyntheticlambda0);
            setIconTintList = new bN(new HashMap(bn_menuhosthelper__externalsyntheticlambda0.setY), new HashMap(bn_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0), bn_menuhosthelper__externalsyntheticlambda0.setX);
        }
    }

    /* renamed from: o.m$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends setStackedBackground {
        private nF<Executor> MenuHostHelper$$ExternalSyntheticLambda0;
        private nF<setCompatPressedTranslationZResource> MenuHostHelper$$ExternalSyntheticLambda1;
        private nF<setEditableFactory> ViewPager$SavedState$1;
        private nF<setBackgroundTintBlendMode> setChipCornerRadius;
        private nF<PublicSuffixDatabase> setIconTintList;
        private nF<setLengthCounter> setLayoutAnimation;
        private nF setNavigationOnClickListener;
        private nF<setPivotY> setOnLongClickListener;
        private nF<setOffscreenPageLimit> setTextAlignment;
        private nF<String> setUiOptions;
        private nF<Context> setUnboundedRipple;
        private nF setX;
        private nF setY;

        /* synthetic */ AnonymousClass1(Context context, byte b) {
            this(context);
        }

        private AnonymousClass1(Context context) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new registerForContextMenu(getStrokeWidth$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            if (context != null) {
                setTransitionDuration settransitionduration = new setTransitionDuration(context);
                this.setUnboundedRipple = settransitionduration;
                setProgressBackgroundTintList setprogressbackgroundtintlist = new setProgressBackgroundTintList(settransitionduration, setRenderEffect$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList, setLayoutFrozen$MenuHostHelper$$ExternalSyntheticLambda1.setX);
                this.setX = setprogressbackgroundtintlist;
                this.setY = new registerForContextMenu(new setTopEdgeEffectColor(this.setUnboundedRipple, setprogressbackgroundtintlist));
                this.setNavigationOnClickListener = new setLabelFor(this.setUnboundedRipple, setInlineLabelResource.setX.MenuHostHelper$$ExternalSyntheticLambda1, setMaxWidthResource$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
                this.setUiOptions = new registerForContextMenu(new setAnimationMatrix(this.setUnboundedRipple));
                this.setOnLongClickListener = new registerForContextMenu(new setCurrentItem(setRenderEffect$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList, setLayoutFrozen$MenuHostHelper$$ExternalSyntheticLambda1.setX, onActivityStopped.setX.MenuHostHelper$$ExternalSyntheticLambda1, this.setNavigationOnClickListener, this.setUiOptions));
                setChipDelegate setchipdelegate = new setChipDelegate(setRenderEffect$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setchipdelegate;
                setContentInsetEndWithActions setcontentinsetendwithactions = new setContentInsetEndWithActions(this.setUnboundedRipple, this.setOnLongClickListener, setchipdelegate, setLayoutFrozen$MenuHostHelper$$ExternalSyntheticLambda1.setX);
                this.setTextAlignment = setcontentinsetendwithactions;
                nF<Executor> nFVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
                nF nFVar2 = this.setY;
                nF<setPivotY> nFVar3 = this.setOnLongClickListener;
                this.setIconTintList = new isRound(nFVar, nFVar2, setcontentinsetendwithactions, nFVar3, nFVar3);
                nF<Context> nFVar4 = this.setUnboundedRipple;
                nF nFVar5 = this.setY;
                nF<setPivotY> nFVar6 = this.setOnLongClickListener;
                this.ViewPager$SavedState$1 = new onAppEnteredForeground(nFVar4, nFVar5, nFVar6, this.setTextAlignment, this.MenuHostHelper$$ExternalSyntheticLambda0, nFVar6, setRenderEffect$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList, setLayoutFrozen$MenuHostHelper$$ExternalSyntheticLambda1.setX, this.setOnLongClickListener);
                nF<Executor> nFVar7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                nF<setPivotY> nFVar8 = this.setOnLongClickListener;
                this.setChipCornerRadius = new setMovementMethod(nFVar7, nFVar8, this.setTextAlignment, nFVar8);
                final setRenderEffect setrendereffect = setRenderEffect$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
                final setLayoutFrozen setlayoutfrozen = setLayoutFrozen$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                final nF<PublicSuffixDatabase> nFVar9 = this.setIconTintList;
                final nF<setEditableFactory> nFVar10 = this.ViewPager$SavedState$1;
                final nF<setBackgroundTintBlendMode> nFVar11 = this.setChipCornerRadius;
                this.setLayoutAnimation = new registerForContextMenu(new setTag<setLengthCounter>(setrendereffect, setlayoutfrozen, nFVar9, nFVar10, nFVar11) { // from class: o.DateValidatorPointForward$1
                    private final nF<setSearchableInfo> MenuHostHelper$$ExternalSyntheticLambda0;
                    private final nF<SavedStateHandleController> MenuHostHelper$$ExternalSyntheticLambda1;
                    private final nF<setEditableFactory> setIconTintList;
                    private final nF<setBackgroundTintBlendMode> setX;
                    private final nF<setSearchableInfo> setY;

                    {
                        this.setY = setrendereffect;
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = setlayoutfrozen;
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar9;
                        this.setIconTintList = nFVar10;
                        this.setX = nFVar11;
                    }

                    @Override // o.nF
                    public final /* synthetic */ Object setIconTintList() {
                        return new setLengthCounter(this.setY.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), this.setIconTintList.setIconTintList(), this.setX.setIconTintList());
                    }
                });
                return;
            }
            throw new NullPointerException("instance cannot be null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setStackedBackground
        public final setLengthCounter setY() {
            return this.setLayoutAnimation.setIconTintList();
        }

        @Override // o.setStackedBackground
        final setCloseIconSize setX() {
            return this.setOnLongClickListener.setIconTintList();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.m$1$setY */
        /* loaded from: classes.dex */
        public static final class setY implements setStackedBackground$MenuHostHelper$$ExternalSyntheticLambda1 {
            private Context MenuHostHelper$$ExternalSyntheticLambda1;
            private static byte[] setY = {116, 58, -28, -63, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
            public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 38;

            private setY() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public /* synthetic */ setY(byte b) {
                this();
            }

            @Override // o.setStackedBackground$MenuHostHelper$$ExternalSyntheticLambda1
            public final setStackedBackground setX() {
                Context context = this.MenuHostHelper$$ExternalSyntheticLambda1;
                byte[] bArr = setY;
                byte[] bArr2 = new byte[23];
                int i = 97;
                int i2 = 4;
                int i3 = 0;
                if (bArr == null) {
                    i2 = 4 + 1;
                    i = (97 + 4) - 8;
                }
                while (true) {
                    bArr2[i3] = (byte) i;
                    i3++;
                    if (i3 == 23) {
                        break;
                    }
                    byte b = bArr[i2];
                    i2++;
                    i = (i + b) - 8;
                }
                Class<?> cls = Class.forName(new String(bArr2, 0));
                if (context != null) {
                    return new AnonymousClass1(this.MenuHostHelper$$ExternalSyntheticLambda1, (byte) 0);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append(" must be set");
                throw new IllegalStateException(sb.toString());
            }

            @Override // o.setStackedBackground$MenuHostHelper$$ExternalSyntheticLambda1
            public final /* bridge */ /* synthetic */ setStackedBackground$MenuHostHelper$$ExternalSyntheticLambda1 setY(Context context) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
                return this;
            }
        }
    }

    public C0286m(Context context) {
        super(context);
    }

    public C0286m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // o.setTabRippleColor, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r0 = r10.getPaddingRight()
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.setNavigationOnClickListener()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r4 == r5) goto L31
            r5 = 80
            if (r4 == r5) goto L28
            int r13 = r10.getPaddingTop()
            goto L3b
        L28:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L3b
        L31:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r4 + r15
        L3b:
            android.graphics.drawable.Drawable r15 = r10.setUiOptions()
            r1 = 0
            if (r15 != 0) goto L44
            r15 = 0
            goto L48
        L44:
            int r15 = r15.getIntrinsicHeight()
        L48:
            if (r1 >= r2) goto Lac
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto La9
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto La9
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            o.setTabRippleColor$setY r7 = (o.setTabRippleColor.setY) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L6e
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r8 = r8 & r3
        L6e:
            int r9 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r10)
            int r8 = o.setWeightSum.MenuHostHelper$$ExternalSyntheticLambda1(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L88
            r9 = 5
            if (r8 == r9) goto L82
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L95
        L82:
            int r8 = r14 - r12
            int r8 = r8 - r5
            int r9 = r7.rightMargin
            goto L94
        L88:
            int r8 = r14 - r11
            int r8 = r8 - r0
            int r8 = r8 - r5
            int r8 = r8 / 2
            int r8 = r8 + r11
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
        L94:
            int r8 = r8 - r9
        L95:
            boolean r9 = r10.MenuHostHelper$$ExternalSyntheticLambda0(r1)
            if (r9 == 0) goto L9c
            int r13 = r13 + r15
        L9c:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r6 + r13
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r13 = r13 + r6
        La9:
            int r1 = r1 + 1
            goto L48
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0286m.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTabRippleColor, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.res_0x7f0a01ff) {
                    view = childAt;
                } else if (id != R.id.res_0x7f0a006a) {
                    if ((id != R.id.res_0x7f0a008d && id != R.id.res_0x7f0a0097) || view3 != null) {
                        break;
                    }
                    view3 = childAt;
                } else {
                    view2 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            View view4 = view2;
            while (true) {
                i5 = setBaselineAlignBottom.setIconSize(view4);
                if (i5 > 0) {
                    break;
                } else if (!(view4 instanceof ViewGroup)) {
                    break;
                } else {
                    ViewGroup viewGroup = (ViewGroup) view4;
                    if (viewGroup.getChildCount() != 1) {
                        break;
                    }
                    view4 = viewGroup.getChildAt(0);
                }
            }
            i5 = 0;
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingTop;
        if (view2 != null) {
            int min = Math.min(i9, i4);
            if (min > 0) {
                i9 -= min;
                i7 = min + i5;
            } else {
                i7 = i5;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingTop = (paddingTop - i5) + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i9 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10 + getPaddingLeft() + getPaddingRight(), i, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    setTabRippleColor.setY sety = (setTabRippleColor.setY) childAt3.getLayoutParams();
                    if (((ViewGroup.LayoutParams) sety).width == -1) {
                        int i13 = ((ViewGroup.LayoutParams) sety).height;
                        ((ViewGroup.LayoutParams) sety).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        ((ViewGroup.LayoutParams) sety).height = i13;
                    }
                }
            }
        }
        z = true;
        if (z) {
            return;
        }
        super.onMeasure(i, i2);
    }
}