package o;

import o.setStartIconContentDescription;

/* loaded from: classes.dex */
public final class setNumColumns {

    /* renamed from: o.setNumColumns$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[setStartIconContentDescription.setUiOptions.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[setStartIconContentDescription.setUiOptions.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setStartIconContentDescription.setUiOptions.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setX extends setStartIconContentDescription<setX, setIconTintList> implements setHasFixedSize {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final setX DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile setLineSpacingMultiplier<setX> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        public int valueCase_ = 0;
        public Object value_;

        private setX() {
        }

        /* loaded from: classes.dex */
        public enum setY {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);
            
            private final int setOnLongClickListener;

            setY(int i) {
                this.setOnLongClickListener = i;
            }

            public static setY MenuHostHelper$$ExternalSyntheticLambda1(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }
        }

        public static setIconTintList setX() {
            return DEFAULT_INSTANCE.setNavigationOnClickListener();
        }

        /* loaded from: classes.dex */
        public static final class setIconTintList extends setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<setX, setIconTintList> implements setHasFixedSize {
            /* synthetic */ setIconTintList(byte b) {
                this();
            }

            private setIconTintList() {
                super(setX.DEFAULT_INSTANCE);
            }

            public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
                setOnLongClickListener();
                setX.setIconTintList((setX) this.setY, z);
                return this;
            }

            public final setIconTintList setIconTintList(float f) {
                setOnLongClickListener();
                setX.MenuHostHelper$$ExternalSyntheticLambda0((setX) this.setY, f);
                return this;
            }

            public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(int i) {
                setOnLongClickListener();
                setX.setY((setX) this.setY, i);
                return this;
            }

            public final setIconTintList setY(long j) {
                setOnLongClickListener();
                setX.setY((setX) this.setY, j);
                return this;
            }

            public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str) {
                setOnLongClickListener();
                setX.setIconTintList((setX) this.setY, str);
                return this;
            }

            public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList.setY sety) {
                setOnLongClickListener();
                setX.setY((setX) this.setY, sety);
                return this;
            }

            public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(double d) {
                setOnLongClickListener();
                setX.setY((setX) this.setY, d);
                return this;
            }
        }

        @Override // o.setStartIconContentDescription
        public final Object setIconTintList(setStartIconContentDescription.setUiOptions setuioptions, Object obj, Object obj2) {
            setLineSpacingMultiplier setlinespacingmultiplier;
            switch (AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[setuioptions.ordinal()]) {
                case 1:
                    return new setX();
                case 2:
                    return new setIconTintList((byte) 0);
                case 3:
                    return setX(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", setIconTintList.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    setLineSpacingMultiplier<setX> setlinespacingmultiplier2 = PARSER;
                    if (setlinespacingmultiplier2 == null) {
                        synchronized (setX.class) {
                            setlinespacingmultiplier = PARSER;
                            if (setlinespacingmultiplier == null) {
                                setlinespacingmultiplier = new setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda0(DEFAULT_INSTANCE);
                                PARSER = setlinespacingmultiplier;
                            }
                        }
                        return setlinespacingmultiplier;
                    }
                    return setlinespacingmultiplier2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            setX setx = new setX();
            DEFAULT_INSTANCE = setx;
            setStartIconContentDescription.setX(setX.class, setx);
        }

        static /* synthetic */ void setY(setX setx, long j) {
            setx.valueCase_ = 4;
            setx.value_ = Long.valueOf(j);
        }

        static /* synthetic */ void setIconTintList(setX setx, String str) {
            setx.valueCase_ = 5;
            setx.value_ = str;
        }

        static /* synthetic */ void setY(setX setx, setIconTintList.setY sety) {
            setx.value_ = sety.setIconTintList();
            setx.valueCase_ = 6;
        }

        static /* synthetic */ void setY(setX setx, double d) {
            setx.valueCase_ = 7;
            setx.value_ = Double.valueOf(d);
        }

        static /* synthetic */ void setIconTintList(setX setx, boolean z) {
            setx.valueCase_ = 1;
            setx.value_ = Boolean.valueOf(z);
        }

        static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setX setx, float f) {
            setx.valueCase_ = 2;
            setx.value_ = Float.valueOf(f);
        }

        static /* synthetic */ void setY(setX setx, int i) {
            setx.valueCase_ = 3;
            setx.value_ = Integer.valueOf(i);
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends setStartIconContentDescription<setIconTintList, setY> implements setCacheComposition {
        private static final setIconTintList DEFAULT_INSTANCE;
        private static volatile setLineSpacingMultiplier<setIconTintList> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        public setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<String> strings_ = setStartIconContentDescription.setUnboundedRipple();

        private setIconTintList() {
        }

        public static setY setIconTintList() {
            return DEFAULT_INSTANCE.setNavigationOnClickListener();
        }

        /* loaded from: classes.dex */
        public static final class setY extends setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<setIconTintList, setY> implements setCacheComposition {
            /* synthetic */ setY(byte b) {
                this();
            }

            private setY() {
                super(setIconTintList.DEFAULT_INSTANCE);
            }

            public final setY MenuHostHelper$$ExternalSyntheticLambda1(Iterable<String> iterable) {
                setOnLongClickListener();
                setIconTintList.setX((setIconTintList) this.setY, iterable);
                return this;
            }
        }

        @Override // o.setStartIconContentDescription
        public final Object setIconTintList(setStartIconContentDescription.setUiOptions setuioptions, Object obj, Object obj2) {
            setLineSpacingMultiplier setlinespacingmultiplier;
            switch (AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[setuioptions.ordinal()]) {
                case 1:
                    return new setIconTintList();
                case 2:
                    return new setY((byte) 0);
                case 3:
                    return setX(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    setLineSpacingMultiplier<setIconTintList> setlinespacingmultiplier2 = PARSER;
                    if (setlinespacingmultiplier2 == null) {
                        synchronized (setIconTintList.class) {
                            setlinespacingmultiplier = PARSER;
                            if (setlinespacingmultiplier == null) {
                                setlinespacingmultiplier = new setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda0(DEFAULT_INSTANCE);
                                PARSER = setlinespacingmultiplier;
                            }
                        }
                        return setlinespacingmultiplier;
                    }
                    return setlinespacingmultiplier2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            setIconTintList seticontintlist = new setIconTintList();
            DEFAULT_INSTANCE = seticontintlist;
            setStartIconContentDescription.setX(setIconTintList.class, seticontintlist);
        }

        static /* synthetic */ void setX(setIconTintList seticontintlist, Iterable iterable) {
            if (!seticontintlist.strings_.setY()) {
                seticontintlist.strings_ = setStartIconContentDescription.setY(seticontintlist.strings_);
            }
            setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1.setX(iterable, seticontintlist.strings_);
        }
    }
}