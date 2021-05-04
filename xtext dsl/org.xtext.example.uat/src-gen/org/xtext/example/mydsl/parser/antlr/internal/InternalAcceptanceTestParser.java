package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.AcceptanceTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAcceptanceTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'item'", "'x'", "'send'", "'order'", "'query'", "'case:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAcceptanceTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAcceptanceTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAcceptanceTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAcceptanceTest.g"; }



     	private AcceptanceTestGrammarAccess grammarAccess;

        public InternalAcceptanceTestParser(TokenStream input, AcceptanceTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AcceptanceTest";
       	}

       	@Override
       	protected AcceptanceTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAcceptanceTest"
    // InternalAcceptanceTest.g:64:1: entryRuleAcceptanceTest returns [EObject current=null] : iv_ruleAcceptanceTest= ruleAcceptanceTest EOF ;
    public final EObject entryRuleAcceptanceTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTest = null;


        try {
            // InternalAcceptanceTest.g:64:55: (iv_ruleAcceptanceTest= ruleAcceptanceTest EOF )
            // InternalAcceptanceTest.g:65:2: iv_ruleAcceptanceTest= ruleAcceptanceTest EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTest=ruleAcceptanceTest();

            state._fsp--;

             current =iv_ruleAcceptanceTest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAcceptanceTest"


    // $ANTLR start "ruleAcceptanceTest"
    // InternalAcceptanceTest.g:71:1: ruleAcceptanceTest returns [EObject current=null] : ( (lv_tests_0_0= ruleTestCase ) )* ;
    public final EObject ruleAcceptanceTest() throws RecognitionException {
        EObject current = null;

        EObject lv_tests_0_0 = null;



        	enterRule();

        try {
            // InternalAcceptanceTest.g:77:2: ( ( (lv_tests_0_0= ruleTestCase ) )* )
            // InternalAcceptanceTest.g:78:2: ( (lv_tests_0_0= ruleTestCase ) )*
            {
            // InternalAcceptanceTest.g:78:2: ( (lv_tests_0_0= ruleTestCase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAcceptanceTest.g:79:3: (lv_tests_0_0= ruleTestCase )
            	    {
            	    // InternalAcceptanceTest.g:79:3: (lv_tests_0_0= ruleTestCase )
            	    // InternalAcceptanceTest.g:80:4: lv_tests_0_0= ruleTestCase
            	    {

            	    				newCompositeNode(grammarAccess.getAcceptanceTestAccess().getTestsTestCaseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tests_0_0=ruleTestCase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAcceptanceTestRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tests",
            	    					lv_tests_0_0,
            	    					"org.xtext.example.mydsl.AcceptanceTest.TestCase");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleAcceptanceTest"


    // $ANTLR start "entryRuleItem"
    // InternalAcceptanceTest.g:100:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalAcceptanceTest.g:100:45: (iv_ruleItem= ruleItem EOF )
            // InternalAcceptanceTest.g:101:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalAcceptanceTest.g:107:1: ruleItem returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x' ( (lv_quantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;


        	enterRule();

        try {
            // InternalAcceptanceTest.g:113:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x' ( (lv_quantity_3_0= RULE_INT ) ) ) )
            // InternalAcceptanceTest.g:114:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x' ( (lv_quantity_3_0= RULE_INT ) ) )
            {
            // InternalAcceptanceTest.g:114:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x' ( (lv_quantity_3_0= RULE_INT ) ) )
            // InternalAcceptanceTest.g:115:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'x' ( (lv_quantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		
            // InternalAcceptanceTest.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAcceptanceTest.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAcceptanceTest.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalAcceptanceTest.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getXKeyword_2());
            		
            // InternalAcceptanceTest.g:141:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalAcceptanceTest.g:142:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalAcceptanceTest.g:142:4: (lv_quantity_3_0= RULE_INT )
            // InternalAcceptanceTest.g:143:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getItemAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleAction"
    // InternalAcceptanceTest.g:163:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAcceptanceTest.g:163:47: (iv_ruleAction= ruleAction EOF )
            // InternalAcceptanceTest.g:164:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAcceptanceTest.g:170:1: ruleAction returns [EObject current=null] : ( ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_1=null;
        Token lv_action_0_2=null;
        Token lv_action_0_3=null;


        	enterRule();

        try {
            // InternalAcceptanceTest.g:176:2: ( ( ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) ) ) )
            // InternalAcceptanceTest.g:177:2: ( ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) ) )
            {
            // InternalAcceptanceTest.g:177:2: ( ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) ) )
            // InternalAcceptanceTest.g:178:3: ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) )
            {
            // InternalAcceptanceTest.g:178:3: ( (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' ) )
            // InternalAcceptanceTest.g:179:4: (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' )
            {
            // InternalAcceptanceTest.g:179:4: (lv_action_0_1= 'send' | lv_action_0_2= 'order' | lv_action_0_3= 'query' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAcceptanceTest.g:180:5: lv_action_0_1= 'send'
                    {
                    lv_action_0_1=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_action_0_1, grammarAccess.getActionAccess().getActionSendKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "action", lv_action_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAcceptanceTest.g:191:5: lv_action_0_2= 'order'
                    {
                    lv_action_0_2=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_action_0_2, grammarAccess.getActionAccess().getActionOrderKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "action", lv_action_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAcceptanceTest.g:202:5: lv_action_0_3= 'query'
                    {
                    lv_action_0_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_action_0_3, grammarAccess.getActionAccess().getActionQueryKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "action", lv_action_0_3, null);
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTestCase"
    // InternalAcceptanceTest.g:218:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // InternalAcceptanceTest.g:218:49: (iv_ruleTestCase= ruleTestCase EOF )
            // InternalAcceptanceTest.g:219:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalAcceptanceTest.g:225:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'case:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAcceptanceTest.g:231:2: ( (otherlv_0= 'case:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalAcceptanceTest.g:232:2: (otherlv_0= 'case:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalAcceptanceTest.g:232:2: (otherlv_0= 'case:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalAcceptanceTest.g:233:3: otherlv_0= 'case:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getCaseKeyword_0());
            		
            // InternalAcceptanceTest.g:237:3: ( (otherlv_1= RULE_ID ) )
            // InternalAcceptanceTest.g:238:4: (otherlv_1= RULE_ID )
            {
            // InternalAcceptanceTest.g:238:4: (otherlv_1= RULE_ID )
            // InternalAcceptanceTest.g:239:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getTestCaseAccess().getGivenCaseCrossReference_1_0());
            				

            }


            }

            // InternalAcceptanceTest.g:250:3: ( (otherlv_2= RULE_ID ) )
            // InternalAcceptanceTest.g:251:4: (otherlv_2= RULE_ID )
            {
            // InternalAcceptanceTest.g:251:4: (otherlv_2= RULE_ID )
            // InternalAcceptanceTest.g:252:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestCaseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getTestCaseAccess().getWhenConditionCrossReference_2_0());
            				

            }


            }

            // InternalAcceptanceTest.g:263:3: ( (otherlv_3= RULE_ID ) )
            // InternalAcceptanceTest.g:264:4: (otherlv_3= RULE_ID )
            {
            // InternalAcceptanceTest.g:264:4: (otherlv_3= RULE_ID )
            // InternalAcceptanceTest.g:265:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestCaseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTestCaseAccess().getThenOutcomeCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleTestCase"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}