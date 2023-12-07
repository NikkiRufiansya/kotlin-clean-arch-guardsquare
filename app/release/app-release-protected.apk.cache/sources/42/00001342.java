package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: o.xy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614xy implements xJ {
    private final CRC32 MenuHostHelper$$ExternalSyntheticLambda0;
    private byte MenuHostHelper$$ExternalSyntheticLambda1;
    private final xB setIconTintList;
    private final C0613xx setX;
    private final Inflater setY;

    public C0614xy(xJ xJVar) {
        pN.setY(xJVar, "");
        xB xBVar = new xB(xJVar);
        this.setIconTintList = xBVar;
        Inflater inflater = new Inflater(true);
        this.setY = inflater;
        this.setX = new C0613xx(xBVar, inflater);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new CRC32();
    }

    @Override // o.xJ
    public final long setY(C0602xo c0602xo, long j) {
        long j2;
        pN.setY(c0602xo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                if (this.setIconTintList.setY(10L)) {
                    byte MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(3L);
                    boolean z = ((MenuHostHelper$$ExternalSyntheticLambda1 >> 1) & 1) == 1;
                    if (z) {
                        MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1, 0L, 10L);
                    }
                    xB xBVar = this.setIconTintList;
                    if (xBVar.setY(2L)) {
                        setY("ID1ID2", 8075, xBVar.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1());
                        this.setIconTintList.setOnLongClickListener(8L);
                        if (((MenuHostHelper$$ExternalSyntheticLambda1 >> 2) & 1) == 1) {
                            if (!this.setIconTintList.setY(2L)) {
                                throw new EOFException();
                            }
                            if (z) {
                                MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1, 0L, 2L);
                            }
                            int ViewPager$SavedState$1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1() & 65535;
                            long j3 = (short) (((ViewPager$SavedState$1 & 65280) >>> 8) | ((ViewPager$SavedState$1 & 255) << 8));
                            if (this.setIconTintList.setY(j3)) {
                                if (z) {
                                    j2 = j3;
                                    MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1, 0L, j3);
                                } else {
                                    j2 = j3;
                                }
                                this.setIconTintList.setOnLongClickListener(j2);
                            } else {
                                throw new EOFException();
                            }
                        }
                        if (((MenuHostHelper$$ExternalSyntheticLambda1 >> 3) & 1) == 1) {
                            long y = this.setIconTintList.setY((byte) 0, 0L, Long.MAX_VALUE);
                            if (y == -1) {
                                throw new EOFException();
                            }
                            if (z) {
                                MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1, 0L, y + 1);
                            }
                            this.setIconTintList.setOnLongClickListener(y + 1);
                        }
                        if (((MenuHostHelper$$ExternalSyntheticLambda1 >> 4) & 1) == 1) {
                            long y2 = this.setIconTintList.setY((byte) 0, 0L, Long.MAX_VALUE);
                            if (y2 == -1) {
                                throw new EOFException();
                            }
                            if (z) {
                                MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1, 0L, y2 + 1);
                            }
                            this.setIconTintList.setOnLongClickListener(y2 + 1);
                        }
                        if (z) {
                            xB xBVar2 = this.setIconTintList;
                            if (!xBVar2.setY(2L)) {
                                throw new EOFException();
                            }
                            int ViewPager$SavedState$12 = xBVar2.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1() & 65535;
                            setY("FHCRC", (short) (((ViewPager$SavedState$12 & 65280) >>> 8) | ((ViewPager$SavedState$12 & 255) << 8)), (short) this.MenuHostHelper$$ExternalSyntheticLambda0.getValue());
                            this.MenuHostHelper$$ExternalSyntheticLambda0.reset();
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = (byte) 1;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new EOFException();
                }
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                long j4 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda0;
                long y3 = this.setX.setY(c0602xo, j);
                if (y3 != -1) {
                    MenuHostHelper$$ExternalSyntheticLambda1(c0602xo, j4, y3);
                    return y3;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = (byte) 2;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                xB xBVar3 = this.setIconTintList;
                if (xBVar3.setY(4L)) {
                    setY("CRC", xBVar3.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled(), (int) this.MenuHostHelper$$ExternalSyntheticLambda0.getValue());
                    xB xBVar4 = this.setIconTintList;
                    if (xBVar4.setY(4L)) {
                        setY("ISIZE", xBVar4.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled(), (int) this.setY.getBytesWritten());
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = (byte) 3;
                        if (!this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1()) {
                            throw new IOException("gzip finished without exhausting source");
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new EOFException();
                }
            }
            return -1L;
        }
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setIconTintList.setIconTintList.setX();
    }

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setX.close();
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda1(C0602xo c0602xo, long j, long j2) {
        int i;
        xE xEVar = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(xEVar);
        while (j >= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) {
            j -= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            xEVar = xEVar.setY;
            pN.setX(xEVar);
        }
        while (j2 > 0) {
            int min = (int) Math.min(xEVar.setIconTintList - i, j2);
            this.MenuHostHelper$$ExternalSyntheticLambda0.update(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, (int) (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j), min);
            j2 -= min;
            xEVar = xEVar.setY;
            pN.setX(xEVar);
            j = 0;
        }
    }

    private static void setY(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) format, "");
        throw new IOException(format);
    }
}