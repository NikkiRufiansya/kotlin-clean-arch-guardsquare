package o;

import o.setStartIconContentDescription;
import o.setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public abstract class setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType extends setStartIconContentDescription<MessageType, BuilderType>, BuilderType extends setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> extends setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType> {
    private final MessageType MenuHostHelper$$ExternalSyntheticLambda1;
    protected boolean setX = false;
    public MessageType setY;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1
    protected /* synthetic */ setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(setLeftStripDrawable setleftstripdrawable) {
        return setY((setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>) ((setStartIconContentDescription) setleftstripdrawable));
    }

    public setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1(MessageType messagetype) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = messagetype;
        this.setY = (MessageType) messagetype.setY(setStartIconContentDescription.setUiOptions.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnLongClickListener() {
        if (this.setX) {
            MessageType messagetype = (MessageType) this.setY.setY(setStartIconContentDescription.setUiOptions.NEW_MUTABLE_INSTANCE);
            setIconTintList(messagetype, this.setY);
            this.setY = messagetype;
            this.setX = false;
        }
    }

    @Override // o.setText
    public final boolean ViewPager$SavedState$1() {
        return setStartIconContentDescription.setIconTintList(this.setY, false);
    }

    @Override // o.setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1
    /* renamed from: setNavigationOnClickListener */
    public BuilderType clone() {
        BuilderType buildertype = (BuilderType) setIconSize().setZ();
        buildertype.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0());
        return buildertype;
    }

    @Override // o.setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0
    /* renamed from: setY */
    public MessageType MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setX) {
            return this.setY;
        }
        this.setY.setTextAlignment();
        this.setX = true;
        return this.setY;
    }

    @Override // o.setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0
    /* renamed from: setX */
    public final MessageType setIconTintList() {
        MessageType MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1()) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        throw setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
    }

    protected BuilderType setY(MessageType messagetype) {
        return MenuHostHelper$$ExternalSyntheticLambda1((setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>) messagetype);
    }

    public BuilderType MenuHostHelper$$ExternalSyntheticLambda1(MessageType messagetype) {
        setOnLongClickListener();
        setIconTintList(this.setY, messagetype);
        return this;
    }

    private void setIconTintList(MessageType messagetype, MessageType messagetype2) {
        writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(messagetype.getClass()).setY(messagetype, messagetype2);
    }

    @Override // o.setText
    /* renamed from: setUnboundedRipple */
    public MessageType setIconSize() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}