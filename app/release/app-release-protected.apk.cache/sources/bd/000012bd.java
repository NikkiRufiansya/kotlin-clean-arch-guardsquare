package o;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.wi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568wi {
    final InterfaceC0541vk MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    final C0532vb setIconTintList;
    List<? extends Proxy> setLayoutAnimation;
    final List<vG> setUiOptions;
    final C0565wf setUnboundedRipple;
    final AbstractC0549vs setX;
    List<? extends InetSocketAddress> setY;

    static {
        new C0569wi$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    }

    public C0568wi(C0532vb c0532vb, C0565wf c0565wf, InterfaceC0541vk interfaceC0541vk, AbstractC0549vs abstractC0549vs) {
        pN.setY(c0532vb, "");
        pN.setY(c0565wf, "");
        pN.setY(interfaceC0541vk, "");
        pN.setY(abstractC0549vs, "");
        this.setIconTintList = c0532vb;
        this.setUnboundedRipple = c0565wf;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0541vk;
        this.setX = abstractC0549vs;
        this.setLayoutAnimation = C0358os.setIconTintList;
        this.setY = C0358os.setIconTintList;
        this.setUiOptions = new ArrayList();
        C0555vx c0555vx = c0532vb.setCenterIfNoTextEnabled;
        setY sety = new setY(c0532vb.setNavigationOnClickListener, c0555vx);
        AbstractC0549vs.setX(this.MenuHostHelper$$ExternalSyntheticLambda0, c0555vx);
        List<Proxy> iconTintList = sety.setIconTintList();
        this.setLayoutAnimation = iconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0, c0555vx, iconTintList);
    }

    /* renamed from: o.wi$setY */
    /* loaded from: classes.dex */
    static final class setY extends pO implements InterfaceC0376pj<List<? extends Proxy>> {
        private /* synthetic */ Proxy setIconTintList;
        private /* synthetic */ C0555vx setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(Proxy proxy, C0555vx c0555vx) {
            super(0);
            this.setIconTintList = proxy;
            this.setY = c0555vx;
        }

        @Override // o.InterfaceC0376pj
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
        public final List<Proxy> setIconTintList() {
            Proxy proxy = this.setIconTintList;
            if (proxy == null) {
                URI layoutAnimation = this.setY.setLayoutAnimation();
                if (layoutAnimation.getHost() == null) {
                    return vL.MenuHostHelper$$ExternalSyntheticLambda1(Proxy.NO_PROXY);
                }
                List<Proxy> select = C0568wi.this.setIconTintList.setOnLongClickListener.select(layoutAnimation);
                List<Proxy> list = select;
                return list == null || list.isEmpty() ? vL.MenuHostHelper$$ExternalSyntheticLambda1(Proxy.NO_PROXY) : vL.MenuHostHelper$$ExternalSyntheticLambda0(select);
            }
            List<Proxy> singletonList = Collections.singletonList(proxy);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
            return singletonList;
        }
    }

    /* renamed from: o.wi$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        public final List<vG> MenuHostHelper$$ExternalSyntheticLambda0;
        public int setY;

        public setX(List<vG> list) {
            pN.setY(list, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = list;
        }

        public final vG setIconTintList() {
            if (!(this.setY < this.MenuHostHelper$$ExternalSyntheticLambda0.size())) {
                throw new NoSuchElementException();
            }
            List<vG> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i = this.setY;
            this.setY = i + 1;
            return list.get(i);
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda1 < this.setLayoutAnimation.size()) || (this.setUiOptions.isEmpty() ^ true);
    }
}