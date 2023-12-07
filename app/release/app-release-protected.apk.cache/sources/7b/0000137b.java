package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.InterfaceC0541vk;
import o.xQ;
import o.xU;

/* renamed from: o.yh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624yh {
    final List<xQ.setY> MenuHostHelper$$ExternalSyntheticLambda0;
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private InterfaceC0541vk.setY setIconTintList;
    private List<xU.setX> setNavigationOnClickListener;
    private final Map<Method, yo<?>> setOnLongClickListener = new ConcurrentHashMap();
    final C0555vx setX;
    @Nullable
    private Executor setY;

    public C0624yh(InterfaceC0541vk.setY sety, C0555vx c0555vx, List<xU.setX> list, List<xQ.setY> list2, @Nullable Executor executor, boolean z) {
        this.setIconTintList = sety;
        this.setX = c0555vx;
        this.setNavigationOnClickListener = list;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = list2;
        this.setY = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0192, code lost:
        throw o.C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(r1.setChipCornerRadius, "Form-encoded method must contain at least one @Field.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
        if (r1.setIconTintList == false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.yo<?> MenuHostHelper$$ExternalSyntheticLambda1(java.lang.reflect.Method r11) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0624yh.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.reflect.Method):o.yo");
    }

    public final <T> xU<T, vF> setY(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.setNavigationOnClickListener.indexOf(null) + 1;
        int size = this.setNavigationOnClickListener.size();
        for (int i = indexOf; i < size; i++) {
            xU<T, vF> xUVar = (xU<T, vF>) this.setNavigationOnClickListener.get(i).setY(type);
            if (xUVar != null) {
                return xUVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.setNavigationOnClickListener.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.setNavigationOnClickListener.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> xU<vH, T> MenuHostHelper$$ExternalSyntheticLambda1(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.setNavigationOnClickListener.indexOf(null) + 1;
        int size = this.setNavigationOnClickListener.size();
        for (int i = indexOf; i < size; i++) {
            xU<vH, T> xUVar = (xU<vH, T>) this.setNavigationOnClickListener.get(i).MenuHostHelper$$ExternalSyntheticLambda0(type, annotationArr, this);
            if (xUVar != null) {
                return xUVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.setNavigationOnClickListener.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.setNavigationOnClickListener.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> xU<T, String> setY(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.setNavigationOnClickListener.size();
        for (int i = 0; i < size; i++) {
            this.setNavigationOnClickListener.get(i);
        }
        return xP$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* renamed from: o.yh$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        public final List<xU.setX> MenuHostHelper$$ExternalSyntheticLambda0;
        @Nullable
        public InterfaceC0541vk.setY MenuHostHelper$$ExternalSyntheticLambda1;
        public final List<xQ.setY> setIconTintList;
        public boolean setLayoutAnimation;
        public final C0626yj setUnboundedRipple;
        @Nullable
        public Executor setX;
        @Nullable
        public C0555vx setY;

        private setY(C0626yj c0626yj) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList();
            this.setIconTintList = new ArrayList();
            this.setUnboundedRipple = c0626yj;
        }

        public setY() {
            this(C0626yj.setIconTintList());
        }
    }
}