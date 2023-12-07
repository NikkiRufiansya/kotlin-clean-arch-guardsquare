package o;

import o.AbstractC0239il;
import o.il$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public abstract class il$MenuHostHelper$$ExternalSyntheticLambda1<MessageType extends AbstractC0239il<MessageType, BuilderType>, BuilderType extends il$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> extends hU$MenuHostHelper$$ExternalSyntheticLambda0<MessageType, BuilderType> {
    private final MessageType MenuHostHelper$$ExternalSyntheticLambda1;
    public MessageType setIconTintList;

    public il$MenuHostHelper$$ExternalSyntheticLambda1(MessageType messagetype) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = messagetype;
        if ((messagetype.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.setIconTintList = (MessageType) this.MenuHostHelper$$ExternalSyntheticLambda1.setMaxEms();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setTextAlignment() {
        if ((this.setIconTintList.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return;
        }
        MessageType messagetype = (MessageType) this.MenuHostHelper$$ExternalSyntheticLambda1.setMaxEms();
        iU.setX().setIconTintList(messagetype.getClass()).setIconTintList(messagetype, this.setIconTintList);
        this.setIconTintList = messagetype;
    }

    @Override // o.iK
    public final boolean setTextScaleX() {
        return AbstractC0239il.setX(this.setIconTintList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.iJ.setY
    /* renamed from: setY */
    public MessageType setChipCornerRadius() {
        if (!((this.setIconTintList.memoizedSerializedSize & Integer.MIN_VALUE) != 0)) {
            return this.setIconTintList;
        }
        MessageType messagetype = this.setIconTintList;
        iU.setX().setIconTintList(messagetype.getClass()).MenuHostHelper$$ExternalSyntheticLambda1(messagetype);
        messagetype.memoizedSerializedSize &= Integer.MAX_VALUE;
        return this.setIconTintList;
    }

    @Override // o.iJ.setY
    /* renamed from: setNavigationOnClickListener */
    public final MessageType ViewPager$SavedState$1() {
        MessageType messagetype;
        if (!((this.setIconTintList.memoizedSerializedSize & Integer.MIN_VALUE) != 0)) {
            messagetype = this.setIconTintList;
        } else {
            MessageType messagetype2 = this.setIconTintList;
            iU.setX().setIconTintList(messagetype2.getClass()).MenuHostHelper$$ExternalSyntheticLambda1(messagetype2);
            messagetype2.memoizedSerializedSize &= Integer.MAX_VALUE;
            messagetype = this.setIconTintList;
        }
        if (messagetype.setTextScaleX()) {
            return messagetype;
        }
        throw new ja();
    }

    @Override // o.hU$MenuHostHelper$$ExternalSyntheticLambda0
    public final /* synthetic */ hU$MenuHostHelper$$ExternalSyntheticLambda0 setLayoutAnimation() {
        il$MenuHostHelper$$ExternalSyntheticLambda1 z = this.MenuHostHelper$$ExternalSyntheticLambda1.setZ();
        z.setIconTintList = setChipCornerRadius();
        return z;
    }

    public final BuilderType setCenterIfNoTextEnabled() {
        BuilderType buildertype = (BuilderType) this.MenuHostHelper$$ExternalSyntheticLambda1.setZ();
        buildertype.setIconTintList = setChipCornerRadius();
        return buildertype;
    }

    @Override // o.hU$MenuHostHelper$$ExternalSyntheticLambda0
    public /* synthetic */ Object clone() {
        il$MenuHostHelper$$ExternalSyntheticLambda1 z = this.MenuHostHelper$$ExternalSyntheticLambda1.setZ();
        z.setIconTintList = setChipCornerRadius();
        return z;
    }

    @Override // o.iK
    public final /* bridge */ /* synthetic */ iJ setIconSize() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final BuilderType MenuHostHelper$$ExternalSyntheticLambda0(MessageType messagetype) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.equals(messagetype)) {
            return this;
        }
        setTextAlignment();
        MessageType messagetype2 = this.setIconTintList;
        iU.setX().setIconTintList(messagetype2.getClass()).setIconTintList(messagetype2, messagetype);
        return this;
    }
}