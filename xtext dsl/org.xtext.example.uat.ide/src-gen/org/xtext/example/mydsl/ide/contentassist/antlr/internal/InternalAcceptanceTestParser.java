package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.AcceptanceTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAcceptanceTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'send'", "'order'", "'query'", "'item'", "'x'", "'case:'"
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

    	public void setGrammarAccess(AcceptanceTestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAcceptanceTest"
    // InternalAcceptanceTest.g:53:1: entryRuleAcceptanceTest : ruleAcceptanceTest EOF ;
    public final void entryRuleAcceptanceTest() throws RecognitionException {
        try {
            // InternalAcceptanceTest.g:54:1: ( ruleAcceptanceTest EOF )
            // InternalAcceptanceTest.g:55:1: ruleAcceptanceTest EOF
            {
             before(grammarAccess.getAcceptanceTestRule()); 
            pushFollow(FOLLOW_1);
            ruleAcceptanceTest();

            state._fsp--;

             after(grammarAccess.getAcceptanceTestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAcceptanceTest"


    // $ANTLR start "ruleAcceptanceTest"
    // InternalAcceptanceTest.g:62:1: ruleAcceptanceTest : ( ( rule__AcceptanceTest__TestsAssignment )* ) ;
    public final void ruleAcceptanceTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:66:2: ( ( ( rule__AcceptanceTest__TestsAssignment )* ) )
            // InternalAcceptanceTest.g:67:2: ( ( rule__AcceptanceTest__TestsAssignment )* )
            {
            // InternalAcceptanceTest.g:67:2: ( ( rule__AcceptanceTest__TestsAssignment )* )
            // InternalAcceptanceTest.g:68:3: ( rule__AcceptanceTest__TestsAssignment )*
            {
             before(grammarAccess.getAcceptanceTestAccess().getTestsAssignment()); 
            // InternalAcceptanceTest.g:69:3: ( rule__AcceptanceTest__TestsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAcceptanceTest.g:69:4: rule__AcceptanceTest__TestsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AcceptanceTest__TestsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAcceptanceTestAccess().getTestsAssignment()); 

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
    // $ANTLR end "ruleAcceptanceTest"


    // $ANTLR start "entryRuleItem"
    // InternalAcceptanceTest.g:78:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalAcceptanceTest.g:79:1: ( ruleItem EOF )
            // InternalAcceptanceTest.g:80:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalAcceptanceTest.g:87:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:91:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalAcceptanceTest.g:92:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalAcceptanceTest.g:92:2: ( ( rule__Item__Group__0 ) )
            // InternalAcceptanceTest.g:93:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalAcceptanceTest.g:94:3: ( rule__Item__Group__0 )
            // InternalAcceptanceTest.g:94:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleAction"
    // InternalAcceptanceTest.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalAcceptanceTest.g:104:1: ( ruleAction EOF )
            // InternalAcceptanceTest.g:105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAcceptanceTest.g:112:1: ruleAction : ( ( rule__Action__ActionAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:116:2: ( ( ( rule__Action__ActionAssignment ) ) )
            // InternalAcceptanceTest.g:117:2: ( ( rule__Action__ActionAssignment ) )
            {
            // InternalAcceptanceTest.g:117:2: ( ( rule__Action__ActionAssignment ) )
            // InternalAcceptanceTest.g:118:3: ( rule__Action__ActionAssignment )
            {
             before(grammarAccess.getActionAccess().getActionAssignment()); 
            // InternalAcceptanceTest.g:119:3: ( rule__Action__ActionAssignment )
            // InternalAcceptanceTest.g:119:4: rule__Action__ActionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTestCase"
    // InternalAcceptanceTest.g:128:1: entryRuleTestCase : ruleTestCase EOF ;
    public final void entryRuleTestCase() throws RecognitionException {
        try {
            // InternalAcceptanceTest.g:129:1: ( ruleTestCase EOF )
            // InternalAcceptanceTest.g:130:1: ruleTestCase EOF
            {
             before(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getTestCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalAcceptanceTest.g:137:1: ruleTestCase : ( ( rule__TestCase__Group__0 ) ) ;
    public final void ruleTestCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:141:2: ( ( ( rule__TestCase__Group__0 ) ) )
            // InternalAcceptanceTest.g:142:2: ( ( rule__TestCase__Group__0 ) )
            {
            // InternalAcceptanceTest.g:142:2: ( ( rule__TestCase__Group__0 ) )
            // InternalAcceptanceTest.g:143:3: ( rule__TestCase__Group__0 )
            {
             before(grammarAccess.getTestCaseAccess().getGroup()); 
            // InternalAcceptanceTest.g:144:3: ( rule__TestCase__Group__0 )
            // InternalAcceptanceTest.g:144:4: rule__TestCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "rule__Action__ActionAlternatives_0"
    // InternalAcceptanceTest.g:152:1: rule__Action__ActionAlternatives_0 : ( ( 'send' ) | ( 'order' ) | ( 'query' ) );
    public final void rule__Action__ActionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:156:1: ( ( 'send' ) | ( 'order' ) | ( 'query' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalAcceptanceTest.g:157:2: ( 'send' )
                    {
                    // InternalAcceptanceTest.g:157:2: ( 'send' )
                    // InternalAcceptanceTest.g:158:3: 'send'
                    {
                     before(grammarAccess.getActionAccess().getActionSendKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAcceptanceTest.g:163:2: ( 'order' )
                    {
                    // InternalAcceptanceTest.g:163:2: ( 'order' )
                    // InternalAcceptanceTest.g:164:3: 'order'
                    {
                     before(grammarAccess.getActionAccess().getActionOrderKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionOrderKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAcceptanceTest.g:169:2: ( 'query' )
                    {
                    // InternalAcceptanceTest.g:169:2: ( 'query' )
                    // InternalAcceptanceTest.g:170:3: 'query'
                    {
                     before(grammarAccess.getActionAccess().getActionQueryKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionQueryKeyword_0_2()); 

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
    // $ANTLR end "rule__Action__ActionAlternatives_0"


    // $ANTLR start "rule__Item__Group__0"
    // InternalAcceptanceTest.g:179:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:183:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalAcceptanceTest.g:184:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

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
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalAcceptanceTest.g:191:1: rule__Item__Group__0__Impl : ( 'item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:195:1: ( ( 'item' ) )
            // InternalAcceptanceTest.g:196:1: ( 'item' )
            {
            // InternalAcceptanceTest.g:196:1: ( 'item' )
            // InternalAcceptanceTest.g:197:2: 'item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

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
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalAcceptanceTest.g:206:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:210:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalAcceptanceTest.g:211:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

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
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalAcceptanceTest.g:218:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:222:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalAcceptanceTest.g:223:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalAcceptanceTest.g:223:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalAcceptanceTest.g:224:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalAcceptanceTest.g:225:2: ( rule__Item__NameAssignment_1 )
            // InternalAcceptanceTest.g:225:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalAcceptanceTest.g:233:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:237:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalAcceptanceTest.g:238:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

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
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalAcceptanceTest.g:245:1: rule__Item__Group__2__Impl : ( 'x' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:249:1: ( ( 'x' ) )
            // InternalAcceptanceTest.g:250:1: ( 'x' )
            {
            // InternalAcceptanceTest.g:250:1: ( 'x' )
            // InternalAcceptanceTest.g:251:2: 'x'
            {
             before(grammarAccess.getItemAccess().getXKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalAcceptanceTest.g:260:1: rule__Item__Group__3 : rule__Item__Group__3__Impl ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:264:1: ( rule__Item__Group__3__Impl )
            // InternalAcceptanceTest.g:265:2: rule__Item__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__3__Impl();

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
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalAcceptanceTest.g:271:1: rule__Item__Group__3__Impl : ( ( rule__Item__QuantityAssignment_3 ) ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:275:1: ( ( ( rule__Item__QuantityAssignment_3 ) ) )
            // InternalAcceptanceTest.g:276:1: ( ( rule__Item__QuantityAssignment_3 ) )
            {
            // InternalAcceptanceTest.g:276:1: ( ( rule__Item__QuantityAssignment_3 ) )
            // InternalAcceptanceTest.g:277:2: ( rule__Item__QuantityAssignment_3 )
            {
             before(grammarAccess.getItemAccess().getQuantityAssignment_3()); 
            // InternalAcceptanceTest.g:278:2: ( rule__Item__QuantityAssignment_3 )
            // InternalAcceptanceTest.g:278:3: rule__Item__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Item__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getQuantityAssignment_3()); 

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
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__TestCase__Group__0"
    // InternalAcceptanceTest.g:287:1: rule__TestCase__Group__0 : rule__TestCase__Group__0__Impl rule__TestCase__Group__1 ;
    public final void rule__TestCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:291:1: ( rule__TestCase__Group__0__Impl rule__TestCase__Group__1 )
            // InternalAcceptanceTest.g:292:2: rule__TestCase__Group__0__Impl rule__TestCase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TestCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__1();

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
    // $ANTLR end "rule__TestCase__Group__0"


    // $ANTLR start "rule__TestCase__Group__0__Impl"
    // InternalAcceptanceTest.g:299:1: rule__TestCase__Group__0__Impl : ( 'case:' ) ;
    public final void rule__TestCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:303:1: ( ( 'case:' ) )
            // InternalAcceptanceTest.g:304:1: ( 'case:' )
            {
            // InternalAcceptanceTest.g:304:1: ( 'case:' )
            // InternalAcceptanceTest.g:305:2: 'case:'
            {
             before(grammarAccess.getTestCaseAccess().getCaseKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getCaseKeyword_0()); 

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
    // $ANTLR end "rule__TestCase__Group__0__Impl"


    // $ANTLR start "rule__TestCase__Group__1"
    // InternalAcceptanceTest.g:314:1: rule__TestCase__Group__1 : rule__TestCase__Group__1__Impl rule__TestCase__Group__2 ;
    public final void rule__TestCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:318:1: ( rule__TestCase__Group__1__Impl rule__TestCase__Group__2 )
            // InternalAcceptanceTest.g:319:2: rule__TestCase__Group__1__Impl rule__TestCase__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TestCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__2();

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
    // $ANTLR end "rule__TestCase__Group__1"


    // $ANTLR start "rule__TestCase__Group__1__Impl"
    // InternalAcceptanceTest.g:326:1: rule__TestCase__Group__1__Impl : ( ( rule__TestCase__GivenAssignment_1 ) ) ;
    public final void rule__TestCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:330:1: ( ( ( rule__TestCase__GivenAssignment_1 ) ) )
            // InternalAcceptanceTest.g:331:1: ( ( rule__TestCase__GivenAssignment_1 ) )
            {
            // InternalAcceptanceTest.g:331:1: ( ( rule__TestCase__GivenAssignment_1 ) )
            // InternalAcceptanceTest.g:332:2: ( rule__TestCase__GivenAssignment_1 )
            {
             before(grammarAccess.getTestCaseAccess().getGivenAssignment_1()); 
            // InternalAcceptanceTest.g:333:2: ( rule__TestCase__GivenAssignment_1 )
            // InternalAcceptanceTest.g:333:3: rule__TestCase__GivenAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__GivenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getGivenAssignment_1()); 

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
    // $ANTLR end "rule__TestCase__Group__1__Impl"


    // $ANTLR start "rule__TestCase__Group__2"
    // InternalAcceptanceTest.g:341:1: rule__TestCase__Group__2 : rule__TestCase__Group__2__Impl rule__TestCase__Group__3 ;
    public final void rule__TestCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:345:1: ( rule__TestCase__Group__2__Impl rule__TestCase__Group__3 )
            // InternalAcceptanceTest.g:346:2: rule__TestCase__Group__2__Impl rule__TestCase__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__TestCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__3();

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
    // $ANTLR end "rule__TestCase__Group__2"


    // $ANTLR start "rule__TestCase__Group__2__Impl"
    // InternalAcceptanceTest.g:353:1: rule__TestCase__Group__2__Impl : ( ( rule__TestCase__WhenAssignment_2 ) ) ;
    public final void rule__TestCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:357:1: ( ( ( rule__TestCase__WhenAssignment_2 ) ) )
            // InternalAcceptanceTest.g:358:1: ( ( rule__TestCase__WhenAssignment_2 ) )
            {
            // InternalAcceptanceTest.g:358:1: ( ( rule__TestCase__WhenAssignment_2 ) )
            // InternalAcceptanceTest.g:359:2: ( rule__TestCase__WhenAssignment_2 )
            {
             before(grammarAccess.getTestCaseAccess().getWhenAssignment_2()); 
            // InternalAcceptanceTest.g:360:2: ( rule__TestCase__WhenAssignment_2 )
            // InternalAcceptanceTest.g:360:3: rule__TestCase__WhenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__WhenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getWhenAssignment_2()); 

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
    // $ANTLR end "rule__TestCase__Group__2__Impl"


    // $ANTLR start "rule__TestCase__Group__3"
    // InternalAcceptanceTest.g:368:1: rule__TestCase__Group__3 : rule__TestCase__Group__3__Impl ;
    public final void rule__TestCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:372:1: ( rule__TestCase__Group__3__Impl )
            // InternalAcceptanceTest.g:373:2: rule__TestCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__Group__3__Impl();

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
    // $ANTLR end "rule__TestCase__Group__3"


    // $ANTLR start "rule__TestCase__Group__3__Impl"
    // InternalAcceptanceTest.g:379:1: rule__TestCase__Group__3__Impl : ( ( rule__TestCase__ThenAssignment_3 ) ) ;
    public final void rule__TestCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:383:1: ( ( ( rule__TestCase__ThenAssignment_3 ) ) )
            // InternalAcceptanceTest.g:384:1: ( ( rule__TestCase__ThenAssignment_3 ) )
            {
            // InternalAcceptanceTest.g:384:1: ( ( rule__TestCase__ThenAssignment_3 ) )
            // InternalAcceptanceTest.g:385:2: ( rule__TestCase__ThenAssignment_3 )
            {
             before(grammarAccess.getTestCaseAccess().getThenAssignment_3()); 
            // InternalAcceptanceTest.g:386:2: ( rule__TestCase__ThenAssignment_3 )
            // InternalAcceptanceTest.g:386:3: rule__TestCase__ThenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__ThenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getThenAssignment_3()); 

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
    // $ANTLR end "rule__TestCase__Group__3__Impl"


    // $ANTLR start "rule__AcceptanceTest__TestsAssignment"
    // InternalAcceptanceTest.g:395:1: rule__AcceptanceTest__TestsAssignment : ( ruleTestCase ) ;
    public final void rule__AcceptanceTest__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:399:1: ( ( ruleTestCase ) )
            // InternalAcceptanceTest.g:400:2: ( ruleTestCase )
            {
            // InternalAcceptanceTest.g:400:2: ( ruleTestCase )
            // InternalAcceptanceTest.g:401:3: ruleTestCase
            {
             before(grammarAccess.getAcceptanceTestAccess().getTestsTestCaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getAcceptanceTestAccess().getTestsTestCaseParserRuleCall_0()); 

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
    // $ANTLR end "rule__AcceptanceTest__TestsAssignment"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalAcceptanceTest.g:410:1: rule__Item__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:414:1: ( ( RULE_ID ) )
            // InternalAcceptanceTest.g:415:2: ( RULE_ID )
            {
            // InternalAcceptanceTest.g:415:2: ( RULE_ID )
            // InternalAcceptanceTest.g:416:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__QuantityAssignment_3"
    // InternalAcceptanceTest.g:425:1: rule__Item__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Item__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:429:1: ( ( RULE_INT ) )
            // InternalAcceptanceTest.g:430:2: ( RULE_INT )
            {
            // InternalAcceptanceTest.g:430:2: ( RULE_INT )
            // InternalAcceptanceTest.g:431:3: RULE_INT
            {
             before(grammarAccess.getItemAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getQuantityINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Item__QuantityAssignment_3"


    // $ANTLR start "rule__Action__ActionAssignment"
    // InternalAcceptanceTest.g:440:1: rule__Action__ActionAssignment : ( ( rule__Action__ActionAlternatives_0 ) ) ;
    public final void rule__Action__ActionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:444:1: ( ( ( rule__Action__ActionAlternatives_0 ) ) )
            // InternalAcceptanceTest.g:445:2: ( ( rule__Action__ActionAlternatives_0 ) )
            {
            // InternalAcceptanceTest.g:445:2: ( ( rule__Action__ActionAlternatives_0 ) )
            // InternalAcceptanceTest.g:446:3: ( rule__Action__ActionAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getActionAlternatives_0()); 
            // InternalAcceptanceTest.g:447:3: ( rule__Action__ActionAlternatives_0 )
            // InternalAcceptanceTest.g:447:4: rule__Action__ActionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAlternatives_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment"


    // $ANTLR start "rule__TestCase__GivenAssignment_1"
    // InternalAcceptanceTest.g:455:1: rule__TestCase__GivenAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TestCase__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:459:1: ( ( ( RULE_ID ) ) )
            // InternalAcceptanceTest.g:460:2: ( ( RULE_ID ) )
            {
            // InternalAcceptanceTest.g:460:2: ( ( RULE_ID ) )
            // InternalAcceptanceTest.g:461:3: ( RULE_ID )
            {
             before(grammarAccess.getTestCaseAccess().getGivenCaseCrossReference_1_0()); 
            // InternalAcceptanceTest.g:462:3: ( RULE_ID )
            // InternalAcceptanceTest.g:463:4: RULE_ID
            {
             before(grammarAccess.getTestCaseAccess().getGivenCaseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getGivenCaseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTestCaseAccess().getGivenCaseCrossReference_1_0()); 

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
    // $ANTLR end "rule__TestCase__GivenAssignment_1"


    // $ANTLR start "rule__TestCase__WhenAssignment_2"
    // InternalAcceptanceTest.g:474:1: rule__TestCase__WhenAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TestCase__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:478:1: ( ( ( RULE_ID ) ) )
            // InternalAcceptanceTest.g:479:2: ( ( RULE_ID ) )
            {
            // InternalAcceptanceTest.g:479:2: ( ( RULE_ID ) )
            // InternalAcceptanceTest.g:480:3: ( RULE_ID )
            {
             before(grammarAccess.getTestCaseAccess().getWhenConditionCrossReference_2_0()); 
            // InternalAcceptanceTest.g:481:3: ( RULE_ID )
            // InternalAcceptanceTest.g:482:4: RULE_ID
            {
             before(grammarAccess.getTestCaseAccess().getWhenConditionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getWhenConditionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTestCaseAccess().getWhenConditionCrossReference_2_0()); 

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
    // $ANTLR end "rule__TestCase__WhenAssignment_2"


    // $ANTLR start "rule__TestCase__ThenAssignment_3"
    // InternalAcceptanceTest.g:493:1: rule__TestCase__ThenAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TestCase__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAcceptanceTest.g:497:1: ( ( ( RULE_ID ) ) )
            // InternalAcceptanceTest.g:498:2: ( ( RULE_ID ) )
            {
            // InternalAcceptanceTest.g:498:2: ( ( RULE_ID ) )
            // InternalAcceptanceTest.g:499:3: ( RULE_ID )
            {
             before(grammarAccess.getTestCaseAccess().getThenOutcomeCrossReference_3_0()); 
            // InternalAcceptanceTest.g:500:3: ( RULE_ID )
            // InternalAcceptanceTest.g:501:4: RULE_ID
            {
             before(grammarAccess.getTestCaseAccess().getThenOutcomeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getThenOutcomeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTestCaseAccess().getThenOutcomeCrossReference_3_0()); 

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
    // $ANTLR end "rule__TestCase__ThenAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}