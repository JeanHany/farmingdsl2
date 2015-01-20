package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'{'", "'periodicite'", "'Name'", "'atelier'", "'('", "','", "')'", "'res_alloc'", "'}'", "'rule'", "'fin'", "'debut'", "'Res_Alloc'", "'duration'", "'res_type'", "'Rule'", "'predicat'", "'Date'", "'day'", "'month'", "'Atelier'", "'activity'", "'-'", "'ResourceType'", "'resource'", "'Elevage'", "'Culture'", "'Daily'", "'Weekly'", "'Monthly'", "'January'", "'February'", "'March'", "'April'", "'May'", "'June'", "'July'", "'August'", "'September'", "'October'", "'November'", "'December'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Activity";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity75);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_periodicite_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        EObject lv_res_alloc_14_0 = null;

        EObject lv_res_alloc_16_0 = null;

        EObject lv_rule_20_0 = null;

        EObject lv_rule_22_0 = null;

        EObject lv_fin_25_0 = null;

        EObject lv_debut_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleActivity122); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity134); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:89:3: otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleActivity147); 

                        	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: ( (lv_periodicite_3_0= rulePeriodicite ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_periodicite_3_0= rulePeriodicite )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_periodicite_3_0= rulePeriodicite )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:3: lv_periodicite_3_0= rulePeriodicite
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicite_in_ruleActivity168);
                    lv_periodicite_3_0=rulePeriodicite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicite",
                            		lv_periodicite_3_0, 
                            		"Periodicite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity183); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity204);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:4: (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:6: otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity219); 

                        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getAtelierKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleActivity231); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity254);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity267); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: ( ruleEString )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity290);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleActivity304); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:3: (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:5: otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleActivity319); 

                        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRes_allocKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity331); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: ( (lv_res_alloc_14_0= ruleRes_Alloc ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:189:3: lv_res_alloc_14_0= ruleRes_Alloc
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity352);
                    lv_res_alloc_14_0=ruleRes_Alloc();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"res_alloc",
                            		lv_res_alloc_14_0, 
                            		"Res_Alloc");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:2: (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:4: otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity365); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:3: lv_res_alloc_16_0= ruleRes_Alloc
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity386);
                    	    lv_res_alloc_16_0=ruleRes_Alloc();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"res_alloc",
                    	            		lv_res_alloc_16_0, 
                    	            		"Res_Alloc");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity400); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:3: (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:5: otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleActivity415); 

                        	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRuleKeyword_6_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity427); 

                        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: ( (lv_rule_20_0= ruleRule ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:3: lv_rule_20_0= ruleRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity448);
                    lv_rule_20_0=ruleRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_20_0, 
                            		"Rule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:2: (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:4: otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) )
                    	    {
                    	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity461); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:1: ( (lv_rule_22_0= ruleRule ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:3: lv_rule_22_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity482);
                    	    lv_rule_22_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rule",
                    	            		lv_rule_22_0, 
                    	            		"Rule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity496); 

                        	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleActivity510); 

                	newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getFinKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:1: ( (lv_fin_25_0= ruleDate ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:3: lv_fin_25_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity531);
            lv_fin_25_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"fin",
                    		lv_fin_25_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_26=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleActivity543); 

                	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getDebutKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:1: ( (lv_debut_27_0= ruleDate ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:3: lv_debut_27_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity564);
            lv_debut_27_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"debut",
                    		lv_debut_27_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_28=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity576); 

                	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString615);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString626); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString666); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString692); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRes_Alloc"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:1: entryRuleRes_Alloc returns [EObject current=null] : iv_ruleRes_Alloc= ruleRes_Alloc EOF ;
    public final EObject entryRuleRes_Alloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRes_Alloc = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:2: (iv_ruleRes_Alloc= ruleRes_Alloc EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:2: iv_ruleRes_Alloc= ruleRes_Alloc EOF
            {
             newCompositeNode(grammarAccess.getRes_AllocRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc737);
            iv_ruleRes_Alloc=ruleRes_Alloc();

            state._fsp--;

             current =iv_ruleRes_Alloc; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRes_Alloc747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRes_Alloc"


    // $ANTLR start "ruleRes_Alloc"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:1: ruleRes_Alloc returns [EObject current=null] : ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRes_Alloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        EObject lv_res_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:28: ( ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:2: () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRes_AllocAccess().getRes_AllocAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRes_Alloc793); 

                	newLeafNode(otherlv_1, grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRes_Alloc805); 

                	newLeafNode(otherlv_2, grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:1: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:3: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRes_Alloc818); 

                        	newLeafNode(otherlv_3, grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: ( (lv_duration_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:1: (lv_duration_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:1: (lv_duration_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:3: lv_duration_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc839);
                    lv_duration_4_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRes_AllocRule());
                    	        }
                           		set(
                           			current, 
                           			"duration",
                            		lv_duration_4_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:4: (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:6: otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRes_Alloc854); 

                        	newLeafNode(otherlv_5, grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: ( (lv_res_type_6_0= ruleResourceType ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:1: (lv_res_type_6_0= ruleResourceType )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:1: (lv_res_type_6_0= ruleResourceType )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:3: lv_res_type_6_0= ruleResourceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_ruleRes_Alloc875);
                    lv_res_type_6_0=ruleResourceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRes_AllocRule());
                    	        }
                           		set(
                           			current, 
                           			"res_type",
                            		lv_res_type_6_0, 
                            		"ResourceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRes_Alloc889); 

                	newLeafNode(otherlv_7, grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRes_Alloc"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule925);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:1: ruleRule returns [EObject current=null] : ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:28: ( ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:2: () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleAccess().getRuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRule981); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule993); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:3: otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRule1006); 

                        	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getPredicatKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRule1018); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule1041);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRule1054); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: ( ruleEString )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule1077);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRule1091); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRule1105); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:547:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate1141);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate1151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_day_4_0 = null;

        Enumerator lv_month_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:28: ( ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDate1197); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate1209); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:3: otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDate1222); 

                        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: ( (lv_day_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_day_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: (lv_day_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:3: lv_day_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleDate1243);
                    lv_day_4_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"day",
                            		lv_day_4_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:4: (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:6: otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDate1258); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getMonthKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: ( (lv_month_6_0= ruleMonth ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_month_6_0= ruleMonth )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_month_6_0= ruleMonth )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:3: lv_month_6_0= ruleMonth
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMonth_in_ruleDate1279);
                    lv_month_6_0=ruleMonth();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"month",
                            		lv_month_6_0, 
                            		"Month");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate1293); 

                	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:628:1: entryRuleAtelier_Impl returns [EObject current=null] : iv_ruleAtelier_Impl= ruleAtelier_Impl EOF ;
    public final EObject entryRuleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelier_Impl = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:2: (iv_ruleAtelier_Impl= ruleAtelier_Impl EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:2: iv_ruleAtelier_Impl= ruleAtelier_Impl EOF
            {
             newCompositeNode(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1329);
            iv_ruleAtelier_Impl=ruleAtelier_Impl();

            state._fsp--;

             current =iv_ruleAtelier_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl1339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtelier_Impl"


    // $ANTLR start "ruleAtelier_Impl"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:1: ruleAtelier_Impl returns [EObject current=null] : ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:640:28: ( ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:2: () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAtelier_Impl1385); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelier_Impl1397); 

                	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAtelier_Impl1410); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtelier_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelier_Impl1433);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtelier_Impl1447); 

                	newLeafNode(otherlv_5, grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtelier_Impl"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1484);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject1495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEIntegerObject1534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEIntegerObject1551); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleResourceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:2: (iv_ruleResourceType= ruleResourceType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_entryRuleResourceType1596);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceType1606); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:1: ruleResourceType returns [EObject current=null] : ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:28: ( ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:2: () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleResourceType1652); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1673);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResourceType1685); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (otherlv_4= 'resource' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:3: otherlv_4= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleResourceType1698); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1721);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResourceType1735); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:1: entryRuleElevage returns [EObject current=null] : iv_ruleElevage= ruleElevage EOF ;
    public final EObject entryRuleElevage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElevage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:801:2: (iv_ruleElevage= ruleElevage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:2: iv_ruleElevage= ruleElevage EOF
            {
             newCompositeNode(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage1775);
            iv_ruleElevage=ruleElevage();

            state._fsp--;

             current =iv_ruleElevage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage1785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElevageAccess().getElevageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleElevage1831); 

                	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElevage1843); 

                	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleElevage1856); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage1879);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElevage1893); 

                	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture1929);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture1939); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCulture1985); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture1997); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCulture2010); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture2033);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCulture2047); 

                	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicite"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: rulePeriodicite returns [Enumerator current=null] : ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) ) ;
    public final Enumerator rulePeriodicite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:28: ( ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:1: ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:1: ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 40:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:2: (enumLiteral_0= 'Daily' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:2: (enumLiteral_0= 'Daily' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:4: enumLiteral_0= 'Daily'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePeriodicite2097); 

                            current = grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:6: (enumLiteral_1= 'Weekly' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:6: (enumLiteral_1= 'Weekly' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:8: enumLiteral_1= 'Weekly'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePeriodicite2114); 

                            current = grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:931:6: (enumLiteral_2= 'Monthly' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:931:6: (enumLiteral_2= 'Monthly' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:931:8: enumLiteral_2= 'Monthly'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePeriodicite2131); 

                            current = grammarAccess.getPeriodiciteAccess().getMonthlyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPeriodiciteAccess().getMonthlyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicite"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:941:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) ) ;
    public final Enumerator ruleMonth() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:28: ( ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) )
            int alt22=12;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 45:
                {
                alt22=4;
                }
                break;
            case 46:
                {
                alt22=5;
                }
                break;
            case 47:
                {
                alt22=6;
                }
                break;
            case 48:
                {
                alt22=7;
                }
                break;
            case 49:
                {
                alt22=8;
                }
                break;
            case 50:
                {
                alt22=9;
                }
                break;
            case 51:
                {
                alt22=10;
                }
                break;
            case 52:
                {
                alt22=11;
                }
                break;
            case 53:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:2: (enumLiteral_0= 'January' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:2: (enumLiteral_0= 'January' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:4: enumLiteral_0= 'January'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMonth2176); 

                            current = grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:6: (enumLiteral_1= 'February' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:6: (enumLiteral_1= 'February' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:8: enumLiteral_1= 'February'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMonth2193); 

                            current = grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:6: (enumLiteral_2= 'March' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:6: (enumLiteral_2= 'March' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:8: enumLiteral_2= 'March'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMonth2210); 

                            current = grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:6: (enumLiteral_3= 'April' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:6: (enumLiteral_3= 'April' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:8: enumLiteral_3= 'April'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMonth2227); 

                            current = grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:6: (enumLiteral_4= 'May' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:6: (enumLiteral_4= 'May' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:8: enumLiteral_4= 'May'
                    {
                    enumLiteral_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMonth2244); 

                            current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:6: (enumLiteral_5= 'June' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:6: (enumLiteral_5= 'June' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:974:8: enumLiteral_5= 'June'
                    {
                    enumLiteral_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMonth2261); 

                            current = grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:6: (enumLiteral_6= 'July' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:6: (enumLiteral_6= 'July' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:8: enumLiteral_6= 'July'
                    {
                    enumLiteral_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMonth2278); 

                            current = grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:6: (enumLiteral_7= 'August' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:6: (enumLiteral_7= 'August' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:8: enumLiteral_7= 'August'
                    {
                    enumLiteral_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMonth2295); 

                            current = grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:6: (enumLiteral_8= 'September' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:6: (enumLiteral_8= 'September' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:8: enumLiteral_8= 'September'
                    {
                    enumLiteral_8=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMonth2312); 

                            current = grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:6: (enumLiteral_9= 'October' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:6: (enumLiteral_9= 'October' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:8: enumLiteral_9= 'October'
                    {
                    enumLiteral_9=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMonth2329); 

                            current = grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:6: (enumLiteral_10= 'November' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:6: (enumLiteral_10= 'November' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:8: enumLiteral_10= 'November'
                    {
                    enumLiteral_10=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMonth2346); 

                            current = grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:6: (enumLiteral_11= 'December' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:6: (enumLiteral_11= 'December' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:8: enumLiteral_11= 'December'
                    {
                    enumLiteral_11=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMonth2363); 

                            current = grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonth"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleActivity122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity134 = new BitSet(new long[]{0x000000000068E000L});
        public static final BitSet FOLLOW_13_in_ruleActivity147 = new BitSet(new long[]{0x0000038000000000L});
        public static final BitSet FOLLOW_rulePeriodicite_in_ruleActivity168 = new BitSet(new long[]{0x000000000068C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity183 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity204 = new BitSet(new long[]{0x0000000000688000L});
        public static final BitSet FOLLOW_15_in_ruleActivity219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleActivity231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity254 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleActivity267 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity290 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleActivity304 = new BitSet(new long[]{0x0000000000680000L});
        public static final BitSet FOLLOW_19_in_ruleActivity319 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity331 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity352 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity365 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity386 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity400 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleActivity415 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity427 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity448 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity461 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity482 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity496 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleActivity510 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity531 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleActivity543 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity564 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleActivity576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRes_Alloc747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRes_Alloc793 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRes_Alloc805 = new BitSet(new long[]{0x0000000006100000L});
        public static final BitSet FOLLOW_25_in_ruleRes_Alloc818 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc839 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleRes_Alloc854 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleResourceType_in_ruleRes_Alloc875 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRes_Alloc889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRule981 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule993 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleRule1006 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRule1018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule1041 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleRule1054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule1077 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleRule1091 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRule1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDate1197 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDate1209 = new BitSet(new long[]{0x00000000C0100000L});
        public static final BitSet FOLLOW_30_in_ruleDate1222 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleDate1243 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_31_in_ruleDate1258 = new BitSet(new long[]{0x003FFC0000000000L});
        public static final BitSet FOLLOW_ruleMonth_in_ruleDate1279 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDate1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAtelier_Impl1385 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelier_Impl1397 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleAtelier_Impl1410 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelier_Impl1433 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAtelier_Impl1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEIntegerObject1534 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_entryRuleResourceType1596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceType1606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleResourceType1652 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1673 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResourceType1685 = new BitSet(new long[]{0x0000001000100000L});
        public static final BitSet FOLLOW_36_in_ruleResourceType1698 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1721 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleResourceType1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage1775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleElevage1831 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage1843 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleElevage1856 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage1879 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleElevage1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture1929 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture1939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCulture1985 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture1997 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleCulture2010 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture2033 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCulture2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePeriodicite2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePeriodicite2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePeriodicite2131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleMonth2176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMonth2193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMonth2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMonth2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleMonth2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMonth2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMonth2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleMonth2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMonth2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleMonth2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMonth2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMonth2363 = new BitSet(new long[]{0x0000000000000002L});
    }


}