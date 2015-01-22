package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Daily'", "'Weekly'", "'Monthly'", "'labour'", "'semis'", "'irrigatgion'", "'fertilisation'", "'recolte'", "'ALIMENTATION'", "'traite'", "'surveillanceagnelage'", "'surveillangevelage'", "'January'", "'February'", "'March'", "'April'", "'May'", "'June'", "'July'", "'August'", "'September'", "'October'", "'November'", "'December'", "'Ovin'", "'Bovin'", "'Corn'", "'Wheat'", "'Sorghum'", "'Activity'", "'{'", "'fin'", "'debut'", "'}'", "'periodicite'", "'activites'", "'atelier'", "'('", "')'", "','", "'res_alloc'", "'rule'", "'Res_Alloc'", "'duration'", "'res_type'", "'Rule'", "'predicat'", "'Date'", "'day'", "'month'", "'Atelier'", "'activity'", "'-'", "'ResourceType'", "'resource'", "'Elevage'", "'animals'", "'Culture'", "'cereals'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleActivity"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleActivity EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity61);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleActivity : ( ( rule__Activity__Group__0 )* ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Activity__Group__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Activity__Group__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Activity__Group__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Activity__Group__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Activity__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Activity__Group__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity94);
            	    rule__Activity__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleRes_Alloc"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: entryRuleRes_Alloc : ruleRes_Alloc EOF ;
    public final void entryRuleRes_Alloc() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ( ruleRes_Alloc EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: ruleRes_Alloc EOF
            {
             before(grammarAccess.getRes_AllocRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc124);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getRes_AllocRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRes_Alloc131); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRes_Alloc"


    // $ANTLR start "ruleRes_Alloc"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:1: ruleRes_Alloc : ( ( rule__Res_Alloc__Group__0 ) ) ;
    public final void ruleRes_Alloc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:2: ( ( ( rule__Res_Alloc__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__Res_Alloc__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__Res_Alloc__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__Res_Alloc__Group__0 )
            {
             before(grammarAccess.getRes_AllocAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__Res_Alloc__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:2: rule__Res_Alloc__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__0_in_ruleRes_Alloc157);
            rule__Res_Alloc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRes_Alloc"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( ruleRule EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule184);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule191); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__Rule__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule217);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleDate EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate244);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate251); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__Date__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate277);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleAtelier_Impl : ruleAtelier_Impl EOF ;
    public final void entryRuleAtelier_Impl() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleAtelier_Impl EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleAtelier_Impl EOF
            {
             before(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl304);
            ruleAtelier_Impl();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtelier_Impl"


    // $ANTLR start "ruleAtelier_Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleAtelier_Impl : ( ( rule__Atelier_Impl__Group__0 ) ) ;
    public final void ruleAtelier_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__Atelier_Impl__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Atelier_Impl__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Atelier_Impl__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__Atelier_Impl__Group__0 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__Atelier_Impl__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__Atelier_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl337);
            rule__Atelier_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtelier_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtelier_Impl"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ruleEIntegerObject EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject364);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__EIntegerObject__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__EIntegerObject__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:2: rule__EIntegerObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject397);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleResourceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: entryRuleResourceType : ruleResourceType EOF ;
    public final void entryRuleResourceType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ruleResourceType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ruleResourceType EOF
            {
             before(grammarAccess.getResourceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_entryRuleResourceType424);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getResourceTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceType431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruleResourceType : ( ( rule__ResourceType__Group__0 ) ) ;
    public final void ruleResourceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:2: ( ( ( rule__ResourceType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__ResourceType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__ResourceType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__ResourceType__Group__0 )
            {
             before(grammarAccess.getResourceTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__ResourceType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:2: rule__ResourceType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__0_in_ruleResourceType457);
            rule__ResourceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString484);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString517);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: entryRuleElevage : ruleElevage EOF ;
    public final void entryRuleElevage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( ruleElevage EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ruleElevage EOF
            {
             before(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage548);
            ruleElevage();

            state._fsp--;

             after(grammarAccess.getElevageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage555); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ruleElevage : ( ( rule__Elevage__Group__0 ) ) ;
    public final void ruleElevage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:2: ( ( ( rule__Elevage__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( rule__Elevage__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( rule__Elevage__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( rule__Elevage__Group__0 )
            {
             before(grammarAccess.getElevageAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( rule__Elevage__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:2: rule__Elevage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0_in_ruleElevage581);
            rule__Elevage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: ( ruleCulture EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:320:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture608);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture615); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( rule__Culture__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( rule__Culture__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:334:2: rule__Culture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0_in_ruleCulture641);
            rule__Culture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicite"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:347:1: rulePeriodicite : ( ( rule__Periodicite__Alternatives ) ) ;
    public final void rulePeriodicite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: ( ( ( rule__Periodicite__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( ( rule__Periodicite__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( ( rule__Periodicite__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( rule__Periodicite__Alternatives )
            {
             before(grammarAccess.getPeriodiciteAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( rule__Periodicite__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:2: rule__Periodicite__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicite__Alternatives_in_rulePeriodicite678);
            rule__Periodicite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPeriodiciteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeriodicite"


    // $ANTLR start "ruleActivites"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: ruleActivites : ( ( rule__Activites__Alternatives ) ) ;
    public final void ruleActivites() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( ( ( rule__Activites__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ( rule__Activites__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ( rule__Activites__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( rule__Activites__Alternatives )
            {
             before(grammarAccess.getActivitesAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( rule__Activites__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:2: rule__Activites__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activites__Alternatives_in_ruleActivites714);
            rule__Activites__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivitesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivites"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( ( rule__Month__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( rule__Month__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:2: rule__Month__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Month__Alternatives_in_ruleMonth750);
            rule__Month__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleAnimals"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ruleAnimals : ( ( rule__Animals__Alternatives ) ) ;
    public final void ruleAnimals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ( ( ( rule__Animals__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( ( rule__Animals__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( ( rule__Animals__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( rule__Animals__Alternatives )
            {
             before(grammarAccess.getAnimalsAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Animals__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:2: rule__Animals__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animals__Alternatives_in_ruleAnimals786);
            rule__Animals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimalsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimals"


    // $ANTLR start "ruleCereal"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:423:1: ruleCereal : ( ( rule__Cereal__Alternatives ) ) ;
    public final void ruleCereal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ( ( ( rule__Cereal__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ( rule__Cereal__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ( rule__Cereal__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( rule__Cereal__Alternatives )
            {
             before(grammarAccess.getCerealAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( rule__Cereal__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:430:2: rule__Cereal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cereal__Alternatives_in_ruleCereal822);
            rule__Cereal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCerealAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCereal"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives858); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives875); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Periodicite__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: rule__Periodicite__Alternatives : ( ( ( 'Daily' ) ) | ( ( 'Weekly' ) ) | ( ( 'Monthly' ) ) );
    public final void rule__Periodicite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( ( 'Daily' ) ) | ( ( 'Weekly' ) ) | ( ( 'Monthly' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( 'Daily' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( 'Daily' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( 'Daily' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( 'Daily' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:3: 'Daily'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Periodicite__Alternatives908); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:6: ( ( 'Weekly' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:6: ( ( 'Weekly' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( 'Weekly' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( 'Weekly' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:3: 'Weekly'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Periodicite__Alternatives929); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:6: ( ( 'Monthly' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:6: ( ( 'Monthly' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( 'Monthly' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getMonthlyEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( 'Monthly' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:3: 'Monthly'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Periodicite__Alternatives950); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getMonthlyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Periodicite__Alternatives"


    // $ANTLR start "rule__Activites__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: rule__Activites__Alternatives : ( ( ( 'labour' ) ) | ( ( 'semis' ) ) | ( ( 'irrigatgion' ) ) | ( ( 'fertilisation' ) ) | ( ( 'recolte' ) ) | ( ( 'ALIMENTATION' ) ) | ( ( 'traite' ) ) | ( ( 'surveillanceagnelage' ) ) | ( ( 'surveillangevelage' ) ) );
    public final void rule__Activites__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: ( ( ( 'labour' ) ) | ( ( 'semis' ) ) | ( ( 'irrigatgion' ) ) | ( ( 'fertilisation' ) ) | ( ( 'recolte' ) ) | ( ( 'ALIMENTATION' ) ) | ( ( 'traite' ) ) | ( ( 'surveillanceagnelage' ) ) | ( ( 'surveillangevelage' ) ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
                {
                alt4=7;
                }
                break;
            case 21:
                {
                alt4=8;
                }
                break;
            case 22:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: ( ( 'labour' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: ( ( 'labour' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( 'labour' )
                    {
                     before(grammarAccess.getActivitesAccess().getLabourEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: ( 'labour' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:3: 'labour'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Activites__Alternatives986); 

                    }

                     after(grammarAccess.getActivitesAccess().getLabourEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:507:6: ( ( 'semis' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:507:6: ( ( 'semis' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ( 'semis' )
                    {
                     before(grammarAccess.getActivitesAccess().getSemisEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( 'semis' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:3: 'semis'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Activites__Alternatives1007); 

                    }

                     after(grammarAccess.getActivitesAccess().getSemisEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:6: ( ( 'irrigatgion' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:6: ( ( 'irrigatgion' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( 'irrigatgion' )
                    {
                     before(grammarAccess.getActivitesAccess().getIrrigatgionEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'irrigatgion' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:3: 'irrigatgion'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Activites__Alternatives1028); 

                    }

                     after(grammarAccess.getActivitesAccess().getIrrigatgionEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:6: ( ( 'fertilisation' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:6: ( ( 'fertilisation' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( 'fertilisation' )
                    {
                     before(grammarAccess.getActivitesAccess().getFertilisationEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( 'fertilisation' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:3: 'fertilisation'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Activites__Alternatives1049); 

                    }

                     after(grammarAccess.getActivitesAccess().getFertilisationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:6: ( ( 'recolte' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:6: ( ( 'recolte' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( 'recolte' )
                    {
                     before(grammarAccess.getActivitesAccess().getRecolteEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: ( 'recolte' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:3: 'recolte'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Activites__Alternatives1070); 

                    }

                     after(grammarAccess.getActivitesAccess().getRecolteEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ( 'ALIMENTATION' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ( 'ALIMENTATION' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( 'ALIMENTATION' )
                    {
                     before(grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( 'ALIMENTATION' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:3: 'ALIMENTATION'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Activites__Alternatives1091); 

                    }

                     after(grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:6: ( ( 'traite' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:6: ( ( 'traite' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: ( 'traite' )
                    {
                     before(grammarAccess.getActivitesAccess().getTraiteEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: ( 'traite' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:544:3: 'traite'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Activites__Alternatives1112); 

                    }

                     after(grammarAccess.getActivitesAccess().getTraiteEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:6: ( ( 'surveillanceagnelage' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:6: ( ( 'surveillanceagnelage' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( 'surveillanceagnelage' )
                    {
                     before(grammarAccess.getActivitesAccess().getSurveillanceagnelageEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( 'surveillanceagnelage' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:3: 'surveillanceagnelage'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Activites__Alternatives1133); 

                    }

                     after(grammarAccess.getActivitesAccess().getSurveillanceagnelageEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:6: ( ( 'surveillangevelage' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:6: ( ( 'surveillangevelage' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( 'surveillangevelage' )
                    {
                     before(grammarAccess.getActivitesAccess().getSurveillangevelageEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( 'surveillangevelage' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:3: 'surveillangevelage'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Activites__Alternatives1154); 

                    }

                     after(grammarAccess.getActivitesAccess().getSurveillangevelageEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activites__Alternatives"


    // $ANTLR start "rule__Month__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: rule__Month__Alternatives : ( ( ( 'January' ) ) | ( ( 'February' ) ) | ( ( 'March' ) ) | ( ( 'April' ) ) | ( ( 'May' ) ) | ( ( 'June' ) ) | ( ( 'July' ) ) | ( ( 'August' ) ) | ( ( 'September' ) ) | ( ( 'October' ) ) | ( ( 'November' ) ) | ( ( 'December' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( ( ( 'January' ) ) | ( ( 'February' ) ) | ( ( 'March' ) ) | ( ( 'April' ) ) | ( ( 'May' ) ) | ( ( 'June' ) ) | ( ( 'July' ) ) | ( ( 'August' ) ) | ( ( 'September' ) ) | ( ( 'October' ) ) | ( ( 'November' ) ) | ( ( 'December' ) ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            case 29:
                {
                alt5=7;
                }
                break;
            case 30:
                {
                alt5=8;
                }
                break;
            case 31:
                {
                alt5=9;
                }
                break;
            case 32:
                {
                alt5=10;
                }
                break;
            case 33:
                {
                alt5=11;
                }
                break;
            case 34:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( ( 'January' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( ( 'January' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ( 'January' )
                    {
                     before(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( 'January' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:3: 'January'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Month__Alternatives1190); 

                    }

                     after(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( ( 'February' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( ( 'February' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( 'February' )
                    {
                     before(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( 'February' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:3: 'February'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Month__Alternatives1211); 

                    }

                     after(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:6: ( ( 'March' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:6: ( ( 'March' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( 'March' )
                    {
                     before(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( 'March' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:3: 'March'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Month__Alternatives1232); 

                    }

                     after(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:6: ( ( 'April' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:6: ( ( 'April' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( 'April' )
                    {
                     before(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( 'April' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:3: 'April'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Month__Alternatives1253); 

                    }

                     after(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:6: ( ( 'May' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:6: ( ( 'May' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ( 'May' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ( 'May' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:3: 'May'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Month__Alternatives1274); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:6: ( ( 'June' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:6: ( ( 'June' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( 'June' )
                    {
                     before(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( 'June' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:3: 'June'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Month__Alternatives1295); 

                    }

                     after(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:615:6: ( ( 'July' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:615:6: ( ( 'July' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( 'July' )
                    {
                     before(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( 'July' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:3: 'July'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Month__Alternatives1316); 

                    }

                     after(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:6: ( ( 'August' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:6: ( ( 'August' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( 'August' )
                    {
                     before(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( 'August' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:3: 'August'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Month__Alternatives1337); 

                    }

                     after(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( 'September' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( 'September' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( 'September' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( 'September' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:3: 'September'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Month__Alternatives1358); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:6: ( ( 'October' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:6: ( ( 'October' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( 'October' )
                    {
                     before(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( 'October' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:3: 'October'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Month__Alternatives1379); 

                    }

                     after(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( ( 'November' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( ( 'November' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( 'November' )
                    {
                     before(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( 'November' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:3: 'November'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Month__Alternatives1400); 

                    }

                     after(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( 'December' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( 'December' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( 'December' )
                    {
                     before(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( 'December' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:3: 'December'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Month__Alternatives1421); 

                    }

                     after(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Alternatives"


    // $ANTLR start "rule__Animals__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__Animals__Alternatives : ( ( ( 'Ovin' ) ) | ( ( 'Bovin' ) ) );
    public final void rule__Animals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( ( ( 'Ovin' ) ) | ( ( 'Bovin' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( 'Ovin' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( 'Ovin' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( 'Ovin' )
                    {
                     before(grammarAccess.getAnimalsAccess().getOvinEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( 'Ovin' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:3: 'Ovin'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Animals__Alternatives1457); 

                    }

                     after(grammarAccess.getAnimalsAccess().getOvinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:6: ( ( 'Bovin' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:6: ( ( 'Bovin' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( 'Bovin' )
                    {
                     before(grammarAccess.getAnimalsAccess().getBovinEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( 'Bovin' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:3: 'Bovin'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Animals__Alternatives1478); 

                    }

                     after(grammarAccess.getAnimalsAccess().getBovinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animals__Alternatives"


    // $ANTLR start "rule__Cereal__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: rule__Cereal__Alternatives : ( ( ( 'Corn' ) ) | ( ( 'Wheat' ) ) | ( ( 'Sorghum' ) ) );
    public final void rule__Cereal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( ( 'Corn' ) ) | ( ( 'Wheat' ) ) | ( ( 'Sorghum' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( 'Corn' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( 'Corn' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( 'Corn' )
                    {
                     before(grammarAccess.getCerealAccess().getCornEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( 'Corn' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:3: 'Corn'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__Cereal__Alternatives1514); 

                    }

                     after(grammarAccess.getCerealAccess().getCornEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:6: ( ( 'Wheat' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:6: ( ( 'Wheat' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( 'Wheat' )
                    {
                     before(grammarAccess.getCerealAccess().getWheatEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( 'Wheat' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:3: 'Wheat'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__Cereal__Alternatives1535); 

                    }

                     after(grammarAccess.getCerealAccess().getWheatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:6: ( ( 'Sorghum' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:6: ( ( 'Sorghum' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( 'Sorghum' )
                    {
                     before(grammarAccess.getCerealAccess().getSorghumEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( 'Sorghum' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:3: 'Sorghum'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__Cereal__Alternatives1556); 

                    }

                     after(grammarAccess.getCerealAccess().getSorghumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cereal__Alternatives"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01589);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01592);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ( 'Activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( 'Activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( 'Activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Activity__Group__0__Impl1620); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11651);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11654);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: rule__Activity__Group__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Activity__Group__1__Impl1682); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21713);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21716);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__Group_2__0 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ( rule__Activity__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Activity__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Activity__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( rule__Activity__Group_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( rule__Activity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:2: rule__Activity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl1743);
                    rule__Activity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31774);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31777);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ( ( rule__Activity__Group_3__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( rule__Activity__Group_3__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( rule__Activity__Group_3__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( rule__Activity__Group_3__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__Activity__Group_3__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: rule__Activity__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl1804);
            rule__Activity__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41834);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__41837);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__Activity__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl1864);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__51895);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__51898);
            rule__Activity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( rule__Activity__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Activity__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl1925);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__61956);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__61959);
            rule__Activity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__Activity__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Activity__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl1986);
                    rule__Activity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72017);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__72020);
            rule__Activity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: rule__Activity__Group__7__Impl : ( 'fin' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( 'fin' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( 'fin' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( 'fin' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: 'fin'
            {
             before(grammarAccess.getActivityAccess().getFinKeyword_7()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Activity__Group__7__Impl2048); 
             after(grammarAccess.getActivityAccess().getFinKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82079);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82082);
            rule__Activity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__FinAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( ( rule__Activity__FinAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__Activity__FinAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__Activity__FinAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( rule__Activity__FinAssignment_8 )
            {
             before(grammarAccess.getActivityAccess().getFinAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( rule__Activity__FinAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:2: rule__Activity__FinAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__FinAssignment_8_in_rule__Activity__Group__8__Impl2109);
            rule__Activity__FinAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getFinAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__92139);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__92142);
            rule__Activity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9"


    // $ANTLR start "rule__Activity__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: rule__Activity__Group__9__Impl : ( 'debut' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( 'debut' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( 'debut' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( 'debut' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:1: 'debut'
            {
             before(grammarAccess.getActivityAccess().getDebutKeyword_9()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Activity__Group__9__Impl2170); 
             after(grammarAccess.getActivityAccess().getDebutKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9__Impl"


    // $ANTLR start "rule__Activity__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__102201);
            rule__Activity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__102204);
            rule__Activity__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10"


    // $ANTLR start "rule__Activity__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__DebutAssignment_10 ) ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( ( rule__Activity__DebutAssignment_10 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( ( rule__Activity__DebutAssignment_10 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( ( rule__Activity__DebutAssignment_10 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( rule__Activity__DebutAssignment_10 )
            {
             before(grammarAccess.getActivityAccess().getDebutAssignment_10()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rule__Activity__DebutAssignment_10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:2: rule__Activity__DebutAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__DebutAssignment_10_in_rule__Activity__Group__10__Impl2231);
            rule__Activity__DebutAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDebutAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10__Impl"


    // $ANTLR start "rule__Activity__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( rule__Activity__Group__11__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:2: rule__Activity__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__112261);
            rule__Activity__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11"


    // $ANTLR start "rule__Activity__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: rule__Activity__Group__11__Impl : ( '}' ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Activity__Group__11__Impl2289); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11__Impl"


    // $ANTLR start "rule__Activity__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__Activity__Group_2__0 : rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 ;
    public final void rule__Activity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:2: rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__02344);
            rule__Activity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__02347);
            rule__Activity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0"


    // $ANTLR start "rule__Activity__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__Activity__Group_2__0__Impl : ( 'periodicite' ) ;
    public final void rule__Activity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( 'periodicite' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( 'periodicite' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( 'periodicite' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: 'periodicite'
            {
             before(grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Activity__Group_2__0__Impl2375); 
             after(grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: rule__Activity__Group_2__1 : rule__Activity__Group_2__1__Impl ;
    public final void rule__Activity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rule__Activity__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:2: rule__Activity__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__12406);
            rule__Activity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1"


    // $ANTLR start "rule__Activity__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__Activity__Group_2__1__Impl : ( ( rule__Activity__PeriodiciteAssignment_2_1 ) ) ;
    public final void rule__Activity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( ( ( rule__Activity__PeriodiciteAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( ( rule__Activity__PeriodiciteAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( ( rule__Activity__PeriodiciteAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__Activity__PeriodiciteAssignment_2_1 )
            {
             before(grammarAccess.getActivityAccess().getPeriodiciteAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( rule__Activity__PeriodiciteAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:2: rule__Activity__PeriodiciteAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PeriodiciteAssignment_2_1_in_rule__Activity__Group_2__1__Impl2433);
            rule__Activity__PeriodiciteAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getPeriodiciteAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02467);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02470);
            rule__Activity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__0"


    // $ANTLR start "rule__Activity__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: rule__Activity__Group_3__0__Impl : ( 'activites' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( 'activites' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( 'activites' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( 'activites' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: 'activites'
            {
             before(grammarAccess.getActivityAccess().getActivitesKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Activity__Group_3__0__Impl2498); 
             after(grammarAccess.getActivityAccess().getActivitesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( rule__Activity__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:2: rule__Activity__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12529);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__1"


    // $ANTLR start "rule__Activity__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: rule__Activity__Group_3__1__Impl : ( ( rule__Activity__ActivitesAssignment_3_1 ) ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( ( rule__Activity__ActivitesAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ( rule__Activity__ActivitesAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ( rule__Activity__ActivitesAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( rule__Activity__ActivitesAssignment_3_1 )
            {
             before(grammarAccess.getActivityAccess().getActivitesAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( rule__Activity__ActivitesAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:2: rule__Activity__ActivitesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__ActivitesAssignment_3_1_in_rule__Activity__Group_3__1__Impl2556);
            rule__Activity__ActivitesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getActivitesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02590);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02593);
            rule__Activity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: rule__Activity__Group_4__0__Impl : ( 'atelier' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( 'atelier' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: ( 'atelier' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: ( 'atelier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: 'atelier'
            {
             before(grammarAccess.getActivityAccess().getAtelierKeyword_4_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Activity__Group_4__0__Impl2621); 
             after(grammarAccess.getActivityAccess().getAtelierKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__12652);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__12655);
            rule__Activity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__Activity__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: '('
            {
             before(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Activity__Group_4__1__Impl2683); 
             after(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:2: rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__22714);
            rule__Activity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__22717);
            rule__Activity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: rule__Activity__Group_4__2__Impl : ( ( rule__Activity__AtelierAssignment_4_2 ) ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ( ( ( rule__Activity__AtelierAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( ( rule__Activity__AtelierAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( ( rule__Activity__AtelierAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( rule__Activity__AtelierAssignment_4_2 )
            {
             before(grammarAccess.getActivityAccess().getAtelierAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( rule__Activity__AtelierAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:2: rule__Activity__AtelierAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__AtelierAssignment_4_2_in_rule__Activity__Group_4__2__Impl2744);
            rule__Activity__AtelierAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAtelierAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__Activity__Group_4__3 : rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 ;
    public final void rule__Activity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:2: rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__32774);
            rule__Activity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__4_in_rule__Activity__Group_4__32777);
            rule__Activity__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__3"


    // $ANTLR start "rule__Activity__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__Activity__Group_4__3__Impl : ( ( rule__Activity__Group_4_3__0 )* ) ;
    public final void rule__Activity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( ( ( rule__Activity__Group_4_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__Activity__Group_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__Activity__Group_4_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__Activity__Group_4_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( rule__Activity__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==50) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__Activity__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__0_in_rule__Activity__Group_4__3__Impl2804);
            	    rule__Activity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__3__Impl"


    // $ANTLR start "rule__Activity__Group_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__Activity__Group_4__4 : rule__Activity__Group_4__4__Impl ;
    public final void rule__Activity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__Activity__Group_4__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__Activity__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__4__Impl_in_rule__Activity__Group_4__42835);
            rule__Activity__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__4"


    // $ANTLR start "rule__Activity__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: rule__Activity__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Activity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ')'
            {
             before(grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Activity__Group_4__4__Impl2863); 
             after(grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__4__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__Activity__Group_4_3__0 : rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 ;
    public final void rule__Activity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:2: rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__0__Impl_in_rule__Activity__Group_4_3__02904);
            rule__Activity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__1_in_rule__Activity__Group_4_3__02907);
            rule__Activity__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__0"


    // $ANTLR start "rule__Activity__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: rule__Activity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Activity__Group_4_3__0__Impl2935); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: rule__Activity__Group_4_3__1 : rule__Activity__Group_4_3__1__Impl ;
    public final void rule__Activity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( rule__Activity__Group_4_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:2: rule__Activity__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__1__Impl_in_rule__Activity__Group_4_3__12966);
            rule__Activity__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__1"


    // $ANTLR start "rule__Activity__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: rule__Activity__Group_4_3__1__Impl : ( ( rule__Activity__AtelierAssignment_4_3_1 ) ) ;
    public final void rule__Activity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( ( ( rule__Activity__AtelierAssignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ( ( rule__Activity__AtelierAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ( ( rule__Activity__AtelierAssignment_4_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( rule__Activity__AtelierAssignment_4_3_1 )
            {
             before(grammarAccess.getActivityAccess().getAtelierAssignment_4_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( rule__Activity__AtelierAssignment_4_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:2: rule__Activity__AtelierAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__AtelierAssignment_4_3_1_in_rule__Activity__Group_4_3__1__Impl2993);
            rule__Activity__AtelierAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAtelierAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03027);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03030);
            rule__Activity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: rule__Activity__Group_5__0__Impl : ( 'res_alloc' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( ( 'res_alloc' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ( 'res_alloc' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ( 'res_alloc' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: 'res_alloc'
            {
             before(grammarAccess.getActivityAccess().getRes_allocKeyword_5_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Activity__Group_5__0__Impl3058); 
             after(grammarAccess.getActivityAccess().getRes_allocKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13089);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13092);
            rule__Activity__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: rule__Activity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Activity__Group_5__1__Impl3120); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:2: rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23151);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__23154);
            rule__Activity__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Res_allocAssignment_5_2 ) ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: ( ( ( rule__Activity__Res_allocAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( ( rule__Activity__Res_allocAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( ( rule__Activity__Res_allocAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( rule__Activity__Res_allocAssignment_5_2 )
            {
             before(grammarAccess.getActivityAccess().getRes_allocAssignment_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( rule__Activity__Res_allocAssignment_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:2: rule__Activity__Res_allocAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Res_allocAssignment_5_2_in_rule__Activity__Group_5__2__Impl3181);
            rule__Activity__Res_allocAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRes_allocAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: rule__Activity__Group_5__3 : rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4 ;
    public final void rule__Activity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:2: rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__33211);
            rule__Activity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__4_in_rule__Activity__Group_5__33214);
            rule__Activity__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3"


    // $ANTLR start "rule__Activity__Group_5__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: rule__Activity__Group_5__3__Impl : ( ( rule__Activity__Group_5_3__0 )* ) ;
    public final void rule__Activity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( ( ( rule__Activity__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( ( rule__Activity__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( ( rule__Activity__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( rule__Activity__Group_5_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( rule__Activity__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==50) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:2: rule__Activity__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__0_in_rule__Activity__Group_5__3__Impl3241);
            	    rule__Activity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3__Impl"


    // $ANTLR start "rule__Activity__Group_5__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: rule__Activity__Group_5__4 : rule__Activity__Group_5__4__Impl ;
    public final void rule__Activity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: ( rule__Activity__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:2: rule__Activity__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__4__Impl_in_rule__Activity__Group_5__43272);
            rule__Activity__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__4"


    // $ANTLR start "rule__Activity__Group_5__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rule__Activity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Activity__Group_5__4__Impl3300); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__4__Impl"


    // $ANTLR start "rule__Activity__Group_5_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__Activity__Group_5_3__0 : rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1 ;
    public final void rule__Activity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:2: rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__0__Impl_in_rule__Activity__Group_5_3__03341);
            rule__Activity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__1_in_rule__Activity__Group_5_3__03344);
            rule__Activity__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__0"


    // $ANTLR start "rule__Activity__Group_5_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: rule__Activity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_3_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Activity__Group_5_3__0__Impl3372); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: rule__Activity__Group_5_3__1 : rule__Activity__Group_5_3__1__Impl ;
    public final void rule__Activity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( rule__Activity__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:2: rule__Activity__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__1__Impl_in_rule__Activity__Group_5_3__13403);
            rule__Activity__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__1"


    // $ANTLR start "rule__Activity__Group_5_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: rule__Activity__Group_5_3__1__Impl : ( ( rule__Activity__Res_allocAssignment_5_3_1 ) ) ;
    public final void rule__Activity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ( ( rule__Activity__Res_allocAssignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ( ( rule__Activity__Res_allocAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ( ( rule__Activity__Res_allocAssignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: ( rule__Activity__Res_allocAssignment_5_3_1 )
            {
             before(grammarAccess.getActivityAccess().getRes_allocAssignment_5_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( rule__Activity__Res_allocAssignment_5_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:2: rule__Activity__Res_allocAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Res_allocAssignment_5_3_1_in_rule__Activity__Group_5_3__1__Impl3430);
            rule__Activity__Res_allocAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRes_allocAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03464);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03467);
            rule__Activity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0"


    // $ANTLR start "rule__Activity__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: rule__Activity__Group_6__0__Impl : ( 'rule' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: ( ( 'rule' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( 'rule' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( 'rule' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: 'rule'
            {
             before(grammarAccess.getActivityAccess().getRuleKeyword_6_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Activity__Group_6__0__Impl3495); 
             after(grammarAccess.getActivityAccess().getRuleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0__Impl"


    // $ANTLR start "rule__Activity__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13526);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13529);
            rule__Activity__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1"


    // $ANTLR start "rule__Activity__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: rule__Activity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Activity__Group_6__1__Impl3557); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3 ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:2: rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23588);
            rule__Activity__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__3_in_rule__Activity__Group_6__23591);
            rule__Activity__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2"


    // $ANTLR start "rule__Activity__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__RuleAssignment_6_2 ) ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( ( rule__Activity__RuleAssignment_6_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( ( rule__Activity__RuleAssignment_6_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( ( rule__Activity__RuleAssignment_6_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__Activity__RuleAssignment_6_2 )
            {
             before(grammarAccess.getActivityAccess().getRuleAssignment_6_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( rule__Activity__RuleAssignment_6_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:2: rule__Activity__RuleAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__RuleAssignment_6_2_in_rule__Activity__Group_6__2__Impl3618);
            rule__Activity__RuleAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRuleAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2__Impl"


    // $ANTLR start "rule__Activity__Group_6__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Activity__Group_6__3 : rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4 ;
    public final void rule__Activity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:2: rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__3__Impl_in_rule__Activity__Group_6__33648);
            rule__Activity__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__4_in_rule__Activity__Group_6__33651);
            rule__Activity__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__3"


    // $ANTLR start "rule__Activity__Group_6__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: rule__Activity__Group_6__3__Impl : ( ( rule__Activity__Group_6_3__0 )* ) ;
    public final void rule__Activity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( ( rule__Activity__Group_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( ( rule__Activity__Group_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( ( rule__Activity__Group_6_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__Activity__Group_6_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: ( rule__Activity__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:2: rule__Activity__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__0_in_rule__Activity__Group_6__3__Impl3678);
            	    rule__Activity__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__3__Impl"


    // $ANTLR start "rule__Activity__Group_6__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: rule__Activity__Group_6__4 : rule__Activity__Group_6__4__Impl ;
    public final void rule__Activity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: ( rule__Activity__Group_6__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:2: rule__Activity__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__4__Impl_in_rule__Activity__Group_6__43709);
            rule__Activity__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__4"


    // $ANTLR start "rule__Activity__Group_6__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: rule__Activity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Activity__Group_6__4__Impl3737); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: rule__Activity__Group_6_3__0 : rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1 ;
    public final void rule__Activity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:2: rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__0__Impl_in_rule__Activity__Group_6_3__03778);
            rule__Activity__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__1_in_rule__Activity__Group_6_3__03781);
            rule__Activity__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__0"


    // $ANTLR start "rule__Activity__Group_6_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: rule__Activity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_3_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Activity__Group_6_3__0__Impl3809); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: rule__Activity__Group_6_3__1 : rule__Activity__Group_6_3__1__Impl ;
    public final void rule__Activity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Activity__Group_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__Activity__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__1__Impl_in_rule__Activity__Group_6_3__13840);
            rule__Activity__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__1"


    // $ANTLR start "rule__Activity__Group_6_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: rule__Activity__Group_6_3__1__Impl : ( ( rule__Activity__RuleAssignment_6_3_1 ) ) ;
    public final void rule__Activity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( ( ( rule__Activity__RuleAssignment_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( rule__Activity__RuleAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( rule__Activity__RuleAssignment_6_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( rule__Activity__RuleAssignment_6_3_1 )
            {
             before(grammarAccess.getActivityAccess().getRuleAssignment_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Activity__RuleAssignment_6_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:2: rule__Activity__RuleAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__RuleAssignment_6_3_1_in_rule__Activity__Group_6_3__1__Impl3867);
            rule__Activity__RuleAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRuleAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: rule__Res_Alloc__Group__0 : rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1 ;
    public final void rule__Res_Alloc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:2: rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__0__Impl_in_rule__Res_Alloc__Group__03901);
            rule__Res_Alloc__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__1_in_rule__Res_Alloc__Group__03904);
            rule__Res_Alloc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__0"


    // $ANTLR start "rule__Res_Alloc__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: rule__Res_Alloc__Group__0__Impl : ( () ) ;
    public final void rule__Res_Alloc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: ()
            {
             before(grammarAccess.getRes_AllocAccess().getRes_AllocAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: 
            {
            }

             after(grammarAccess.getRes_AllocAccess().getRes_AllocAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: rule__Res_Alloc__Group__1 : rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2 ;
    public final void rule__Res_Alloc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:2: rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__1__Impl_in_rule__Res_Alloc__Group__13962);
            rule__Res_Alloc__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__2_in_rule__Res_Alloc__Group__13965);
            rule__Res_Alloc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__1"


    // $ANTLR start "rule__Res_Alloc__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: rule__Res_Alloc__Group__1__Impl : ( 'Res_Alloc' ) ;
    public final void rule__Res_Alloc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( ( 'Res_Alloc' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( 'Res_Alloc' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( 'Res_Alloc' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: 'Res_Alloc'
            {
             before(grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Res_Alloc__Group__1__Impl3993); 
             after(grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__Res_Alloc__Group__2 : rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3 ;
    public final void rule__Res_Alloc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:2: rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__2__Impl_in_rule__Res_Alloc__Group__24024);
            rule__Res_Alloc__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__3_in_rule__Res_Alloc__Group__24027);
            rule__Res_Alloc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__2"


    // $ANTLR start "rule__Res_Alloc__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Res_Alloc__Group__2__Impl : ( '{' ) ;
    public final void rule__Res_Alloc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: '{'
            {
             before(grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Res_Alloc__Group__2__Impl4055); 
             after(grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__2__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: rule__Res_Alloc__Group__3 : rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4 ;
    public final void rule__Res_Alloc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:2: rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__3__Impl_in_rule__Res_Alloc__Group__34086);
            rule__Res_Alloc__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__4_in_rule__Res_Alloc__Group__34089);
            rule__Res_Alloc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__3"


    // $ANTLR start "rule__Res_Alloc__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: rule__Res_Alloc__Group__3__Impl : ( ( rule__Res_Alloc__Group_3__0 )? ) ;
    public final void rule__Res_Alloc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ( ( rule__Res_Alloc__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( ( rule__Res_Alloc__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( ( rule__Res_Alloc__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: ( rule__Res_Alloc__Group_3__0 )?
            {
             before(grammarAccess.getRes_AllocAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( rule__Res_Alloc__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:2: rule__Res_Alloc__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__0_in_rule__Res_Alloc__Group__3__Impl4116);
                    rule__Res_Alloc__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRes_AllocAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__3__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: rule__Res_Alloc__Group__4 : rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5 ;
    public final void rule__Res_Alloc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:1: ( rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:2: rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__4__Impl_in_rule__Res_Alloc__Group__44147);
            rule__Res_Alloc__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__5_in_rule__Res_Alloc__Group__44150);
            rule__Res_Alloc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__4"


    // $ANTLR start "rule__Res_Alloc__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: rule__Res_Alloc__Group__4__Impl : ( ( rule__Res_Alloc__Group_4__0 )? ) ;
    public final void rule__Res_Alloc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ( ( ( rule__Res_Alloc__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( ( rule__Res_Alloc__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( ( rule__Res_Alloc__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: ( rule__Res_Alloc__Group_4__0 )?
            {
             before(grammarAccess.getRes_AllocAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( rule__Res_Alloc__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:2: rule__Res_Alloc__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__0_in_rule__Res_Alloc__Group__4__Impl4177);
                    rule__Res_Alloc__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRes_AllocAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__4__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: rule__Res_Alloc__Group__5 : rule__Res_Alloc__Group__5__Impl ;
    public final void rule__Res_Alloc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: ( rule__Res_Alloc__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:2: rule__Res_Alloc__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__5__Impl_in_rule__Res_Alloc__Group__54208);
            rule__Res_Alloc__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__5"


    // $ANTLR start "rule__Res_Alloc__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: rule__Res_Alloc__Group__5__Impl : ( '}' ) ;
    public final void rule__Res_Alloc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: '}'
            {
             before(grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Res_Alloc__Group__5__Impl4236); 
             after(grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__5__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: rule__Res_Alloc__Group_3__0 : rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1 ;
    public final void rule__Res_Alloc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:2: rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__0__Impl_in_rule__Res_Alloc__Group_3__04279);
            rule__Res_Alloc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__1_in_rule__Res_Alloc__Group_3__04282);
            rule__Res_Alloc__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__0"


    // $ANTLR start "rule__Res_Alloc__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: rule__Res_Alloc__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Res_Alloc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( ( 'duration' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( 'duration' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( 'duration' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: 'duration'
            {
             before(grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Res_Alloc__Group_3__0__Impl4310); 
             after(grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: rule__Res_Alloc__Group_3__1 : rule__Res_Alloc__Group_3__1__Impl ;
    public final void rule__Res_Alloc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( rule__Res_Alloc__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:2: rule__Res_Alloc__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__1__Impl_in_rule__Res_Alloc__Group_3__14341);
            rule__Res_Alloc__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__1"


    // $ANTLR start "rule__Res_Alloc__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: rule__Res_Alloc__Group_3__1__Impl : ( ( rule__Res_Alloc__DurationAssignment_3_1 ) ) ;
    public final void rule__Res_Alloc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( ( ( rule__Res_Alloc__DurationAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( ( rule__Res_Alloc__DurationAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( ( rule__Res_Alloc__DurationAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( rule__Res_Alloc__DurationAssignment_3_1 )
            {
             before(grammarAccess.getRes_AllocAccess().getDurationAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( rule__Res_Alloc__DurationAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:2: rule__Res_Alloc__DurationAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__DurationAssignment_3_1_in_rule__Res_Alloc__Group_3__1__Impl4368);
            rule__Res_Alloc__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: rule__Res_Alloc__Group_4__0 : rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1 ;
    public final void rule__Res_Alloc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ( rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:2: rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__0__Impl_in_rule__Res_Alloc__Group_4__04402);
            rule__Res_Alloc__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__1_in_rule__Res_Alloc__Group_4__04405);
            rule__Res_Alloc__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__0"


    // $ANTLR start "rule__Res_Alloc__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: rule__Res_Alloc__Group_4__0__Impl : ( 'res_type' ) ;
    public final void rule__Res_Alloc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( 'res_type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( 'res_type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( 'res_type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: 'res_type'
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Res_Alloc__Group_4__0__Impl4433); 
             after(grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: rule__Res_Alloc__Group_4__1 : rule__Res_Alloc__Group_4__1__Impl ;
    public final void rule__Res_Alloc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ( rule__Res_Alloc__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:2: rule__Res_Alloc__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__1__Impl_in_rule__Res_Alloc__Group_4__14464);
            rule__Res_Alloc__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__1"


    // $ANTLR start "rule__Res_Alloc__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: rule__Res_Alloc__Group_4__1__Impl : ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) ) ;
    public final void rule__Res_Alloc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:1: ( rule__Res_Alloc__Res_typeAssignment_4_1 )
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: ( rule__Res_Alloc__Res_typeAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:2: rule__Res_Alloc__Res_typeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Res_typeAssignment_4_1_in_rule__Res_Alloc__Group_4__1__Impl4491);
            rule__Res_Alloc__Res_typeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getRes_typeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04525);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04528);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: 
            {
            }

             after(grammarAccess.getRuleAccess().getRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14586);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14589);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: rule__Rule__Group__1__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ( 'Rule' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( 'Rule' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( 'Rule' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Rule__Group__1__Impl4617); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24648);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24651);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Rule__Group__2__Impl4679); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34710);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34713);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Rule__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( rule__Rule__Group_3__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Rule__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:2: rule__Rule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl4740);
                    rule__Rule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( rule__Rule__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44771);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Rule__Group__4__Impl4799); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__04840);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__04843);
            rule__Rule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: rule__Rule__Group_3__0__Impl : ( 'predicat' ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( ( 'predicat' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( 'predicat' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( 'predicat' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: 'predicat'
            {
             before(grammarAccess.getRuleAccess().getPredicatKeyword_3_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Rule__Group_3__0__Impl4871); 
             after(grammarAccess.getRuleAccess().getPredicatKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:2: rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__14902);
            rule__Rule__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__14905);
            rule__Rule__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: rule__Rule__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Rule__Group_3__1__Impl4933); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: rule__Rule__Group_3__2 : rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3 ;
    public final void rule__Rule__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: ( rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:2: rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__24964);
            rule__Rule__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__3_in_rule__Rule__Group_3__24967);
            rule__Rule__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2"


    // $ANTLR start "rule__Rule__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: rule__Rule__Group_3__2__Impl : ( ( rule__Rule__PredicatAssignment_3_2 ) ) ;
    public final void rule__Rule__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( ( ( rule__Rule__PredicatAssignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( ( rule__Rule__PredicatAssignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( ( rule__Rule__PredicatAssignment_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( rule__Rule__PredicatAssignment_3_2 )
            {
             before(grammarAccess.getRuleAccess().getPredicatAssignment_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( rule__Rule__PredicatAssignment_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:2: rule__Rule__PredicatAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PredicatAssignment_3_2_in_rule__Rule__Group_3__2__Impl4994);
            rule__Rule__PredicatAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2__Impl"


    // $ANTLR start "rule__Rule__Group_3__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: rule__Rule__Group_3__3 : rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4 ;
    public final void rule__Rule__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:2: rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__3__Impl_in_rule__Rule__Group_3__35024);
            rule__Rule__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__4_in_rule__Rule__Group_3__35027);
            rule__Rule__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__3"


    // $ANTLR start "rule__Rule__Group_3__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: rule__Rule__Group_3__3__Impl : ( ( rule__Rule__Group_3_3__0 )* ) ;
    public final void rule__Rule__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( ( ( rule__Rule__Group_3_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( rule__Rule__Group_3_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( rule__Rule__Group_3_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( rule__Rule__Group_3_3__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_3_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( rule__Rule__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:2: rule__Rule__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__0_in_rule__Rule__Group_3__3__Impl5054);
            	    rule__Rule__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__3__Impl"


    // $ANTLR start "rule__Rule__Group_3__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__Rule__Group_3__4 : rule__Rule__Group_3__4__Impl ;
    public final void rule__Rule__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( rule__Rule__Group_3__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:2: rule__Rule__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__4__Impl_in_rule__Rule__Group_3__45085);
            rule__Rule__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__4"


    // $ANTLR start "rule__Rule__Group_3__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__Rule__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Rule__Group_3__4__Impl5113); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__4__Impl"


    // $ANTLR start "rule__Rule__Group_3_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__Rule__Group_3_3__0 : rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1 ;
    public final void rule__Rule__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__0__Impl_in_rule__Rule__Group_3_3__05154);
            rule__Rule__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__1_in_rule__Rule__Group_3_3__05157);
            rule__Rule__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__0"


    // $ANTLR start "rule__Rule__Group_3_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: rule__Rule__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_3_3_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Rule__Group_3_3__0__Impl5185); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: rule__Rule__Group_3_3__1 : rule__Rule__Group_3_3__1__Impl ;
    public final void rule__Rule__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__Rule__Group_3_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__Rule__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__1__Impl_in_rule__Rule__Group_3_3__15216);
            rule__Rule__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__1"


    // $ANTLR start "rule__Rule__Group_3_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Rule__Group_3_3__1__Impl : ( ( rule__Rule__PredicatAssignment_3_3_1 ) ) ;
    public final void rule__Rule__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( ( rule__Rule__PredicatAssignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( rule__Rule__PredicatAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( rule__Rule__PredicatAssignment_3_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( rule__Rule__PredicatAssignment_3_3_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatAssignment_3_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( rule__Rule__PredicatAssignment_3_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:2: rule__Rule__PredicatAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PredicatAssignment_3_3_1_in_rule__Rule__Group_3_3__1__Impl5243);
            rule__Rule__PredicatAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05277);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05280);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15338);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15341);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( 'Date' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( 'Date' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( 'Date' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Date__Group__1__Impl5369); 
             after(grammarAccess.getDateAccess().getDateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25400);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25403);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: rule__Date__Group__2__Impl : ( '{' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Date__Group__2__Impl5431); 
             after(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35462);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35465);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: rule__Date__Group__3__Impl : ( ( rule__Date__Group_3__0 )? ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( ( ( rule__Date__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( ( rule__Date__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( ( rule__Date__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: ( rule__Date__Group_3__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ( rule__Date__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:2: rule__Date__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__0_in_rule__Date__Group__3__Impl5492);
                    rule__Date__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45523);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45526);
            rule__Date__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: rule__Date__Group__4__Impl : ( ( rule__Date__Group_4__0 )? ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( ( ( rule__Date__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( ( rule__Date__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( ( rule__Date__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( rule__Date__Group_4__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( rule__Date__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:2: rule__Date__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__0_in_rule__Date__Group__4__Impl5553);
                    rule__Date__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Date__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: rule__Date__Group__5 : rule__Date__Group__5__Impl ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: ( rule__Date__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:2: rule__Date__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55584);
            rule__Date__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5"


    // $ANTLR start "rule__Date__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: rule__Date__Group__5__Impl : ( '}' ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Date__Group__5__Impl5612); 
             after(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5__Impl"


    // $ANTLR start "rule__Date__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: rule__Date__Group_3__0 : rule__Date__Group_3__0__Impl rule__Date__Group_3__1 ;
    public final void rule__Date__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( rule__Date__Group_3__0__Impl rule__Date__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:2: rule__Date__Group_3__0__Impl rule__Date__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__0__Impl_in_rule__Date__Group_3__05655);
            rule__Date__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__1_in_rule__Date__Group_3__05658);
            rule__Date__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__0"


    // $ANTLR start "rule__Date__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: rule__Date__Group_3__0__Impl : ( 'day' ) ;
    public final void rule__Date__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( ( 'day' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( 'day' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( 'day' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: 'day'
            {
             before(grammarAccess.getDateAccess().getDayKeyword_3_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Date__Group_3__0__Impl5686); 
             after(grammarAccess.getDateAccess().getDayKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__0__Impl"


    // $ANTLR start "rule__Date__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: rule__Date__Group_3__1 : rule__Date__Group_3__1__Impl ;
    public final void rule__Date__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: ( rule__Date__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:2: rule__Date__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__1__Impl_in_rule__Date__Group_3__15717);
            rule__Date__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__1"


    // $ANTLR start "rule__Date__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: rule__Date__Group_3__1__Impl : ( ( rule__Date__DayAssignment_3_1 ) ) ;
    public final void rule__Date__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: ( ( ( rule__Date__DayAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: ( ( rule__Date__DayAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: ( ( rule__Date__DayAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: ( rule__Date__DayAssignment_3_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:1: ( rule__Date__DayAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:2: rule__Date__DayAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_3_1_in_rule__Date__Group_3__1__Impl5744);
            rule__Date__DayAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__1__Impl"


    // $ANTLR start "rule__Date__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: rule__Date__Group_4__0 : rule__Date__Group_4__0__Impl rule__Date__Group_4__1 ;
    public final void rule__Date__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( rule__Date__Group_4__0__Impl rule__Date__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:2: rule__Date__Group_4__0__Impl rule__Date__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__0__Impl_in_rule__Date__Group_4__05778);
            rule__Date__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__1_in_rule__Date__Group_4__05781);
            rule__Date__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0"


    // $ANTLR start "rule__Date__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: rule__Date__Group_4__0__Impl : ( 'month' ) ;
    public final void rule__Date__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: ( ( 'month' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: ( 'month' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: ( 'month' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: 'month'
            {
             before(grammarAccess.getDateAccess().getMonthKeyword_4_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Date__Group_4__0__Impl5809); 
             after(grammarAccess.getDateAccess().getMonthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0__Impl"


    // $ANTLR start "rule__Date__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: rule__Date__Group_4__1 : rule__Date__Group_4__1__Impl ;
    public final void rule__Date__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ( rule__Date__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:2: rule__Date__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__1__Impl_in_rule__Date__Group_4__15840);
            rule__Date__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1"


    // $ANTLR start "rule__Date__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: rule__Date__Group_4__1__Impl : ( ( rule__Date__MonthAssignment_4_1 ) ) ;
    public final void rule__Date__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: ( ( ( rule__Date__MonthAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( ( rule__Date__MonthAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( ( rule__Date__MonthAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: ( rule__Date__MonthAssignment_4_1 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( rule__Date__MonthAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:2: rule__Date__MonthAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__MonthAssignment_4_1_in_rule__Date__Group_4__1__Impl5867);
            rule__Date__MonthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__Atelier_Impl__Group__0 : rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 ;
    public final void rule__Atelier_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__05901);
            rule__Atelier_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__05904);
            rule__Atelier_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__0"


    // $ANTLR start "rule__Atelier_Impl__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: rule__Atelier_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Atelier_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: ()
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: 
            {
            }

             after(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__0__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__Atelier_Impl__Group__1 : rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 ;
    public final void rule__Atelier_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:2: rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__15962);
            rule__Atelier_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__15965);
            rule__Atelier_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__1"


    // $ANTLR start "rule__Atelier_Impl__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: rule__Atelier_Impl__Group__1__Impl : ( 'Atelier' ) ;
    public final void rule__Atelier_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ( ( 'Atelier' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( 'Atelier' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( 'Atelier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: 'Atelier'
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Atelier_Impl__Group__1__Impl5993); 
             after(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__1__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: rule__Atelier_Impl__Group__2 : rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 ;
    public final void rule__Atelier_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:2: rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__26024);
            rule__Atelier_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__26027);
            rule__Atelier_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__2"


    // $ANTLR start "rule__Atelier_Impl__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: rule__Atelier_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Atelier_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: '{'
            {
             before(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Atelier_Impl__Group__2__Impl6055); 
             after(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__2__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: rule__Atelier_Impl__Group__3 : rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 ;
    public final void rule__Atelier_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: ( rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:2: rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__36086);
            rule__Atelier_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__36089);
            rule__Atelier_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__3"


    // $ANTLR start "rule__Atelier_Impl__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: rule__Atelier_Impl__Group__3__Impl : ( ( rule__Atelier_Impl__Group_3__0 )? ) ;
    public final void rule__Atelier_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( ( ( rule__Atelier_Impl__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( rule__Atelier_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( rule__Atelier_Impl__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:2: rule__Atelier_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl6116);
                    rule__Atelier_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__3__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: rule__Atelier_Impl__Group__4 : rule__Atelier_Impl__Group__4__Impl ;
    public final void rule__Atelier_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: ( rule__Atelier_Impl__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:2: rule__Atelier_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__46147);
            rule__Atelier_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__4"


    // $ANTLR start "rule__Atelier_Impl__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: rule__Atelier_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Atelier_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: '}'
            {
             before(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Atelier_Impl__Group__4__Impl6175); 
             after(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__4__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: rule__Atelier_Impl__Group_3__0 : rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 ;
    public final void rule__Atelier_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:2: rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__06216);
            rule__Atelier_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__06219);
            rule__Atelier_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group_3__0"


    // $ANTLR start "rule__Atelier_Impl__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: rule__Atelier_Impl__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Atelier_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( ( 'activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: ( 'activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: ( 'activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: 'activity'
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Atelier_Impl__Group_3__0__Impl6247); 
             after(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: rule__Atelier_Impl__Group_3__1 : rule__Atelier_Impl__Group_3__1__Impl ;
    public final void rule__Atelier_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( rule__Atelier_Impl__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:2: rule__Atelier_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__16278);
            rule__Atelier_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group_3__1"


    // $ANTLR start "rule__Atelier_Impl__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: rule__Atelier_Impl__Group_3__1__Impl : ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) ;
    public final void rule__Atelier_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:2: rule__Atelier_Impl__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl6305);
            rule__Atelier_Impl__ActivityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__06339);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__06342);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==63) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:2: '-'
                    {
                    match(input,63,FollowSets000.FOLLOW_63_in_rule__EIntegerObject__Group__0__Impl6371); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( rule__EIntegerObject__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__16404);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl6431); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__ResourceType__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: rule__ResourceType__Group__0 : rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 ;
    public final void rule__ResourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:2: rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__0__Impl_in_rule__ResourceType__Group__06464);
            rule__ResourceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__1_in_rule__ResourceType__Group__06467);
            rule__ResourceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0"


    // $ANTLR start "rule__ResourceType__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: rule__ResourceType__Group__0__Impl : ( () ) ;
    public final void rule__ResourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: ()
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: 
            {
            }

             after(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0__Impl"


    // $ANTLR start "rule__ResourceType__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: rule__ResourceType__Group__1 : rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2 ;
    public final void rule__ResourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ( rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:2: rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__1__Impl_in_rule__ResourceType__Group__16525);
            rule__ResourceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__2_in_rule__ResourceType__Group__16528);
            rule__ResourceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1"


    // $ANTLR start "rule__ResourceType__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: rule__ResourceType__Group__1__Impl : ( 'ResourceType' ) ;
    public final void rule__ResourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: ( ( 'ResourceType' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( 'ResourceType' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( 'ResourceType' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: 'ResourceType'
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__ResourceType__Group__1__Impl6556); 
             after(grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1__Impl"


    // $ANTLR start "rule__ResourceType__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: rule__ResourceType__Group__2 : rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3 ;
    public final void rule__ResourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: ( rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:2: rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__2__Impl_in_rule__ResourceType__Group__26587);
            rule__ResourceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__3_in_rule__ResourceType__Group__26590);
            rule__ResourceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__2"


    // $ANTLR start "rule__ResourceType__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: rule__ResourceType__Group__2__Impl : ( ( rule__ResourceType__NameAssignment_2 ) ) ;
    public final void rule__ResourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: ( ( ( rule__ResourceType__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( ( rule__ResourceType__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( ( rule__ResourceType__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( rule__ResourceType__NameAssignment_2 )
            {
             before(grammarAccess.getResourceTypeAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( rule__ResourceType__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:2: rule__ResourceType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__NameAssignment_2_in_rule__ResourceType__Group__2__Impl6617);
            rule__ResourceType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__2__Impl"


    // $ANTLR start "rule__ResourceType__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: rule__ResourceType__Group__3 : rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4 ;
    public final void rule__ResourceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:1: ( rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:2: rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__3__Impl_in_rule__ResourceType__Group__36647);
            rule__ResourceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__4_in_rule__ResourceType__Group__36650);
            rule__ResourceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__3"


    // $ANTLR start "rule__ResourceType__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: rule__ResourceType__Group__3__Impl : ( '{' ) ;
    public final void rule__ResourceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: '{'
            {
             before(grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ResourceType__Group__3__Impl6678); 
             after(grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__3__Impl"


    // $ANTLR start "rule__ResourceType__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: rule__ResourceType__Group__4 : rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5 ;
    public final void rule__ResourceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: ( rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:2: rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__4__Impl_in_rule__ResourceType__Group__46709);
            rule__ResourceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__5_in_rule__ResourceType__Group__46712);
            rule__ResourceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__4"


    // $ANTLR start "rule__ResourceType__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: rule__ResourceType__Group__4__Impl : ( ( rule__ResourceType__Group_4__0 )? ) ;
    public final void rule__ResourceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( ( ( rule__ResourceType__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( ( rule__ResourceType__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( ( rule__ResourceType__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( rule__ResourceType__Group_4__0 )?
            {
             before(grammarAccess.getResourceTypeAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( rule__ResourceType__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==65) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:2: rule__ResourceType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__0_in_rule__ResourceType__Group__4__Impl6739);
                    rule__ResourceType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__4__Impl"


    // $ANTLR start "rule__ResourceType__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: rule__ResourceType__Group__5 : rule__ResourceType__Group__5__Impl ;
    public final void rule__ResourceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:1: ( rule__ResourceType__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:2: rule__ResourceType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__5__Impl_in_rule__ResourceType__Group__56770);
            rule__ResourceType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__5"


    // $ANTLR start "rule__ResourceType__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: rule__ResourceType__Group__5__Impl : ( '}' ) ;
    public final void rule__ResourceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: '}'
            {
             before(grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__ResourceType__Group__5__Impl6798); 
             after(grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__5__Impl"


    // $ANTLR start "rule__ResourceType__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__ResourceType__Group_4__0 : rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1 ;
    public final void rule__ResourceType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:2: rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__0__Impl_in_rule__ResourceType__Group_4__06841);
            rule__ResourceType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__1_in_rule__ResourceType__Group_4__06844);
            rule__ResourceType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__0"


    // $ANTLR start "rule__ResourceType__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: rule__ResourceType__Group_4__0__Impl : ( 'resource' ) ;
    public final void rule__ResourceType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: ( ( 'resource' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( 'resource' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( 'resource' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: 'resource'
            {
             before(grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__ResourceType__Group_4__0__Impl6872); 
             after(grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__0__Impl"


    // $ANTLR start "rule__ResourceType__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: rule__ResourceType__Group_4__1 : rule__ResourceType__Group_4__1__Impl ;
    public final void rule__ResourceType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( rule__ResourceType__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:2: rule__ResourceType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__1__Impl_in_rule__ResourceType__Group_4__16903);
            rule__ResourceType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__1"


    // $ANTLR start "rule__ResourceType__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: rule__ResourceType__Group_4__1__Impl : ( ( rule__ResourceType__ResourceAssignment_4_1 ) ) ;
    public final void rule__ResourceType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( ( ( rule__ResourceType__ResourceAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( ( rule__ResourceType__ResourceAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( ( rule__ResourceType__ResourceAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__ResourceType__ResourceAssignment_4_1 )
            {
             before(grammarAccess.getResourceTypeAccess().getResourceAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( rule__ResourceType__ResourceAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:2: rule__ResourceType__ResourceAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__ResourceAssignment_4_1_in_rule__ResourceType__Group_4__1__Impl6930);
            rule__ResourceType__ResourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getResourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__1__Impl"


    // $ANTLR start "rule__Elevage__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__06967);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__06970);
            rule__Elevage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__0"


    // $ANTLR start "rule__Elevage__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: 
            {
            }

             after(grammarAccess.getElevageAccess().getElevageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__0__Impl"


    // $ANTLR start "rule__Elevage__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__17028);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__17031);
            rule__Elevage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__1"


    // $ANTLR start "rule__Elevage__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ( ( 'Elevage' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( 'Elevage' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( 'Elevage' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__Elevage__Group__1__Impl7059); 
             after(grammarAccess.getElevageAccess().getElevageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__1__Impl"


    // $ANTLR start "rule__Elevage__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__27090);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__27093);
            rule__Elevage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__2"


    // $ANTLR start "rule__Elevage__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Elevage__Group__2__Impl7121); 
             after(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__2__Impl"


    // $ANTLR start "rule__Elevage__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__37152);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__37155);
            rule__Elevage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__3"


    // $ANTLR start "rule__Elevage__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:1: ( rule__Elevage__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==67) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl7182);
                    rule__Elevage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElevageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__3__Impl"


    // $ANTLR start "rule__Elevage__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl rule__Elevage__Group__5 ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:1: ( rule__Elevage__Group__4__Impl rule__Elevage__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:2: rule__Elevage__Group__4__Impl rule__Elevage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__47213);
            rule__Elevage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__5_in_rule__Elevage__Group__47216);
            rule__Elevage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__4"


    // $ANTLR start "rule__Elevage__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: rule__Elevage__Group__4__Impl : ( ( rule__Elevage__Group_4__0 )? ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ( ( ( rule__Elevage__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ( ( rule__Elevage__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ( ( rule__Elevage__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:1: ( rule__Elevage__Group_4__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:1: ( rule__Elevage__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:2: rule__Elevage__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__0_in_rule__Elevage__Group__4__Impl7243);
                    rule__Elevage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElevageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__4__Impl"


    // $ANTLR start "rule__Elevage__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__Elevage__Group__5 : rule__Elevage__Group__5__Impl ;
    public final void rule__Elevage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( rule__Elevage__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__Elevage__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__5__Impl_in_rule__Elevage__Group__57274);
            rule__Elevage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__5"


    // $ANTLR start "rule__Elevage__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: rule__Elevage__Group__5__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Elevage__Group__5__Impl7302); 
             after(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__5__Impl"


    // $ANTLR start "rule__Elevage__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__07345);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__07348);
            rule__Elevage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__0"


    // $ANTLR start "rule__Elevage__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: rule__Elevage__Group_3__0__Impl : ( 'animals' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: ( ( 'animals' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( 'animals' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( 'animals' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: 'animals'
            {
             before(grammarAccess.getElevageAccess().getAnimalsKeyword_3_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__Elevage__Group_3__0__Impl7376); 
             after(grammarAccess.getElevageAccess().getAnimalsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__0__Impl"


    // $ANTLR start "rule__Elevage__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__17407);
            rule__Elevage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__1"


    // $ANTLR start "rule__Elevage__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__AnimalsAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: ( ( ( rule__Elevage__AnimalsAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ( rule__Elevage__AnimalsAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ( rule__Elevage__AnimalsAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( rule__Elevage__AnimalsAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getAnimalsAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( rule__Elevage__AnimalsAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:2: rule__Elevage__AnimalsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__AnimalsAssignment_3_1_in_rule__Elevage__Group_3__1__Impl7434);
            rule__Elevage__AnimalsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getAnimalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__1__Impl"


    // $ANTLR start "rule__Elevage__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: rule__Elevage__Group_4__0 : rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1 ;
    public final void rule__Elevage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:2: rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__0__Impl_in_rule__Elevage__Group_4__07468);
            rule__Elevage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__1_in_rule__Elevage__Group_4__07471);
            rule__Elevage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__0"


    // $ANTLR start "rule__Elevage__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__Elevage__Group_4__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( ( 'activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( 'activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( 'activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_4_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Elevage__Group_4__0__Impl7499); 
             after(grammarAccess.getElevageAccess().getActivityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__0__Impl"


    // $ANTLR start "rule__Elevage__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: rule__Elevage__Group_4__1 : rule__Elevage__Group_4__1__Impl ;
    public final void rule__Elevage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__Elevage__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__Elevage__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__1__Impl_in_rule__Elevage__Group_4__17530);
            rule__Elevage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__1"


    // $ANTLR start "rule__Elevage__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__Elevage__Group_4__1__Impl : ( ( rule__Elevage__ActivityAssignment_4_1 ) ) ;
    public final void rule__Elevage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( ( rule__Elevage__ActivityAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__Elevage__ActivityAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__Elevage__ActivityAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__Elevage__ActivityAssignment_4_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__Elevage__ActivityAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:2: rule__Elevage__ActivityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_4_1_in_rule__Elevage__Group_4__1__Impl7557);
            rule__Elevage__ActivityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getActivityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__1__Impl"


    // $ANTLR start "rule__Culture__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__07591);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__07594);
            rule__Culture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0"


    // $ANTLR start "rule__Culture__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: 
            {
            }

             after(grammarAccess.getCultureAccess().getCultureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0__Impl"


    // $ANTLR start "rule__Culture__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__17652);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__17655);
            rule__Culture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1"


    // $ANTLR start "rule__Culture__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ( 'Culture' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( 'Culture' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( 'Culture' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__Culture__Group__1__Impl7683); 
             after(grammarAccess.getCultureAccess().getCultureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__27714);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__27717);
            rule__Culture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2"


    // $ANTLR start "rule__Culture__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Culture__Group__2__Impl7745); 
             after(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2__Impl"


    // $ANTLR start "rule__Culture__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__37776);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__37779);
            rule__Culture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3"


    // $ANTLR start "rule__Culture__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ( rule__Culture__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl7806);
                    rule__Culture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCultureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3__Impl"


    // $ANTLR start "rule__Culture__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl rule__Culture__Group__5 ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__Culture__Group__4__Impl rule__Culture__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__Culture__Group__4__Impl rule__Culture__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__47837);
            rule__Culture__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__5_in_rule__Culture__Group__47840);
            rule__Culture__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4"


    // $ANTLR start "rule__Culture__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__Culture__Group__4__Impl : ( ( rule__Culture__Group_4__0 )? ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( ( rule__Culture__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( ( rule__Culture__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( ( rule__Culture__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: ( rule__Culture__Group_4__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: ( rule__Culture__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==62) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:2: rule__Culture__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__0_in_rule__Culture__Group__4__Impl7867);
                    rule__Culture__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCultureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4__Impl"


    // $ANTLR start "rule__Culture__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: rule__Culture__Group__5 : rule__Culture__Group__5__Impl ;
    public final void rule__Culture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( rule__Culture__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:2: rule__Culture__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__5__Impl_in_rule__Culture__Group__57898);
            rule__Culture__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__5"


    // $ANTLR start "rule__Culture__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: rule__Culture__Group__5__Impl : ( '}' ) ;
    public final void rule__Culture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Culture__Group__5__Impl7926); 
             after(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__5__Impl"


    // $ANTLR start "rule__Culture__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__07969);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__07972);
            rule__Culture__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__0"


    // $ANTLR start "rule__Culture__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Culture__Group_3__0__Impl : ( 'cereals' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ( 'cereals' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'cereals' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'cereals' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: 'cereals'
            {
             before(grammarAccess.getCultureAccess().getCerealsKeyword_3_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__Culture__Group_3__0__Impl8000); 
             after(grammarAccess.getCultureAccess().getCerealsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__0__Impl"


    // $ANTLR start "rule__Culture__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__18031);
            rule__Culture__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__1"


    // $ANTLR start "rule__Culture__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__CerealsAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ( ( rule__Culture__CerealsAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ( rule__Culture__CerealsAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ( rule__Culture__CerealsAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( rule__Culture__CerealsAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getCerealsAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( rule__Culture__CerealsAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:2: rule__Culture__CerealsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__CerealsAssignment_3_1_in_rule__Culture__Group_3__1__Impl8058);
            rule__Culture__CerealsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getCerealsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__1__Impl"


    // $ANTLR start "rule__Culture__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: rule__Culture__Group_4__0 : rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1 ;
    public final void rule__Culture__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: ( rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:2: rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__0__Impl_in_rule__Culture__Group_4__08092);
            rule__Culture__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__1_in_rule__Culture__Group_4__08095);
            rule__Culture__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__0"


    // $ANTLR start "rule__Culture__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: rule__Culture__Group_4__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: ( ( 'activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: ( 'activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: ( 'activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4058:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_4_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Culture__Group_4__0__Impl8123); 
             after(grammarAccess.getCultureAccess().getActivityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__0__Impl"


    // $ANTLR start "rule__Culture__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: rule__Culture__Group_4__1 : rule__Culture__Group_4__1__Impl ;
    public final void rule__Culture__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: ( rule__Culture__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:2: rule__Culture__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__1__Impl_in_rule__Culture__Group_4__18154);
            rule__Culture__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__1"


    // $ANTLR start "rule__Culture__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: rule__Culture__Group_4__1__Impl : ( ( rule__Culture__ActivityAssignment_4_1 ) ) ;
    public final void rule__Culture__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( ( ( rule__Culture__ActivityAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: ( ( rule__Culture__ActivityAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: ( ( rule__Culture__ActivityAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4088:1: ( rule__Culture__ActivityAssignment_4_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( rule__Culture__ActivityAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:2: rule__Culture__ActivityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_4_1_in_rule__Culture__Group_4__1__Impl8181);
            rule__Culture__ActivityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getActivityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__PeriodiciteAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: rule__Activity__PeriodiciteAssignment_2_1 : ( rulePeriodicite ) ;
    public final void rule__Activity__PeriodiciteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ( rulePeriodicite ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( rulePeriodicite )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( rulePeriodicite )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: rulePeriodicite
            {
             before(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicite_in_rule__Activity__PeriodiciteAssignment_2_18220);
            rulePeriodicite();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__PeriodiciteAssignment_2_1"


    // $ANTLR start "rule__Activity__ActivitesAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: rule__Activity__ActivitesAssignment_3_1 : ( ruleActivites ) ;
    public final void rule__Activity__ActivitesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( ( ruleActivites ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ruleActivites )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ruleActivites )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: ruleActivites
            {
             before(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivites_in_rule__Activity__ActivitesAssignment_3_18251);
            ruleActivites();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivitesAssignment_3_1"


    // $ANTLR start "rule__Activity__AtelierAssignment_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: rule__Activity__AtelierAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Activity__AtelierAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_28286);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AtelierAssignment_4_2"


    // $ANTLR start "rule__Activity__AtelierAssignment_4_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: rule__Activity__AtelierAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Activity__AtelierAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_3_18325);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AtelierAssignment_4_3_1"


    // $ANTLR start "rule__Activity__Res_allocAssignment_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: rule__Activity__Res_allocAssignment_5_2 : ( ruleRes_Alloc ) ;
    public final void rule__Activity__Res_allocAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ( ( ruleRes_Alloc ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: ( ruleRes_Alloc )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: ( ruleRes_Alloc )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: ruleRes_Alloc
            {
             before(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_28360);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Res_allocAssignment_5_2"


    // $ANTLR start "rule__Activity__Res_allocAssignment_5_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: rule__Activity__Res_allocAssignment_5_3_1 : ( ruleRes_Alloc ) ;
    public final void rule__Activity__Res_allocAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( ( ruleRes_Alloc ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ( ruleRes_Alloc )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ( ruleRes_Alloc )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ruleRes_Alloc
            {
             before(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_3_18391);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Res_allocAssignment_5_3_1"


    // $ANTLR start "rule__Activity__RuleAssignment_6_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:1: rule__Activity__RuleAssignment_6_2 : ( ruleRule ) ;
    public final void rule__Activity__RuleAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ( ruleRule ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( ruleRule )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( ruleRule )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ruleRule
            {
             before(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_28422);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__RuleAssignment_6_2"


    // $ANTLR start "rule__Activity__RuleAssignment_6_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: rule__Activity__RuleAssignment_6_3_1 : ( ruleRule ) ;
    public final void rule__Activity__RuleAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( ( ruleRule ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ( ruleRule )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ( ruleRule )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: ruleRule
            {
             before(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_3_18453);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__RuleAssignment_6_3_1"


    // $ANTLR start "rule__Activity__FinAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: rule__Activity__FinAssignment_8 : ( ruleDate ) ;
    public final void rule__Activity__FinAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( ( ruleDate ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: ( ruleDate )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: ( ruleDate )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4238:1: ruleDate
            {
             before(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Activity__FinAssignment_88484);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__FinAssignment_8"


    // $ANTLR start "rule__Activity__DebutAssignment_10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: rule__Activity__DebutAssignment_10 : ( ruleDate ) ;
    public final void rule__Activity__DebutAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: ( ( ruleDate ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( ruleDate )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( ruleDate )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ruleDate
            {
             before(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Activity__DebutAssignment_108515);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DebutAssignment_10"


    // $ANTLR start "rule__Res_Alloc__DurationAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: rule__Res_Alloc__DurationAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Res_Alloc__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ( ruleEIntegerObject ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( ruleEIntegerObject )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( ruleEIntegerObject )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: ruleEIntegerObject
            {
             before(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_rule__Res_Alloc__DurationAssignment_3_18546);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__DurationAssignment_3_1"


    // $ANTLR start "rule__Res_Alloc__Res_typeAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: rule__Res_Alloc__Res_typeAssignment_4_1 : ( ruleResourceType ) ;
    public final void rule__Res_Alloc__Res_typeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( ( ruleResourceType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( ruleResourceType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( ruleResourceType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: ruleResourceType
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_rule__Res_Alloc__Res_typeAssignment_4_18577);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Res_typeAssignment_4_1"


    // $ANTLR start "rule__Rule__PredicatAssignment_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: rule__Rule__PredicatAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Rule__PredicatAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:1: ruleEString
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_28612);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatAssignment_3_2"


    // $ANTLR start "rule__Rule__PredicatAssignment_3_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: rule__Rule__PredicatAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__PredicatAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ruleEString
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_3_18651);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatAssignment_3_3_1"


    // $ANTLR start "rule__Date__DayAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: rule__Date__DayAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Date__DayAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:1: ( ( ruleEIntegerObject ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: ( ruleEIntegerObject )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: ( ruleEIntegerObject )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ruleEIntegerObject
            {
             before(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_rule__Date__DayAssignment_3_18686);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_3_1"


    // $ANTLR start "rule__Date__MonthAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: rule__Date__MonthAssignment_4_1 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( ( ruleMonth ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: ( ruleMonth )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: ( ruleMonth )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_4_18717);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_4_1"


    // $ANTLR start "rule__Atelier_Impl__ActivityAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: rule__Atelier_Impl__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Atelier_Impl__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: ( ruleEString )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityActivityCrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: ruleEString
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_18752);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplAccess().getActivityActivityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtelier_ImplAccess().getActivityActivityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__ActivityAssignment_3_1"


    // $ANTLR start "rule__ResourceType__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: rule__ResourceType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ResourceType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ruleEString
            {
             before(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResourceType__NameAssignment_28787);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__NameAssignment_2"


    // $ANTLR start "rule__ResourceType__ResourceAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4394:1: rule__ResourceType__ResourceAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ResourceType__ResourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4398:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( ruleEString )
            {
             before(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ruleEString
            {
             before(grammarAccess.getResourceTypeAccess().getResourceRessourceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResourceType__ResourceAssignment_4_18822);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceTypeAccess().getResourceRessourceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__ResourceAssignment_4_1"


    // $ANTLR start "rule__Elevage__AnimalsAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: rule__Elevage__AnimalsAssignment_3_1 : ( ruleAnimals ) ;
    public final void rule__Elevage__AnimalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:1: ( ( ruleAnimals ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( ruleAnimals )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( ruleAnimals )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: ruleAnimals
            {
             before(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimals_in_rule__Elevage__AnimalsAssignment_3_18859);
            ruleAnimals();

            state._fsp--;

             after(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__AnimalsAssignment_3_1"


    // $ANTLR start "rule__Elevage__ActivityAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: rule__Elevage__ActivityAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_4_18894);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElevageAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__ActivityAssignment_4_1"


    // $ANTLR start "rule__Culture__CerealsAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: rule__Culture__CerealsAssignment_3_1 : ( ruleCereal ) ;
    public final void rule__Culture__CerealsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ( ruleCereal ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( ruleCereal )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( ruleCereal )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ruleCereal
            {
             before(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCereal_in_rule__Culture__CerealsAssignment_3_18929);
            ruleCereal();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__CerealsAssignment_3_1"


    // $ANTLR start "rule__Culture__ActivityAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: rule__Culture__ActivityAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_4_18964);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__ActivityAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity94 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRes_Alloc131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__0_in_ruleRes_Alloc157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_entryRuleResourceType424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceType431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__0_in_ruleResourceType457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0_in_ruleElevage581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Periodicite__Alternatives_in_rulePeriodicite678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activites__Alternatives_in_ruleActivites714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animals__Alternatives_in_ruleAnimals786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cereal__Alternatives_in_ruleCereal822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Periodicite__Alternatives908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Periodicite__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Periodicite__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Activites__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Activites__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Activites__Alternatives1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Activites__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Activites__Alternatives1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Activites__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Activites__Alternatives1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activites__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activites__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Month__Alternatives1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Month__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Month__Alternatives1232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Month__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Month__Alternatives1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Month__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Month__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Month__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Month__Alternatives1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Month__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Month__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Month__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Animals__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Animals__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Cereal__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Cereal__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Cereal__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01589 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Activity__Group__0__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11651 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Activity__Group__1__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21713 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31774 = new BitSet(new long[]{0x0018840000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41834 = new BitSet(new long[]{0x0018840000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__41837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__51895 = new BitSet(new long[]{0x0018840000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__51898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__61956 = new BitSet(new long[]{0x0018840000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__61959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72017 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__72020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Activity__Group__7__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82079 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__FinAssignment_8_in_rule__Activity__Group__8__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__92139 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__92142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Activity__Group__9__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__102201 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__102204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__DebutAssignment_10_in_rule__Activity__Group__10__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__112261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Activity__Group__11__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__02344 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__02347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Activity__Group_2__0__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__12406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PeriodiciteAssignment_2_1_in_rule__Activity__Group_2__1__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02467 = new BitSet(new long[]{0x00000000007FC000L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Activity__Group_3__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__ActivitesAssignment_3_1_in_rule__Activity__Group_3__1__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02590 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Activity__Group_4__0__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__12652 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__12655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Activity__Group_4__1__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__22714 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__22717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__AtelierAssignment_4_2_in_rule__Activity__Group_4__2__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__32774 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__4_in_rule__Activity__Group_4__32777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__0_in_rule__Activity__Group_4__3__Impl2804 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__4__Impl_in_rule__Activity__Group_4__42835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Activity__Group_4__4__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__0__Impl_in_rule__Activity__Group_4_3__02904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__1_in_rule__Activity__Group_4_3__02907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Activity__Group_4_3__0__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__1__Impl_in_rule__Activity__Group_4_3__12966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__AtelierAssignment_4_3_1_in_rule__Activity__Group_4_3__1__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__03027 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__03030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Activity__Group_5__0__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13089 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Activity__Group_5__1__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23151 = new BitSet(new long[]{0x0004100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__23154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Res_allocAssignment_5_2_in_rule__Activity__Group_5__2__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__33211 = new BitSet(new long[]{0x0004100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__4_in_rule__Activity__Group_5__33214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__0_in_rule__Activity__Group_5__3__Impl3241 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__4__Impl_in_rule__Activity__Group_5__43272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Activity__Group_5__4__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__0__Impl_in_rule__Activity__Group_5_3__03341 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__1_in_rule__Activity__Group_5_3__03344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Activity__Group_5_3__0__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__1__Impl_in_rule__Activity__Group_5_3__13403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Res_allocAssignment_5_3_1_in_rule__Activity__Group_5_3__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03464 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Activity__Group_6__0__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13526 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Activity__Group_6__1__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23588 = new BitSet(new long[]{0x0004100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__3_in_rule__Activity__Group_6__23591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__RuleAssignment_6_2_in_rule__Activity__Group_6__2__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__3__Impl_in_rule__Activity__Group_6__33648 = new BitSet(new long[]{0x0004100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__4_in_rule__Activity__Group_6__33651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__0_in_rule__Activity__Group_6__3__Impl3678 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__4__Impl_in_rule__Activity__Group_6__43709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Activity__Group_6__4__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__0__Impl_in_rule__Activity__Group_6_3__03778 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__1_in_rule__Activity__Group_6_3__03781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Activity__Group_6_3__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__1__Impl_in_rule__Activity__Group_6_3__13840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__RuleAssignment_6_3_1_in_rule__Activity__Group_6_3__1__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__0__Impl_in_rule__Res_Alloc__Group__03901 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__1_in_rule__Res_Alloc__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__1__Impl_in_rule__Res_Alloc__Group__13962 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__2_in_rule__Res_Alloc__Group__13965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Res_Alloc__Group__1__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__2__Impl_in_rule__Res_Alloc__Group__24024 = new BitSet(new long[]{0x00C0100000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__3_in_rule__Res_Alloc__Group__24027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Res_Alloc__Group__2__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__3__Impl_in_rule__Res_Alloc__Group__34086 = new BitSet(new long[]{0x00C0100000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__4_in_rule__Res_Alloc__Group__34089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__0_in_rule__Res_Alloc__Group__3__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__4__Impl_in_rule__Res_Alloc__Group__44147 = new BitSet(new long[]{0x00C0100000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__5_in_rule__Res_Alloc__Group__44150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__0_in_rule__Res_Alloc__Group__4__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__5__Impl_in_rule__Res_Alloc__Group__54208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Res_Alloc__Group__5__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__0__Impl_in_rule__Res_Alloc__Group_3__04279 = new BitSet(new long[]{0x8000000000000040L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__1_in_rule__Res_Alloc__Group_3__04282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Res_Alloc__Group_3__0__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__1__Impl_in_rule__Res_Alloc__Group_3__14341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__DurationAssignment_3_1_in_rule__Res_Alloc__Group_3__1__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__0__Impl_in_rule__Res_Alloc__Group_4__04402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__1_in_rule__Res_Alloc__Group_4__04405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Res_Alloc__Group_4__0__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__1__Impl_in_rule__Res_Alloc__Group_4__14464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Res_typeAssignment_4_1_in_rule__Res_Alloc__Group_4__1__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04525 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14586 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Rule__Group__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24648 = new BitSet(new long[]{0x0200100000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Rule__Group__2__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34710 = new BitSet(new long[]{0x0200100000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Rule__Group__4__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__04840 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__04843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Rule__Group_3__0__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__14902 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__14905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Rule__Group_3__1__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__24964 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__3_in_rule__Rule__Group_3__24967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PredicatAssignment_3_2_in_rule__Rule__Group_3__2__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__3__Impl_in_rule__Rule__Group_3__35024 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__4_in_rule__Rule__Group_3__35027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__0_in_rule__Rule__Group_3__3__Impl5054 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__4__Impl_in_rule__Rule__Group_3__45085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Rule__Group_3__4__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__0__Impl_in_rule__Rule__Group_3_3__05154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__1_in_rule__Rule__Group_3_3__05157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Rule__Group_3_3__0__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__1__Impl_in_rule__Rule__Group_3_3__15216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PredicatAssignment_3_3_1_in_rule__Rule__Group_3_3__1__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05277 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15338 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Date__Group__1__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25400 = new BitSet(new long[]{0x1800100000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Date__Group__2__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35462 = new BitSet(new long[]{0x1800100000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__0_in_rule__Date__Group__3__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45523 = new BitSet(new long[]{0x1800100000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__0_in_rule__Date__Group__4__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Date__Group__5__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__0__Impl_in_rule__Date__Group_3__05655 = new BitSet(new long[]{0x8000000000000040L});
        public static final BitSet FOLLOW_rule__Date__Group_3__1_in_rule__Date__Group_3__05658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Date__Group_3__0__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__1__Impl_in_rule__Date__Group_3__15717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_3_1_in_rule__Date__Group_3__1__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__0__Impl_in_rule__Date__Group_4__05778 = new BitSet(new long[]{0x00000007FF800000L});
        public static final BitSet FOLLOW_rule__Date__Group_4__1_in_rule__Date__Group_4__05781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Date__Group_4__0__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__1__Impl_in_rule__Date__Group_4__15840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__MonthAssignment_4_1_in_rule__Date__Group_4__1__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__05901 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__05904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__15962 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__15965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Atelier_Impl__Group__1__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__26024 = new BitSet(new long[]{0x4000100000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__26027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Atelier_Impl__Group__2__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__36086 = new BitSet(new long[]{0x4000100000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__36089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__46147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Atelier_Impl__Group__4__Impl6175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__06216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__06219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Atelier_Impl__Group_3__0__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__16278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__06339 = new BitSet(new long[]{0x8000000000000040L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__06342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__EIntegerObject__Group__0__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__16404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl6431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__0__Impl_in_rule__ResourceType__Group__06464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__1_in_rule__ResourceType__Group__06467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__1__Impl_in_rule__ResourceType__Group__16525 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__2_in_rule__ResourceType__Group__16528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__ResourceType__Group__1__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__2__Impl_in_rule__ResourceType__Group__26587 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__3_in_rule__ResourceType__Group__26590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__NameAssignment_2_in_rule__ResourceType__Group__2__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__3__Impl_in_rule__ResourceType__Group__36647 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__4_in_rule__ResourceType__Group__36650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ResourceType__Group__3__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__4__Impl_in_rule__ResourceType__Group__46709 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__5_in_rule__ResourceType__Group__46712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__0_in_rule__ResourceType__Group__4__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__5__Impl_in_rule__ResourceType__Group__56770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__ResourceType__Group__5__Impl6798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__0__Impl_in_rule__ResourceType__Group_4__06841 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__1_in_rule__ResourceType__Group_4__06844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__ResourceType__Group_4__0__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__1__Impl_in_rule__ResourceType__Group_4__16903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__ResourceAssignment_4_1_in_rule__ResourceType__Group_4__1__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__06967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__06970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__17028 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__17031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__Elevage__Group__1__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__27090 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__27093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Elevage__Group__2__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__37152 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__37155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__47213 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__Elevage__Group__5_in_rule__Elevage__Group__47216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__0_in_rule__Elevage__Group__4__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__5__Impl_in_rule__Elevage__Group__57274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Elevage__Group__5__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__07345 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__07348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__Elevage__Group_3__0__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__17407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__AnimalsAssignment_3_1_in_rule__Elevage__Group_3__1__Impl7434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__0__Impl_in_rule__Elevage__Group_4__07468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__1_in_rule__Elevage__Group_4__07471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Elevage__Group_4__0__Impl7499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__1__Impl_in_rule__Elevage__Group_4__17530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_4_1_in_rule__Elevage__Group_4__1__Impl7557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__07591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__07594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__17652 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__17655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__Culture__Group__1__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__27714 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__27717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Culture__Group__2__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__37776 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__37779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__47837 = new BitSet(new long[]{0x4000100000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Culture__Group__5_in_rule__Culture__Group__47840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__0_in_rule__Culture__Group__4__Impl7867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__5__Impl_in_rule__Culture__Group__57898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Culture__Group__5__Impl7926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__07969 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__07972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__Culture__Group_3__0__Impl8000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__18031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__CerealsAssignment_3_1_in_rule__Culture__Group_3__1__Impl8058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__0__Impl_in_rule__Culture__Group_4__08092 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__1_in_rule__Culture__Group_4__08095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Culture__Group_4__0__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__1__Impl_in_rule__Culture__Group_4__18154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_4_1_in_rule__Culture__Group_4__1__Impl8181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicite_in_rule__Activity__PeriodiciteAssignment_2_18220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivites_in_rule__Activity__ActivitesAssignment_3_18251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_28286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_3_18325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_28360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_3_18391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_28422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_3_18453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Activity__FinAssignment_88484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Activity__DebutAssignment_108515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__Res_Alloc__DurationAssignment_3_18546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_rule__Res_Alloc__Res_typeAssignment_4_18577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_28612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_3_18651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__Date__DayAssignment_3_18686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_4_18717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_18752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResourceType__NameAssignment_28787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResourceType__ResourceAssignment_4_18822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimals_in_rule__Elevage__AnimalsAssignment_3_18859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_4_18894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCereal_in_rule__Culture__CerealsAssignment_3_18929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_4_18964 = new BitSet(new long[]{0x0000000000000002L});
    }


}