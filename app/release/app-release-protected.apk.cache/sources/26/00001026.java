package o;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class setTabIndicatorFullWidth {
    public static final setTabIndicatorFullWidth setIconTintList = new setTabIndicatorFullWidth();

    private setTabIndicatorFullWidth() {
    }

    public static setSecondaryProgressTintBlendMode<setCropToPadding> setX(setTickMarkTintMode<setCropToPadding> settickmarktintmode, List<? extends setDescendantFocusability<setCropToPadding>> list, rU rUVar, InterfaceC0376pj<? extends File> interfaceC0376pj) {
        pN.setY(list, "");
        pN.setY(rUVar, "");
        pN.setY(interfaceC0376pj, "");
        setTextAppearanceInactive settextappearanceinactive = setTextAppearanceInactive.setIconTintList;
        return new getKey(setTextAppearanceInactive.MenuHostHelper$$ExternalSyntheticLambda1(setHandwritingDelegatorCallback.setY, settickmarktintmode, list, rUVar, new setX(interfaceC0376pj)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends pO implements InterfaceC0376pj<File> {
        final /* synthetic */ InterfaceC0376pj<File> setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        setX(InterfaceC0376pj<? extends File> interfaceC0376pj) {
            super(0);
            this.setX = interfaceC0376pj;
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ File setIconTintList() {
            File iconTintList = this.setX.setIconTintList();
            pN.setY(iconTintList, "");
            String name = iconTintList.getName();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, "");
            String iconTintList2 = qR.setIconTintList(name, '.', "");
            setHandwritingDelegatorCallback sethandwritingdelegatorcallback = setHandwritingDelegatorCallback.setY;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList2, (Object) setHandwritingDelegatorCallback.setX())) {
                return iconTintList;
            }
            StringBuilder sb = new StringBuilder("File extension for file: ");
            sb.append(iconTintList);
            sb.append(" does not match required extension for Preferences file: ");
            setHandwritingDelegatorCallback sethandwritingdelegatorcallback2 = setHandwritingDelegatorCallback.setY;
            sb.append(setHandwritingDelegatorCallback.setX());
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}