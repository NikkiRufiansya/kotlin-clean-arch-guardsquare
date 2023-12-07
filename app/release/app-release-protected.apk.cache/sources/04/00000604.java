package o;

/* renamed from: o.ia  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0229ia {
    private static volatile int setX = 100;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    private int setY;

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1(int i);

    /* synthetic */ AbstractC0229ia(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0229ia setIconTintList(byte[] bArr, int i, int i2, boolean z) {
        setY sety = new setY(bArr, 0, 0, false, (byte) 0);
        try {
            sety.MenuHostHelper$$ExternalSyntheticLambda1(0);
            return sety;
        } catch (C0241in e) {
            throw new IllegalArgumentException(e);
        }
    }

    private AbstractC0229ia() {
        this.setIconTintList = setX;
        this.setY = Integer.MAX_VALUE;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
    }

    /* renamed from: o.ia$setY */
    /* loaded from: classes.dex */
    static final class setY extends AbstractC0229ia {
        private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private final byte[] MenuHostHelper$$ExternalSyntheticLambda1;
        private int setIconTintList;
        private int setLayoutAnimation;
        private int setOnLongClickListener;
        private int setX;
        private int setY;

        /* synthetic */ setY(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private setY(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.setY = Integer.MAX_VALUE;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = bArr;
            this.setX = i2 + i;
            this.setOnLongClickListener = i;
            this.setLayoutAnimation = i;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }

        @Override // o.AbstractC0229ia
        public final int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            if (i < 0) {
                throw new C0241in("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = this.setOnLongClickListener;
            int i3 = this.setLayoutAnimation;
            int i4 = i + (i2 - i3);
            if (i4 < 0) {
                throw new C0241in("Failed to parse the message.");
            }
            int i5 = this.setY;
            if (i4 > i5) {
                throw new C0241in("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.setY = i4;
            int i6 = this.setX + this.setIconTintList;
            this.setX = i6;
            int i7 = i6 - i3;
            if (i7 > i4) {
                int i8 = i7 - i4;
                this.setIconTintList = i8;
                this.setX = i6 - i8;
            } else {
                this.setIconTintList = 0;
            }
            return i5;
        }
    }
}