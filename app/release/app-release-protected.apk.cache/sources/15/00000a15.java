package o;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import o.setContentPadding;

/* loaded from: classes.dex */
public final class setChipEndPadding {
    private static setChipEndPadding MenuHostHelper$$ExternalSyntheticLambda0;
    private static setChipEndPadding MenuHostHelper$$ExternalSyntheticLambda1;
    static final setBackgroundTint setIconTintList;
    private static final String setNavigationOnClickListener;
    private static final String setY;
    private final int setUiOptions;
    private final boolean setUnboundedRipple;
    public final setBackgroundTint setX;

    static {
        setBackgroundTint setbackgroundtint = BaseTransientBottomBar$Behavior.MenuHostHelper$$ExternalSyntheticLambda0;
        setIconTintList = setbackgroundtint;
        setY = Character.toString((char) 8206);
        setNavigationOnClickListener = Character.toString((char) 8207);
        MenuHostHelper$$ExternalSyntheticLambda1 = new setChipEndPadding(false, 2, setbackgroundtint);
        MenuHostHelper$$ExternalSyntheticLambda0 = new setChipEndPadding(true, 2, setbackgroundtint);
    }

    public static setChipEndPadding setY() {
        setChipEndPadding$MenuHostHelper$$ExternalSyntheticLambda0 setchipendpadding_menuhosthelper__externalsyntheticlambda0 = new setChipEndPadding$MenuHostHelper$$ExternalSyntheticLambda0();
        if (setchipendpadding_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == 2 && setchipendpadding_menuhosthelper__externalsyntheticlambda0.setY == setIconTintList) {
            return setchipendpadding_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 ? MenuHostHelper$$ExternalSyntheticLambda0 : MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return new setChipEndPadding(setchipendpadding_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0, setchipendpadding_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1, setchipendpadding_menuhosthelper__externalsyntheticlambda0.setY);
    }

    private setChipEndPadding(boolean z, int i, setBackgroundTint setbackgroundtint) {
        this.setUnboundedRipple = z;
        this.setUiOptions = i;
        this.setX = setbackgroundtint;
    }

    public final CharSequence setY(CharSequence charSequence, setBackgroundTint setbackgroundtint, boolean z) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda02 = setbackgroundtint.MenuHostHelper$$ExternalSyntheticLambda0(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if ((this.setUiOptions & 2) != 0) {
            boolean MenuHostHelper$$ExternalSyntheticLambda03 = (MenuHostHelper$$ExternalSyntheticLambda02 ? BaseTransientBottomBar$Behavior.setUiOptions : BaseTransientBottomBar$Behavior.setIconTintList).MenuHostHelper$$ExternalSyntheticLambda0(charSequence, 0, charSequence.length());
            if (!this.setUnboundedRipple && (MenuHostHelper$$ExternalSyntheticLambda03 || MenuHostHelper$$ExternalSyntheticLambda1(charSequence) == 1)) {
                str = setY;
            } else {
                str = (!this.setUnboundedRipple || (MenuHostHelper$$ExternalSyntheticLambda03 && MenuHostHelper$$ExternalSyntheticLambda1(charSequence) != -1)) ? "" : setNavigationOnClickListener;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda02 != this.setUnboundedRipple) {
            spannableStringBuilder.append(MenuHostHelper$$ExternalSyntheticLambda02 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda04 = (MenuHostHelper$$ExternalSyntheticLambda02 ? BaseTransientBottomBar$Behavior.setUiOptions : BaseTransientBottomBar$Behavior.setIconTintList).MenuHostHelper$$ExternalSyntheticLambda0(charSequence, 0, charSequence.length());
        if (!this.setUnboundedRipple && (MenuHostHelper$$ExternalSyntheticLambda04 || setIconTintList(charSequence) == 1)) {
            str2 = setY;
        } else if (this.setUnboundedRipple && (!MenuHostHelper$$ExternalSyntheticLambda04 || setIconTintList(charSequence) == -1)) {
            str2 = setNavigationOnClickListener;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(Locale locale) {
        int iconTintList;
        iconTintList = setContentPadding.setX.setIconTintList(locale);
        return iconTintList == 1;
    }

    private static int setIconTintList(CharSequence charSequence) {
        setIconTintList seticontintlist = new setIconTintList(charSequence);
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
        int i = 0;
        int i2 = 0;
        while (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
            byte MenuHostHelper$$ExternalSyntheticLambda02 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda02 != 0) {
                if (MenuHostHelper$$ExternalSyntheticLambda02 == 1 || MenuHostHelper$$ExternalSyntheticLambda02 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (MenuHostHelper$$ExternalSyntheticLambda02 != 9) {
                    switch (MenuHostHelper$$ExternalSyntheticLambda02) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        byte MenuHostHelper$$ExternalSyntheticLambda02;
        char charAt;
        char charAt2;
        setIconTintList seticontintlist = new setIconTintList(charSequence);
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 < seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 && i == 0) {
            char charAt3 = seticontintlist.setY.charAt(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
            seticontintlist.setIconTintList = charAt3;
            if (Character.isHighSurrogate(charAt3)) {
                int codePointAt = Character.codePointAt(seticontintlist.setY, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 += Character.charCount(codePointAt);
                MenuHostHelper$$ExternalSyntheticLambda02 = Character.getDirectionality(codePointAt);
            } else {
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1++;
                MenuHostHelper$$ExternalSyntheticLambda02 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist.setIconTintList);
                byte b = 12;
                if (seticontintlist.setX) {
                    char c = seticontintlist.setIconTintList;
                    if (c == '<') {
                        int i4 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                        while (true) {
                            int i5 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (i5 < seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0) {
                                CharSequence charSequence2 = seticontintlist.setY;
                                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = i5 + 1;
                                char charAt4 = charSequence2.charAt(i5);
                                seticontintlist.setIconTintList = charAt4;
                                if (charAt4 != '>') {
                                    if (charAt4 == '\"' || charAt4 == '\'') {
                                        do {
                                            int i6 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                                            if (i6 < seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0) {
                                                CharSequence charSequence3 = seticontintlist.setY;
                                                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = i6 + 1;
                                                charAt2 = charSequence3.charAt(i6);
                                                seticontintlist.setIconTintList = charAt2;
                                            }
                                        } while (charAt2 != charAt4);
                                    }
                                }
                            } else {
                                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
                                seticontintlist.setIconTintList = '<';
                                b = 13;
                            }
                        }
                        MenuHostHelper$$ExternalSyntheticLambda02 = b;
                    } else if (c == '&') {
                        do {
                            int i7 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (i7 < seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0) {
                                CharSequence charSequence4 = seticontintlist.setY;
                                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = i7 + 1;
                                charAt = charSequence4.charAt(i7);
                                seticontintlist.setIconTintList = charAt;
                            }
                            MenuHostHelper$$ExternalSyntheticLambda02 = 12;
                        } while (charAt != ';');
                        MenuHostHelper$$ExternalSyntheticLambda02 = 12;
                    }
                }
            }
            if (MenuHostHelper$$ExternalSyntheticLambda02 != 0) {
                if (MenuHostHelper$$ExternalSyntheticLambda02 == 1 || MenuHostHelper$$ExternalSyntheticLambda02 == 2) {
                    if (i3 == 0) {
                        return 1;
                    }
                } else if (MenuHostHelper$$ExternalSyntheticLambda02 != 9) {
                    switch (MenuHostHelper$$ExternalSyntheticLambda02) {
                        case 14:
                        case 15:
                            i3++;
                            i2 = -1;
                            break;
                        case 16:
                        case 17:
                            i3++;
                            i2 = 1;
                            break;
                        case 18:
                            i3--;
                            i2 = 0;
                            break;
                    }
                }
            } else if (i3 == 0) {
                return -1;
            }
            i = i3;
        }
        if (i != 0) {
            if (i2 != 0) {
                return i2;
            }
            while (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
                switch (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        private static final byte[] setUiOptions = new byte[1792];
        final int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        char setIconTintList;
        final boolean setX = false;
        final CharSequence setY;

        static {
            for (int i = 0; i < 1792; i++) {
                setUiOptions[i] = Character.getDirectionality(i);
            }
        }

        setIconTintList(CharSequence charSequence) {
            this.setY = charSequence;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = charSequence.length();
        }

        static byte MenuHostHelper$$ExternalSyntheticLambda0(char c) {
            return c < 1792 ? setUiOptions[c] : Character.getDirectionality(c);
        }

        final byte MenuHostHelper$$ExternalSyntheticLambda0() {
            char charAt = this.setY.charAt(this.MenuHostHelper$$ExternalSyntheticLambda1 - 1);
            this.setIconTintList = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.MenuHostHelper$$ExternalSyntheticLambda1 -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1--;
            char c = this.setIconTintList;
            byte directionality = c < 1792 ? setUiOptions[c] : Character.getDirectionality(c);
            if (this.setX) {
                char c2 = this.setIconTintList;
                if (c2 == '>') {
                    return setX();
                }
                return c2 == ';' ? MenuHostHelper$$ExternalSyntheticLambda1() : directionality;
            }
            return directionality;
        }

        private byte setX() {
            char charAt;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            while (true) {
                int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.setY;
                int i3 = i2 - 1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
                char charAt2 = charSequence.charAt(i3);
                this.setIconTintList = charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    } else if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (i4 > 0) {
                                CharSequence charSequence2 = this.setY;
                                int i5 = i4 - 1;
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = i5;
                                charAt = charSequence2.charAt(i5);
                                this.setIconTintList = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    return (byte) 12;
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setIconTintList = '>';
            return (byte) 13;
        }

        private byte MenuHostHelper$$ExternalSyntheticLambda1() {
            char charAt;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            do {
                int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.setY;
                int i3 = i2 - 1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
                charAt = charSequence.charAt(i3);
                this.setIconTintList = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setIconTintList = ';';
            return (byte) 13;
        }
    }
}