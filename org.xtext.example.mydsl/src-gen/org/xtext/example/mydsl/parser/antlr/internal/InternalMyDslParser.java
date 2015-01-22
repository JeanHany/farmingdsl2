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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'{'", "'periodicite'", "'activites'", "'atelier'", "'('", "','", "')'", "'res_alloc'", "'}'", "'rule'", "'fin'", "'debut'", "'Res_Alloc'", "'duration'", "'res_type'", "'Rule'", "'predicat'", "'Date'", "'day'", "'month'", "'Atelier'", "'activity'", "'-'", "'ResourceType'", "'resource'", "'Elevage'", "'animals'", "'Culture'", "'cereals'", "'Daily'", "'Weekly'", "'Monthly'", "'labour'", "'semis'", "'irrigatgion'", "'fertilisation'", "'recolte'", "'ALIMENTATION'", "'traite'", "'surveillanceagnelage'", "'surveillangevelage'", "'January'", "'February'", "'March'", "'April'", "'May'", "'June'", "'July'", "'August'", "'September'", "'October'", "'November'", "'December'", "'Ovin'", "'Bovin'", "'Corn'", "'Wheat'", "'Sorghum'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) ) (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )* ;
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

        Enumerator lv_activites_5_0 = null;

        EObject lv_res_alloc_14_0 = null;

        EObject lv_res_alloc_16_0 = null;

        EObject lv_rule_20_0 = null;

        EObject lv_rule_22_0 = null;

        EObject lv_fin_25_0 = null;

        EObject lv_debut_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) ) (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) ) (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) ) (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) ) (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}'
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

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:4: (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:6: otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity183); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getActivitesKeyword_3_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ( (lv_activites_5_0= ruleActivites ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_activites_5_0= ruleActivites )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_activites_5_0= ruleActivites )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:3: lv_activites_5_0= ruleActivites
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleActivites_in_ruleActivity204);
            	    lv_activites_5_0=ruleActivites();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activites",
            	            		lv_activites_5_0, 
            	            		"Activites");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:3: (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:5: otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
            	            {
            	            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity218); 

            	                	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getAtelierKeyword_4_0());
            	                
            	            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleActivity230); 

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
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity253);
            	            ruleEString();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( (LA2_0==17) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:4: otherlv_9= ',' ( ( ruleEString ) )
            	            	    {
            	            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity266); 

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
            	            	    	    
            	            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity289);
            	            	    ruleEString();

            	            	    state._fsp--;

            	            	     
            	            	    	        afterParserOrEnumRuleCall();
            	            	    	    

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop2;
            	                }
            	            } while (true);

            	            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleActivity303); 

            	                	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:3: (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==19) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:5: otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}'
            	            {
            	            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleActivity318); 

            	                	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRes_allocKeyword_5_0());
            	                
            	            otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity330); 

            	                	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
            	                
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: ( (lv_res_alloc_14_0= ruleRes_Alloc ) )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:189:3: lv_res_alloc_14_0= ruleRes_Alloc
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity351);
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
            	            loop4:
            	            do {
            	                int alt4=2;
            	                int LA4_0 = input.LA(1);

            	                if ( (LA4_0==17) ) {
            	                    alt4=1;
            	                }


            	                switch (alt4) {
            	            	case 1 :
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:4: otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
            	            	    {
            	            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity364); 

            	            	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
            	            	        
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
            	            	    {
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:3: lv_res_alloc_16_0= ruleRes_Alloc
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
            	            	    	    
            	            	    pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity385);
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
            	            	    break loop4;
            	                }
            	            } while (true);

            	            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity399); 

            	                	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:3: (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:5: otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}'
            	            {
            	            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleActivity414); 

            	                	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRuleKeyword_6_0());
            	                
            	            otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity426); 

            	                	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
            	                
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: ( (lv_rule_20_0= ruleRule ) )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:3: lv_rule_20_0= ruleRule
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity447);
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
            	            loop6:
            	            do {
            	                int alt6=2;
            	                int LA6_0 = input.LA(1);

            	                if ( (LA6_0==17) ) {
            	                    alt6=1;
            	                }


            	                switch (alt6) {
            	            	case 1 :
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:4: otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity460); 

            	            	        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
            	            	        
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:1: ( (lv_rule_22_0= ruleRule ) )
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
            	            	    {
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
            	            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:3: lv_rule_22_0= ruleRule
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
            	            	    	    
            	            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity481);
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
            	            	    break loop6;
            	                }
            	            } while (true);

            	            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity495); 

            	                	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
            	                

            	            }
            	            break;

            	    }

            	    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleActivity509); 

            	        	newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getFinKeyword_7());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:1: ( (lv_fin_25_0= ruleDate ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:3: lv_fin_25_0= ruleDate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity530);
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

            	    otherlv_26=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleActivity542); 

            	        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getDebutKeyword_9());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:1: ( (lv_debut_27_0= ruleDate ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:3: lv_debut_27_0= ruleDate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity563);
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

            	    otherlv_28=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity575); 

            	        	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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


    // $ANTLR start "entryRuleRes_Alloc"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: entryRuleRes_Alloc returns [EObject current=null] : iv_ruleRes_Alloc= ruleRes_Alloc EOF ;
    public final EObject entryRuleRes_Alloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRes_Alloc = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:2: (iv_ruleRes_Alloc= ruleRes_Alloc EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:2: iv_ruleRes_Alloc= ruleRes_Alloc EOF
            {
             newCompositeNode(grammarAccess.getRes_AllocRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc614);
            iv_ruleRes_Alloc=ruleRes_Alloc();

            state._fsp--;

             current =iv_ruleRes_Alloc; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRes_Alloc624); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: ruleRes_Alloc returns [EObject current=null] : ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:28: ( ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRes_AllocAccess().getRes_AllocAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRes_Alloc670); 

                	newLeafNode(otherlv_1, grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRes_Alloc682); 

                	newLeafNode(otherlv_2, grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:3: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRes_Alloc695); 

                        	newLeafNode(otherlv_3, grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: ( (lv_duration_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_duration_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_duration_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:3: lv_duration_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc716);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:4: (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:6: otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRes_Alloc731); 

                        	newLeafNode(otherlv_5, grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: ( (lv_res_type_6_0= ruleResourceType ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_res_type_6_0= ruleResourceType )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_res_type_6_0= ruleResourceType )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:3: lv_res_type_6_0= ruleResourceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_ruleRes_Alloc752);
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

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRes_Alloc766); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule802);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule812); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: ruleRule returns [EObject current=null] : ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:28: ( ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:2: () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleAccess().getRuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRule858); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule870); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:1: (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:3: otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRule883); 

                        	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getPredicatKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRule895); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule918);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRule931); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ( ruleEString )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule954);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRule968); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRule982); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate1018);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate1028); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:28: ( ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDate1074); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate1086); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:3: otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDate1099); 

                        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: ( (lv_day_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_day_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_day_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:3: lv_day_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleDate1120);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:4: (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:6: otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDate1135); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getMonthKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: ( (lv_month_6_0= ruleMonth ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_month_6_0= ruleMonth )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_month_6_0= ruleMonth )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:3: lv_month_6_0= ruleMonth
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMonth_in_ruleDate1156);
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

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate1170); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: entryRuleAtelier_Impl returns [EObject current=null] : iv_ruleAtelier_Impl= ruleAtelier_Impl EOF ;
    public final EObject entryRuleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelier_Impl = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:2: (iv_ruleAtelier_Impl= ruleAtelier_Impl EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: iv_ruleAtelier_Impl= ruleAtelier_Impl EOF
            {
             newCompositeNode(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1206);
            iv_ruleAtelier_Impl=ruleAtelier_Impl();

            state._fsp--;

             current =iv_ruleAtelier_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl1216); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:1: ruleAtelier_Impl returns [EObject current=null] : ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:28: ( ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:2: () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAtelier_Impl1262); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelier_Impl1274); 

                	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:619:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:619:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAtelier_Impl1287); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtelier_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelier_Impl1310);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtelier_Impl1324); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1361);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject1372); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:2: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEIntegerObject1411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEIntegerObject1428); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:2: (iv_ruleResourceType= ruleResourceType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_entryRuleResourceType1473);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceType1483); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:1: ruleResourceType returns [EObject current=null] : ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:696:28: ( ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:2: () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleResourceType1529); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1550);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResourceType1562); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:1: (otherlv_4= 'resource' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:3: otherlv_4= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleResourceType1575); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1598);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResourceType1612); 

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1649);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1660); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1700); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1726); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_animals_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}'
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:3: otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) )
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleElevage1856); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getAnimalsKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: ( (lv_animals_4_0= ruleAnimals ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: (lv_animals_4_0= ruleAnimals )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: (lv_animals_4_0= ruleAnimals )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: lv_animals_4_0= ruleAnimals
                    {
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnimals_in_ruleElevage1877);
                    lv_animals_4_0=ruleAnimals();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElevageRule());
                    	        }
                           		set(
                           			current, 
                           			"animals",
                            		lv_animals_4_0, 
                            		"Animals");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:4: (otherlv_5= 'activity' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:6: otherlv_5= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleElevage1892); 

                        	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getActivityKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage1915);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElevage1929); 

                	newLeafNode(otherlv_7, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:882:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture1965);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture1975); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_cereals_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCulture2021); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture2033); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:3: otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) )
                    {
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCulture2046); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getCerealsKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: ( (lv_cereals_4_0= ruleCereal ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_cereals_4_0= ruleCereal )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_cereals_4_0= ruleCereal )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:3: lv_cereals_4_0= ruleCereal
                    {
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCereal_in_ruleCulture2067);
                    lv_cereals_4_0=ruleCereal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCultureRule());
                    	        }
                           		set(
                           			current, 
                           			"cereals",
                            		lv_cereals_4_0, 
                            		"Cereal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:4: (otherlv_5= 'activity' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:6: otherlv_5= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCulture2082); 

                        	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getActivityKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture2105);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCulture2119); 

                	newLeafNode(otherlv_7, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:1: rulePeriodicite returns [Enumerator current=null] : ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) ) ;
    public final Enumerator rulePeriodicite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:28: ( ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: ( (enumLiteral_0= 'Daily' ) | (enumLiteral_1= 'Weekly' ) | (enumLiteral_2= 'Monthly' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt23=1;
                }
                break;
            case 42:
                {
                alt23=2;
                }
                break;
            case 43:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:2: (enumLiteral_0= 'Daily' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:2: (enumLiteral_0= 'Daily' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:4: enumLiteral_0= 'Daily'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePeriodicite2169); 

                            current = grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodiciteAccess().getDailyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:6: (enumLiteral_1= 'Weekly' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:6: (enumLiteral_1= 'Weekly' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:8: enumLiteral_1= 'Weekly'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePeriodicite2186); 

                            current = grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodiciteAccess().getWeeklyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:6: (enumLiteral_2= 'Monthly' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:6: (enumLiteral_2= 'Monthly' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:975:8: enumLiteral_2= 'Monthly'
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePeriodicite2203); 

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


    // $ANTLR start "ruleActivites"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:985:1: ruleActivites returns [Enumerator current=null] : ( (enumLiteral_0= 'labour' ) | (enumLiteral_1= 'semis' ) | (enumLiteral_2= 'irrigatgion' ) | (enumLiteral_3= 'fertilisation' ) | (enumLiteral_4= 'recolte' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'traite' ) | (enumLiteral_7= 'surveillanceagnelage' ) | (enumLiteral_8= 'surveillangevelage' ) ) ;
    public final Enumerator ruleActivites() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:28: ( ( (enumLiteral_0= 'labour' ) | (enumLiteral_1= 'semis' ) | (enumLiteral_2= 'irrigatgion' ) | (enumLiteral_3= 'fertilisation' ) | (enumLiteral_4= 'recolte' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'traite' ) | (enumLiteral_7= 'surveillanceagnelage' ) | (enumLiteral_8= 'surveillangevelage' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: ( (enumLiteral_0= 'labour' ) | (enumLiteral_1= 'semis' ) | (enumLiteral_2= 'irrigatgion' ) | (enumLiteral_3= 'fertilisation' ) | (enumLiteral_4= 'recolte' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'traite' ) | (enumLiteral_7= 'surveillanceagnelage' ) | (enumLiteral_8= 'surveillangevelage' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: ( (enumLiteral_0= 'labour' ) | (enumLiteral_1= 'semis' ) | (enumLiteral_2= 'irrigatgion' ) | (enumLiteral_3= 'fertilisation' ) | (enumLiteral_4= 'recolte' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'traite' ) | (enumLiteral_7= 'surveillanceagnelage' ) | (enumLiteral_8= 'surveillangevelage' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt24=1;
                }
                break;
            case 45:
                {
                alt24=2;
                }
                break;
            case 46:
                {
                alt24=3;
                }
                break;
            case 47:
                {
                alt24=4;
                }
                break;
            case 48:
                {
                alt24=5;
                }
                break;
            case 49:
                {
                alt24=6;
                }
                break;
            case 50:
                {
                alt24=7;
                }
                break;
            case 51:
                {
                alt24=8;
                }
                break;
            case 52:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:2: (enumLiteral_0= 'labour' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:2: (enumLiteral_0= 'labour' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:4: enumLiteral_0= 'labour'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleActivites2248); 

                            current = grammarAccess.getActivitesAccess().getLabourEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getActivitesAccess().getLabourEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:6: (enumLiteral_1= 'semis' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:6: (enumLiteral_1= 'semis' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:8: enumLiteral_1= 'semis'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleActivites2265); 

                            current = grammarAccess.getActivitesAccess().getSemisEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getActivitesAccess().getSemisEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:6: (enumLiteral_2= 'irrigatgion' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:6: (enumLiteral_2= 'irrigatgion' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:8: enumLiteral_2= 'irrigatgion'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleActivites2282); 

                            current = grammarAccess.getActivitesAccess().getIrrigatgionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getActivitesAccess().getIrrigatgionEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:6: (enumLiteral_3= 'fertilisation' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:6: (enumLiteral_3= 'fertilisation' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:8: enumLiteral_3= 'fertilisation'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleActivites2299); 

                            current = grammarAccess.getActivitesAccess().getFertilisationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getActivitesAccess().getFertilisationEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:6: (enumLiteral_4= 'recolte' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:6: (enumLiteral_4= 'recolte' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:8: enumLiteral_4= 'recolte'
                    {
                    enumLiteral_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleActivites2316); 

                            current = grammarAccess.getActivitesAccess().getRecolteEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getActivitesAccess().getRecolteEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:6: (enumLiteral_5= 'ALIMENTATION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:6: (enumLiteral_5= 'ALIMENTATION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:8: enumLiteral_5= 'ALIMENTATION'
                    {
                    enumLiteral_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleActivites2333); 

                            current = grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:6: (enumLiteral_6= 'traite' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:6: (enumLiteral_6= 'traite' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:8: enumLiteral_6= 'traite'
                    {
                    enumLiteral_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleActivites2350); 

                            current = grammarAccess.getActivitesAccess().getTraiteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getActivitesAccess().getTraiteEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:6: (enumLiteral_7= 'surveillanceagnelage' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:6: (enumLiteral_7= 'surveillanceagnelage' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:8: enumLiteral_7= 'surveillanceagnelage'
                    {
                    enumLiteral_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleActivites2367); 

                            current = grammarAccess.getActivitesAccess().getSurveillanceagnelageEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getActivitesAccess().getSurveillanceagnelageEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:6: (enumLiteral_8= 'surveillangevelage' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:6: (enumLiteral_8= 'surveillangevelage' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:8: enumLiteral_8= 'surveillangevelage'
                    {
                    enumLiteral_8=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleActivites2384); 

                            current = grammarAccess.getActivitesAccess().getSurveillangevelageEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getActivitesAccess().getSurveillangevelageEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleActivites"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1046:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:28: ( ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: ( (enumLiteral_0= 'January' ) | (enumLiteral_1= 'February' ) | (enumLiteral_2= 'March' ) | (enumLiteral_3= 'April' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'June' ) | (enumLiteral_6= 'July' ) | (enumLiteral_7= 'August' ) | (enumLiteral_8= 'September' ) | (enumLiteral_9= 'October' ) | (enumLiteral_10= 'November' ) | (enumLiteral_11= 'December' ) )
            int alt25=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt25=1;
                }
                break;
            case 54:
                {
                alt25=2;
                }
                break;
            case 55:
                {
                alt25=3;
                }
                break;
            case 56:
                {
                alt25=4;
                }
                break;
            case 57:
                {
                alt25=5;
                }
                break;
            case 58:
                {
                alt25=6;
                }
                break;
            case 59:
                {
                alt25=7;
                }
                break;
            case 60:
                {
                alt25=8;
                }
                break;
            case 61:
                {
                alt25=9;
                }
                break;
            case 62:
                {
                alt25=10;
                }
                break;
            case 63:
                {
                alt25=11;
                }
                break;
            case 64:
                {
                alt25=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:2: (enumLiteral_0= 'January' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:2: (enumLiteral_0= 'January' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:4: enumLiteral_0= 'January'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMonth2429); 

                            current = grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:6: (enumLiteral_1= 'February' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:6: (enumLiteral_1= 'February' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:8: enumLiteral_1= 'February'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMonth2446); 

                            current = grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:6: (enumLiteral_2= 'March' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:6: (enumLiteral_2= 'March' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:8: enumLiteral_2= 'March'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMonth2463); 

                            current = grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:6: (enumLiteral_3= 'April' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:6: (enumLiteral_3= 'April' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:8: enumLiteral_3= 'April'
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMonth2480); 

                            current = grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:6: (enumLiteral_4= 'May' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:6: (enumLiteral_4= 'May' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:8: enumLiteral_4= 'May'
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMonth2497); 

                            current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:6: (enumLiteral_5= 'June' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:6: (enumLiteral_5= 'June' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:8: enumLiteral_5= 'June'
                    {
                    enumLiteral_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMonth2514); 

                            current = grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:6: (enumLiteral_6= 'July' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:6: (enumLiteral_6= 'July' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:8: enumLiteral_6= 'July'
                    {
                    enumLiteral_6=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMonth2531); 

                            current = grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:6: (enumLiteral_7= 'August' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:6: (enumLiteral_7= 'August' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:8: enumLiteral_7= 'August'
                    {
                    enumLiteral_7=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleMonth2548); 

                            current = grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:6: (enumLiteral_8= 'September' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:6: (enumLiteral_8= 'September' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:8: enumLiteral_8= 'September'
                    {
                    enumLiteral_8=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMonth2565); 

                            current = grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:6: (enumLiteral_9= 'October' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:6: (enumLiteral_9= 'October' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:8: enumLiteral_9= 'October'
                    {
                    enumLiteral_9=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMonth2582); 

                            current = grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:6: (enumLiteral_10= 'November' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:6: (enumLiteral_10= 'November' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:8: enumLiteral_10= 'November'
                    {
                    enumLiteral_10=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleMonth2599); 

                            current = grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:6: (enumLiteral_11= 'December' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:6: (enumLiteral_11= 'December' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:8: enumLiteral_11= 'December'
                    {
                    enumLiteral_11=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMonth2616); 

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


    // $ANTLR start "ruleAnimals"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: ruleAnimals returns [Enumerator current=null] : ( (enumLiteral_0= 'Ovin' ) | (enumLiteral_1= 'Bovin' ) ) ;
    public final Enumerator ruleAnimals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:28: ( ( (enumLiteral_0= 'Ovin' ) | (enumLiteral_1= 'Bovin' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ( (enumLiteral_0= 'Ovin' ) | (enumLiteral_1= 'Bovin' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ( (enumLiteral_0= 'Ovin' ) | (enumLiteral_1= 'Bovin' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==65) ) {
                alt26=1;
            }
            else if ( (LA26_0==66) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:2: (enumLiteral_0= 'Ovin' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:2: (enumLiteral_0= 'Ovin' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:4: enumLiteral_0= 'Ovin'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleAnimals2661); 

                            current = grammarAccess.getAnimalsAccess().getOvinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnimalsAccess().getOvinEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:6: (enumLiteral_1= 'Bovin' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:6: (enumLiteral_1= 'Bovin' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:8: enumLiteral_1= 'Bovin'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleAnimals2678); 

                            current = grammarAccess.getAnimalsAccess().getBovinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnimalsAccess().getBovinEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleAnimals"


    // $ANTLR start "ruleCereal"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1144:1: ruleCereal returns [Enumerator current=null] : ( (enumLiteral_0= 'Corn' ) | (enumLiteral_1= 'Wheat' ) | (enumLiteral_2= 'Sorghum' ) ) ;
    public final Enumerator ruleCereal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1146:28: ( ( (enumLiteral_0= 'Corn' ) | (enumLiteral_1= 'Wheat' ) | (enumLiteral_2= 'Sorghum' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: ( (enumLiteral_0= 'Corn' ) | (enumLiteral_1= 'Wheat' ) | (enumLiteral_2= 'Sorghum' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: ( (enumLiteral_0= 'Corn' ) | (enumLiteral_1= 'Wheat' ) | (enumLiteral_2= 'Sorghum' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt27=1;
                }
                break;
            case 68:
                {
                alt27=2;
                }
                break;
            case 69:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:2: (enumLiteral_0= 'Corn' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:2: (enumLiteral_0= 'Corn' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:4: enumLiteral_0= 'Corn'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCereal2723); 

                            current = grammarAccess.getCerealAccess().getCornEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCerealAccess().getCornEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:6: (enumLiteral_1= 'Wheat' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:6: (enumLiteral_1= 'Wheat' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:8: enumLiteral_1= 'Wheat'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCereal2740); 

                            current = grammarAccess.getCerealAccess().getWheatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCerealAccess().getWheatEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:6: (enumLiteral_2= 'Sorghum' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:6: (enumLiteral_2= 'Sorghum' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:8: enumLiteral_2= 'Sorghum'
                    {
                    enumLiteral_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCereal2757); 

                            current = grammarAccess.getCerealAccess().getSorghumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCerealAccess().getSorghumEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleCereal"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleActivity122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity134 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleActivity147 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_rulePeriodicite_in_ruleActivity168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleActivity183 = new BitSet(new long[]{0x001FF00000000000L});
        public static final BitSet FOLLOW_ruleActivites_in_ruleActivity204 = new BitSet(new long[]{0x0000000000688000L});
        public static final BitSet FOLLOW_15_in_ruleActivity218 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleActivity230 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity253 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleActivity266 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity289 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleActivity303 = new BitSet(new long[]{0x0000000000680000L});
        public static final BitSet FOLLOW_19_in_ruleActivity318 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity330 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity351 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity364 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity385 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity399 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleActivity414 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity426 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity447 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity460 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity481 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity495 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleActivity509 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity530 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleActivity542 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity563 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleActivity575 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRes_Alloc624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRes_Alloc670 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRes_Alloc682 = new BitSet(new long[]{0x0000000006100000L});
        public static final BitSet FOLLOW_25_in_ruleRes_Alloc695 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc716 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleRes_Alloc731 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleResourceType_in_ruleRes_Alloc752 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRes_Alloc766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRule858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule870 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleRule883 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRule895 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule918 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleRule931 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule954 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleRule968 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRule982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDate1074 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDate1086 = new BitSet(new long[]{0x00000000C0100000L});
        public static final BitSet FOLLOW_30_in_ruleDate1099 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleDate1120 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_31_in_ruleDate1135 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMonth_in_ruleDate1156 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDate1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAtelier_Impl1262 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelier_Impl1274 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleAtelier_Impl1287 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelier_Impl1310 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAtelier_Impl1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEIntegerObject1411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_entryRuleResourceType1473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceType1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleResourceType1529 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1550 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResourceType1562 = new BitSet(new long[]{0x0000001000100000L});
        public static final BitSet FOLLOW_36_in_ruleResourceType1575 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1598 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleResourceType1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage1775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleElevage1831 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage1843 = new BitSet(new long[]{0x0000004200100000L});
        public static final BitSet FOLLOW_38_in_ruleElevage1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleAnimals_in_ruleElevage1877 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleElevage1892 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage1915 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleElevage1929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture1965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCulture2021 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture2033 = new BitSet(new long[]{0x0000010200100000L});
        public static final BitSet FOLLOW_40_in_ruleCulture2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
        public static final BitSet FOLLOW_ruleCereal_in_ruleCulture2067 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleCulture2082 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture2105 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCulture2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePeriodicite2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePeriodicite2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePeriodicite2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleActivites2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleActivites2265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleActivites2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleActivites2299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleActivites2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleActivites2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleActivites2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleActivites2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleActivites2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMonth2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMonth2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMonth2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMonth2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMonth2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMonth2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMonth2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleMonth2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleMonth2565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMonth2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleMonth2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMonth2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleAnimals2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleAnimals2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCereal2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCereal2740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleCereal2757 = new BitSet(new long[]{0x0000000000000002L});
    }


}