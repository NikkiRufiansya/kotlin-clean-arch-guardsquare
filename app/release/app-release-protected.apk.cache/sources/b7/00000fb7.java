package o;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.RemoteConfigRegistrar;
import o.setCloseIconVisible;
import o.setProgressDrawableTiled;
import o.setStartIconContentDescription;
import o.setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setViewCacheExtension;

/* loaded from: classes.dex */
public abstract class setStartIconContentDescription<MessageType extends setStartIconContentDescription<MessageType, BuilderType>, BuilderType extends setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> extends setLeftStripDrawable<MessageType, BuilderType> {
    private static Map<Object, setStartIconContentDescription<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected setLayerPaint unknownFields = setLayerPaint.setIconTintList();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public enum setUiOptions {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* loaded from: classes.dex */
    public static class setY<ContainingType extends setDrawingCacheQuality, Type> extends setNextFocusRightId<ContainingType, Type> {
        final setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda1;
        final setX setX;
    }

    protected abstract Object setIconTintList(setUiOptions setuioptions, Object obj, Object obj2);

    @Override // o.setText
    /* renamed from: setCenterIfNoTextEnabled */
    public final MessageType setIconSize() {
        return (MessageType) setY(setUiOptions.GET_DEFAULT_INSTANCE);
    }

    @Override // o.setDrawingCacheQuality
    /* renamed from: setOnNavigationItemSelectedListener */
    public final BuilderType setZ() {
        return (BuilderType) setY(setUiOptions.NEW_BUILDER);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        setTextOff.setIconTintList(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        this.memoizedHashCode = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(getClass()).MenuHostHelper$$ExternalSyntheticLambda1(this);
        return this.memoizedHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (setIconSize().getClass().isInstance(obj)) {
            return writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(getClass()).MenuHostHelper$$ExternalSyntheticLambda0(this, (setStartIconContentDescription) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTextAlignment() {
        writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(getClass()).setX(this);
    }

    public final <MessageType extends setStartIconContentDescription<MessageType, BuilderType>, BuilderType extends setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> BuilderType setNavigationOnClickListener() {
        return (BuilderType) setY(setUiOptions.NEW_BUILDER);
    }

    @Override // o.setText
    public final boolean ViewPager$SavedState$1() {
        return setIconTintList(this, true);
    }

    @Override // o.setDrawingCacheQuality
    /* renamed from: setAnimationFromJson */
    public final BuilderType setTextScaleX() {
        BuilderType buildertype = (BuilderType) setY(setUiOptions.NEW_BUILDER);
        buildertype.MenuHostHelper$$ExternalSyntheticLambda1(this);
        return buildertype;
    }

    protected Object MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions setuioptions, Object obj) {
        return setIconTintList(setuioptions, obj, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object setY(setUiOptions setuioptions) {
        return setIconTintList(setuioptions, (Object) null, (Object) null);
    }

    @Override // o.setLeftStripDrawable
    int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.memoizedSerializedSize;
    }

    @Override // o.setLeftStripDrawable
    void setIconTintList(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // o.setDrawingCacheQuality
    public void setIconTintList(setMenuPrepared setmenuprepared) {
        setImageTintBlendMode setimagetintblendmode;
        setValues MenuHostHelper$$ExternalSyntheticLambda0 = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(getClass());
        if (setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            setimagetintblendmode = setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            setimagetintblendmode = new setImageTintBlendMode(setmenuprepared);
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setY((setValues) this, (WindowInsetsCompat$Impl29) setimagetintblendmode);
    }

    @Override // o.setDrawingCacheQuality
    public int setChipCornerRadius() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(getClass()).setY(this);
        }
        return this.memoizedSerializedSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object setLayoutAnimation() {
        return setY(setUiOptions.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends setStartIconContentDescription<?, ?>> T setIconTintList(Class<T> cls) {
        setStartIconContentDescription<?, ?> setstarticoncontentdescription = defaultInstanceMap.get(cls);
        if (setstarticoncontentdescription == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                setstarticoncontentdescription = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (setstarticoncontentdescription == null) {
            setstarticoncontentdescription = (T) ((setStartIconContentDescription) WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda0(cls)).setIconSize();
            if (setstarticoncontentdescription == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, setstarticoncontentdescription);
        }
        return (T) setstarticoncontentdescription;
    }

    public static <T extends setStartIconContentDescription<?, ?>> void setX(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object setX(setDrawingCacheQuality setdrawingcachequality, String str, Object[] objArr) {
        return new setRotationY(setdrawingcachequality, str, objArr);
    }

    /* loaded from: classes.dex */
    public static abstract class setIconTintList<MessageType extends setIconTintList<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends setStartIconContentDescription<MessageType, BuilderType> implements setAccessibilityHeading<MessageType, BuilderType> {
        protected RemoteConfigRegistrar<setX> extensions = RemoteConfigRegistrar.setIconTintList();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final RemoteConfigRegistrar<setX> setX() {
            if (this.extensions.setIconTintList) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX implements RemoteConfigRegistrar.setY<setX> {
        final boolean MenuHostHelper$$ExternalSyntheticLambda0;
        final boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
        final int setX;
        final setViewCacheExtension.setIconTintList<?> setY;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.setX - ((setX) obj).setX;
        }

        @Override // o.RemoteConfigRegistrar.setY
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setX;
        }

        @Override // o.RemoteConfigRegistrar.setY
        public final setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setX() {
            return this.setIconTintList;
        }

        @Override // o.RemoteConfigRegistrar.setY
        public final setCloseIconVisible.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setIconTintList.setZ;
        }

        @Override // o.RemoteConfigRegistrar.setY
        public final boolean setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // o.RemoteConfigRegistrar.setY
        public final boolean setIconTintList() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.RemoteConfigRegistrar.setY
        public final setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0 setY(setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0 setdrawingcachequality_menuhosthelper__externalsyntheticlambda0, setDrawingCacheQuality setdrawingcachequality) {
            return ((setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1) setdrawingcachequality_menuhosthelper__externalsyntheticlambda0).MenuHostHelper$$ExternalSyntheticLambda1((setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1) ((setStartIconContentDescription) setdrawingcachequality));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object setIconTintList(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final <T extends setStartIconContentDescription<T, ?>> boolean setIconTintList(T t, boolean z) {
        byte byteValue = ((Byte) t.setY(setUiOptions.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean iconTintList = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(t.getClass()).setIconTintList(t);
        if (z) {
            t.MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions.SET_MEMOIZED_IS_INITIALIZED, iconTintList ? t : null);
        }
        return iconTintList;
    }

    public static <E> setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setUnboundedRipple() {
        return setCollapsible.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public static <E> setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setY(setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setviewcacheextension_menuhosthelper__externalsyntheticlambda1) {
        int size = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.size();
        return setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setX(size == 0 ? 10 : size << 1);
    }

    static <T extends setStartIconContentDescription<T, ?>> T setY(T t, final setCloseIcon setcloseicon, setStateDescription setstatedescription) {
        setTranslateX settranslatex;
        T t2 = (T) t.setY(setUiOptions.NEW_MUTABLE_INSTANCE);
        try {
            setValues MenuHostHelper$$ExternalSyntheticLambda0 = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(t2.getClass());
            if (setcloseicon.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                settranslatex = setcloseicon.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                settranslatex = new setTranslateX(setcloseicon) { // from class: o.BottomAppBar$Behavior
                    private int MenuHostHelper$$ExternalSyntheticLambda0;
                    private int MenuHostHelper$$ExternalSyntheticLambda1;
                    private final setCloseIcon setIconTintList;
                    private int setY = 0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        setCloseIcon setcloseicon2 = (setCloseIcon) setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(setcloseicon, "input");
                        this.setIconTintList = setcloseicon2;
                        setcloseicon2.MenuHostHelper$$ExternalSyntheticLambda0 = this;
                    }

                    @Override // o.setTranslateX
                    public final int setIconTintList() {
                        int i = this.setY;
                        if (i != 0) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                            this.setY = 0;
                        } else {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.setAnimationFromJson();
                        }
                        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (i2 == 0 || i2 == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                            return Integer.MAX_VALUE;
                        }
                        return setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(i2);
                    }

                    @Override // o.setTranslateX
                    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
                        return this.MenuHostHelper$$ExternalSyntheticLambda1;
                    }

                    @Override // o.setTranslateX
                    public final boolean setOnNavigationItemSelectedListener() {
                        int i;
                        if (this.setIconTintList.setIconTintList() || (i = this.MenuHostHelper$$ExternalSyntheticLambda1) == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                            return false;
                        }
                        return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i);
                    }

                    private <T> T MenuHostHelper$$ExternalSyntheticLambda1(setValues<T> setvalues, setStateDescription setstatedescription2) {
                        int textScaleX = this.setIconTintList.setTextScaleX();
                        if (this.setIconTintList.setIconTintList >= this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1) {
                            throw new setProgressDrawableTiled("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                        }
                        int x = this.setIconTintList.setX(textScaleX);
                        T iconTintList = setvalues.setIconTintList();
                        this.setIconTintList.setIconTintList++;
                        setvalues.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, this, setstatedescription2);
                        setvalues.setX(iconTintList);
                        this.setIconTintList.setIconTintList(0);
                        setCloseIcon setcloseicon2 = this.setIconTintList;
                        setcloseicon2.setIconTintList--;
                        this.setIconTintList.setY(x);
                        return iconTintList;
                    }

                    private <T> T setY(setValues<T> setvalues, setStateDescription setstatedescription2) {
                        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.setY(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1), 4);
                        try {
                            T iconTintList = setvalues.setIconTintList();
                            setvalues.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, this, setstatedescription2);
                            setvalues.setX(iconTintList);
                            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                                return iconTintList;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } finally {
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setX(List<Double> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setExpandedTitleMarginTop) {
                            setExpandedTitleMarginTop setexpandedtitlemargintop = (setExpandedTitleMarginTop) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                                do {
                                    setexpandedtitlemargintop.setX(this.setIconTintList.setY());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 7) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setexpandedtitlemargintop.setX(this.setIconTintList.setY());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 1) {
                            do {
                                list.add(Double.valueOf(this.setIconTintList.setY()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 7) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Double.valueOf(this.setIconTintList.setY()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setOnLongClickListener(List<Float> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setStaticLayoutBuilderConfigurer) {
                            setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = (setStaticLayoutBuilderConfigurer) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 3) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setstaticlayoutbuilderconfigurer.setX(this.setIconTintList.setUiOptions());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                                do {
                                    setstaticlayoutbuilderconfigurer.setX(this.setIconTintList.setUiOptions());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 3) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Float.valueOf(this.setIconTintList.setUiOptions()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 5) {
                            do {
                                list.add(Float.valueOf(this.setIconTintList.setUiOptions()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setMaxEms(List<Long> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setChipEndPaddingResource) {
                            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setLayoutDirection());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setLayoutDirection());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setLayoutDirection()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setLayoutDirection()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setNavigationOnClickListener(List<Long> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setChipEndPaddingResource) {
                            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setIconSize());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setIconSize());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setIconSize()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setIconSize()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setLayoutAnimation(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setUnboundedRipple());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setUnboundedRipple());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setUnboundedRipple()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setUnboundedRipple()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setUnboundedRipple(List<Long> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setChipEndPaddingResource) {
                            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setNavigationOnClickListener());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 7) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setchipendpaddingresource.setIconTintList(this.setIconTintList.setNavigationOnClickListener());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 1) {
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setNavigationOnClickListener()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 7) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Long.valueOf(this.setIconTintList.setNavigationOnClickListener()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void MenuHostHelper$$ExternalSyntheticLambda0(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 3) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setLayoutAnimation());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setLayoutAnimation());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 3) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Integer.valueOf(this.setIconTintList.setLayoutAnimation()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 5) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setLayoutAnimation()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void MenuHostHelper$$ExternalSyntheticLambda1(List<Boolean> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setIconStartPaddingResource) {
                            setIconStartPaddingResource seticonstartpaddingresource = (setIconStartPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    seticonstartpaddingresource.setY(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    seticonstartpaddingresource.setY(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Boolean.valueOf(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Boolean.valueOf(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void ViewPager$SavedState$1(List<String> list) {
                        MenuHostHelper$$ExternalSyntheticLambda1(list, false);
                    }

                    @Override // o.setTranslateX
                    public final void setIconSize(List<String> list) {
                        MenuHostHelper$$ExternalSyntheticLambda1(list, true);
                    }

                    private void MenuHostHelper$$ExternalSyntheticLambda1(List<String> list, boolean z) {
                        String onNavigationItemSelectedListener;
                        int animationFromJson;
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) != 2) {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                        if ((list instanceof ExecutorsRegistrar) && !z) {
                            ExecutorsRegistrar executorsRegistrar = (ExecutorsRegistrar) list;
                            while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                executorsRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setX());
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                int animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                if (animationFromJson2 != this.MenuHostHelper$$ExternalSyntheticLambda1) {
                                    this.setY = animationFromJson2;
                                    return;
                                }
                            }
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                        do {
                            if (z) {
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                    onNavigationItemSelectedListener = this.setIconTintList.setMaxEms();
                                } else {
                                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                                }
                            } else if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                onNavigationItemSelectedListener = this.setIconTintList.setOnNavigationItemSelectedListener();
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                            list.add(onNavigationItemSelectedListener);
                            if (this.setIconTintList.setIconTintList()) {
                                return;
                            }
                            animationFromJson = this.setIconTintList.setAnimationFromJson();
                        } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                        this.setY = animationFromJson;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.setTranslateX
                    public final <T> void setX(List<T> list, setValues<T> setvalues, setStateDescription setstatedescription2) {
                        int animationFromJson;
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) != 2) {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        do {
                            list.add(MenuHostHelper$$ExternalSyntheticLambda1(setvalues, setstatedescription2));
                            if (this.setIconTintList.setIconTintList() || this.setY != 0) {
                                return;
                            }
                            animationFromJson = this.setIconTintList.setAnimationFromJson();
                        } while (animationFromJson == i);
                        this.setY = animationFromJson;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.setTranslateX
                    public final <T> void MenuHostHelper$$ExternalSyntheticLambda0(List<T> list, setValues<T> setvalues, setStateDescription setstatedescription2) {
                        int animationFromJson;
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) != 3) {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        do {
                            list.add(setY(setvalues, setstatedescription2));
                            if (this.setIconTintList.setIconTintList() || this.setY != 0) {
                                return;
                            }
                            animationFromJson = this.setIconTintList.setAnimationFromJson();
                        } while (animationFromJson == i);
                        this.setY = animationFromJson;
                    }

                    @Override // o.setTranslateX
                    public final void setIconTintList(List<setSpeed> list) {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) != 2) {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                        while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            list.add(this.setIconTintList.setX());
                            if (this.setIconTintList.setIconTintList()) {
                                return;
                            }
                            int animationFromJson = this.setIconTintList.setAnimationFromJson();
                            if (animationFromJson != this.MenuHostHelper$$ExternalSyntheticLambda1) {
                                this.setY = animationFromJson;
                                return;
                            }
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final void setTextScaleX(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setTextScaleX());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setTextScaleX());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setTextScaleX()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setTextScaleX()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setY(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setOnLongClickListener());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setOnLongClickListener());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setOnLongClickListener()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setOnLongClickListener()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setUiOptions(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 3) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.ViewPager$SavedState$1());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.ViewPager$SavedState$1());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 3) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Integer.valueOf(this.setIconTintList.ViewPager$SavedState$1()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 5) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.ViewPager$SavedState$1()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setCenterIfNoTextEnabled(List<Long> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setChipEndPaddingResource) {
                            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setChipCornerRadius());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX();
                                if ((textScaleX & 7) == 0) {
                                    int MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                    do {
                                        setchipendpaddingresource.setIconTintList(this.setIconTintList.setChipCornerRadius());
                                    } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda12 + textScaleX);
                                    return;
                                }
                                throw new setProgressDrawableTiled("Failed to parse the message.");
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda13 == 1) {
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setChipCornerRadius()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda13 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX();
                            if ((textScaleX2 & 7) == 0) {
                                int MenuHostHelper$$ExternalSyntheticLambda14 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    list.add(Long.valueOf(this.setIconTintList.setChipCornerRadius()));
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < MenuHostHelper$$ExternalSyntheticLambda14 + textScaleX2);
                                return;
                            }
                            throw new setProgressDrawableTiled("Failed to parse the message.");
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setChipCornerRadius(List<Integer> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setLabelVisibilityMode) {
                            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setTextAlignment());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setTextAlignment());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setTextAlignment()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Integer.valueOf(this.setIconTintList.setTextAlignment()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final void setTextAlignment(List<Long> list) {
                        int animationFromJson;
                        int animationFromJson2;
                        if (list instanceof setChipEndPaddingResource) {
                            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setZ());
                                    if (this.setIconTintList.setIconTintList()) {
                                        return;
                                    }
                                    animationFromJson2 = this.setIconTintList.setAnimationFromJson();
                                } while (animationFromJson2 == this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.setY = animationFromJson2;
                                return;
                            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                                int textScaleX = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                                do {
                                    setchipendpaddingresource.setIconTintList(this.setIconTintList.setZ());
                                } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX);
                                if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX) {
                                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                return;
                            } else {
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            }
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setZ()));
                                if (this.setIconTintList.setIconTintList()) {
                                    return;
                                }
                                animationFromJson = this.setIconTintList.setAnimationFromJson();
                            } while (animationFromJson == this.MenuHostHelper$$ExternalSyntheticLambda1);
                            this.setY = animationFromJson;
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                            int textScaleX2 = this.setIconTintList.setTextScaleX() + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
                            do {
                                list.add(Long.valueOf(this.setIconTintList.setZ()));
                            } while (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() < textScaleX2);
                            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() != textScaleX2) {
                                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                        } else {
                            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: o.BottomAppBar$Behavior$3  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static /* synthetic */ class AnonymousClass3 {
                        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

                        static {
                            int[] iArr = new int[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
                            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
                            try {
                                iArr[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BOOL.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BYTES.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.DOUBLE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.ENUM.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED32.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED64.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FLOAT.ordinal()] = 7;
                            } catch (NoSuchFieldError unused7) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT32.ordinal()] = 8;
                            } catch (NoSuchFieldError unused8) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT64.ordinal()] = 9;
                            } catch (NoSuchFieldError unused9) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE.ordinal()] = 10;
                            } catch (NoSuchFieldError unused10) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED32.ordinal()] = 11;
                            } catch (NoSuchFieldError unused11) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED64.ordinal()] = 12;
                            } catch (NoSuchFieldError unused12) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT32.ordinal()] = 13;
                            } catch (NoSuchFieldError unused13) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT64.ordinal()] = 14;
                            } catch (NoSuchFieldError unused14) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.STRING.ordinal()] = 15;
                            } catch (NoSuchFieldError unused15) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT32.ordinal()] = 16;
                            } catch (NoSuchFieldError unused16) {
                            }
                            try {
                                MenuHostHelper$$ExternalSyntheticLambda1[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT64.ordinal()] = 17;
                            } catch (NoSuchFieldError unused17) {
                            }
                        }
                    }

                    private Object setX(setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, Class<?> cls, setStateDescription setstatedescription2) {
                        switch (AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[setcloseiconvisible_menuhosthelper__externalsyntheticlambda1.ordinal()]) {
                            case 1:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Boolean.valueOf(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 2:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                    return this.setIconTintList.setX();
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 3:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                                    return Double.valueOf(this.setIconTintList.setY());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 4:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Integer.valueOf(this.setIconTintList.setOnLongClickListener());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 5:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                                    return Integer.valueOf(this.setIconTintList.setLayoutAnimation());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 6:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                                    return Long.valueOf(this.setIconTintList.setNavigationOnClickListener());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 7:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                                    return Float.valueOf(this.setIconTintList.setUiOptions());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 8:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Integer.valueOf(this.setIconTintList.setUnboundedRipple());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 9:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Long.valueOf(this.setIconTintList.setIconSize());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 10:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                    return MenuHostHelper$$ExternalSyntheticLambda1(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription2);
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 11:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                                    return Integer.valueOf(this.setIconTintList.ViewPager$SavedState$1());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 12:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                                    return Long.valueOf(this.setIconTintList.setChipCornerRadius());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 13:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Integer.valueOf(this.setIconTintList.setTextAlignment());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 14:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Long.valueOf(this.setIconTintList.setZ());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 15:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                                    return this.setIconTintList.setMaxEms();
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 16:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Integer.valueOf(this.setIconTintList.setTextScaleX());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            case 17:
                                if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                                    return Long.valueOf(this.setIconTintList.setLayoutDirection());
                                }
                                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                            default:
                                throw new RuntimeException("unsupported field type.");
                        }
                    }

                    @Override // o.setTranslateX
                    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final setSpeed setY() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            return this.setIconTintList.setX();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final double setX() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                            return this.setIconTintList.setY();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setOnLongClickListener() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setOnLongClickListener();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setNavigationOnClickListener() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                            return this.setIconTintList.setLayoutAnimation();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final long setUiOptions() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                            return this.setIconTintList.setNavigationOnClickListener();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final float setLayoutAnimation() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                            return this.setIconTintList.setUiOptions();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final <T> T setX(Class<T> cls, setStateDescription setstatedescription2) {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 3) {
                            return (T) setY(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription2);
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final <T> T setIconTintList(setValues<T> setvalues, setStateDescription setstatedescription2) {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 3) {
                            return (T) setY(setvalues, setstatedescription2);
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setUnboundedRipple() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setUnboundedRipple();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final long setIconSize() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setIconSize();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
                        r8.put(r2, r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
                        return;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.setTranslateX
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final <K, V> void MenuHostHelper$$ExternalSyntheticLambda0(java.util.Map<K, V> r8, o.setRightStripDrawable.setY<K, V> r9, o.setStateDescription r10) {
                        /*
                            r7 = this;
                            int r0 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                            int r0 = o.setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(r0)
                            r1 = 2
                            if (r0 != r1) goto L70
                            o.setCloseIcon r0 = r7.setIconTintList
                            int r0 = r0.setTextScaleX()
                            o.setCloseIcon r2 = r7.setIconTintList
                            int r0 = r2.setX(r0)
                            K r2 = r9.setY
                            V r3 = r9.MenuHostHelper$$ExternalSyntheticLambda0
                        L19:
                            int r4 = r7.setIconTintList()     // Catch: java.lang.Throwable -> L69
                            r5 = 2147483647(0x7fffffff, float:NaN)
                            if (r4 == r5) goto L60
                            o.setCloseIcon r5 = r7.setIconTintList     // Catch: java.lang.Throwable -> L69
                            boolean r5 = r5.setIconTintList()     // Catch: java.lang.Throwable -> L69
                            if (r5 != 0) goto L60
                            r5 = 1
                            java.lang.String r6 = "Unable to parse map entry."
                            if (r4 == r5) goto L4b
                            if (r4 == r1) goto L3e
                            boolean r4 = r7.setOnNavigationItemSelectedListener()     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            if (r4 == 0) goto L38
                            goto L19
                        L38:
                            o.setProgressDrawableTiled r4 = new o.setProgressDrawableTiled     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            r4.<init>(r6)     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            throw r4     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                        L3e:
                            o.setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r9.setX     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            V r5 = r9.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            java.lang.Class r5 = r5.getClass()     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            java.lang.Object r3 = r7.setX(r4, r5, r10)     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            goto L19
                        L4b:
                            o.setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r9.setIconTintList     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            r5 = 0
                            java.lang.Object r2 = r7.setX(r4, r5, r5)     // Catch: o.setProgressDrawableTiled.setY -> L53 java.lang.Throwable -> L69
                            goto L19
                        L53:
                            boolean r4 = r7.setOnNavigationItemSelectedListener()     // Catch: java.lang.Throwable -> L69
                            if (r4 == 0) goto L5a
                            goto L19
                        L5a:
                            o.setProgressDrawableTiled r8 = new o.setProgressDrawableTiled     // Catch: java.lang.Throwable -> L69
                            r8.<init>(r6)     // Catch: java.lang.Throwable -> L69
                            throw r8     // Catch: java.lang.Throwable -> L69
                        L60:
                            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L69
                            o.setCloseIcon r8 = r7.setIconTintList
                            r8.setY(r0)
                            return
                        L69:
                            r8 = move-exception
                            o.setCloseIcon r9 = r7.setIconTintList
                            r9.setY(r0)
                            throw r8
                        L70:
                            o.setProgressDrawableTiled$setY r8 = new o.setProgressDrawableTiled$setY
                            java.lang.String r9 = "Protocol message tag had invalid wire type."
                            r8.<init>(r9)
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.BottomAppBar$Behavior.MenuHostHelper$$ExternalSyntheticLambda0(java.util.Map, o.setRightStripDrawable$setY, o.setStateDescription):void");
                    }

                    @Override // o.setTranslateX
                    public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls, setStateDescription setstatedescription2) {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            return (T) MenuHostHelper$$ExternalSyntheticLambda1(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription2);
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final <T> T setX(setValues<T> setvalues, setStateDescription setstatedescription2) {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            return (T) MenuHostHelper$$ExternalSyntheticLambda1(setvalues, setstatedescription2);
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setTextAlignment() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 5) {
                            return this.setIconTintList.ViewPager$SavedState$1();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final long ViewPager$SavedState$1() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 1) {
                            return this.setIconTintList.setChipCornerRadius();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setChipCornerRadius() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setTextAlignment();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final long setCenterIfNoTextEnabled() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setZ();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final String setMaxEms() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            return this.setIconTintList.setOnNavigationItemSelectedListener();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final String setAnimationFromJson() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                            return this.setIconTintList.setMaxEms();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final int setTextScaleX() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setTextScaleX();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }

                    @Override // o.setTranslateX
                    public final long setZ() {
                        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1) == 0) {
                            return this.setIconTintList.setLayoutDirection();
                        }
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                };
            }
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(t2, settranslatex, setstatedescription);
            MenuHostHelper$$ExternalSyntheticLambda0.setX(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof setProgressDrawableTiled) {
                throw ((setProgressDrawableTiled) e.getCause());
            }
            setProgressDrawableTiled setprogressdrawabletiled = new setProgressDrawableTiled(e.getMessage());
            setprogressdrawabletiled.setX = t2;
            throw setprogressdrawabletiled;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof setProgressDrawableTiled) {
                throw ((setProgressDrawableTiled) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends setStartIconContentDescription<T, ?>> T setX(T t) {
        if (t == null || t.ViewPager$SavedState$1()) {
            return t;
        }
        setProgressDrawableTiled setprogressdrawabletiled = new setProgressDrawableTiled(t.setUiOptions().getMessage());
        setprogressdrawabletiled.setX = t;
        throw setprogressdrawabletiled;
    }

    public static <T extends setStartIconContentDescription<T, ?>> T MenuHostHelper$$ExternalSyntheticLambda1(T t, InputStream inputStream) {
        setCloseIcon setcloseicon_menuhosthelper__externalsyntheticlambda1;
        if (inputStream == null) {
            byte[] bArr = setViewCacheExtension.setIconTintList;
            setcloseicon_menuhosthelper__externalsyntheticlambda1 = setCloseIcon.setY(bArr, 0, bArr.length, false);
        } else {
            setcloseicon_menuhosthelper__externalsyntheticlambda1 = new setCloseIcon$MenuHostHelper$$ExternalSyntheticLambda1(inputStream, 4096, (byte) 0);
        }
        return (T) setX(setY(t, setcloseicon_menuhosthelper__externalsyntheticlambda1, setStateDescription.MenuHostHelper$$ExternalSyntheticLambda1()));
    }
}