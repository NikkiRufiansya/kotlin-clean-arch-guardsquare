package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
class setPromptId$MenuHostHelper$$ExternalSyntheticLambda0<K, V> implements Iterator<Map.Entry<K, V>> {
    private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ setPromptId setIconTintList;

    private setPromptId$MenuHostHelper$$ExternalSyntheticLambda0(setPromptId setpromptid) {
        this.setIconTintList = setpromptid;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setpromptid.setIconTintList.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setPromptId$MenuHostHelper$$ExternalSyntheticLambda0(setPromptId setpromptid, byte b) {
        this(setpromptid);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return (i > 0 && i <= this.setIconTintList.setIconTintList.size()) || MenuHostHelper$$ExternalSyntheticLambda0().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.entrySet().iterator();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (MenuHostHelper$$ExternalSyntheticLambda0().hasNext()) {
            return MenuHostHelper$$ExternalSyntheticLambda0().next();
        }
        List<setPromptId<K, V>.setY> list = this.setIconTintList.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        return list.get(i);
    }
}