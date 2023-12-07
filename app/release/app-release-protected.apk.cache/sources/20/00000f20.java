package o;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import o.setProgressDrawableTiled;
import o.setRightStripDrawable;

/* loaded from: classes.dex */
abstract class setScaleType implements setTranslateX {
    /* synthetic */ setScaleType(byte b) {
        this();
    }

    private setScaleType() {
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends setScaleType {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private final byte[] MenuHostHelper$$ExternalSyntheticLambda1;
        private int setIconTintList;
        private int setLayoutAnimation;
        private int setNavigationOnClickListener;
        private final int setX;
        private final boolean setY;

        public setIconTintList(ByteBuffer byteBuffer, boolean z) {
            super((byte) 0);
            this.setY = true;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.setLayoutAnimation = arrayOffset;
            this.setX = arrayOffset;
            this.setIconTintList = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // o.setTranslateX
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setNavigationOnClickListener;
        }

        @Override // o.setTranslateX
        public final String setMaxEms() {
            return setIconTintList(false);
        }

        @Override // o.setTranslateX
        public final String setAnimationFromJson() {
            return setIconTintList(true);
        }

        private <T> T setY(setValues<T> setvalues, setStateDescription setstatedescription) {
            int textAppearanceResource = setTextAppearanceResource();
            if (textAppearanceResource >= 0) {
                int i = this.setIconTintList;
                int i2 = this.setLayoutAnimation;
                if (textAppearanceResource <= i - i2) {
                    int i3 = i2 + textAppearanceResource;
                    this.setIconTintList = i3;
                    try {
                        T iconTintList = setvalues.setIconTintList();
                        setvalues.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, this, setstatedescription);
                        setvalues.setX(iconTintList);
                        if (this.setLayoutAnimation == i3) {
                            return iconTintList;
                        }
                        throw new setProgressDrawableTiled("Failed to parse the message.");
                    } finally {
                        this.setIconTintList = i;
                    }
                }
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        private <T> T MenuHostHelper$$ExternalSyntheticLambda0(setValues<T> setvalues, setStateDescription setstatedescription) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.setY(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener), 4);
            try {
                T iconTintList = setvalues.setIconTintList();
                setvalues.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, this, setstatedescription);
                setvalues.setX(iconTintList);
                if (this.setNavigationOnClickListener == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    return iconTintList;
                }
                throw new setProgressDrawableTiled("Failed to parse the message.");
            } finally {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            }
        }

        @Override // o.setTranslateX
        public final void setX(List<Double> list) {
            int i;
            int i2;
            if (list instanceof setExpandedTitleMarginTop) {
                setExpandedTitleMarginTop setexpandedtitlemargintop = (setExpandedTitleMarginTop) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                    do {
                        setexpandedtitlemargintop.setX(setX());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setexpandedtitlemargintop.setX(Double.longBitsToDouble(setMinAndMaxProgress()));
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
                do {
                    list.add(Double.valueOf(setX()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Double.valueOf(Double.longBitsToDouble(setMinAndMaxProgress())));
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setOnLongClickListener(List<Float> list) {
            int i;
            int i2;
            if (list instanceof setStaticLayoutBuilderConfigurer) {
                setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = (setStaticLayoutBuilderConfigurer) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    setY(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setstaticlayoutbuilderconfigurer.setX(Float.intBitsToFloat(setLayoutDirection()));
                    }
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                    do {
                        setstaticlayoutbuilderconfigurer.setX(setLayoutAnimation());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                setY(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Float.valueOf(Float.intBitsToFloat(setLayoutDirection())));
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 5) {
                do {
                    list.add(Float.valueOf(setLayoutAnimation()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setMaxEms(List<Long> list) {
            int i;
            int i2;
            if (list instanceof setChipEndPaddingResource) {
                setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        setchipendpaddingresource.setIconTintList(SearchView$SavedState$1());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        int i3 = this.setLayoutAnimation;
                        if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                            this.setLayoutAnimation = i3;
                            return;
                        }
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = this.setLayoutAnimation + setTextAppearanceResource();
                    while (true) {
                        i2 = this.setLayoutAnimation;
                        if (i2 >= textAppearanceResource) {
                            break;
                        }
                        setchipendpaddingresource.setIconTintList(SearchView$SavedState$1());
                    }
                    if (i2 != textAppearanceResource) {
                        throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                    list.add(Long.valueOf(SearchView$SavedState$1()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    int i4 = this.setLayoutAnimation;
                    if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                        this.setLayoutAnimation = i4;
                        return;
                    }
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = this.setLayoutAnimation + setTextAppearanceResource();
                while (true) {
                    i = this.setLayoutAnimation;
                    if (i >= textAppearanceResource2) {
                        break;
                    }
                    list.add(Long.valueOf(SearchView$SavedState$1()));
                }
                if (i != textAppearanceResource2) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setNavigationOnClickListener(List<Long> list) {
            int i;
            int i2;
            if (list instanceof setChipEndPaddingResource) {
                setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        setchipendpaddingresource.setIconTintList(SearchView$SavedState$1());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        int i3 = this.setLayoutAnimation;
                        if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                            this.setLayoutAnimation = i3;
                            return;
                        }
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = this.setLayoutAnimation + setTextAppearanceResource();
                    while (true) {
                        i2 = this.setLayoutAnimation;
                        if (i2 >= textAppearanceResource) {
                            break;
                        }
                        setchipendpaddingresource.setIconTintList(SearchView$SavedState$1());
                    }
                    if (i2 != textAppearanceResource) {
                        throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                    list.add(Long.valueOf(SearchView$SavedState$1()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    int i4 = this.setLayoutAnimation;
                    if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                        this.setLayoutAnimation = i4;
                        return;
                    }
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = this.setLayoutAnimation + setTextAppearanceResource();
                while (true) {
                    i = this.setLayoutAnimation;
                    if (i >= textAppearanceResource2) {
                        break;
                    }
                    list.add(Long.valueOf(SearchView$SavedState$1()));
                }
                if (i != textAppearanceResource2) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setLayoutAnimation(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        int i3 = this.setLayoutAnimation;
                        if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                            this.setLayoutAnimation = i3;
                            return;
                        }
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = this.setLayoutAnimation + setTextAppearanceResource();
                    while (true) {
                        i2 = this.setLayoutAnimation;
                        if (i2 >= textAppearanceResource) {
                            break;
                        }
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                    }
                    if (i2 != textAppearanceResource) {
                        throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                    list.add(Integer.valueOf(setTextAppearanceResource()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    int i4 = this.setLayoutAnimation;
                    if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                        this.setLayoutAnimation = i4;
                        return;
                    }
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = this.setLayoutAnimation + setTextAppearanceResource();
                while (true) {
                    i = this.setLayoutAnimation;
                    if (i >= textAppearanceResource2) {
                        break;
                    }
                    list.add(Integer.valueOf(setTextAppearanceResource()));
                }
                if (i != textAppearanceResource2) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setUnboundedRipple(List<Long> list) {
            int i;
            int i2;
            if (list instanceof setChipEndPaddingResource) {
                setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                    do {
                        setchipendpaddingresource.setIconTintList(setUiOptions());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setchipendpaddingresource.setIconTintList(setMinAndMaxProgress());
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
                do {
                    list.add(Long.valueOf(setUiOptions()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Long.valueOf(setMinAndMaxProgress()));
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void MenuHostHelper$$ExternalSyntheticLambda0(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    setY(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setLayoutDirection());
                    }
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                    do {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setNavigationOnClickListener());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                setY(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Integer.valueOf(setLayoutDirection()));
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 5) {
                do {
                    list.add(Integer.valueOf(setNavigationOnClickListener()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void MenuHostHelper$$ExternalSyntheticLambda1(List<Boolean> list) {
            int i;
            int i2;
            int i3;
            int i4;
            if (list instanceof setIconStartPaddingResource) {
                setIconStartPaddingResource seticonstartpaddingresource = (setIconStartPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    do {
                        seticonstartpaddingresource.setY(MenuHostHelper$$ExternalSyntheticLambda0());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i3 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i3;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = this.setLayoutAnimation + setTextAppearanceResource();
                    while (true) {
                        i4 = this.setLayoutAnimation;
                        if (i4 >= textAppearanceResource) {
                            break;
                        }
                        seticonstartpaddingresource.setY(setTextAppearanceResource() != 0);
                    }
                    if (i4 != textAppearanceResource) {
                        throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                do {
                    list.add(Boolean.valueOf(MenuHostHelper$$ExternalSyntheticLambda0()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = this.setLayoutAnimation + setTextAppearanceResource();
                while (true) {
                    i2 = this.setLayoutAnimation;
                    if (i2 >= textAppearanceResource2) {
                        break;
                    }
                    list.add(Boolean.valueOf(setTextAppearanceResource() != 0));
                }
                if (i2 != textAppearanceResource2) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void ViewPager$SavedState$1(List<String> list) {
            MenuHostHelper$$ExternalSyntheticLambda0(list, false);
        }

        @Override // o.setTranslateX
        public final void setIconSize(List<String> list) {
            MenuHostHelper$$ExternalSyntheticLambda0(list, true);
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(List<String> list, boolean z) {
            int i;
            int i2;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 2) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if ((list instanceof ExecutorsRegistrar) && !z) {
                ExecutorsRegistrar executorsRegistrar = (ExecutorsRegistrar) list;
                do {
                    executorsRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(setY());
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i2 = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i2;
                return;
            }
            do {
                list.add(setIconTintList(z));
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                i = this.setLayoutAnimation;
            } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
            this.setLayoutAnimation = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setTranslateX
        public final <T> void setX(List<T> list, setValues<T> setvalues, setStateDescription setstatedescription) {
            int i;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 2) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            int i2 = this.setNavigationOnClickListener;
            do {
                list.add(setY(setvalues, setstatedescription));
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                i = this.setLayoutAnimation;
            } while (setTextAppearanceResource() == i2);
            this.setLayoutAnimation = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setTranslateX
        public final <T> void MenuHostHelper$$ExternalSyntheticLambda0(List<T> list, setValues<T> setvalues, setStateDescription setstatedescription) {
            int i;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 3) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            int i2 = this.setNavigationOnClickListener;
            do {
                list.add(MenuHostHelper$$ExternalSyntheticLambda0(setvalues, setstatedescription));
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                i = this.setLayoutAnimation;
            } while (setTextAppearanceResource() == i2);
            this.setLayoutAnimation = i;
        }

        @Override // o.setTranslateX
        public final void setIconTintList(List<setSpeed> list) {
            int i;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 2) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(setY());
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                i = this.setLayoutAnimation;
            } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
            this.setLayoutAnimation = i;
        }

        @Override // o.setTranslateX
        public final void setTextScaleX(List<Integer> list) {
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
                    if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                        int textAppearanceResource = setTextAppearanceResource();
                        int i = this.setLayoutAnimation;
                        while (this.setLayoutAnimation < i + textAppearanceResource) {
                            setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                        }
                        return;
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
                while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    int i2 = this.setLayoutAnimation;
                    if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                        this.setLayoutAnimation = i2;
                        return;
                    }
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 != 0) {
                if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                    int textAppearanceResource2 = setTextAppearanceResource();
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource2) {
                        list.add(Integer.valueOf(setTextAppearanceResource()));
                    }
                    return;
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                list.add(Integer.valueOf(setTextAppearanceResource()));
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                int i4 = this.setLayoutAnimation;
                if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                    this.setLayoutAnimation = i4;
                    return;
                }
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final void setY(List<Integer> list) {
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
                    if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                        int textAppearanceResource = setTextAppearanceResource();
                        int i = this.setLayoutAnimation;
                        while (this.setLayoutAnimation < i + textAppearanceResource) {
                            setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                        }
                        return;
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
                while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                    setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    int i2 = this.setLayoutAnimation;
                    if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                        this.setLayoutAnimation = i2;
                        return;
                    }
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 != 0) {
                if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                    int textAppearanceResource2 = setTextAppearanceResource();
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource2) {
                        list.add(Integer.valueOf(setTextAppearanceResource()));
                    }
                    return;
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            while (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                list.add(Integer.valueOf(setTextAppearanceResource()));
                if (this.setLayoutAnimation == this.setIconTintList) {
                    return;
                }
                int i4 = this.setLayoutAnimation;
                if (setTextAppearanceResource() != this.setNavigationOnClickListener) {
                    this.setLayoutAnimation = i4;
                    return;
                }
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final void setUiOptions(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    setY(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setLayoutDirection());
                    }
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                    do {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setTextAlignment());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                setY(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Integer.valueOf(setLayoutDirection()));
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 5) {
                do {
                    list.add(Integer.valueOf(setTextAlignment()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setCenterIfNoTextEnabled(List<Long> list) {
            int i;
            int i2;
            if (list instanceof setChipEndPaddingResource) {
                setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                    do {
                        setchipendpaddingresource.setIconTintList(ViewPager$SavedState$1());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource);
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        setchipendpaddingresource.setIconTintList(setMinAndMaxProgress());
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
                do {
                    list.add(Long.valueOf(ViewPager$SavedState$1()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                MenuHostHelper$$ExternalSyntheticLambda1(textAppearanceResource2);
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    list.add(Long.valueOf(setMinAndMaxProgress()));
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setChipCornerRadius(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof setLabelVisibilityMode) {
                setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    do {
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0(setChipCornerRadius());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        int textAppearanceResource2 = setTextAppearanceResource();
                        setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda0((textAppearanceResource2 >>> 1) ^ (-(textAppearanceResource2 & 1)));
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                do {
                    list.add(Integer.valueOf(setChipCornerRadius()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource3 = setTextAppearanceResource();
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource3) {
                    int textAppearanceResource4 = setTextAppearanceResource();
                    list.add(Integer.valueOf((textAppearanceResource4 >>> 1) ^ (-(textAppearanceResource4 & 1))));
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        @Override // o.setTranslateX
        public final void setTextAlignment(List<Long> list) {
            int i;
            int i2;
            if (list instanceof setChipEndPaddingResource) {
                setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
                int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    do {
                        setchipendpaddingresource.setIconTintList(setCenterIfNoTextEnabled());
                        if (this.setLayoutAnimation == this.setIconTintList) {
                            return;
                        }
                        i2 = this.setLayoutAnimation;
                    } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                    this.setLayoutAnimation = i2;
                    return;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                    int textAppearanceResource = setTextAppearanceResource();
                    int i3 = this.setLayoutAnimation;
                    while (this.setLayoutAnimation < i3 + textAppearanceResource) {
                        long SearchView$SavedState$1 = SearchView$SavedState$1();
                        setchipendpaddingresource.setIconTintList((SearchView$SavedState$1 >>> 1) ^ (-(SearchView$SavedState$1 & 1)));
                    }
                    return;
                } else {
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
                do {
                    list.add(Long.valueOf(setCenterIfNoTextEnabled()));
                    if (this.setLayoutAnimation == this.setIconTintList) {
                        return;
                    }
                    i = this.setLayoutAnimation;
                } while (setTextAppearanceResource() == this.setNavigationOnClickListener);
                this.setLayoutAnimation = i;
            } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
                int textAppearanceResource2 = setTextAppearanceResource();
                int i4 = this.setLayoutAnimation;
                while (this.setLayoutAnimation < i4 + textAppearanceResource2) {
                    long SearchView$SavedState$12 = SearchView$SavedState$1();
                    list.add(Long.valueOf((SearchView$SavedState$12 >>> 1) ^ (-(SearchView$SavedState$12 & 1))));
                }
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }

        private Object setIconTintList(setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, Class<?> cls, setStateDescription setstatedescription) {
            switch (AnonymousClass2.setIconTintList[setcloseiconvisible_menuhosthelper__externalsyntheticlambda1.ordinal()]) {
                case 1:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Boolean.valueOf(setTextAppearanceResource() != 0);
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 2:
                    return setY();
                case 3:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Double.valueOf(Double.longBitsToDouble(setMinAndMaxProgress()));
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 4:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Integer.valueOf(setTextAppearanceResource());
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 5:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Integer.valueOf(setLayoutDirection());
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 6:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Long.valueOf(setMinAndMaxProgress());
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 7:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Float.valueOf(Float.intBitsToFloat(setLayoutDirection()));
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 8:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Integer.valueOf(setTextAppearanceResource());
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 9:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Long.valueOf(SearchView$SavedState$1());
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 10:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                        return setY(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription);
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 11:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Integer.valueOf(setLayoutDirection());
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 12:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                        throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                    }
                    if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                        return Long.valueOf(setMinAndMaxProgress());
                    }
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                case 13:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        int textAppearanceResource = setTextAppearanceResource();
                        return Integer.valueOf((textAppearanceResource >>> 1) ^ (-(textAppearanceResource & 1)));
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 14:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        long SearchView$SavedState$1 = SearchView$SavedState$1();
                        return Long.valueOf((SearchView$SavedState$1 >>> 1) ^ (-(1 & SearchView$SavedState$1)));
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 15:
                    return setIconTintList(true);
                case 16:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Integer.valueOf(setTextAppearanceResource());
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                case 17:
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                        return Long.valueOf(SearchView$SavedState$1());
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int setTextAppearanceResource() {
            int i;
            int i2 = this.setLayoutAnimation;
            int i3 = this.setIconTintList;
            if (i3 == i2) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.setLayoutAnimation = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) setCheckedIconEnabled();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (bArr[i7] < 0) {
                                                    throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.setLayoutAnimation = i5;
                return i;
            }
        }

        private long SearchView$SavedState$1() {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            int i2 = this.setLayoutAnimation;
            int i3 = this.setIconTintList;
            if (i3 == i2) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.setLayoutAnimation = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return setCheckedIconEnabled();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 >= 0) {
                            long j5 = i9;
                            int i10 = i5 + 1;
                            long j6 = j5 ^ (bArr[i5] << 28);
                            if (j6 < 0) {
                                i5 = i10 + 1;
                                long j7 = j6 ^ (bArr[i10] << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j6 = j7 ^ (bArr[i5] << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j7 = j6 ^ (bArr[i10] << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j8 = (j7 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i5 = i11 + 1;
                                                if (bArr[i11] < 0) {
                                                    throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
                                                }
                                                j2 = j8;
                                                this.setLayoutAnimation = i5;
                                                return j2;
                                            }
                                            i7 = i11;
                                            j = j8;
                                        }
                                    }
                                }
                                j2 = j7 ^ j3;
                                this.setLayoutAnimation = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j2 = j6 ^ j4;
                            i5 = i10;
                            this.setLayoutAnimation = i5;
                            return j2;
                        }
                        i = i9 ^ (-2080896);
                    }
                    i5 = i7;
                    j2 = j;
                    this.setLayoutAnimation = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.setLayoutAnimation = i5;
                return j2;
            }
        }

        private long setCheckedIconEnabled() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte guidelinePercent = setGuidelinePercent();
                j |= (guidelinePercent & Byte.MAX_VALUE) << i;
                if ((guidelinePercent & 128) == 0) {
                    return j;
                }
            }
            throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
        }

        private byte setGuidelinePercent() {
            int i = this.setLayoutAnimation;
            if (i == this.setIconTintList) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setLayoutAnimation = i + 1;
            return bArr[i];
        }

        private int setLayoutDirection() {
            int i = this.setLayoutAnimation;
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setLayoutAnimation = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long setMinAndMaxProgress() {
            int i = this.setLayoutAnimation;
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setLayoutAnimation = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private void setHasDecor() {
            int i = this.setIconTintList;
            int i2 = this.setLayoutAnimation;
            if (i - i2 >= 10) {
                byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.setLayoutAnimation = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            for (int i5 = 0; i5 < 10; i5++) {
                if (setGuidelinePercent() >= 0) {
                    return;
                }
            }
            throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
        }

        private void setChipIconTintResource() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.setY(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener), 4);
            while (setIconTintList() != Integer.MAX_VALUE && setOnNavigationItemSelectedListener()) {
            }
            if (this.setNavigationOnClickListener != this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new setProgressDrawableTiled("Failed to parse the message.");
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            if (i >= 0) {
                int i2 = this.setIconTintList;
                int i3 = this.setLayoutAnimation;
                if (i <= i2 - i3) {
                    this.setLayoutAnimation = i3 + i;
                    return;
                }
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        private void setY(int i) {
            if (i < 0 || i > this.setIconTintList - this.setLayoutAnimation) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i & 3) != 0) {
                throw new setProgressDrawableTiled("Failed to parse the message.");
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            if (i < 0 || i > this.setIconTintList - this.setLayoutAnimation) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i & 7) != 0) {
                throw new setProgressDrawableTiled("Failed to parse the message.");
            }
        }

        @Override // o.setTranslateX
        public final int setIconTintList() {
            if (this.setLayoutAnimation == this.setIconTintList) {
                return Integer.MAX_VALUE;
            }
            int textAppearanceResource = setTextAppearanceResource();
            this.setNavigationOnClickListener = textAppearanceResource;
            if (textAppearanceResource == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return Integer.MAX_VALUE;
            }
            return setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(textAppearanceResource);
        }

        @Override // o.setTranslateX
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return setTextAppearanceResource() != 0;
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final setSpeed setY() {
            setSpeed x;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                int textAppearanceResource = setTextAppearanceResource();
                if (textAppearanceResource == 0) {
                    return setSpeed.setIconTintList;
                }
                if (textAppearanceResource >= 0) {
                    int i = this.setIconTintList;
                    int i2 = this.setLayoutAnimation;
                    if (textAppearanceResource <= i - i2) {
                        if (this.setY) {
                            x = setSpeed.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, i2, textAppearanceResource);
                        } else {
                            x = setSpeed.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, i2, textAppearanceResource);
                        }
                        this.setLayoutAnimation += textAppearanceResource;
                        return x;
                    }
                }
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final double setX() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                return Double.longBitsToDouble(setMinAndMaxProgress());
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final int setOnLongClickListener() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return setTextAppearanceResource();
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final int setNavigationOnClickListener() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                return setLayoutDirection();
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final long setUiOptions() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                return setMinAndMaxProgress();
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final float setLayoutAnimation() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                return Float.intBitsToFloat(setLayoutDirection());
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final <T> T setX(Class<T> cls, setStateDescription setstatedescription) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 3) {
                return (T) MenuHostHelper$$ExternalSyntheticLambda0(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription);
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final <T> T setIconTintList(setValues<T> setvalues, setStateDescription setstatedescription) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 3) {
                return (T) MenuHostHelper$$ExternalSyntheticLambda0(setvalues, setstatedescription);
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final int setUnboundedRipple() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return setTextAppearanceResource();
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final long setIconSize() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return SearchView$SavedState$1();
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setTranslateX
        public final <K, V> void MenuHostHelper$$ExternalSyntheticLambda0(Map<K, V> map, setRightStripDrawable.setY<K, V> sety, setStateDescription setstatedescription) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                int textAppearanceResource = setTextAppearanceResource();
                if (textAppearanceResource >= 0) {
                    int i = this.setIconTintList;
                    int i2 = this.setLayoutAnimation;
                    if (textAppearanceResource <= i - i2) {
                        this.setIconTintList = i2 + textAppearanceResource;
                        try {
                            Object obj = sety.setY;
                            Object obj2 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
                            while (true) {
                                int iconTintList = setIconTintList();
                                if (iconTintList == Integer.MAX_VALUE) {
                                    map.put(obj, obj2);
                                    return;
                                } else if (iconTintList == 1) {
                                    obj = setIconTintList(sety.setIconTintList, null, null);
                                } else if (iconTintList == 2) {
                                    obj2 = setIconTintList(sety.setX, sety.MenuHostHelper$$ExternalSyntheticLambda0.getClass(), setstatedescription);
                                } else {
                                    try {
                                        if (!setOnNavigationItemSelectedListener()) {
                                            throw new setProgressDrawableTiled("Unable to parse map entry.");
                                            break;
                                        }
                                    } catch (setProgressDrawableTiled.setY unused) {
                                        if (!setOnNavigationItemSelectedListener()) {
                                            throw new setProgressDrawableTiled("Unable to parse map entry.");
                                        }
                                    }
                                }
                            }
                        } finally {
                            this.setIconTintList = i;
                        }
                    }
                }
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls, setStateDescription setstatedescription) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                return (T) setY(writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(cls), setstatedescription);
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final <T> T setX(setValues<T> setvalues, setStateDescription setstatedescription) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                return (T) setY(setvalues, setstatedescription);
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final int setTextAlignment() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 5) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (4 <= this.setIconTintList - this.setLayoutAnimation) {
                return setLayoutDirection();
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final long ViewPager$SavedState$1() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) != 1) {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            if (8 <= this.setIconTintList - this.setLayoutAnimation) {
                return setMinAndMaxProgress();
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setTranslateX
        public final int setChipCornerRadius() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                int textAppearanceResource = setTextAppearanceResource();
                return (textAppearanceResource >>> 1) ^ (-(textAppearanceResource & 1));
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final long setCenterIfNoTextEnabled() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                long SearchView$SavedState$1 = SearchView$SavedState$1();
                return (SearchView$SavedState$1 >>> 1) ^ (-(1 & SearchView$SavedState$1));
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        private String setIconTintList(boolean z) {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 2) {
                int textAppearanceResource = setTextAppearanceResource();
                if (textAppearanceResource == 0) {
                    return "";
                }
                if (textAppearanceResource >= 0) {
                    int i = this.setIconTintList;
                    int i2 = this.setLayoutAnimation;
                    if (textAppearanceResource <= i - i2) {
                        if (z && !setExpandedTitleMarginEnd.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, i2, i2 + textAppearanceResource)) {
                            throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                        }
                        String str = new String(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setLayoutAnimation, textAppearanceResource, setViewCacheExtension.setY);
                        this.setLayoutAnimation += textAppearanceResource;
                        return str;
                    }
                }
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final int setTextScaleX() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return setTextAppearanceResource();
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final long setZ() {
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener) == 0) {
                return SearchView$SavedState$1();
            }
            throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
        }

        @Override // o.setTranslateX
        public final boolean setOnNavigationItemSelectedListener() {
            int i;
            if ((this.setLayoutAnimation == this.setIconTintList) || (i = this.setNavigationOnClickListener) == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return false;
            }
            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(i);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                setHasDecor();
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                MenuHostHelper$$ExternalSyntheticLambda0(8);
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                MenuHostHelper$$ExternalSyntheticLambda0(setTextAppearanceResource());
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                setChipIconTintResource();
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                MenuHostHelper$$ExternalSyntheticLambda0(4);
                return true;
            } else {
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setScaleType$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            setIconTintList = iArr;
            try {
                iArr[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                setIconTintList[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}