package o;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import o.vC;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ye  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0621ye<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setY(C0623yg c0623yg, @Nullable T t);

    /* renamed from: o.ye$setChipCornerRadius */
    /* loaded from: classes.dex */
    static final class setChipCornerRadius extends AbstractC0621ye<Object> {
        private final Method MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setChipCornerRadius(Method method, int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = method;
            this.setIconTintList = i;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable Object obj) {
            if (obj == null) {
                throw C0629ym.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, "@Url parameter is null.", new Object[0]);
            }
            c0623yg.setUnboundedRipple = obj.toString();
        }
    }

    /* renamed from: o.ye$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList<T> extends AbstractC0621ye<T> {
        private final String MenuHostHelper$$ExternalSyntheticLambda0;
        private final xU<T, String> setIconTintList;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(String str, xU<T, String> xUVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = (String) Objects.requireNonNull(str, "name == null");
            this.setIconTintList = xUVar;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable T t) {
            String y;
            if (t == null || (y = this.setIconTintList.setY(t)) == null) {
                return;
            }
            c0623yg.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, y);
        }
    }

    /* renamed from: o.ye$setLayoutAnimation */
    /* loaded from: classes.dex */
    static final class setLayoutAnimation<T> extends AbstractC0621ye<T> {
        private final Method MenuHostHelper$$ExternalSyntheticLambda0;
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final String setIconTintList;
        private final boolean setX;
        private final xU<T, String> setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setLayoutAnimation(Method method, int i, String str, xU<T, String> xUVar, boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = method;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setIconTintList = (String) Objects.requireNonNull(str, "name == null");
            this.setY = xUVar;
            this.setX = z;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable T t) {
            if (t == null) {
                Method method = this.MenuHostHelper$$ExternalSyntheticLambda0;
                int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
                StringBuilder sb = new StringBuilder("Path parameter \"");
                sb.append(this.setIconTintList);
                sb.append("\" value must not be null.");
                throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
            }
            String str = this.setIconTintList;
            String y = this.setY.setY(t);
            boolean z = this.setX;
            if (c0623yg.setUnboundedRipple == null) {
                throw new AssertionError();
            }
            String x = C0623yg.setX(y, z);
            String str2 = c0623yg.setUnboundedRipple;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append(str);
            sb2.append("}");
            String replace = str2.replace(sb2.toString(), x);
            if (C0623yg.MenuHostHelper$$ExternalSyntheticLambda0.matcher(replace).matches()) {
                StringBuilder sb3 = new StringBuilder("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
                sb3.append(y);
                throw new IllegalArgumentException(sb3.toString());
            }
            c0623yg.setUnboundedRipple = replace;
        }
    }

    /* renamed from: o.ye$setNavigationOnClickListener */
    /* loaded from: classes.dex */
    static final class setNavigationOnClickListener<T> extends AbstractC0621ye<T> {
        private final xU<T, String> MenuHostHelper$$ExternalSyntheticLambda0;
        private final String MenuHostHelper$$ExternalSyntheticLambda1;
        private final boolean setX;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setNavigationOnClickListener(String str, xU<T, String> xUVar, boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = (String) Objects.requireNonNull(str, "name == null");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = xUVar;
            this.setX = z;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable T t) {
            String y;
            if (t == null || (y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(t)) == null) {
                return;
            }
            c0623yg.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, y, this.setX);
        }
    }

    /* renamed from: o.ye$setCenterIfNoTextEnabled */
    /* loaded from: classes.dex */
    static final class setCenterIfNoTextEnabled<T> extends AbstractC0621ye<T> {
        private final xU<T, String> MenuHostHelper$$ExternalSyntheticLambda1;
        private final boolean setX;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setCenterIfNoTextEnabled(xU<T, String> xUVar, boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = xUVar;
            this.setX = z;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable T t) {
            if (t == null) {
                return;
            }
            c0623yg.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.setY(t), null, this.setX);
        }
    }

    /* renamed from: o.ye$setIconSize */
    /* loaded from: classes.dex */
    static final class setIconSize<T> extends AbstractC0621ye<Map<String, T>> {
        private final int MenuHostHelper$$ExternalSyntheticLambda0;
        private final xU<T, String> MenuHostHelper$$ExternalSyntheticLambda1;
        private final Method setIconTintList;
        private final boolean setY;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC0621ye
        final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw C0629ym.setY(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C0629ym.setY(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.setIconTintList;
                    int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    StringBuilder sb = new StringBuilder("Query map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
                }
                String str2 = (String) this.MenuHostHelper$$ExternalSyntheticLambda1.setY(value);
                if (str2 == null) {
                    Method method2 = this.setIconTintList;
                    int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    StringBuilder sb2 = new StringBuilder("Query map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw C0629ym.setY(method2, i2, sb2.toString(), new Object[0]);
                }
                c0623yg.MenuHostHelper$$ExternalSyntheticLambda0(str, str2, this.setY);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconSize(Method method, int i, xU<T, String> xUVar, boolean z) {
            this.setIconTintList = method;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = xUVar;
            this.setY = z;
        }
    }

    /* renamed from: o.ye$setX */
    /* loaded from: classes.dex */
    static final class setX<T> extends AbstractC0621ye<Map<String, T>> {
        private final xU<T, String> MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final Method setX;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC0621ye
        final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw C0629ym.setY(this.setX, this.setIconTintList, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C0629ym.setY(this.setX, this.setIconTintList, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.setX;
                    int i = this.setIconTintList;
                    StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
                }
                c0623yg.setY(str, (String) this.MenuHostHelper$$ExternalSyntheticLambda1.setY(value));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(Method method, int i, xU<T, String> xUVar) {
            this.setX = method;
            this.setIconTintList = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = xUVar;
        }
    }

    /* renamed from: o.ye$setUiOptions */
    /* loaded from: classes.dex */
    static final class setUiOptions extends AbstractC0621ye<C0557vz> {
        private final int setIconTintList;
        private final Method setX;

        @Override // o.AbstractC0621ye
        final /* bridge */ /* synthetic */ void setY(C0623yg c0623yg, @Nullable C0557vz c0557vz) {
            C0557vz c0557vz2 = c0557vz;
            if (c0557vz2 == null) {
                throw C0629ym.setY(this.setX, this.setIconTintList, "Headers parameter must not be null.", new Object[0]);
            }
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = c0623yg.setUiOptions;
            pN.setY(c0557vz2, "");
            int length = c0557vz2.setIconTintList.length / 2;
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setY(c0557vz2.setIconTintList[i2], c0557vz2.setIconTintList[i2 + 1]);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setUiOptions(Method method, int i) {
            this.setX = method;
            this.setIconTintList = i;
        }
    }

    /* renamed from: o.ye$setY */
    /* loaded from: classes.dex */
    static final class setY<T> extends AbstractC0621ye<Map<String, T>> {
        private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final Method setX;
        private final xU<T, String> setY;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC0621ye
        final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw C0629ym.setY(this.setX, this.setIconTintList, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C0629ym.setY(this.setX, this.setIconTintList, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.setX;
                    int i = this.setIconTintList;
                    StringBuilder sb = new StringBuilder("Field map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
                }
                String str2 = (String) this.setY.setY(value);
                if (str2 == null) {
                    Method method2 = this.setX;
                    int i2 = this.setIconTintList;
                    StringBuilder sb2 = new StringBuilder("Field map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.setY.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw C0629ym.setY(method2, i2, sb2.toString(), new Object[0]);
                } else if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setX(str, str2);
                } else {
                    c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str, str2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(Method method, int i, xU<T, String> xUVar, boolean z) {
            this.setX = method;
            this.setIconTintList = i;
            this.setY = xUVar;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        }
    }

    /* renamed from: o.ye$setOnLongClickListener */
    /* loaded from: classes.dex */
    static final class setOnLongClickListener<T> extends AbstractC0621ye<T> {
        private final Method MenuHostHelper$$ExternalSyntheticLambda1;
        private final xU<T, vF> setIconTintList;
        private final int setX;
        private final C0557vz setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setOnLongClickListener(Method method, int i, C0557vz c0557vz, xU<T, vF> xUVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = method;
            this.setX = i;
            this.setY = c0557vz;
            this.setIconTintList = xUVar;
        }

        @Override // o.AbstractC0621ye
        final void setY(C0623yg c0623yg, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                c0623yg.setNavigationOnClickListener.setX(this.setY, this.setIconTintList.setY(t));
            } catch (IOException e) {
                Method method = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int i = this.setX;
                StringBuilder sb = new StringBuilder("Unable to convert ");
                sb.append(t);
                sb.append(" to RequestBody");
                throw C0629ym.setY(method, i, sb.toString(), e);
            }
        }
    }

    /* renamed from: o.ye$setTextAlignment */
    /* loaded from: classes.dex */
    static final class setTextAlignment extends AbstractC0621ye<vC.setY> {
        static final setTextAlignment setY = new setTextAlignment();

        @Override // o.AbstractC0621ye
        final /* synthetic */ void setY(C0623yg c0623yg, @Nullable vC.setY sety) {
            vC.setY sety2 = sety;
            if (sety2 != null) {
                vC$MenuHostHelper$$ExternalSyntheticLambda1 vc_menuhosthelper__externalsyntheticlambda1 = c0623yg.setNavigationOnClickListener;
                pN.setY(sety2, "");
                vc_menuhosthelper__externalsyntheticlambda1.setY.add(sety2);
            }
        }

        private setTextAlignment() {
        }
    }

    /* renamed from: o.ye$setUnboundedRipple */
    /* loaded from: classes.dex */
    static final class setUnboundedRipple<T> extends AbstractC0621ye<Map<String, T>> {
        private final String MenuHostHelper$$ExternalSyntheticLambda0;
        private final Method MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final xU<T, vF> setY;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC0621ye
        final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw C0629ym.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C0629ym.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    int i = this.setIconTintList;
                    StringBuilder sb = new StringBuilder("Part map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
                }
                StringBuilder sb2 = new StringBuilder("form-data; name=\"");
                sb2.append(str);
                sb2.append("\"");
                c0623yg.setNavigationOnClickListener.setX(C0557vz.setIconTintList("Content-Disposition", sb2.toString(), "Content-Transfer-Encoding", this.MenuHostHelper$$ExternalSyntheticLambda0), (vF) this.setY.setY(value));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setUnboundedRipple(Method method, int i, xU<T, vF> xUVar, String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = method;
            this.setIconTintList = i;
            this.setY = xUVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        }
    }
}