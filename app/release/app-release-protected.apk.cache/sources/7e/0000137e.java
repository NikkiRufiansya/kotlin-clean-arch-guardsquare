package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.AbstractC0621ye;
import o.vA;
import o.vC;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.yi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625yi {
    final C0555vx MenuHostHelper$$ExternalSyntheticLambda0;
    @Nullable
    final vA MenuHostHelper$$ExternalSyntheticLambda1;
    @Nullable
    final String setIconSize;
    @Nullable
    final C0557vz setIconTintList;
    final Method setLayoutAnimation;
    final boolean setNavigationOnClickListener;
    final boolean setOnLongClickListener;
    final boolean setUiOptions;
    final AbstractC0621ye<?>[] setUnboundedRipple;
    final String setX;
    final boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0625yi(setIconTintList seticontintlist) {
        this.setLayoutAnimation = seticontintlist.setChipCornerRadius;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.setOnNavigationItemSelectedListener.setX;
        this.setX = seticontintlist.setUiOptions;
        this.setIconSize = seticontintlist.setMaxEms;
        this.setIconTintList = seticontintlist.setUnboundedRipple;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.setY;
        this.setY = seticontintlist.setOnLongClickListener;
        this.setOnLongClickListener = seticontintlist.setLayoutAnimation;
        this.setUiOptions = seticontintlist.setCenterIfNoTextEnabled;
        this.setUnboundedRipple = seticontintlist.setIconSize;
        this.setNavigationOnClickListener = seticontintlist.setNavigationOnClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yi$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private static final Pattern setAnimationFromJson = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern setTextScaleX = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final Annotation[] ViewPager$SavedState$1;
        boolean setCenterIfNoTextEnabled;
        private boolean setCheckedIconEnabled;
        final Method setChipCornerRadius;
        @Nullable
        private Set<String> setGuidelinePercent;
        @Nullable
        AbstractC0621ye<?>[] setIconSize;
        boolean setIconTintList;
        boolean setLayoutAnimation;
        private boolean setLayoutDirection;
        @Nullable
        String setMaxEms;
        private boolean setMinAndMaxProgress;
        boolean setNavigationOnClickListener;
        boolean setOnLongClickListener;
        final C0624yh setOnNavigationItemSelectedListener;
        final Annotation[][] setTextAlignment;
        private boolean setTextAppearanceResource;
        @Nullable
        String setUiOptions;
        @Nullable
        C0557vz setUnboundedRipple;
        boolean setX;
        @Nullable
        vA setY;
        final Type[] setZ;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(C0624yh c0624yh, Method method) {
            this.setOnNavigationItemSelectedListener = c0624yh;
            this.setChipCornerRadius = method;
            this.ViewPager$SavedState$1 = method.getAnnotations();
            this.setZ = method.getGenericParameterTypes();
            this.setTextAlignment = method.getParameterAnnotations();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2, boolean z) {
            RuntimeException MenuHostHelper$$ExternalSyntheticLambda0;
            RuntimeException MenuHostHelper$$ExternalSyntheticLambda02;
            String str3 = this.setUiOptions;
            if (str3 != null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
                throw MenuHostHelper$$ExternalSyntheticLambda0;
            }
            this.setUiOptions = str;
            this.setOnLongClickListener = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (setAnimationFromJson.matcher(substring).find()) {
                    MenuHostHelper$$ExternalSyntheticLambda02 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    throw MenuHostHelper$$ExternalSyntheticLambda02;
                }
            }
            this.setMaxEms = str2;
            this.setGuidelinePercent = MenuHostHelper$$ExternalSyntheticLambda0(str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final C0557vz setIconTintList(String[] strArr) {
            RuntimeException MenuHostHelper$$ExternalSyntheticLambda0;
            vA y;
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                    throw MenuHostHelper$$ExternalSyntheticLambda0;
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        y = vA.setIconTintList.setY(trim);
                        this.setY = y;
                    } catch (IllegalArgumentException e) {
                        throw C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, e, "Malformed content type: %s", trim);
                    }
                } else {
                    c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(substring, trim);
                }
            }
            return c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public final AbstractC0621ye<?> MenuHostHelper$$ExternalSyntheticLambda0(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            AbstractC0621ye<?> abstractC0621ye;
            if (annotationArr != null) {
                abstractC0621ye = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC0621ye<?> y = setY(i, type, annotationArr, annotation);
                    if (y != null) {
                        if (abstractC0621ye != null) {
                            throw C0629ym.setY(this.setChipCornerRadius, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC0621ye = y;
                    }
                }
            } else {
                abstractC0621ye = null;
            }
            if (abstractC0621ye == null) {
                if (z) {
                    try {
                        if (C0629ym.setIconTintList(type) == oK.class) {
                            this.setNavigationOnClickListener = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw C0629ym.setY(this.setChipCornerRadius, i, "No Retrofit annotation found.", new Object[0]);
            }
            return abstractC0621ye;
        }

        @Nullable
        private AbstractC0621ye<?> setY(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof yR) {
                setY(i, type);
                if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.setTextAppearanceResource) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.setCheckedIconEnabled) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.setLayoutDirection) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.setMinAndMaxProgress) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.setMaxEms == null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                    if (type == C0555vx.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC0621ye.setChipCornerRadius(this.setChipCornerRadius, i);
                    }
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                }
                throw C0629ym.setY(this.setChipCornerRadius, i, "@Url cannot be used with @%s URL", this.setUiOptions);
            } else if (annotation instanceof yM) {
                setY(i, type);
                if (this.setCheckedIconEnabled) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.setLayoutDirection) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.setMinAndMaxProgress) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.setMaxEms != null) {
                    this.setTextAppearanceResource = true;
                    yM yMVar = (yM) annotation;
                    String MenuHostHelper$$ExternalSyntheticLambda1 = yMVar.MenuHostHelper$$ExternalSyntheticLambda1();
                    if (!setTextScaleX.matcher(MenuHostHelper$$ExternalSyntheticLambda1).matches()) {
                        throw C0629ym.setY(this.setChipCornerRadius, i, "@Path parameter name must match %s. Found: %s", setAnimationFromJson.pattern(), MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                    if (this.setGuidelinePercent.contains(MenuHostHelper$$ExternalSyntheticLambda1)) {
                        return new AbstractC0621ye.setLayoutAnimation(this.setChipCornerRadius, i, MenuHostHelper$$ExternalSyntheticLambda1, this.setOnNavigationItemSelectedListener.setY(type, annotationArr), yMVar.setY());
                    }
                    throw C0629ym.setY(this.setChipCornerRadius, i, "URL \"%s\" does not contain \"{%s}\".", this.setMaxEms, MenuHostHelper$$ExternalSyntheticLambda1);
                }
                throw C0629ym.setY(this.setChipCornerRadius, i, "@Path can only be used with relative url on @%s", this.setUiOptions);
            } else if (annotation instanceof yJ) {
                setY(i, type);
                yJ yJVar = (yJ) annotation;
                String iconTintList = yJVar.setIconTintList();
                boolean x = yJVar.setX();
                Class<?> iconTintList2 = C0629ym.setIconTintList(type);
                this.setCheckedIconEnabled = true;
                if (Iterable.class.isAssignableFrom(iconTintList2)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method = this.setChipCornerRadius;
                        StringBuilder sb = new StringBuilder();
                        sb.append(iconTintList2.getSimpleName());
                        sb.append(" must include generic type (e.g., ");
                        sb.append(iconTintList2.getSimpleName());
                        sb.append("<String>)");
                        throw C0629ym.setY(method, i, sb.toString(), new Object[0]);
                    }
                    final AbstractC0621ye.setNavigationOnClickListener setnavigationonclicklistener = new AbstractC0621ye.setNavigationOnClickListener(iconTintList, this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type), annotationArr), x);
                    return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                            Iterable<T> iterable = (Iterable) obj;
                            if (iterable != null) {
                                for (T t : iterable) {
                                    setnavigationonclicklistener.setY(c0623yg, t);
                                }
                            }
                        }
                    };
                } else if (iconTintList2.isArray()) {
                    final AbstractC0621ye.setNavigationOnClickListener setnavigationonclicklistener2 = new AbstractC0621ye.setNavigationOnClickListener(iconTintList, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList2.getComponentType()), annotationArr), x);
                    return new AbstractC0621ye<Object>() { // from class: o.ye.3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                            if (obj == null) {
                                return;
                            }
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                setnavigationonclicklistener2.setY(c0623yg, Array.get(obj, i2));
                            }
                        }
                    };
                } else {
                    return new AbstractC0621ye.setNavigationOnClickListener(iconTintList, this.setOnNavigationItemSelectedListener.setY(type, annotationArr), x);
                }
            } else if (annotation instanceof yL) {
                setY(i, type);
                boolean x2 = ((yL) annotation).setX();
                Class<?> iconTintList3 = C0629ym.setIconTintList(type);
                this.setLayoutDirection = true;
                if (Iterable.class.isAssignableFrom(iconTintList3)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method2 = this.setChipCornerRadius;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iconTintList3.getSimpleName());
                        sb2.append(" must include generic type (e.g., ");
                        sb2.append(iconTintList3.getSimpleName());
                        sb2.append("<String>)");
                        throw C0629ym.setY(method2, i, sb2.toString(), new Object[0]);
                    }
                    final AbstractC0621ye.setCenterIfNoTextEnabled setcenterifnotextenabled = new AbstractC0621ye.setCenterIfNoTextEnabled(this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type), annotationArr), x2);
                    return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                            Iterable<T> iterable = (Iterable) obj;
                            if (iterable != null) {
                                for (T t : iterable) {
                                    setcenterifnotextenabled.setY(c0623yg, t);
                                }
                            }
                        }
                    };
                } else if (iconTintList3.isArray()) {
                    final AbstractC0621ye.setCenterIfNoTextEnabled setcenterifnotextenabled2 = new AbstractC0621ye.setCenterIfNoTextEnabled(this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList3.getComponentType()), annotationArr), x2);
                    return new AbstractC0621ye<Object>() { // from class: o.ye.3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                            if (obj == null) {
                                return;
                            }
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                setcenterifnotextenabled2.setY(c0623yg, Array.get(obj, i2));
                            }
                        }
                    };
                } else {
                    return new AbstractC0621ye.setCenterIfNoTextEnabled(this.setOnNavigationItemSelectedListener.setY(type, annotationArr), x2);
                }
            } else if (annotation instanceof yK) {
                setY(i, type);
                Class<?> iconTintList4 = C0629ym.setIconTintList(type);
                this.setMinAndMaxProgress = true;
                if (!Map.class.isAssignableFrom(iconTintList4)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type MenuHostHelper$$ExternalSyntheticLambda0 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(type, iconTintList4, Map.class);
                if (!(MenuHostHelper$$ExternalSyntheticLambda0 instanceof ParameterizedType)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) MenuHostHelper$$ExternalSyntheticLambda0;
                Type MenuHostHelper$$ExternalSyntheticLambda02 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, parameterizedType);
                if (String.class != MenuHostHelper$$ExternalSyntheticLambda02) {
                    Method method3 = this.setChipCornerRadius;
                    StringBuilder sb3 = new StringBuilder("@QueryMap keys must be of type String: ");
                    sb3.append(MenuHostHelper$$ExternalSyntheticLambda02);
                    throw C0629ym.setY(method3, i, sb3.toString(), new Object[0]);
                }
                return new AbstractC0621ye.setIconSize(this.setChipCornerRadius, i, this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(1, parameterizedType), annotationArr), ((yK) annotation).MenuHostHelper$$ExternalSyntheticLambda1());
            } else if (annotation instanceof yA) {
                setY(i, type);
                String MenuHostHelper$$ExternalSyntheticLambda03 = ((yA) annotation).MenuHostHelper$$ExternalSyntheticLambda0();
                Class<?> iconTintList5 = C0629ym.setIconTintList(type);
                if (Iterable.class.isAssignableFrom(iconTintList5)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method4 = this.setChipCornerRadius;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iconTintList5.getSimpleName());
                        sb4.append(" must include generic type (e.g., ");
                        sb4.append(iconTintList5.getSimpleName());
                        sb4.append("<String>)");
                        throw C0629ym.setY(method4, i, sb4.toString(), new Object[0]);
                    }
                    final AbstractC0621ye.setIconTintList seticontintlist = new AbstractC0621ye.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda03, this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type), annotationArr));
                    return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                            Iterable<T> iterable = (Iterable) obj;
                            if (iterable != null) {
                                for (T t : iterable) {
                                    seticontintlist.setY(c0623yg, t);
                                }
                            }
                        }
                    };
                } else if (iconTintList5.isArray()) {
                    final AbstractC0621ye.setIconTintList seticontintlist2 = new AbstractC0621ye.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda03, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList5.getComponentType()), annotationArr));
                    return new AbstractC0621ye<Object>() { // from class: o.ye.3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                            if (obj == null) {
                                return;
                            }
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                seticontintlist2.setY(c0623yg, Array.get(obj, i2));
                            }
                        }
                    };
                } else {
                    return new AbstractC0621ye.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda03, this.setOnNavigationItemSelectedListener.setY(type, annotationArr));
                }
            } else if (annotation instanceof yB) {
                if (type == C0557vz.class) {
                    return new AbstractC0621ye.setUiOptions(this.setChipCornerRadius, i);
                }
                setY(i, type);
                Class<?> iconTintList6 = C0629ym.setIconTintList(type);
                if (!Map.class.isAssignableFrom(iconTintList6)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type MenuHostHelper$$ExternalSyntheticLambda04 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(type, iconTintList6, Map.class);
                if (!(MenuHostHelper$$ExternalSyntheticLambda04 instanceof ParameterizedType)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) MenuHostHelper$$ExternalSyntheticLambda04;
                Type MenuHostHelper$$ExternalSyntheticLambda05 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, parameterizedType2);
                if (String.class != MenuHostHelper$$ExternalSyntheticLambda05) {
                    Method method5 = this.setChipCornerRadius;
                    StringBuilder sb5 = new StringBuilder("@HeaderMap keys must be of type String: ");
                    sb5.append(MenuHostHelper$$ExternalSyntheticLambda05);
                    throw C0629ym.setY(method5, i, sb5.toString(), new Object[0]);
                }
                return new AbstractC0621ye.setX(this.setChipCornerRadius, i, this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(1, parameterizedType2), annotationArr));
            } else if (annotation instanceof InterfaceC0631yq) {
                setY(i, type);
                if (!this.setLayoutAnimation) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC0631yq interfaceC0631yq = (InterfaceC0631yq) annotation;
                String x3 = interfaceC0631yq.setX();
                boolean y = interfaceC0631yq.setY();
                this.setIconTintList = true;
                Class<?> iconTintList7 = C0629ym.setIconTintList(type);
                if (Iterable.class.isAssignableFrom(iconTintList7)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method6 = this.setChipCornerRadius;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(iconTintList7.getSimpleName());
                        sb6.append(" must include generic type (e.g., ");
                        sb6.append(iconTintList7.getSimpleName());
                        sb6.append("<String>)");
                        throw C0629ym.setY(method6, i, sb6.toString(), new Object[0]);
                    }
                    final AbstractC0621ye<T> abstractC0621ye = new AbstractC0621ye<T>(x3, this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type), annotationArr), y) { // from class: o.ye$MenuHostHelper$$ExternalSyntheticLambda0
                        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
                        private final xU<T, String> setIconTintList;
                        private final String setX;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.setX = (String) Objects.requireNonNull(x3, "name == null");
                            this.setIconTintList = r3;
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable T t) {
                            String y2;
                            if (t == null || (y2 = this.setIconTintList.setY(t)) == null) {
                                return;
                            }
                            String str = this.setX;
                            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setX(str, y2);
                            } else {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str, y2);
                            }
                        }
                    };
                    return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                            Iterable<T> iterable = (Iterable) obj;
                            if (iterable != null) {
                                for (T t : iterable) {
                                    abstractC0621ye.setY(c0623yg, t);
                                }
                            }
                        }
                    };
                } else if (iconTintList7.isArray()) {
                    final AbstractC0621ye<T> abstractC0621ye2 = new AbstractC0621ye<T>(x3, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda1(iconTintList7.getComponentType()), annotationArr), y) { // from class: o.ye$MenuHostHelper$$ExternalSyntheticLambda0
                        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
                        private final xU<T, String> setIconTintList;
                        private final String setX;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.setX = (String) Objects.requireNonNull(x3, "name == null");
                            this.setIconTintList = r3;
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable T t) {
                            String y2;
                            if (t == null || (y2 = this.setIconTintList.setY(t)) == null) {
                                return;
                            }
                            String str = this.setX;
                            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setX(str, y2);
                            } else {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str, y2);
                            }
                        }
                    };
                    return new AbstractC0621ye<Object>() { // from class: o.ye.3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                            if (obj == null) {
                                return;
                            }
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                abstractC0621ye2.setY(c0623yg, Array.get(obj, i2));
                            }
                        }
                    };
                } else {
                    return new AbstractC0621ye<T>(x3, this.setOnNavigationItemSelectedListener.setY(type, annotationArr), y) { // from class: o.ye$MenuHostHelper$$ExternalSyntheticLambda0
                        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
                        private final xU<T, String> setIconTintList;
                        private final String setX;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.setX = (String) Objects.requireNonNull(x3, "name == null");
                            this.setIconTintList = r3;
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable T t) {
                            String y2;
                            if (t == null || (y2 = this.setIconTintList.setY(t)) == null) {
                                return;
                            }
                            String str = this.setX;
                            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setX(str, y2);
                            } else {
                                c0623yg.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str, y2);
                            }
                        }
                    };
                }
            } else if (annotation instanceof yy) {
                setY(i, type);
                if (!this.setLayoutAnimation) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> iconTintList8 = C0629ym.setIconTintList(type);
                if (!Map.class.isAssignableFrom(iconTintList8)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type MenuHostHelper$$ExternalSyntheticLambda06 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(type, iconTintList8, Map.class);
                if (!(MenuHostHelper$$ExternalSyntheticLambda06 instanceof ParameterizedType)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) MenuHostHelper$$ExternalSyntheticLambda06;
                Type MenuHostHelper$$ExternalSyntheticLambda07 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, parameterizedType3);
                if (String.class != MenuHostHelper$$ExternalSyntheticLambda07) {
                    Method method7 = this.setChipCornerRadius;
                    StringBuilder sb7 = new StringBuilder("@FieldMap keys must be of type String: ");
                    sb7.append(MenuHostHelper$$ExternalSyntheticLambda07);
                    throw C0629ym.setY(method7, i, sb7.toString(), new Object[0]);
                }
                xU y2 = this.setOnNavigationItemSelectedListener.setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(1, parameterizedType3), annotationArr);
                this.setIconTintList = true;
                return new AbstractC0621ye.setY(this.setChipCornerRadius, i, y2, ((yy) annotation).setY());
            } else if (annotation instanceof yF) {
                setY(i, type);
                if (!this.setCenterIfNoTextEnabled) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                yF yFVar = (yF) annotation;
                this.setX = true;
                String MenuHostHelper$$ExternalSyntheticLambda12 = yFVar.MenuHostHelper$$ExternalSyntheticLambda1();
                Class<?> iconTintList9 = C0629ym.setIconTintList(type);
                if (MenuHostHelper$$ExternalSyntheticLambda12.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(iconTintList9)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method8 = this.setChipCornerRadius;
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(iconTintList9.getSimpleName());
                            sb8.append(" must include generic type (e.g., ");
                            sb8.append(iconTintList9.getSimpleName());
                            sb8.append("<String>)");
                            throw C0629ym.setY(method8, i, sb8.toString(), new Object[0]);
                        } else if (!vC.setY.class.isAssignableFrom(C0629ym.setIconTintList(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type)))) {
                            throw C0629ym.setY(this.setChipCornerRadius, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else {
                            final AbstractC0621ye.setTextAlignment settextalignment = AbstractC0621ye.setTextAlignment.setY;
                            return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                                /* JADX INFO: Access modifiers changed from: package-private */
                                @Override // o.AbstractC0621ye
                                public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                                    Iterable<T> iterable = (Iterable) obj;
                                    if (iterable != null) {
                                        for (T t : iterable) {
                                            settextalignment.setY(c0623yg, t);
                                        }
                                    }
                                }
                            };
                        }
                    } else if (iconTintList9.isArray()) {
                        if (!vC.setY.class.isAssignableFrom(iconTintList9.getComponentType())) {
                            throw C0629ym.setY(this.setChipCornerRadius, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        final AbstractC0621ye.setTextAlignment settextalignment2 = AbstractC0621ye.setTextAlignment.setY;
                        return new AbstractC0621ye<Object>() { // from class: o.ye.3
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // o.AbstractC0621ye
                            public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                                if (obj == null) {
                                    return;
                                }
                                int length = Array.getLength(obj);
                                for (int i2 = 0; i2 < length; i2++) {
                                    settextalignment2.setY(c0623yg, Array.get(obj, i2));
                                }
                            }
                        };
                    } else if (vC.setY.class.isAssignableFrom(iconTintList9)) {
                        return AbstractC0621ye.setTextAlignment.setY;
                    } else {
                        throw C0629ym.setY(this.setChipCornerRadius, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                StringBuilder sb9 = new StringBuilder("form-data; name=\"");
                sb9.append(MenuHostHelper$$ExternalSyntheticLambda12);
                sb9.append("\"");
                C0557vz iconTintList10 = C0557vz.setIconTintList("Content-Disposition", sb9.toString(), "Content-Transfer-Encoding", yFVar.MenuHostHelper$$ExternalSyntheticLambda0());
                if (Iterable.class.isAssignableFrom(iconTintList9)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method9 = this.setChipCornerRadius;
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(iconTintList9.getSimpleName());
                        sb10.append(" must include generic type (e.g., ");
                        sb10.append(iconTintList9.getSimpleName());
                        sb10.append("<String>)");
                        throw C0629ym.setY(method9, i, sb10.toString(), new Object[0]);
                    }
                    Type MenuHostHelper$$ExternalSyntheticLambda08 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type);
                    if (vC.setY.class.isAssignableFrom(C0629ym.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda08))) {
                        throw C0629ym.setY(this.setChipCornerRadius, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    final AbstractC0621ye.setOnLongClickListener setonlongclicklistener = new AbstractC0621ye.setOnLongClickListener(this.setChipCornerRadius, i, iconTintList10, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda08, annotationArr, this.ViewPager$SavedState$1));
                    return new AbstractC0621ye<Iterable<T>>() { // from class: o.ye.4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final /* synthetic */ void setY(C0623yg c0623yg, @Nullable Object obj) {
                            Iterable<T> iterable = (Iterable) obj;
                            if (iterable != null) {
                                for (T t : iterable) {
                                    setonlongclicklistener.setY(c0623yg, t);
                                }
                            }
                        }
                    };
                } else if (iconTintList9.isArray()) {
                    Class<?> MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(iconTintList9.getComponentType());
                    if (vC.setY.class.isAssignableFrom(MenuHostHelper$$ExternalSyntheticLambda13)) {
                        throw C0629ym.setY(this.setChipCornerRadius, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    final AbstractC0621ye.setOnLongClickListener setonlongclicklistener2 = new AbstractC0621ye.setOnLongClickListener(this.setChipCornerRadius, i, iconTintList10, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda13, annotationArr, this.ViewPager$SavedState$1));
                    return new AbstractC0621ye<Object>() { // from class: o.ye.3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable Object obj) {
                            if (obj == null) {
                                return;
                            }
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                setonlongclicklistener2.setY(c0623yg, Array.get(obj, i2));
                            }
                        }
                    };
                } else if (vC.setY.class.isAssignableFrom(iconTintList9)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                } else {
                    return new AbstractC0621ye.setOnLongClickListener(this.setChipCornerRadius, i, iconTintList10, this.setOnNavigationItemSelectedListener.setY(type, annotationArr, this.ViewPager$SavedState$1));
                }
            } else if (annotation instanceof yH) {
                setY(i, type);
                if (!this.setCenterIfNoTextEnabled) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.setX = true;
                Class<?> iconTintList11 = C0629ym.setIconTintList(type);
                if (!Map.class.isAssignableFrom(iconTintList11)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type MenuHostHelper$$ExternalSyntheticLambda09 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(type, iconTintList11, Map.class);
                if (!(MenuHostHelper$$ExternalSyntheticLambda09 instanceof ParameterizedType)) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) MenuHostHelper$$ExternalSyntheticLambda09;
                Type MenuHostHelper$$ExternalSyntheticLambda010 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, parameterizedType4);
                if (String.class != MenuHostHelper$$ExternalSyntheticLambda010) {
                    Method method10 = this.setChipCornerRadius;
                    StringBuilder sb11 = new StringBuilder("@PartMap keys must be of type String: ");
                    sb11.append(MenuHostHelper$$ExternalSyntheticLambda010);
                    throw C0629ym.setY(method10, i, sb11.toString(), new Object[0]);
                }
                Type MenuHostHelper$$ExternalSyntheticLambda011 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(1, parameterizedType4);
                if (vC.setY.class.isAssignableFrom(C0629ym.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda011))) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new AbstractC0621ye.setUnboundedRipple(this.setChipCornerRadius, i, this.setOnNavigationItemSelectedListener.setY(MenuHostHelper$$ExternalSyntheticLambda011, annotationArr, this.ViewPager$SavedState$1), ((yH) annotation).setIconTintList());
            } else if (annotation instanceof ys) {
                setY(i, type);
                if (this.setLayoutAnimation || this.setCenterIfNoTextEnabled) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    throw C0629ym.setY(this.setChipCornerRadius, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    xU y3 = this.setOnNavigationItemSelectedListener.setY(type, annotationArr, this.ViewPager$SavedState$1);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    return new AbstractC0621ye<T>(this.setChipCornerRadius, i, y3) { // from class: o.ye$MenuHostHelper$$ExternalSyntheticLambda1
                        private final xU<T, vF> MenuHostHelper$$ExternalSyntheticLambda1;
                        private final int setX;
                        private final Method setY;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.setY = r1;
                            this.setX = i;
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = y3;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @Override // o.AbstractC0621ye
                        public final void setY(C0623yg c0623yg, @Nullable T t) {
                            if (t == null) {
                                throw C0629ym.setY(this.setY, this.setX, "Body parameter value must not be null.", new Object[0]);
                            }
                            try {
                                c0623yg.setY = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(t);
                            } catch (IOException e) {
                                Method method11 = this.setY;
                                int i2 = this.setX;
                                StringBuilder sb12 = new StringBuilder("Unable to convert ");
                                sb12.append(t);
                                sb12.append(" to RequestBody");
                                throw C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(method11, e, i2, sb12.toString(), new Object[0]);
                            }
                        }
                    };
                } catch (RuntimeException e) {
                    throw C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.setChipCornerRadius, e, i, "Unable to create @Body converter for %s", type);
                }
            } else if (annotation instanceof yQ) {
                setY(i, type);
                Class<?> iconTintList12 = C0629ym.setIconTintList(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    AbstractC0621ye<?> abstractC0621ye3 = this.setIconSize[i2];
                    if ((abstractC0621ye3 instanceof ye$ViewPager$SavedState$1) && ((ye$ViewPager$SavedState$1) abstractC0621ye3).MenuHostHelper$$ExternalSyntheticLambda1.equals(iconTintList12)) {
                        Method method11 = this.setChipCornerRadius;
                        StringBuilder sb12 = new StringBuilder("@Tag type ");
                        sb12.append(iconTintList12.getName());
                        sb12.append(" is duplicate of parameter #");
                        sb12.append(i2 + 1);
                        sb12.append(" and would always overwrite its value.");
                        throw C0629ym.setY(method11, i, sb12.toString(), new Object[0]);
                    }
                }
                return new ye$ViewPager$SavedState$1(iconTintList12);
            } else {
                return null;
            }
        }

        private void setY(int i, Type type) {
            if (C0629ym.setY(type)) {
                throw C0629ym.setY(this.setChipCornerRadius, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private static Set<String> MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            Matcher matcher = setAnimationFromJson.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private static Class<?> MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }
    }
}