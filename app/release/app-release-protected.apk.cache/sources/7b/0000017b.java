package o;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o.vP;

/* loaded from: classes.dex */
public final class Counter$1 {
    static final int[] MenuHostHelper$$ExternalSyntheticLambda0;
    static final Charset MenuHostHelper$$ExternalSyntheticLambda1;
    private static final byte[] ViewPager$SavedState$1;
    private static final HashMap<String, Counter$1$MenuHostHelper$$ExternalSyntheticLambda1>[] setAnimationFromJson;
    private static final HashMap<Integer, Counter$1$MenuHostHelper$$ExternalSyntheticLambda1>[] setCenterIfNoTextEnabled;
    private static final Counter$1$MenuHostHelper$$ExternalSyntheticLambda1 setChipCornerRadius;
    private static final HashMap<Integer, Integer> setIconSize;
    static final String[] setIconTintList;
    private static byte[] setLayoutAnimation;
    private static final Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] setNavigationOnClickListener;
    private static int[] setOnLongClickListener;
    private static final HashSet<String> setOnNavigationItemSelectedListener;
    private static final byte[] setTextAlignment;
    private static byte[] setUiOptions;
    private static Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[][] setUnboundedRipple;
    static final byte[] setX;
    private static int[] setY;
    private int ExtendableSavedState$1;
    private byte[] FragmentStateAdapter$2;
    private int FragmentStateAdapter$5;
    private int SearchView$SavedState$1;
    private boolean setCheckedIconEnabled;
    private int setChipIconTintResource;
    private int setConstraintSet;
    private int setContentScrimResource;
    private final String setGuidelinePercent;
    private int setHasDecor;
    private int setIconified;
    private int setLayoutDirection;
    private final AssetManager.AssetInputStream setMaxEms;
    private boolean setMinAndMaxProgress;
    private ByteOrder setTextAppearanceResource;
    private Set<Integer> setTextScaleX;
    private final HashMap<String, setIconTintList>[] setZ;

    static {
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        setOnLongClickListener = new int[]{8, 8, 8};
        setY = new int[]{8};
        setUiOptions = new byte[]{-1, -40, -1};
        setTextAlignment = new byte[]{79, 76, 89, 77, 80, 0};
        ViewPager$SavedState$1 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        setIconTintList = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        MenuHostHelper$$ExternalSyntheticLambda0 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        setX = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr2 = {new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("NewSubfileType", vP.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubfileType", 255, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageWidth", 256), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageLength", 257), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("BitsPerSample", 258, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Compression", 259, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PhotometricInterpretation", 262, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageDescription", 270, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Make", 271, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Model", 272, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("StripOffsets", 273), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Orientation", 274, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SamplesPerPixel", 277, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("RowsPerStrip", 278), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("StripByteCounts", 279), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("XResolution", 282, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YResolution", 283, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PlanarConfiguration", 284, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ResolutionUnit", 296, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("TransferFunction", 301, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Software", 305, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DateTime", 306, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Artist", 315, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("WhitePoint", 318, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PrimaryChromaticities", 319, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubIFDPointer", 330, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormat", 513, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormatLength", 514, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrCoefficients", 529, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrSubSampling", 530, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrPositioning", 531, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ReferenceBlackWhite", 532, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Copyright", 33432, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExifIFDPointer", 34665, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSInfoIFDPointer", 34853, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SensorTopBorder", 4, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SensorLeftBorder", 5, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SensorBottomBorder", 6, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SensorRightBorder", 7, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ISO", 23, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JpgFromRaw", 46, 7)};
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr3 = {new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExposureTime", 33434, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FNumber", 33437, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExposureProgram", 34850, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SpectralSensitivity", 34852, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PhotographicSensitivity", 34855, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("OECF", 34856, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExifVersion", 36864, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DateTimeOriginal", 36867, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DateTimeDigitized", 36868, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ComponentsConfiguration", 37121, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("CompressedBitsPerPixel", 37122, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ShutterSpeedValue", 37377, 10), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ApertureValue", 37378, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("BrightnessValue", 37379, 10), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExposureBiasValue", 37380, 10), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("MaxApertureValue", 37381, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubjectDistance", 37382, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("MeteringMode", 37383, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("LightSource", 37384, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Flash", 37385, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FocalLength", 37386, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubjectArea", 37396, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("MakerNote", 37500, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("UserComment", 37510, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubSecTime", 37520, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubSecTimeOriginal", 37521, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubSecTimeDigitized", 37522, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FlashpixVersion", 40960, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ColorSpace", 40961, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PixelXDimension", 40962), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PixelYDimension", 40963), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("RelatedSoundFile", 40964, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("InteroperabilityIFDPointer", 40965, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FlashEnergy", 41483, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SpatialFrequencyResponse", 41484, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FocalPlaneXResolution", 41486, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FocalPlaneYResolution", 41487, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FocalPlaneResolutionUnit", 41488, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubjectLocation", 41492, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExposureIndex", 41493, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SensingMethod", 41495, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FileSource", 41728, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SceneType", 41729, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("CFAPattern", 41730, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("CustomRendered", 41985, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExposureMode", 41986, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("WhiteBalance", 41987, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DigitalZoomRatio", 41988, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("FocalLengthIn35mmFilm", 41989, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SceneCaptureType", 41990, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GainControl", 41991, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Contrast", 41992, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Saturation", 41993, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Sharpness", 41994, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DeviceSettingDescription", 41995, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubjectDistanceRange", 41996, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageUniqueID", 42016, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DNGVersion", 50706, 1), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DefaultCropSize", 50720)};
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr4 = {new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSVersionID", 0, 1), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSLatitudeRef", 1, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSLatitude", 2, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSLongitudeRef", 3, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSLongitude", 4, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSAltitudeRef", 5, 1), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSAltitude", 6, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSTimeStamp", 7, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSSatellites", 8, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSStatus", 9, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSMeasureMode", 10, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDOP", 11, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSSpeedRef", 12, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSSpeed", 13, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSTrackRef", 14, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSTrack", 15, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSImgDirectionRef", 16, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSImgDirection", 17, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSMapDatum", 18, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestLatitudeRef", 19, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestLatitude", 20, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestLongitudeRef", 21, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestLongitude", 22, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestBearingRef", 23, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestBearing", 24, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestDistanceRef", 25, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDestDistance", 26, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSProcessingMethod", 27, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSAreaInformation", 28, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDateStamp", 29, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSDifferential", 30, 3)};
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr5 = {new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("InteroperabilityIndex", 1, 2)};
        Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr6 = {new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("NewSubfileType", vP.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubfileType", 255, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ThumbnailImageWidth", 256), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ThumbnailImageLength", 257), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("BitsPerSample", 258, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Compression", 259, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PhotometricInterpretation", 262, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageDescription", 270, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Make", 271, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Model", 272, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("StripOffsets", 273), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Orientation", 274, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SamplesPerPixel", 277, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("RowsPerStrip", 278), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("StripByteCounts", 279), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("XResolution", 282, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YResolution", 283, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PlanarConfiguration", 284, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ResolutionUnit", 296, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("TransferFunction", 301, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Software", 305, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DateTime", 306, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Artist", 315, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("WhitePoint", 318, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PrimaryChromaticities", 319, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubIFDPointer", 330, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormat", 513, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormatLength", 514, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrCoefficients", 529, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrSubSampling", 530, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("YCbCrPositioning", 531, 3), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ReferenceBlackWhite", 532, 5), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("Copyright", 33432, 2), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExifIFDPointer", 34665, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSInfoIFDPointer", 34853, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DNGVersion", 50706, 1), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("DefaultCropSize", 50720)};
        setChipCornerRadius = new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("StripOffsets", 273, 3);
        setUnboundedRipple = new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[][]{counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr2, counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr3, counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr4, counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr5, counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr6, counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr2, new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[]{new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ThumbnailImage", 256, 7), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("CameraSettingsIFDPointer", 8224, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageProcessingIFDPointer", 8256, 4)}, new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[]{new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PreviewImageStart", 257, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("PreviewImageLength", 258, 4)}, new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[]{new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("AspectFrame", 4371, 3)}, new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[]{new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ColorSpace", 55, 3)}};
        setNavigationOnClickListener = new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[]{new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("SubIFDPointer", 330, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ExifIFDPointer", 34665, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("GPSInfoIFDPointer", 34853, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("InteroperabilityIFDPointer", 40965, 4), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("CameraSettingsIFDPointer", 8224, 1), new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("ImageProcessingIFDPointer", 8256, 1)};
        new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormat", 513, 4);
        new Counter$1$MenuHostHelper$$ExternalSyntheticLambda1("JPEGInterchangeFormatLength", 514, 4);
        setCenterIfNoTextEnabled = new HashMap[10];
        setAnimationFromJson = new HashMap[10];
        setOnNavigationItemSelectedListener = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        setIconSize = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        MenuHostHelper$$ExternalSyntheticLambda1 = forName;
        setLayoutAnimation = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[][] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr7 = setUnboundedRipple;
            if (i < counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr7.length) {
                setCenterIfNoTextEnabled[i] = new HashMap<>();
                setAnimationFromJson[i] = new HashMap<>();
                for (Counter$1$MenuHostHelper$$ExternalSyntheticLambda1 counter$1$MenuHostHelper$$ExternalSyntheticLambda1 : counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr7[i]) {
                    setCenterIfNoTextEnabled[i].put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1.setY), counter$1$MenuHostHelper$$ExternalSyntheticLambda1);
                    setAnimationFromJson[i].put(counter$1$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, counter$1$MenuHostHelper$$ExternalSyntheticLambda1);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = setIconSize;
                Counter$1$MenuHostHelper$$ExternalSyntheticLambda1[] counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8 = setNavigationOnClickListener;
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[0].setY), 5);
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[1].setY), 1);
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[2].setY), 2);
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[3].setY), 3);
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[4].setY), 7);
                hashMap.put(Integer.valueOf(counter$1$MenuHostHelper$$ExternalSyntheticLambda1Arr8[5].setY), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        public final long MenuHostHelper$$ExternalSyntheticLambda1;
        public final long setIconTintList;

        setY(long j, long j2) {
            if (j2 == 0) {
                this.setIconTintList = 0L;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 1L;
                return;
            }
            this.setIconTintList = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = j2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setIconTintList);
            sb.append("/");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        public final int MenuHostHelper$$ExternalSyntheticLambda0;
        public final byte[] MenuHostHelper$$ExternalSyntheticLambda1;
        public final int setY;

        setIconTintList(int i, int i2, byte[] bArr) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setY = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = bArr;
        }

        public static setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[Counter$1.MenuHostHelper$$ExternalSyntheticLambda0[3] * iArr.length]);
            wrap.order(byteOrder);
            int length = iArr.length;
            for (int i = 0; i <= 0; i++) {
                wrap.putShort((short) iArr[0]);
            }
            return new setIconTintList(3, iArr.length, wrap.array());
        }

        public static setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[Counter$1.MenuHostHelper$$ExternalSyntheticLambda0[4] * jArr.length]);
            wrap.order(byteOrder);
            int length = jArr.length;
            for (int i = 0; i <= 0; i++) {
                wrap.putInt((int) jArr[0]);
            }
            return new setIconTintList(4, jArr.length, wrap.array());
        }

        public static setIconTintList setX(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((char) 0);
            byte[] bytes = sb.toString().getBytes(Counter$1.MenuHostHelper$$ExternalSyntheticLambda1);
            return new setIconTintList(2, bytes.length, bytes);
        }

        public static setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(setY[] setyArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[Counter$1.MenuHostHelper$$ExternalSyntheticLambda0[5] * setyArr.length]);
            wrap.order(byteOrder);
            int length = setyArr.length;
            for (int i = 0; i <= 0; i++) {
                setY sety = setyArr[0];
                wrap.putInt((int) sety.setIconTintList);
                wrap.putInt((int) sety.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return new setIconTintList(5, setyArr.length, wrap.array());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(Counter$1.setIconTintList[this.MenuHostHelper$$ExternalSyntheticLambda0]);
            sb.append(", data length:");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.length);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x018f: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:137:0x018f */
        /* JADX WARN: Removed duplicated region for block: B:166:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final java.lang.Object setX(java.nio.ByteOrder r13) {
            /*
                Method dump skipped, instructions count: 462
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Counter$1.setIconTintList.setX(java.nio.ByteOrder):java.lang.Object");
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda1(ByteOrder byteOrder) {
            Object x = setX(byteOrder);
            if (x == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (x instanceof String) {
                return Integer.parseInt((String) x);
            }
            if (x instanceof long[]) {
                long[] jArr = (long[]) x;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (x instanceof int[]) {
                int[] iArr = (int[]) x;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }

        public final String MenuHostHelper$$ExternalSyntheticLambda0(ByteOrder byteOrder) {
            Object x = setX(byteOrder);
            if (x == null) {
                return null;
            }
            if (x instanceof String) {
                return (String) x;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (x instanceof long[]) {
                long[] jArr = (long[]) x;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (x instanceof int[]) {
                int[] iArr = (int[]) x;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (x instanceof double[]) {
                double[] dArr = (double[]) x;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (x instanceof setY[]) {
                setY[] setyArr = (setY[]) x;
                while (i < setyArr.length) {
                    sb.append(setyArr[i].setIconTintList);
                    sb.append('/');
                    sb.append(setyArr[i].MenuHostHelper$$ExternalSyntheticLambda1);
                    i++;
                    if (i != setyArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02dd, code lost:
        if (java.util.Arrays.equals(r3, o.Counter$1.setY) != false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02eb A[Catch: all -> 0x0377, IOException -> 0x0379, TryCatch #0 {IOException -> 0x0379, blocks: (B:7:0x002a, B:9:0x002f, B:10:0x003b, B:11:0x0051, B:13:0x0057, B:46:0x00cb, B:50:0x00e3, B:52:0x00f4, B:53:0x00f9, B:56:0x0113, B:57:0x011c, B:59:0x0150, B:61:0x015e, B:62:0x018a, B:63:0x0191, B:65:0x01a2, B:67:0x01c6, B:71:0x01d7, B:74:0x01f7, B:75:0x0209, B:77:0x0219, B:79:0x0223, B:81:0x0227, B:83:0x022e, B:85:0x0235, B:87:0x023b, B:88:0x023f, B:89:0x0262, B:68:0x01cc, B:70:0x01d2, B:90:0x0278, B:91:0x027c, B:92:0x027f, B:94:0x028e, B:145:0x0373, B:100:0x029f, B:101:0x02a4, B:103:0x02ae, B:120:0x02eb, B:123:0x02ff, B:125:0x0315, B:127:0x031d, B:128:0x0323, B:130:0x0329, B:131:0x032f, B:132:0x0335, B:143:0x0367, B:106:0x02c0, B:108:0x02c5, B:110:0x02cf, B:112:0x02d7, B:115:0x02e1, B:144:0x036e, B:21:0x0068, B:22:0x0073, B:24:0x0076, B:31:0x0087, B:39:0x00aa, B:27:0x007e, B:16:0x005f), top: B:174:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Counter$1(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Counter$1.<init>(java.lang.String):void");
    }

    private setIconTintList setIconTintList(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < setUnboundedRipple.length; i++) {
            setIconTintList seticontintlist = this.setZ[i].get(str);
            if (seticontintlist != null) {
                return seticontintlist;
            }
        }
        return null;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        double d;
        setIconTintList iconTintList = setIconTintList(str);
        if (iconTintList != null) {
            if (!setOnNavigationItemSelectedListener.contains(str)) {
                return iconTintList.MenuHostHelper$$ExternalSyntheticLambda0(this.setTextAppearanceResource);
            }
            if (str.equals("GPSTimeStamp")) {
                if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != 5 && iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != 10) {
                    StringBuilder sb = new StringBuilder("GPS Timestamp format is not rational. format=");
                    sb.append(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
                    Log.w("ExifInterface", sb.toString());
                    return null;
                }
                setY[] setyArr = (setY[]) iconTintList.setX(this.setTextAppearanceResource);
                if (setyArr == null || setyArr.length != 3) {
                    StringBuilder sb2 = new StringBuilder("Invalid GPS Timestamp array. array=");
                    sb2.append(Arrays.toString(setyArr));
                    Log.w("ExifInterface", sb2.toString());
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) setyArr[0].setIconTintList) / ((float) setyArr[0].MenuHostHelper$$ExternalSyntheticLambda1))), Integer.valueOf((int) (((float) setyArr[1].setIconTintList) / ((float) setyArr[1].MenuHostHelper$$ExternalSyntheticLambda1))), Integer.valueOf((int) (((float) setyArr[2].setIconTintList) / ((float) setyArr[2].MenuHostHelper$$ExternalSyntheticLambda1))));
            }
            try {
                Object x = iconTintList.setX(this.setTextAppearanceResource);
                if (x == null) {
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                if (x instanceof String) {
                    d = Double.parseDouble((String) x);
                } else if (x instanceof long[]) {
                    long[] jArr = (long[]) x;
                    if (jArr.length == 1) {
                        d = jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (x instanceof int[]) {
                    int[] iArr = (int[]) x;
                    if (iArr.length == 1) {
                        d = iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (x instanceof double[]) {
                    double[] dArr = (double[]) x;
                    if (dArr.length == 1) {
                        d = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (x instanceof setY[]) {
                    setY[] setyArr2 = (setY[]) x;
                    if (setyArr2.length == 1) {
                        setY sety = setyArr2[0];
                        d = sety.setIconTintList / sety.MenuHostHelper$$ExternalSyntheticLambda1;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        setIconTintList iconTintList = setIconTintList(str);
        if (iconTintList == null) {
            return 1;
        }
        try {
            return iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
        r11.MenuHostHelper$$ExternalSyntheticLambda0 = r10.setTextAppearanceResource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda1(o.Counter$1.setX r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Counter$1.MenuHostHelper$$ExternalSyntheticLambda1(o.Counter$1$setX, int, int):void");
    }

    private void setY(setX setx) {
        setIconTintList seticontintlist;
        setIconTintList(setx, setx.available());
        setX(setx, 0);
        MenuHostHelper$$ExternalSyntheticLambda1(setx, 0);
        MenuHostHelper$$ExternalSyntheticLambda1(setx, 5);
        MenuHostHelper$$ExternalSyntheticLambda1(setx, 4);
        setY();
        if (this.setHasDecor != 8 || (seticontintlist = this.setZ[1].get("MakerNote")) == null) {
            return;
        }
        setX setx2 = new setX(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
        setx2.MenuHostHelper$$ExternalSyntheticLambda0 = this.setTextAppearanceResource;
        setx2.MenuHostHelper$$ExternalSyntheticLambda0(6L);
        setX(setx2, 9);
        setIconTintList seticontintlist2 = this.setZ[9].get("ColorSpace");
        if (seticontintlist2 != null) {
            this.setZ[1].put("ColorSpace", seticontintlist2);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        String MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1("DateTimeOriginal");
        if (MenuHostHelper$$ExternalSyntheticLambda12 != null && MenuHostHelper$$ExternalSyntheticLambda1("DateTime") == null) {
            this.setZ[0].put("DateTime", setIconTintList.setX(MenuHostHelper$$ExternalSyntheticLambda12));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1("ImageWidth") == null) {
            this.setZ[0].put("ImageWidth", setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new long[]{0}, this.setTextAppearanceResource));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1("ImageLength") == null) {
            this.setZ[0].put("ImageLength", setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new long[]{0}, this.setTextAppearanceResource));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1("Orientation") == null) {
            this.setZ[0].put("Orientation", setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new long[]{0}, this.setTextAppearanceResource));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1("LightSource") == null) {
            this.setZ[1].put("LightSource", setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new long[]{0}, this.setTextAppearanceResource));
        }
    }

    private static ByteOrder setIconTintList(setX setx) {
        short readShort = setx.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(Integer.toHexString(readShort));
            throw new IOException(sb.toString());
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void setIconTintList(setX setx, int i) {
        ByteOrder iconTintList = setIconTintList(setx);
        this.setTextAppearanceResource = iconTintList;
        setx.MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList;
        int readUnsignedShort = setx.readUnsignedShort();
        int i2 = this.setHasDecor;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            StringBuilder sb = new StringBuilder("Invalid start code: ");
            sb.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(sb.toString());
        }
        int readInt = setx.readInt();
        if (readInt < 8 || readInt >= i) {
            StringBuilder sb2 = new StringBuilder("Invalid first Ifd offset: ");
            sb2.append(readInt);
            throw new IOException(sb2.toString());
        }
        int i3 = readInt - 8;
        if (i3 <= 0 || setx.skipBytes(i3) == i3) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Couldn't jump to first Ifd: ");
        sb3.append(i3);
        throw new IOException(sb3.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x032c, code lost:
        r1 = new java.lang.StringBuilder("Stop reading file since a wrong offset may cause an infinite loop: ");
        r1.append(r2);
        android.util.Log.w("ExifInterface", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x033d, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setX(o.Counter$1.setX r26, int r27) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Counter$1.setX(o.Counter$1$setX, int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setX setx, int i) {
        setIconTintList seticontintlist;
        setIconTintList seticontintlist2 = this.setZ[i].get("ImageLength");
        setIconTintList seticontintlist3 = this.setZ[i].get("ImageWidth");
        if ((seticontintlist2 == null || seticontintlist3 == null) && (seticontintlist = this.setZ[i].get("JPEGInterchangeFormat")) != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setx, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource), i);
        }
    }

    private void setX(setX setx, HashMap hashMap) {
        int i;
        setIconTintList seticontintlist = (setIconTintList) hashMap.get("JPEGInterchangeFormat");
        setIconTintList seticontintlist2 = (setIconTintList) hashMap.get("JPEGInterchangeFormatLength");
        if (seticontintlist == null || seticontintlist2 == null) {
            return;
        }
        int MenuHostHelper$$ExternalSyntheticLambda12 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        int min = Math.min(seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource), setx.available() - MenuHostHelper$$ExternalSyntheticLambda12);
        int i2 = this.setHasDecor;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.SearchView$SavedState$1;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda12 > 0 || min <= 0) {
            }
            this.setMinAndMaxProgress = true;
            this.FragmentStateAdapter$5 = MenuHostHelper$$ExternalSyntheticLambda12;
            this.setConstraintSet = min;
            if (this.setGuidelinePercent == null && this.setMaxEms == null) {
                byte[] bArr = new byte[min];
                setx.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12);
                setx.readFully(bArr);
                this.FragmentStateAdapter$2 = bArr;
                return;
            }
            return;
        }
        i = this.setLayoutDirection;
        MenuHostHelper$$ExternalSyntheticLambda12 += i;
        if (MenuHostHelper$$ExternalSyntheticLambda12 > 0) {
        }
    }

    private boolean setX(HashMap hashMap) {
        setIconTintList seticontintlist = (setIconTintList) hashMap.get("ImageLength");
        setIconTintList seticontintlist2 = (setIconTintList) hashMap.get("ImageWidth");
        if (seticontintlist == null || seticontintlist2 == null) {
            return false;
        }
        return seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource) <= 512 && seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource) <= 512;
    }

    private void setY() {
        setY(0, 5);
        setY(0, 4);
        setY(5, 4);
        setIconTintList seticontintlist = this.setZ[1].get("PixelXDimension");
        setIconTintList seticontintlist2 = this.setZ[1].get("PixelYDimension");
        if (seticontintlist != null && seticontintlist2 != null) {
            this.setZ[0].put("ImageWidth", seticontintlist);
            this.setZ[0].put("ImageLength", seticontintlist2);
        }
        if (this.setZ[4].isEmpty() && setX(this.setZ[5])) {
            HashMap<String, setIconTintList>[] hashMapArr = this.setZ;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (setX(this.setZ[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setX setx, int i) {
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda12;
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda13;
        setIconTintList seticontintlist = this.setZ[i].get("DefaultCropSize");
        setIconTintList seticontintlist2 = this.setZ[i].get("SensorTopBorder");
        setIconTintList seticontintlist3 = this.setZ[i].get("SensorLeftBorder");
        setIconTintList seticontintlist4 = this.setZ[i].get("SensorBottomBorder");
        setIconTintList seticontintlist5 = this.setZ[i].get("SensorRightBorder");
        if (seticontintlist == null) {
            if (seticontintlist2 != null && seticontintlist3 != null && seticontintlist4 != null && seticontintlist5 != null) {
                int MenuHostHelper$$ExternalSyntheticLambda14 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
                int MenuHostHelper$$ExternalSyntheticLambda15 = seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
                int MenuHostHelper$$ExternalSyntheticLambda16 = seticontintlist5.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
                int MenuHostHelper$$ExternalSyntheticLambda17 = seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
                if (MenuHostHelper$$ExternalSyntheticLambda15 <= MenuHostHelper$$ExternalSyntheticLambda14 || MenuHostHelper$$ExternalSyntheticLambda16 <= MenuHostHelper$$ExternalSyntheticLambda17) {
                    return;
                }
                setIconTintList MenuHostHelper$$ExternalSyntheticLambda18 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new int[]{MenuHostHelper$$ExternalSyntheticLambda15 - MenuHostHelper$$ExternalSyntheticLambda14}, this.setTextAppearanceResource);
                setIconTintList MenuHostHelper$$ExternalSyntheticLambda19 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new int[]{MenuHostHelper$$ExternalSyntheticLambda16 - MenuHostHelper$$ExternalSyntheticLambda17}, this.setTextAppearanceResource);
                this.setZ[i].put("ImageLength", MenuHostHelper$$ExternalSyntheticLambda18);
                this.setZ[i].put("ImageWidth", MenuHostHelper$$ExternalSyntheticLambda19);
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda0(setx, i);
            return;
        }
        if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 == 5) {
            setY[] setyArr = (setY[]) seticontintlist.setX(this.setTextAppearanceResource);
            if (setyArr == null || setyArr.length != 2) {
                StringBuilder sb = new StringBuilder("Invalid crop size values. cropSize=");
                sb.append(Arrays.toString(setyArr));
                Log.w("ExifInterface", sb.toString());
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda12 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new setY[]{setyArr[0]}, this.setTextAppearanceResource);
            MenuHostHelper$$ExternalSyntheticLambda13 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new setY[]{setyArr[1]}, this.setTextAppearanceResource);
        } else {
            int[] iArr = (int[]) seticontintlist.setX(this.setTextAppearanceResource);
            if (iArr == null || iArr.length != 2) {
                StringBuilder sb2 = new StringBuilder("Invalid crop size values. cropSize=");
                sb2.append(Arrays.toString(iArr));
                Log.w("ExifInterface", sb2.toString());
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda12 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new int[]{iArr[0]}, this.setTextAppearanceResource);
            MenuHostHelper$$ExternalSyntheticLambda13 = setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(new int[]{iArr[1]}, this.setTextAppearanceResource);
        }
        this.setZ[i].put("ImageWidth", MenuHostHelper$$ExternalSyntheticLambda12);
        this.setZ[i].put("ImageLength", MenuHostHelper$$ExternalSyntheticLambda13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX extends InputStream implements DataInput {
        private static final ByteOrder setIconTintList = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder setX = ByteOrder.BIG_ENDIAN;
        ByteOrder MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        private DataInputStream setUnboundedRipple;
        final int setY;

        public setX(InputStream inputStream) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.setUnboundedRipple = dataInputStream;
            int available = dataInputStream.available();
            this.setY = available;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setUnboundedRipple.mark(available);
        }

        public setX(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(long j) {
            long j2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (j2 > j) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                this.setUnboundedRipple.reset();
                this.setUnboundedRipple.mark(this.setY);
            } else {
                j -= j2;
            }
            int i = (int) j;
            if (skipBytes(i) != i) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.setUnboundedRipple.available();
        }

        @Override // java.io.InputStream
        public final int read() {
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            return this.setUnboundedRipple.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int read = this.setUnboundedRipple.read(bArr, i, i2);
            this.MenuHostHelper$$ExternalSyntheticLambda1 += read;
            return read;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            return this.setUnboundedRipple.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            return this.setUnboundedRipple.readBoolean();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 += 2;
            return this.setUnboundedRipple.readChar();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 += 2;
            return this.setUnboundedRipple.readUTF();
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1 + i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
            if (i3 > this.setY) {
                throw new EOFException();
            }
            if (this.setUnboundedRipple.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.MenuHostHelper$$ExternalSyntheticLambda1 + bArr.length;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = length;
            if (length > this.setY) {
                throw new EOFException();
            }
            if (this.setUnboundedRipple.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 + 1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            if (i > this.setY) {
                throw new EOFException();
            }
            int read = this.setUnboundedRipple.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 + 2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            if (i > this.setY) {
                throw new EOFException();
            }
            int read = this.setUnboundedRipple.read();
            int read2 = this.setUnboundedRipple.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (byteOrder == setIconTintList) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == setX) {
                return (short) ((read << 8) + read2);
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 + 4;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            if (i > this.setY) {
                throw new EOFException();
            }
            int read = this.setUnboundedRipple.read();
            int read2 = this.setUnboundedRipple.read();
            int read3 = this.setUnboundedRipple.read();
            int read4 = this.setUnboundedRipple.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (byteOrder == setIconTintList) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == setX) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            int min = Math.min(i, this.setY - this.MenuHostHelper$$ExternalSyntheticLambda1);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.setUnboundedRipple.skipBytes(min - i2);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 += i2;
            return i2;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 + 2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            if (i > this.setY) {
                throw new EOFException();
            }
            int read = this.setUnboundedRipple.read();
            int read2 = this.setUnboundedRipple.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (byteOrder == setIconTintList) {
                return (read2 << 8) + read;
            }
            if (byteOrder == setX) {
                return (read << 8) + read2;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 + 8;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            if (i > this.setY) {
                throw new EOFException();
            }
            int read = this.setUnboundedRipple.read();
            int read2 = this.setUnboundedRipple.read();
            int read3 = this.setUnboundedRipple.read();
            int read4 = this.setUnboundedRipple.read();
            int read5 = this.setUnboundedRipple.read();
            int read6 = this.setUnboundedRipple.read();
            int read7 = this.setUnboundedRipple.read();
            int read8 = this.setUnboundedRipple.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (byteOrder == setIconTintList) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == setX) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }
    }

    private void setY(int i, int i2) {
        if (this.setZ[i].isEmpty() || this.setZ[i2].isEmpty()) {
            return;
        }
        setIconTintList seticontintlist = this.setZ[i].get("ImageLength");
        setIconTintList seticontintlist2 = this.setZ[i].get("ImageWidth");
        setIconTintList seticontintlist3 = this.setZ[i2].get("ImageLength");
        setIconTintList seticontintlist4 = this.setZ[i2].get("ImageWidth");
        if (seticontintlist == null || seticontintlist2 == null || seticontintlist3 == null || seticontintlist4 == null) {
            return;
        }
        int MenuHostHelper$$ExternalSyntheticLambda12 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        int MenuHostHelper$$ExternalSyntheticLambda13 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        int MenuHostHelper$$ExternalSyntheticLambda14 = seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        int MenuHostHelper$$ExternalSyntheticLambda15 = seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda1(this.setTextAppearanceResource);
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= MenuHostHelper$$ExternalSyntheticLambda14 || MenuHostHelper$$ExternalSyntheticLambda13 >= MenuHostHelper$$ExternalSyntheticLambda15) {
            return;
        }
        HashMap<String, setIconTintList>[] hashMapArr = this.setZ;
        HashMap<String, setIconTintList> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    private static long[] MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}