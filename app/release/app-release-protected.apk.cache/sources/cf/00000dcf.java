package o;

import java.io.InputStream;
import java.util.Map;
import o.setNumColumns;
import o.setStartIconContentDescription;

/* loaded from: classes.dex */
public final class setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 extends setStartIconContentDescription<setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1, setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda1> implements Timer$1 {
    private static final setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 DEFAULT_INSTANCE;
    private static volatile setLineSpacingMultiplier<setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public setTextOn<String, setNumColumns.setX> preferences_ = setTextOn.MenuHostHelper$$ExternalSyntheticLambda0();

    private setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1() {
        setTextOn<String, setNumColumns.setX> settexton;
        settexton = setTextOn.MenuHostHelper$$ExternalSyntheticLambda0;
        this.preferences_ = settexton;
    }

    public static setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 setX(InputStream inputStream) {
        return (setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1) setStartIconContentDescription.MenuHostHelper$$ExternalSyntheticLambda1(DEFAULT_INSTANCE, inputStream);
    }

    public static setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        return DEFAULT_INSTANCE.setNavigationOnClickListener();
    }

    @Override // o.setStartIconContentDescription
    public final Object setIconTintList(setStartIconContentDescription.setUiOptions setuioptions, Object obj, Object obj2) {
        setLineSpacingMultiplier setlinespacingmultiplier;
        switch (setNumColumns.AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[setuioptions.ordinal()]) {
            case 1:
                return new setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1();
            case 2:
                return new setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
            case 3:
                return setX(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1$MenuHostHelper$$ExternalSyntheticLambda0.setX});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                setLineSpacingMultiplier<setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1> setlinespacingmultiplier2 = PARSER;
                if (setlinespacingmultiplier2 == null) {
                    synchronized (setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1.class) {
                        setlinespacingmultiplier = PARSER;
                        if (setlinespacingmultiplier == null) {
                            setlinespacingmultiplier = new setStartIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda0(DEFAULT_INSTANCE);
                            PARSER = setlinespacingmultiplier;
                        }
                    }
                    return setlinespacingmultiplier;
                }
                return setlinespacingmultiplier2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 setnumcolumns_menuhosthelper__externalsyntheticlambda1 = new setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1();
        DEFAULT_INSTANCE = setnumcolumns_menuhosthelper__externalsyntheticlambda1;
        setStartIconContentDescription.setX(setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1.class, setnumcolumns_menuhosthelper__externalsyntheticlambda1);
    }

    public static /* synthetic */ Map MenuHostHelper$$ExternalSyntheticLambda0(setNumColumns$MenuHostHelper$$ExternalSyntheticLambda1 setnumcolumns_menuhosthelper__externalsyntheticlambda1) {
        if (!setnumcolumns_menuhosthelper__externalsyntheticlambda1.preferences_.MenuHostHelper$$ExternalSyntheticLambda1) {
            setTextOn<String, setNumColumns.setX> settexton = setnumcolumns_menuhosthelper__externalsyntheticlambda1.preferences_;
            setnumcolumns_menuhosthelper__externalsyntheticlambda1.preferences_ = settexton.isEmpty() ? new setTextOn<>() : new setTextOn<>(settexton);
        }
        return setnumcolumns_menuhosthelper__externalsyntheticlambda1.preferences_;
    }
}