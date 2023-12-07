package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: o.xx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613xx implements xJ {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private final Inflater setX;
    private final InterfaceC0607xr setY;

    public C0613xx(InterfaceC0607xr interfaceC0607xr, Inflater inflater) {
        pN.setY(interfaceC0607xr, "");
        pN.setY(inflater, "");
        this.setY = interfaceC0607xr;
        this.setX = inflater;
    }

    @Override // o.xJ
    public final long setY(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        do {
            long x = setX(c0602xo, j);
            if (x > 0) {
                return x;
            }
            if (this.setX.finished() || this.setX.needsDictionary()) {
                return -1L;
            }
        } while (!this.setY.MenuHostHelper$$ExternalSyntheticLambda1());
        throw new EOFException("source exhausted prematurely");
    }

    private long setX(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (i == 0) {
                return 0L;
            }
            try {
                xE x = c0602xo.setX(1);
                int min = (int) Math.min(j, 8192 - x.setIconTintList);
                if (this.setX.needsInput() && !this.setY.MenuHostHelper$$ExternalSyntheticLambda1()) {
                    xE xEVar = this.setY.setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1;
                    pN.setX(xEVar);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                    this.setX.setInput(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                int inflate = this.setX.inflate(x.MenuHostHelper$$ExternalSyntheticLambda0, x.setIconTintList, min);
                int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i2 != 0) {
                    int remaining = i2 - this.setX.getRemaining();
                    this.MenuHostHelper$$ExternalSyntheticLambda1 -= remaining;
                    this.setY.setOnLongClickListener(remaining);
                }
                if (inflate > 0) {
                    x.setIconTintList += inflate;
                    long j2 = inflate;
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 += j2;
                    return j2;
                }
                if (x.MenuHostHelper$$ExternalSyntheticLambda1 == x.setIconTintList) {
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = x.MenuHostHelper$$ExternalSyntheticLambda0();
                    xC.setIconTintList(x);
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setY.setX();
    }

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        this.setX.end();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.setY.close();
    }
}