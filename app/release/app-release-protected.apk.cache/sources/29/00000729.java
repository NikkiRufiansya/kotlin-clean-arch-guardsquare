package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.rmldemo.guardsquare.ui.activity.MainActivity;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.C0320nh;

/* renamed from: o.mf */
/* loaded from: classes.dex */
public final class C0291mf extends setWebViewRenderProcessClient {
    private C0263lc FirebaseRemoteConfigKtxRegistrar;
    private int setError;
    @nE
    public SharedPreferences setTitleMarginEnd;

    @Override // o.setWebViewRenderProcessClient, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        Bundle maxEms = setMaxEms();
        if (maxEms != null) {
            this.setError = maxEms.getInt("NUMBER");
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0036, viewGroup, false);
        int i = R.id.res_0x7f0a0102;
        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = (setScrimVisibleHeightTrigger) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0102);
        if (setscrimvisibleheighttrigger != null) {
            setScrimVisibleHeightTrigger setscrimvisibleheighttrigger2 = (setScrimVisibleHeightTrigger) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0107);
            if (setscrimvisibleheighttrigger2 != null) {
                C0320nh c0320nh = (C0320nh) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01d7);
                if (c0320nh != null) {
                    TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                    if (textView != null) {
                        this.FirebaseRemoteConfigKtxRegistrar = new C0263lc((setMIndicatorOptions) inflate, setscrimvisibleheighttrigger, setscrimvisibleheighttrigger2, c0320nh, textView);
                        C0311mz.setY.setX().setIconTintList(this);
                        lH lHVar = (lH) setAnimationFromJson();
                        if (lHVar != null) {
                            lHVar.setLayoutDirection();
                        }
                        final C0263lc c0263lc = this.FirebaseRemoteConfigKtxRegistrar;
                        pN.setX(c0263lc);
                        c0263lc.MenuHostHelper$$ExternalSyntheticLambda1.setOnClickListener(new View.OnClickListener() { // from class: o.me
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C0291mf.setIconTintList(C0291mf.this, c0263lc);
                            }
                        });
                        c0263lc.setIconTintList.setOnTouchListener(new View.OnTouchListener() { // from class: o.ml
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                return C0291mf.setX(C0291mf.this);
                            }
                        });
                        c0263lc.setIconTintList.setOnCheckedChangeListener(new C0320nh.setY() { // from class: o.mn
                            private static long MenuHostHelper$$ExternalSyntheticLambda1;
                            private static char[] setX;
                            public static final byte[] $$d = {45, -79, -67, -1};
                            public static final int $$e = 217;
                            public static final byte[] $$a = {117, -10, 119, -11};
                            public static final int $$b = 73;
                            private static int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                            private static int setY = 1;

                            static {
                                char[] cArr = new char[2451];
                                ByteBuffer.wrap("ß)}å\u009am8åU5óÂ\u0010C®ÛËZiß\u0086)$¸A:\u009f\u0082<\u0005Z\u008b÷\u0012\u0015\u0083²\u001dÏpmù\u008aJ(ïEWãÏ\u0000J^Õe\u0018ÇÔ \\\u0082Ôï\u0004Ióªr\u0014êqkÓî<\u0018\u009e\u0089û\u000b%³\u0086%à·M7¯¥\b\u0016uV×Ë0V\u0092ÎÿbYû°»\u0012wõÿWw:§\u009cP\u007fÑÁI¤È\u0006Mé»K*.¨ð\u0010S\u00855\u0004\u0098\u008az\u0000TÃö\u0018\u0011\u009b³\nÞßx\"\u009b©%9@¡â?\rÏ¯\u000eÊß\u0014X·âÑa|ú\u009er9áD\u0081æ?\u0001\u009d£\u0017Î¹h0\u008b¦Õ(p¨àqBû¥K\u0007Çj;Ìÿ/\u0005\u0091ÀôzVÎ¹a\u001b\u008f~? ¾\u0003Ee¬È2*\u0086\u008d\u001bð RãµY\u0017ÈzkÜú?\na\u008eÄX&«\u0089$ 3\u0002ãå?Gß*N\u008cùo\u0017ÑÂ´|\u0016Âùq[º>\tàûC]%\u0080TÃö\u000e\u0011\u0096³\u001aÞßx+\u009b¡%s@¤â!\rÅ¯QTÃö\u000e\u0011\u0096³\u001aÞßx<\u009b¯%0@úâ#\rØ¯NÊÈTÃö\u0018\u0011\u0086³\u001aÞ\u0091x=\u009b¢%r@\u0086â\u0015\rç¯NÊÎ\u0014R·ÊÑd|è\u009ezTÉö\u001d\u0011\u009a³KÞ¯x\u0000\u009bü%%@ìâ\u0012\rØ¯\u0013Ê\u0082\u0014A·¶Ñ7|Ý\u009eL9¦D\u009bæR\u0001Ú£BÎ\u009a\u001añ¸O_ÆýR\u0090©6rÕ\u009fk\u0019\u000e\u0092¬\u0015Cîáx\u0084¼Z9ùÆ\u009f&2¿Ð?TÃö\u0018\u0011\u009b³\nÞ\u0084x*\u009b«%r@¸â:\rÈ¯\u000eÊÔ\u0014^·ìÑk|þ\u009e59áD\u0086T\u008eö\u0002\u0011\u0085³\u0017Þ\u009fx7T\u008dö\u0013\u0011Ø³AÞ\u0082xy\u009b§%x@ìâa\r\u008f¯\u001bÊï\u0014h·øÑZ|¦\u009ew9þDÓæT\u0001 £\u0000Îùh6\u008b±Õlp\u008e\u008aw(¬Ï/m¾\u00000¦\u009eE\u001fûÆ\u009e\u0002<\u008eÓpqº\u0014bÊæiW\u000fÄ¢~@âç\u000b\u009a38±ß&}·\u0010T¶\u0093U\u0018\u000b\u0080®\u0011Lîã|\u0081æTÃö\u0018\u0011\u009b³\nÞ\u0084x*\u009b«%r@¶â:\rÄ¯\u000eÊÖ\u0014R·ãÑp|Ê\u009eV9¿D\u0099æ\u0012\u0001\u0090£\u0006åWG\u008c \u000f\u0002\u009eo\u0010É¾*?\u0094æñ,S®¼\\\u001e\u009a{@¥Ê\u0006x`ÿÍm/â\u0088sõ+W¹°\u001b\u0012\u0090\u007f6Ù :yd½Á*TÃö\u000f\u0011\u0087³\u000fÞßx!\u009b£%0@¡â4\rß¯DÊË\u0014CJYèÃ\u000f\u000b\u00adÜÀBfá\u0085m;þ^=üü\u0013\u0002±\u0095Ô\u000bT\u0082ö\u000e\u0011\u0083³\nÞ\u0095xa\u009b¨%8@ D|æ¤\u0001/£©Î,hß\u008b\u001f5\u008bP\u0007ò\u0089\u001df¿çÚt\u0004ü§TÁ×lPÜú~v\u0099÷;tVûðQT°ö*MÍï}\b§ª!ÇªaC\u0082é<\tYãû\u0005\u0014ð¶-Óà\r\u000f®\u008fÈ$e£\u0087O ×]Þ\u0089þ+5Ì\u008bn\u0010\u0003º¥\u001fFÖø\u0003\u009d\u009e?OÐúr3\u0017ìÉNjð\f{¡ÌC\tT\u009eö\u0004\u0011Ì³\tÞ\u0082x \u009b¢%(@·â'\r\u0084¯LÊÙ\u0014Y·ûÑc|ý\u009ex9æD\u009cæ\u0012\u0001\u009a£\u0004\u007fÌÝ': \u00985õäSh°\u008c\u000e\u0011k\u009aÉJ&\u0093\u0084cá¬?=\u009cÂú\"W«µ\u0015\u0012Ðo§Íy*¢ ~\u0082ÛeYÇÕªH\fõïgQá4n\u0096èT\u0099ö\u0005\u0011\u0089³\u0017Þ\u009fx8\u009b¨Æ\u009bd\u0017\u0083\u0084!\u0002L\u0089ê2\t§·$ÚÜxF\u009f\u008e=KPÀöb\u0015à«jÎõle\u0083Æ!\u0007D\u009f\u009a\u00039¥_$ò»T\u009aö\t\u0011\u008d³\u0001ÞÈxy\u009b¶T\u008bö\u000e\u0011\u008c³\u001cÞ\u0082x&\u009b¥÷[UÞ²\\\u0010Ì}RÛö8u\u0086Òã|A»®L}ÜßY8Û\u009aK÷ÕQq²ò\fUiûË<$Ë\u0086)ãÙ=Tâý@g§¯\u0005jháÎC-Á\u0093KöÔTD»ç\u0019/|´¢0\u0001\u0088g\n¾Ø\u001cHûÎT\u0089ö\u0006\u0011\u0097³\u0015Þ\u0091x;\u009b©%/ÝÆ\u007fp\u0098ù:2WÉñQ\u0012Ã¬BÉÖkU\u0084¤&jCµ\u009d3>\u0097XNõ´\u0017\u0018°\u008bÍíof\u0088ñâå@M§Î\u0005Ch×În-ê\u00935öÏT_»©\u0019I|\u0092¢\n\u0001¯g!Ê (s\u008f¼òÎPZ·\u0097\u0015Fx½Þ:T\u00adö\u0005\u0011\u0086³\u000bÞ\u009fx&\u009b¢%}@\u0087â\u0017\rá¯\u0001ÊÚ\u0014B·çÑi|è\u009e;9ôD\u0086æ\u0012\u0001ß£\u000eÎõhr\u008b\u009cÕlpå>T\u009cÎ{\u0006ÙÛ´[\u0012÷ñhOà*\u007f\u0088ëg\u0005T\u008bö\u0004\u0011\u008e³\u001dÞ\u0096x&\u009bµ%55é\u0097zpþÒr¿»\u0019\n²j\u0010þ÷xUî8l\u009eÎ\u001b(¹²^zü¿\u009147\u0096Ô\u0014j\u009e\u000f\u0001\u00ad\u0091B2àõ\u0085|[àøV\u009e×\n\u008c¨\u0016OÞí\u0000\u0080\u0087&/Åº{*\u001eª¼oSÉñV\u0094ÇJPTÝT\u009eö\u0004\u0011Ì³\nÞ\u0095x,\u009b³%/@±ûåT\u009eö\u0004\u0011Ì³\u001bÞ\u0085x&\u009bª%9@úâ#\rØ¯NÊÜ\u0014B·íÑqT\u008aö\u001e\u0011\u008e³\u0015Þ¯x7\u009bþ%kJ@èÚ\u000f\u0012\u00adÅÀ[fø\u0085t;ç^$üë\u0013\u001d±\u0091Ô\u0001\n\u008c©\"Ï«b0\u0080¬'\"ZCT\u008bö\u000e\u0011\u008c³\u001cÞ\u0082x&\u009b¥%r@§â7\rÁ¯\u000eÊß\u0014R·àÑ`|î\u009er9ñòÑPT·Ö\u0015FxØÞ|=ÿ\u0083XæöD1«Æ\tTl\u0091²\t\u0011¿w\u0000Ú¾8y\u009fþâ\u009c@]§À\u0005BhòÎl-ðscÖÔ4\n\u009bÅùRT\u008bö\u000e\u0011\u008c³\u001cÞ\u0082x&\u009b¥%r@³â<\rÅ¯FÊÔ\u0014R·ÑÑv|ø\u009ep9½D\u008eæ\u0005\u0001\u0091£\u0013Î¿h-\u008b T\u008bö\u000e\u0011\u008c³\u001cÞ\u0082x&\u009b¥%r@¢â1\rÅ¯YÊ\u0080\u0014\u0001·þÑ*|ê\u009ey9ýD\u0091æX\u0001É£\u0006T\u008bö\u0004\u0011\u008d³\u001eÞ\u009cx*\u009bé%.@°â8\rõ¯FÊÈ\u0014_·áÑk|ù\u009eD9êDÑæV\u0001Ð£\u0011Î¨h*\u008b¦Õ(p¸\u0092K=ø_Fú\u008d\u0004:T\u009eö\u0004\u0011Ì³\u001bÞ\u009fx \u009b²%1@»â2\rÎ¯DÊÊ\u0094\u00896\u0013ÑÛs\f\u001e\u0088¸7[¥å#\u0080®\"%ÍÚoS\n\u0081ÔBwì\u0011{¼ç^hù«\u0084\u0098&\u001eÁ\u0086c\u0006\u000e¿¨!K¤\u0015?°¯RQýÄ'ÿ\u0085WbÔÀY\u00adÍ\u000btèðV\"3þ\u00919~Îµ¶\u0017,ðäR3?\u00ad\u0099\u000ez\u0082Ä\u0011¡Ò\u0003\u001fìëNz+àõsVÇ0T\u009d\u009a\u007fZØÞT\u0098ö\u000e\u0011\u0091³\rÞÝÙ}{ý\u009cs>õS&õÄ\u0016H¨ÆÍ\u0002oÚ\u00807\"´G5\u0099â:\u0006\\\u008fñ\u000b\u0013\u0093´\u0019UÚ÷I\u0010È²Kß\u0099y`\u009aö$4Aþãu\f\u0084®\bË\u0094\u0015\u0015¶°Ð1T\u009dö\u000e\u0011\u008f³\fÞÞx<\u009b %s@²â2\rÁ¯DÊç\u0014T·ïÑh|ù\u009ei9ó\u0011V³ÅTDöÇ\u009b\u0015=÷Þk`¸\u0005s§ûH\u0005êµ\u008f\u0017Q\u0099ò+\u0094½9>Û¤| T\u009eö\u0004\u0011Ì³\u0012Þ\u0095x=\u009b¨%8@¸â}\rË¯OÊÜ\u0014E·áÑl|ø\u009e59ãD\u008cæ\r\u0001\u008a£\u0012pYÒÃ5\u000b\u0097ÜúX\\ç¿u\u0001´dbÆñ)\u0000\u008b\u0093îQ0\u0091\u0093?õ¦X\u0004º²\u001d4`CÂÂÕ\u0013w\u0089\u0090A2\u009b_\u0019ù¯\u001ae¤²Á,c·\u008cK.ÈK\u001b\u0095Ü6jPæýv\u001fó¸mÅ\u0014g\u009f\u0080\u001b\"\u0095O4È$j¾\u008dv/³B8ä\u009a\u0007\u0018¹\u0092Ü\r~\u009d\u0091>3ùVw\u0088ä+XMÛà\b\u0002Ç¥AØ=z½\u009d ?¾R\u0007ô\u008c\u0017\u0010I\u008eì\u001fT\u009eö\u0004\u0011Ì³\nÞ\u0089x<\u009b²%8@¹â}\rÈ¯TÊÑ\u0014[·êÑ+|ú\u009er9üD\u008eæ\u0005\u0001\u008d£\u0006Î¿h-\u008b\u00adÕ.niÌó+;\u0089ýä~BË¡E\u001fÏzNØû78\u0095®ð;.î\u008d\u001bë\u0087F\u0002¤\u0080\u0003\u0001~0Üñ;a\u0099ïô]RÖ±FïÝJT¨¶\u0007>e½#M\u0081×f\u001fÄÜ©F\u000fòìqRá7u\u0095®z\u001bØ\u0087½\u0002c\u0088À9¦ø\u000b)é¡N/3]\u0091Öv^ÔÕ¹l\u001fþü~¢ýT\u009eö\u0004\u0011Ì³\u000fÞ\u0095x!\u009b¢%2@¦â\f\rÎ¯MÊÓ\u0014Z· Ñg|é\u009er9þD\u008dæN\u0001\u0099£\u001fÎ£h#\u008b¦Õ(p¡\u0092Z=Î_PúÁ&0\u0084¡c_Á\u0084¬$\n\u0093é5W\u00812i\u0090à\u007fSÝò¸AfÊÅs£¸ÄyT\u008dö\u0005\u0011\u0086³\u000bÞ\u009fx&\u009b¢%s@¤â6\rØ¯LÊÑ\u0014D·ýÑl|ó\u009eu9¼D»æ%\u0001¾£2Î\u0092h\u0014\u008b\u008bÕ\u0015p\u009f\u0092m=ø_múá\u0004M§ßÁGT\u008dö\u0005\u0011\u0086³\u000bÞ\u009fx&\u009b¢%s@µâ#\rÚ¯\u000fÊù\u0014T·úÑl|ê\u009er9æD\u0090æ4\u0001\u0097£\u0004Î¨h%\u008b§T\u008fö\u001e\u0011\u0090³\u000bÞ\u0095x!\u009b²%\u001c@¤â#\rÆ¯HÊÛ\u0014V·úÑl|ó\u009eu£^\u0001ÖæUDØ)L\u008fõlqÒ ·d\u0015ïú\u0017X\u0086=\u000eã\u008a@)&ø\u008b\fi§Î/³N\u0011ÖöTTÑ=U\u009fÙx]ÚÀ·A\u0011Öò}Lë)b\u008bàd\u001eÆ\u009c£-}\u009fÞ\u0007¸º\u0015*÷§P\u0018-V\u008fÈhHÊÅ§d\u0001íâp¼ï\u0019eT\u008dö\u0005\u0011\u0086³\u000bÞ\u009fx&\u009b¢%s@¤â6\rØ¯LÊÑ\u0014D·ýÑl|ó\u009eu9¼D»æ%\u0001¾£2Î\u0092h\u0014\u008b\u008bÕ\u0015p\u009f\u0092m=ø_púà\u0004A§ÉÁGlË\u008eCT\u008bö\u000e\u0011\u0096³5Þ\u0099x!\u009b£%l@\u009aâ&\rÇ¯CÊÝ\u0014ETÝö^\u0011×³LÞÅx}\u009b÷%h@áâf\r\u009eTÝö^\u0011×³LÞÅx}\u009b÷%h@áâf\r\u009cTÝö^\u0011×³LÞÅx}\u009b÷%h@áâf\r\u0092¶e\u0014æóoQô<}\u009aÅyOÇÐ¢Y\u0000Ýï\"ø$Z§½.\u001fµr<Ô\u00847\u000e\u0089\u0091ì\u0018N\u009c¡a%Æ\u0087E`ÌÂW¯Þ\tfêìTs1ú\u0093~|\u0085B=à¾\u00077¥¬È%n\u009d\u008d\u00173\u0088V\u0001ô\u0085\u001b|,Õ\u008eVißËD¦Í\u0000uãÿ]`8é\u009amu\u009aZÝø^\u001f×½LÐÅv}\u0095÷+hNáìd\u0003\u009aN\u0014ì\u0097\u000b\u001e©\u0085Ä\fb´\u0081>?¡Z(ø\u00ad\u0017QTÝö^\u0011×³LÞÅx}\u009b÷%h@áâd\r\u009eÔ|vÿ\u0091v3í^døÜ\u001bV¥ÉÀ@bÅ\u008d=1@\u0093ÃtJÖÑ»X\u001dàþj@õ%|\u0087ùh\u000fä\u001cF\u009f¡\u0016\u0003\u008dn\u0004È¼+6\u0095©ð Rª½[\u001dÙ¿ZXÓúH\u0097Á1yÒóll\tå«oD\u009cTÝö^\u0011×³LÞÅx}\u009b÷%h@áâk\r\u009e)ã\u008bflþÎ_£ý\u0005SæÙXZ=Î\u009fPp\u008dÒ9·µi-Ê\u0087¬\u0019\u0001\u009bã\u0001D´9à\u009be|òT\u00adö\u0005\u0011\u0086³\u000bÞ\u009fx&\u009b¢T\u008bö\u000e\u0011\u0096³*Þ\u0099x\"\u009b\u0095%8@¦â:\rË¯MÊö\u0014B·ãÑg|ù\u009eiTÔöR\u0011Ò³HÞÄx~\u009bö%n@æâb\r\u009b¯\u0010Ê\u0089\u0014\u000f·»Ñ4|¬\u009e,9 DÙz\u008dØ\b?\u0090\u009d,ð\u0083V+µ³\u000b8n Ì<#Î\u0081BäÌ:x\u0099ìTßöZ\u0011Ò³KÞÆx\u007f\u009bö%m@äâc\r\u009a¯\u0011Ê\u0088\u0014\u0007·¾T\u008bö\u000e\u0011\u0096³=Þ\u0095x9\u009b¯%>@±â\u001a\rÎTÜö[\u0011Ò³IÞÀx\u007f\u009bö%m@äâc\r\u009a¯\u0011Ê\u0088\u0014\u0007·¾ÉDk\u0094\u008c\u001e.\u008cC\u000eå±\u00069¸£Ý,\u007fü\u0090Q2\u0089W\u0010\u0089\u009c*rLøTÜöZ\u0011Ð³JÞÄxz\u009bð%j@ìâj\r\u009b¯\u0013Ê\u008b\u0014\u0003·»T\u009cö\u0003\u0011\u008d³\u0017Þ\u0095T\u008bö\u000e\u0011\u0096³*Þ\u0089x<\u009b²%8@¹â\u0000\rÏ¯SÊÎ\u0014^·íÑ`TÃö\u000f\u0011\u0087³\u000fÞßx>\u009b£%0@¡â\f\rÚ¯HÊÈ\u0014Rã\bAÄ¦L\u0004Äi\u0014Ï÷,b\u0092õ÷tUýº\u0015\u0018Å}\u0011£\u009d\u00006f«Ë5)±\u008e7óFQô¶S\u0014Øyhßö<lTÃö\u000f\u0011\u0087³\u000fÞßx<\u009b©%>@¿â6\rÞ¯\u000eÊß\u0014R·àÑ||øWåõ)\u0012¡°)Ýù{\u001a\u0098\u008f&\u0018C\u0099á\u0010\u000eø¬(Éï\u0017t´ÅÒV\u007fÞ\u0013Î±\u0015V\u0096ô\u0007\u0099Ò?3Ü®b=\u0007¬¥\u0001JÓè^\u008dÔSYðæø·Zl½ï\u001f~rðÔ^7ß\u0089\u0006ìÌNN¡¼\u0003zf ¸*\u001b\u0098}\u0012Ð·2\u0002\u0095\u0087èñJx\u00adä\u000fabæÄT'ÒyLÜÐ>;\u0091\u008có;V¤¨\u0015\u000b\u008amXÀ\u009e\"\u000bTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@\u008bâ4\rÚ¯RTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@\u008bâ'\rÃ¯LÊÝTÃö\u000f\u0011\u0087³\u000fÞßx<\u009b©%>@¿â6\rÞ¯\u000eÊÚ\u0014D·úÑc|ó\u009ew9öD\u008cæ\u0012\u0001\u009bI7ëì\fo®þÃpeÞ\u0086_8\u0086]LÿÎ\u0010<²ú× \tªª\u0018Ì\u0093a\u001b\u0083\u009b$\u0000Yrûø\u001co¾çÓKuï\u0096]ÈÀmL\u008fò  B¥TÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@µâ0\rÉ¯DTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@³â*\rØ¯NTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@¹â6\rÍ¯O¢\r\u0000ÁçIEÁ(\u0011\u008eãm{Óç¶u\u0014ïû\rY\u008aTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@¢â>\rÙ¯FTÃö\u000f\u0011\u0087³\u000fÞßx-\u009bµ%)@¤â4\rË¯HÊÈ\u0014Tî8Lô«|\tôd$ÂÖ!N\u009fÒúpXÁ·<\u0015¿zrØ¾?2\u009d¼ð VÑµ\u0013\u000b\u0083n\u0012Ì\u008c#w\u0081ÿäh:â\u0099Lÿ\u009bR\u0003°Ò\u0017AjwÈ³/=\u008d³à\u0017dGÆ\u0082!\b\u0083\u0089î[H¼«+\u0015·p4Ò¸=Y\u009fÖú\u0013$ñ\u0087yáõLK®÷\twt\u001fÖ\u00811\u001f\u0093´þ&X¬»#å»@')\u001d\u008bïl3Î¥£2\u0005\u0087æNX¢=P\u009f»plÒý·diÿÊ_¬\u0087\u0001cã\u0093D\u00169a\u009b¼|\u0017Þ°³\u000bÜ\u0006~Þ\u0099U;ÓVVð¥\u0013j\u00ad÷Èajù\u0085\u001d'\u0090B\u000e\u008fÚ-\u000bÊ\u0082h_\u0005Ì\u009f\u0089=QÚÚx\\\u0015Ù³*Pÿîr\u008bò)\u007fÆÏd\u0006\u0001\u0093ß\r|·T\u008bö\u0019\u0011\u0083³\u0015Þ\u009cx \u009b¥%s@³â<\rÆ¯EÊÞ\u0014^·ýÑm|²\u009eh9ýT\u0080ö\u0002\u0011\u0080³>Þ¼x\n\u009b\u0095%\u0002@¶â \rÞ¯\u000fÊË\u0014X6±\u0094|säÑh¼\u00ad\u001aPùÑGK\"Ï\u0080@o\u0087Í0¨¥v!Õ\u0099³\u0014\u001e\u009düG[\u0098&ö\u0084~T\u008eö\u0007\u0011\u0097³\u001cÞ\u0083x;\u009b§%>@¿â \u0000¹¢tEìç`\u008a¥,XÏÓqR\u0014À¶]Y£\u0011:³©T-ö¡\u009b#=\u0089TÃö\u000f\u0011\u0083³\rÞ\u0091x`\u009b¢%2@£â=\rÆ¯NÊÙ\u0014S·ýÑ*|²\u009e\u007f9âDÆæ\u0001\u0001\u008f£\u0006Î¾hj\u008b»Õ7p½u\u0013×Ë0@\u0092ÆÿCY°ºu\u0004ýaqÃê,\u0014\u008e\u0097ë\u0007T«ö\u0004\u0011\u008e³\u001dÞ\u0096x&\u009bµ%5^\u0011üÉ\u001bB¹ÄÔAr²\u0091y/àJbèô\u0007\u0014¥\u0096À\u0019T\u009aö\t\u0011\u008d³\u0001Þ\u0097x:\u009b£%.@ Ü/~ã\u0099o;áV}ð\u008c\u0013G\u00adØÈKjÜ\u0085i'½B&\u009c´?\u0004Y\u0080ô\u001c\u0016\u0092±\rÌ*nï\u0089f+èF\u000eà\u0098\u0003\u0000]ÕøR\u001a©µe×¿r0\u008c\u0083/\u0015I\u0081ä\u0003\u0006\u0095¡ñü~\u001e¿¹uÛúvK\u0090Ø3]MÖè'".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2451);
                                setX = cArr;
                                MenuHostHelper$$ExternalSyntheticLambda1 = 8830038230245635691L;
                            }

                            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                                jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1123
                                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
                                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                                */
                            public static java.lang.Object[] MenuHostHelper$$ExternalSyntheticLambda1(android.content.Context r40, int r41, int r42) {
                                /*
                                    Method dump skipped, instructions count: 16685
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.C0299mn.MenuHostHelper$$ExternalSyntheticLambda1(android.content.Context, int, int):java.lang.Object[]");
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please submit an issue!!! */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
                                /*
                                    byte[] r0 = o.C0299mn.$$a
                                    int r8 = r8 + 4
                                    int r7 = 101 - r7
                                    int r6 = r6 * 3
                                    int r6 = r6 + 1
                                    byte[] r1 = new byte[r6]
                                    int r6 = r6 + (-1)
                                    r2 = 0
                                    if (r0 != 0) goto L17
                                    r3 = r1
                                    r4 = 0
                                    r1 = r0
                                    r0 = r9
                                    r9 = r8
                                    goto L32
                                L17:
                                    r3 = 0
                                L18:
                                    byte r4 = (byte) r7
                                    r1[r3] = r4
                                    int r8 = r8 + 1
                                    if (r3 != r6) goto L27
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r1, r2)
                                    r9[r2] = r6
                                    return
                                L27:
                                    r4 = r0[r8]
                                    int r3 = r3 + 1
                                    r5 = r9
                                    r9 = r8
                                    r8 = r4
                                    r4 = r3
                                    r3 = r1
                                    r1 = r0
                                    r0 = r5
                                L32:
                                    int r8 = -r8
                                    int r7 = r7 + r8
                                    r8 = r9
                                    r9 = r0
                                    r0 = r1
                                    r1 = r3
                                    r3 = r4
                                    goto L18
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.C0299mn.b(int, byte, short, java.lang.Object[]):void");
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please submit an issue!!! */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
                                /*
                                    int r9 = 120 - r9
                                    byte[] r0 = o.C0299mn.$$d
                                    int r7 = r7 * 3
                                    int r7 = 1 - r7
                                    int r8 = r8 * 3
                                    int r8 = 4 - r8
                                    byte[] r1 = new byte[r7]
                                    r2 = 0
                                    if (r0 != 0) goto L16
                                    r3 = r9
                                    r4 = 0
                                    r9 = r8
                                    r8 = r7
                                    goto L2c
                                L16:
                                    r3 = 0
                                L17:
                                    int r4 = r3 + 1
                                    byte r5 = (byte) r9
                                    r1[r3] = r5
                                    if (r4 != r7) goto L26
                                    java.lang.String r7 = new java.lang.String
                                    r7.<init>(r1, r2)
                                    r10[r2] = r7
                                    return
                                L26:
                                    r3 = r0[r8]
                                    r6 = r8
                                    r8 = r7
                                    r7 = r9
                                    r9 = r6
                                L2c:
                                    int r3 = -r3
                                    int r9 = r9 + 1
                                    int r7 = r7 + r3
                                    r3 = r4
                                    r6 = r9
                                    r9 = r7
                                    r7 = r8
                                    r8 = r6
                                    goto L17
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.C0299mn.c(short, byte, byte, java.lang.Object[]):void");
                            }

                            @Override // o.C0320nh.setY
                            public final void MenuHostHelper$$ExternalSyntheticLambda0(C0320nh c0320nh2, boolean z) {
                                C0291mf.MenuHostHelper$$ExternalSyntheticLambda1(C0291mf.this, z);
                            }

                            private static void a(int i2, char c, int i3, Object[] objArr) {
                                jp jpVar = new jp();
                                long[] jArr = new long[i3];
                                jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                                while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i3) {
                                    int i4 = jpVar.MenuHostHelper$$ExternalSyntheticLambda1;
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(setX[i2 + jpVar.MenuHostHelper$$ExternalSyntheticLambda1])};
                                        Object obj = jC.setTextScaleX.get(-534561078);
                                        if (obj == null) {
                                            byte b = (byte) ($$d[3] + 1);
                                            Object[] objArr3 = new Object[1];
                                            c(b, b, (byte) (-$$d[3]), objArr3);
                                            obj = ((Class) jC.setY((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 312, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4)).getMethod((String) objArr3[0], Integer.TYPE);
                                            jC.setTextScaleX.put(-534561078, obj);
                                        }
                                        try {
                                            Object[] objArr4 = {Long.valueOf(((Long) ((Method) obj).invoke(null, objArr2)).longValue()), Long.valueOf(jpVar.MenuHostHelper$$ExternalSyntheticLambda1), Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(c)};
                                            Object obj2 = jC.setTextScaleX.get(-1233430495);
                                            if (obj2 == null) {
                                                byte b2 = (byte) ($$d[3] + 1);
                                                byte b3 = b2;
                                                Object[] objArr5 = new Object[1];
                                                c(b2, b3, b3, objArr5);
                                                obj2 = ((Class) jC.setY((ViewConfiguration.getTapTimeout() >> 16) + 186, (char) (TextUtils.lastIndexOf("", '0') + 1), 4 - View.MeasureSpec.getSize(0))).getMethod((String) objArr5[0], Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE);
                                                jC.setTextScaleX.put(-1233430495, obj2);
                                            }
                                            jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                                            try {
                                                Object[] objArr6 = {jpVar, jpVar};
                                                Object obj3 = jC.setTextScaleX.get(-2123108845);
                                                if (obj3 == null) {
                                                    byte b4 = (byte) ($$d[3] + 1);
                                                    byte b5 = b4;
                                                    Object[] objArr7 = new Object[1];
                                                    c(b4, b5, (byte) (b5 + 2), objArr7);
                                                    obj3 = ((Class) jC.setY(268 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 4 - TextUtils.getTrimmedLength(""))).getMethod((String) objArr7[0], Object.class, Object.class);
                                                    jC.setTextScaleX.put(-2123108845, obj3);
                                                }
                                                ((Method) obj3).invoke(null, objArr6);
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 == null) {
                                            throw th3;
                                        }
                                        throw cause3;
                                    }
                                }
                                char[] cArr = new char[i3];
                                jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                                while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i3) {
                                    cArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) jArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1];
                                    try {
                                        Object[] objArr8 = {jpVar, jpVar};
                                        Object obj4 = jC.setTextScaleX.get(-2123108845);
                                        if (obj4 == null) {
                                            byte b6 = (byte) ($$d[3] + 1);
                                            byte b7 = b6;
                                            Object[] objArr9 = new Object[1];
                                            c(b6, b7, (byte) (b7 + 2), objArr9);
                                            obj4 = ((Class) jC.setY(MotionEvent.axisFromString("") + 270, (char) Color.green(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5)).getMethod((String) objArr9[0], Object.class, Object.class);
                                            jC.setTextScaleX.put(-2123108845, obj4);
                                        }
                                        ((Method) obj4).invoke(null, objArr8);
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 == null) {
                                            throw th4;
                                        }
                                        throw cause4;
                                    }
                                }
                                objArr[0] = new String(cArr);
                            }
                        });
                        c0263lc.setY.setOnClickListener(new View.OnClickListener() { // from class: o.mm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C0291mf.MenuHostHelper$$ExternalSyntheticLambda0(C0291mf.this);
                            }
                        });
                        SharedPreferences sharedPreferences = this.setTitleMarginEnd;
                        if (sharedPreferences == null) {
                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                            sharedPreferences = null;
                        }
                        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sharedPreferences.getString("mode", ""), (Object) "night")) {
                            C0263lc c0263lc2 = this.FirebaseRemoteConfigKtxRegistrar;
                            pN.setX(c0263lc2);
                            c0263lc2.setIconTintList.setChecked(true);
                        }
                        C0263lc c0263lc3 = this.FirebaseRemoteConfigKtxRegistrar;
                        pN.setX(c0263lc3);
                        setMIndicatorOptions setmindicatoroptions = c0263lc3.setX;
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                        return setmindicatoroptions;
                    }
                    i = R.id.res_0x7f0a01fc;
                } else {
                    i = R.id.res_0x7f0a01d7;
                }
            } else {
                i = R.id.res_0x7f0a0107;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // o.setWebViewRenderProcessClient
    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        lA lAVar = (lA) setprogressbackgroundtintblendmode;
        Context checkedIconEnabled = setCheckedIconEnabled();
        if (checkedIconEnabled != null) {
            C0263lc c0263lc = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0263lc);
            c0263lc.setX.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            C0263lc c0263lc2 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0263lc2);
            c0263lc2.MenuHostHelper$$ExternalSyntheticLambda1.setCardBackgroundColor(lAVar.setY(checkedIconEnabled));
            C0263lc c0263lc3 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0263lc3);
            c0263lc3.setY.setCardBackgroundColor(lAVar.setY(checkedIconEnabled));
            C0263lc c0263lc4 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0263lc4);
            c0263lc4.MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0291mf c0291mf) {
        pN.setY(c0291mf, "");
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(c0291mf.FragmentStateAdapter$5());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d5, new C0294mi(), null, 2);
        if (!setbackgroundtintlist.setX) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setbackgroundtintlist.setTextAlignment = "language";
        setbackgroundtintlist.setX();
    }

    public static /* synthetic */ boolean setX(C0291mf c0291mf) {
        pN.setY(c0291mf, "");
        setEndIconContentDescription animationFromJson = c0291mf.setAnimationFromJson();
        pN.setX(animationFromJson);
        kU kUVar = ((MainActivity) animationFromJson).setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.setY.setVisibility(0);
        return false;
    }

    public static /* synthetic */ void setIconTintList(C0291mf c0291mf, C0263lc c0263lc) {
        pN.setY(c0291mf, "");
        pN.setY(c0263lc, "");
        setEndIconContentDescription animationFromJson = c0291mf.setAnimationFromJson();
        pN.setX(animationFromJson);
        kU kUVar = ((MainActivity) animationFromJson).setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.setY.setVisibility(0);
        c0263lc.setIconTintList.setChecked(!c0263lc.setIconTintList.isChecked());
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(C0291mf c0291mf, boolean z) {
        setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor;
        setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor2;
        pN.setY(c0291mf, "");
        SharedPreferences sharedPreferences = null;
        if (z) {
            SharedPreferences sharedPreferences2 = c0291mf.setTitleMarginEnd;
            if (sharedPreferences2 != null) {
                sharedPreferences = sharedPreferences2;
            } else {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            }
            sharedPreferences.edit().putString("mode", "night").apply();
            C0263lc c0263lc = c0291mf.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0263lc);
            C0320nh c0320nh = c0263lc.setIconTintList;
            setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setsimpleitemselectedripplecolor_menuhosthelper__externalsyntheticlambda1 = setSimpleItemSelectedRippleColor.setIconTintList;
            setsimpleitemselectedripplecolor2 = setSimpleItemSelectedRippleColor.setY;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0320nh, "");
            setSimpleItemSelectedRippleColor.setIconTintList(setsimpleitemselectedripplecolor2, new lF(), c0320nh);
            return;
        }
        SharedPreferences sharedPreferences3 = c0291mf.setTitleMarginEnd;
        if (sharedPreferences3 != null) {
            sharedPreferences = sharedPreferences3;
        } else {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        sharedPreferences.edit().putString("mode", "day").apply();
        C0263lc c0263lc2 = c0291mf.FirebaseRemoteConfigKtxRegistrar;
        pN.setX(c0263lc2);
        C0320nh c0320nh2 = c0263lc2.setIconTintList;
        setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setsimpleitemselectedripplecolor_menuhosthelper__externalsyntheticlambda12 = setSimpleItemSelectedRippleColor.setIconTintList;
        setsimpleitemselectedripplecolor = setSimpleItemSelectedRippleColor.setY;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0320nh2, "");
        setSimpleItemSelectedRippleColor.setY(setsimpleitemselectedripplecolor, new lD(), c0320nh2);
    }
}