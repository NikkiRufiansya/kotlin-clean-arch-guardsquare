package o;

/* renamed from: o.ii  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0236ii {
    DOUBLE(0, setY.SCALAR, EnumC0245ir.DOUBLE),
    FLOAT(1, setY.SCALAR, EnumC0245ir.FLOAT),
    INT64(2, setY.SCALAR, EnumC0245ir.LONG),
    UINT64(3, setY.SCALAR, EnumC0245ir.LONG),
    INT32(4, setY.SCALAR, EnumC0245ir.INT),
    FIXED64(5, setY.SCALAR, EnumC0245ir.LONG),
    FIXED32(6, setY.SCALAR, EnumC0245ir.INT),
    BOOL(7, setY.SCALAR, EnumC0245ir.BOOLEAN),
    STRING(8, setY.SCALAR, EnumC0245ir.STRING),
    MESSAGE(9, setY.SCALAR, EnumC0245ir.MESSAGE),
    BYTES(10, setY.SCALAR, EnumC0245ir.BYTE_STRING),
    UINT32(11, setY.SCALAR, EnumC0245ir.INT),
    ENUM(12, setY.SCALAR, EnumC0245ir.ENUM),
    SFIXED32(13, setY.SCALAR, EnumC0245ir.INT),
    SFIXED64(14, setY.SCALAR, EnumC0245ir.LONG),
    SINT32(15, setY.SCALAR, EnumC0245ir.INT),
    SINT64(16, setY.SCALAR, EnumC0245ir.LONG),
    GROUP(17, setY.SCALAR, EnumC0245ir.MESSAGE),
    DOUBLE_LIST(18, setY.VECTOR, EnumC0245ir.DOUBLE),
    FLOAT_LIST(19, setY.VECTOR, EnumC0245ir.FLOAT),
    INT64_LIST(20, setY.VECTOR, EnumC0245ir.LONG),
    UINT64_LIST(21, setY.VECTOR, EnumC0245ir.LONG),
    INT32_LIST(22, setY.VECTOR, EnumC0245ir.INT),
    FIXED64_LIST(23, setY.VECTOR, EnumC0245ir.LONG),
    FIXED32_LIST(24, setY.VECTOR, EnumC0245ir.INT),
    BOOL_LIST(25, setY.VECTOR, EnumC0245ir.BOOLEAN),
    STRING_LIST(26, setY.VECTOR, EnumC0245ir.STRING),
    MESSAGE_LIST(27, setY.VECTOR, EnumC0245ir.MESSAGE),
    BYTES_LIST(28, setY.VECTOR, EnumC0245ir.BYTE_STRING),
    UINT32_LIST(29, setY.VECTOR, EnumC0245ir.INT),
    ENUM_LIST(30, setY.VECTOR, EnumC0245ir.ENUM),
    SFIXED32_LIST(31, setY.VECTOR, EnumC0245ir.INT),
    SFIXED64_LIST(32, setY.VECTOR, EnumC0245ir.LONG),
    SINT32_LIST(33, setY.VECTOR, EnumC0245ir.INT),
    SINT64_LIST(34, setY.VECTOR, EnumC0245ir.LONG),
    DOUBLE_LIST_PACKED(35, setY.PACKED_VECTOR, EnumC0245ir.DOUBLE),
    FLOAT_LIST_PACKED(36, setY.PACKED_VECTOR, EnumC0245ir.FLOAT),
    INT64_LIST_PACKED(37, setY.PACKED_VECTOR, EnumC0245ir.LONG),
    UINT64_LIST_PACKED(38, setY.PACKED_VECTOR, EnumC0245ir.LONG),
    INT32_LIST_PACKED(39, setY.PACKED_VECTOR, EnumC0245ir.INT),
    FIXED64_LIST_PACKED(40, setY.PACKED_VECTOR, EnumC0245ir.LONG),
    FIXED32_LIST_PACKED(41, setY.PACKED_VECTOR, EnumC0245ir.INT),
    BOOL_LIST_PACKED(42, setY.PACKED_VECTOR, EnumC0245ir.BOOLEAN),
    UINT32_LIST_PACKED(43, setY.PACKED_VECTOR, EnumC0245ir.INT),
    ENUM_LIST_PACKED(44, setY.PACKED_VECTOR, EnumC0245ir.ENUM),
    SFIXED32_LIST_PACKED(45, setY.PACKED_VECTOR, EnumC0245ir.INT),
    SFIXED64_LIST_PACKED(46, setY.PACKED_VECTOR, EnumC0245ir.LONG),
    SINT32_LIST_PACKED(47, setY.PACKED_VECTOR, EnumC0245ir.INT),
    SINT64_LIST_PACKED(48, setY.PACKED_VECTOR, EnumC0245ir.LONG),
    GROUP_LIST(49, setY.VECTOR, EnumC0245ir.MESSAGE),
    MAP(50, setY.MAP, EnumC0245ir.VOID);
    
    private static final EnumC0236ii[] setTooltipText;
    private final EnumC0245ir FabTransformationBehavior;
    private final boolean Fragment$5;
    private final Class<?> setCloseIconEndPadding;
    final setY setLayoutAnimation;
    final int setOnLongClickListener;

    static {
        EnumC0236ii[] values = values();
        setTooltipText = new EnumC0236ii[values.length];
        for (EnumC0236ii enumC0236ii : values) {
            setTooltipText[enumC0236ii.setOnLongClickListener] = enumC0236ii;
        }
    }

    EnumC0236ii(int i, setY sety, EnumC0245ir enumC0245ir) {
        int i2;
        this.setOnLongClickListener = i;
        this.setLayoutAnimation = sety;
        this.FabTransformationBehavior = enumC0245ir;
        int i3 = AnonymousClass4.setX[sety.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.setCloseIconEndPadding = enumC0245ir.setCenterIfNoTextEnabled;
        } else if (i3 == 2) {
            this.setCloseIconEndPadding = enumC0245ir.setCenterIfNoTextEnabled;
        } else {
            this.setCloseIconEndPadding = null;
        }
        this.Fragment$5 = (sety != setY.SCALAR || (i2 = AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda0[enumC0245ir.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : false;
    }

    /* renamed from: o.ii$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[EnumC0245ir.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[EnumC0245ir.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[EnumC0245ir.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[EnumC0245ir.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[setY.values().length];
            setX = iArr2;
            try {
                iArr2[setY.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[setY.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[setY.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.ii$setY */
    /* loaded from: classes.dex */
    enum setY {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        final boolean MenuHostHelper$$ExternalSyntheticLambda1;

        setY(boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        }
    }
}