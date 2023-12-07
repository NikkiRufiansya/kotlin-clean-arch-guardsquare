package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
class setPromptId$MenuHostHelper$$ExternalSyntheticLambda1<K, V> implements Iterator<Map.Entry<K, V>> {
    private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    final /* synthetic */ setPromptId setX;
    private int setY;

    private setPromptId$MenuHostHelper$$ExternalSyntheticLambda1(setPromptId setpromptid) {
        this.setX = setpromptid;
        this.setY = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setPromptId$MenuHostHelper$$ExternalSyntheticLambda1(setPromptId setpromptid, byte b) {
        this(setpromptid);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.setY + 1 >= this.setX.setIconTintList.size()) {
            return !this.setX.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty() && setIconTintList().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.setIconTintList) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.setIconTintList = false;
        if (!this.setX.setY) {
            if (this.setY < this.setX.setIconTintList.size()) {
                setPromptId setpromptid = this.setX;
                int i = this.setY;
                this.setY = i - 1;
                setpromptid.setX(i);
                return;
            }
            setIconTintList().remove();
            return;
        }
        throw new UnsupportedOperationException();
    }

    private Iterator<Map.Entry<K, V>> setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0.entrySet().iterator();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.setIconTintList = true;
        int i = this.setY + 1;
        this.setY = i;
        if (i < this.setX.setIconTintList.size()) {
            return this.setX.setIconTintList.get(this.setY);
        }
        return setIconTintList().next();
    }
}