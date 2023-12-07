package o;

import o.AbstractC0089cw;
import o.cA;

/* renamed from: o.cs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0085cs implements InterfaceC0088cv {
    private final C0087cu MenuHostHelper$$ExternalSyntheticLambda0;
    private final setVerticalScrollbarOverlay<AbstractC0089cw> MenuHostHelper$$ExternalSyntheticLambda1;

    public C0085cs(C0087cu c0087cu, setVerticalScrollbarOverlay<AbstractC0089cw> setverticalscrollbaroverlay) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0087cu;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setverticalscrollbaroverlay;
    }

    @Override // o.InterfaceC0088cv
    public final boolean setX(Exception exc) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(exc);
        return true;
    }

    @Override // o.InterfaceC0088cv
    public final boolean setY(AbstractC0091cy abstractC0091cy) {
        if (!(abstractC0091cy.setUiOptions() == cA.setIconTintList.REGISTERED) || this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(abstractC0091cy)) {
            return false;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(new AbstractC0089cw.setY() { // from class: o.ci$MenuHostHelper$$ExternalSyntheticLambda1
            private Long MenuHostHelper$$ExternalSyntheticLambda0;
            private String MenuHostHelper$$ExternalSyntheticLambda1;
            private Long setIconTintList;

            @Override // o.AbstractC0089cw.setY
            public final AbstractC0089cw.setY setIconTintList(String str) {
                if (str == null) {
                    throw new NullPointerException("Null token");
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                return this;
            }

            @Override // o.AbstractC0089cw.setY
            public final AbstractC0089cw.setY MenuHostHelper$$ExternalSyntheticLambda0(long j) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.valueOf(j);
                return this;
            }

            @Override // o.AbstractC0089cw.setY
            public final AbstractC0089cw.setY setIconTintList(long j) {
                this.setIconTintList = Long.valueOf(j);
                return this;
            }

            @Override // o.AbstractC0089cw.setY
            public final AbstractC0089cw MenuHostHelper$$ExternalSyntheticLambda1() {
                String str = this.MenuHostHelper$$ExternalSyntheticLambda1 == null ? " token" : "";
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" tokenExpirationTimestamp");
                    str = sb.toString();
                }
                if (this.setIconTintList == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" tokenCreationTimestamp");
                    str = sb2.toString();
                }
                if (!str.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder("Missing required properties:");
                    sb3.append(str);
                    throw new IllegalStateException(sb3.toString());
                }
                return new C0075ci(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0.longValue(), this.setIconTintList.longValue(), (byte) 0);
            }
        }.setIconTintList(abstractC0091cy.setX()).MenuHostHelper$$ExternalSyntheticLambda0(abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda0()).setIconTintList(abstractC0091cy.setNavigationOnClickListener()).MenuHostHelper$$ExternalSyntheticLambda1());
        return true;
    }
}