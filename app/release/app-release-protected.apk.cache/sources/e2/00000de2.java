package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class setOnChildClickListener {
    public final attachInterface MenuHostHelper$$ExternalSyntheticLambda0;
    public final byte[] MenuHostHelper$$ExternalSyntheticLambda1;

    public setOnChildClickListener(attachInterface attachinterface, byte[] bArr) {
        if (attachinterface == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = attachinterface;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setOnChildClickListener) {
            setOnChildClickListener setonchildclicklistener = (setOnChildClickListener) obj;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.equals(setonchildclicklistener.MenuHostHelper$$ExternalSyntheticLambda0)) {
                return Arrays.equals(this.MenuHostHelper$$ExternalSyntheticLambda1, setonchildclicklistener.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}