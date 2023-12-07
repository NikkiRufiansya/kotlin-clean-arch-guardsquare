package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gX extends gV implements Iterable<gV> {
    public final List<gV> setY = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator<gV> iterator() {
        return this.setY.iterator();
    }

    @Override // o.gV
    public final Number MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).MenuHostHelper$$ExternalSyntheticLambda0();
        }
        throw new IllegalStateException();
    }

    @Override // o.gV
    public final String setOnLongClickListener() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).setOnLongClickListener();
        }
        throw new IllegalStateException();
    }

    @Override // o.gV
    public final double setY() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).setY();
        }
        throw new IllegalStateException();
    }

    @Override // o.gV
    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        throw new IllegalStateException();
    }

    @Override // o.gV
    public final int setX() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).setX();
        }
        throw new IllegalStateException();
    }

    @Override // o.gV
    public final boolean setIconTintList() {
        if (this.setY.size() == 1) {
            return this.setY.get(0).setIconTintList();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof gX) && ((gX) obj).setY.equals(this.setY));
    }

    public final int hashCode() {
        return this.setY.hashCode();
    }
}