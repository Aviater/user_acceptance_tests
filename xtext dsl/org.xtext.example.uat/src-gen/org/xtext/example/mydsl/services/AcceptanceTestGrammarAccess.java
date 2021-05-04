/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AcceptanceTestGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class AcceptanceTestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.AcceptanceTest");
		private final Assignment cTestsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTestsTestCaseParserRuleCall_0 = (RuleCall)cTestsAssignment.eContents().get(0);
		
		//AcceptanceTest:
		//    tests+=TestCase*;
		@Override public ParserRule getRule() { return rule; }
		
		//tests+=TestCase*
		public Assignment getTestsAssignment() { return cTestsAssignment; }
		
		//TestCase
		public RuleCall getTestsTestCaseParserRuleCall_0() { return cTestsTestCaseParserRuleCall_0; }
	}
	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.Item");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cXKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuantityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuantityINTTerminalRuleCall_3_0 = (RuleCall)cQuantityAssignment_3.eContents().get(0);
		
		//Item:
		//    'item' name=ID 'x' quantity=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'item' name=ID 'x' quantity=INT
		public Group getGroup() { return cGroup; }
		
		//'item'
		public Keyword getItemKeyword_0() { return cItemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'x'
		public Keyword getXKeyword_2() { return cXKeyword_2; }
		
		//quantity=INT
		public Assignment getQuantityAssignment_3() { return cQuantityAssignment_3; }
		
		//INT
		public RuleCall getQuantityINTTerminalRuleCall_3_0() { return cQuantityINTTerminalRuleCall_3_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.Action");
		private final Assignment cActionAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cActionAlternatives_0 = (Alternatives)cActionAssignment.eContents().get(0);
		private final Keyword cActionSendKeyword_0_0 = (Keyword)cActionAlternatives_0.eContents().get(0);
		private final Keyword cActionOrderKeyword_0_1 = (Keyword)cActionAlternatives_0.eContents().get(1);
		private final Keyword cActionQueryKeyword_0_2 = (Keyword)cActionAlternatives_0.eContents().get(2);
		
		//Action:
		//    action=('send' | 'order' | 'query')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//action=('send' | 'order' | 'query')
		public Assignment getActionAssignment() { return cActionAssignment; }
		
		//('send' | 'order' | 'query')
		public Alternatives getActionAlternatives_0() { return cActionAlternatives_0; }
		
		//'send'
		public Keyword getActionSendKeyword_0_0() { return cActionSendKeyword_0_0; }
		
		//'order'
		public Keyword getActionOrderKeyword_0_1() { return cActionOrderKeyword_0_1; }
		
		//'query'
		public Keyword getActionQueryKeyword_0_2() { return cActionQueryKeyword_0_2; }
	}
	public class CaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.Case");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGivenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		
		//Case:
		//    'given' (items+=Item)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'given' (items+=Item)*
		public Group getGroup() { return cGroup; }
		
		//'given'
		public Keyword getGivenKeyword_0() { return cGivenKeyword_0; }
		
		//(items+=Item)*
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//Item
		public RuleCall getItemsItemParserRuleCall_1_0() { return cItemsItemParserRuleCall_1_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionActionParserRuleCall_1_0 = (RuleCall)cActionAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cValueAlternatives_3_0 = (Alternatives)cValueAssignment_3.eContents().get(0);
		private final Keyword cValueTrueKeyword_3_0_0 = (Keyword)cValueAlternatives_3_0.eContents().get(0);
		private final Keyword cValueFalseKeyword_3_0_1 = (Keyword)cValueAlternatives_3_0.eContents().get(1);
		
		//Condition:
		//    'when' action=Action 'is' value=('true' | 'false')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'when' action=Action 'is' value=('true' | 'false')
		public Group getGroup() { return cGroup; }
		
		//'when'
		public Keyword getWhenKeyword_0() { return cWhenKeyword_0; }
		
		//action=Action
		public Assignment getActionAssignment_1() { return cActionAssignment_1; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_1_0() { return cActionActionParserRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//value=('true' | 'false')
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//('true' | 'false')
		public Alternatives getValueAlternatives_3_0() { return cValueAlternatives_3_0; }
		
		//'true'
		public Keyword getValueTrueKeyword_3_0_0() { return cValueTrueKeyword_3_0_0; }
		
		//'false'
		public Keyword getValueFalseKeyword_3_0_1() { return cValueFalseKeyword_3_0_1; }
	}
	public class OutcomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.Outcome");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResultAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cResultAlternatives_3_0 = (Alternatives)cResultAssignment_3.eContents().get(0);
		private final Keyword cResultTrueKeyword_3_0_0 = (Keyword)cResultAlternatives_3_0.eContents().get(0);
		private final Keyword cResultFalseKeyword_3_0_1 = (Keyword)cResultAlternatives_3_0.eContents().get(1);
		
		//Outcome:
		//    'then' (items+=Item*)? 'is' result=('true' | 'false')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'then' (items+=Item*)? 'is' result=('true' | 'false')
		public Group getGroup() { return cGroup; }
		
		//'then'
		public Keyword getThenKeyword_0() { return cThenKeyword_0; }
		
		//(items+=Item*)?
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//Item
		public RuleCall getItemsItemParserRuleCall_1_0() { return cItemsItemParserRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//result=('true' | 'false')
		public Assignment getResultAssignment_3() { return cResultAssignment_3; }
		
		//('true' | 'false')
		public Alternatives getResultAlternatives_3_0() { return cResultAlternatives_3_0; }
		
		//'true'
		public Keyword getResultTrueKeyword_3_0_0() { return cResultTrueKeyword_3_0_0; }
		
		//'false'
		public Keyword getResultFalseKeyword_3_0_1() { return cResultFalseKeyword_3_0_1; }
	}
	public class TestCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.AcceptanceTest.TestCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cGivenAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cGivenCaseCrossReference_1_0 = (CrossReference)cGivenAssignment_1.eContents().get(0);
		private final RuleCall cGivenCaseIDTerminalRuleCall_1_0_1 = (RuleCall)cGivenCaseCrossReference_1_0.eContents().get(1);
		private final Assignment cWhenAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cWhenConditionCrossReference_2_0 = (CrossReference)cWhenAssignment_2.eContents().get(0);
		private final RuleCall cWhenConditionIDTerminalRuleCall_2_0_1 = (RuleCall)cWhenConditionCrossReference_2_0.eContents().get(1);
		private final Assignment cThenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cThenOutcomeCrossReference_3_0 = (CrossReference)cThenAssignment_3.eContents().get(0);
		private final RuleCall cThenOutcomeIDTerminalRuleCall_3_0_1 = (RuleCall)cThenOutcomeCrossReference_3_0.eContents().get(1);
		
		//TestCase:
		//    'case:' given=[Case] when=[Condition] then=[Outcome]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'case:' given=[Case] when=[Condition] then=[Outcome]
		public Group getGroup() { return cGroup; }
		
		//'case:'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//given=[Case]
		public Assignment getGivenAssignment_1() { return cGivenAssignment_1; }
		
		//[Case]
		public CrossReference getGivenCaseCrossReference_1_0() { return cGivenCaseCrossReference_1_0; }
		
		//ID
		public RuleCall getGivenCaseIDTerminalRuleCall_1_0_1() { return cGivenCaseIDTerminalRuleCall_1_0_1; }
		
		//when=[Condition]
		public Assignment getWhenAssignment_2() { return cWhenAssignment_2; }
		
		//[Condition]
		public CrossReference getWhenConditionCrossReference_2_0() { return cWhenConditionCrossReference_2_0; }
		
		//ID
		public RuleCall getWhenConditionIDTerminalRuleCall_2_0_1() { return cWhenConditionIDTerminalRuleCall_2_0_1; }
		
		//then=[Outcome]
		public Assignment getThenAssignment_3() { return cThenAssignment_3; }
		
		//[Outcome]
		public CrossReference getThenOutcomeCrossReference_3_0() { return cThenOutcomeCrossReference_3_0; }
		
		//ID
		public RuleCall getThenOutcomeIDTerminalRuleCall_3_0_1() { return cThenOutcomeIDTerminalRuleCall_3_0_1; }
	}
	
	
	private final AcceptanceTestElements pAcceptanceTest;
	private final ItemElements pItem;
	private final ActionElements pAction;
	private final CaseElements pCase;
	private final ConditionElements pCondition;
	private final OutcomeElements pOutcome;
	private final TestCaseElements pTestCase;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AcceptanceTestGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAcceptanceTest = new AcceptanceTestElements();
		this.pItem = new ItemElements();
		this.pAction = new ActionElements();
		this.pCase = new CaseElements();
		this.pCondition = new ConditionElements();
		this.pOutcome = new OutcomeElements();
		this.pTestCase = new TestCaseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.AcceptanceTest".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AcceptanceTest:
	//    tests+=TestCase*;
	public AcceptanceTestElements getAcceptanceTestAccess() {
		return pAcceptanceTest;
	}
	
	public ParserRule getAcceptanceTestRule() {
		return getAcceptanceTestAccess().getRule();
	}
	
	//Item:
	//    'item' name=ID 'x' quantity=INT
	//;
	public ItemElements getItemAccess() {
		return pItem;
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}
	
	//Action:
	//    action=('send' | 'order' | 'query')
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Case:
	//    'given' (items+=Item)*
	//;
	public CaseElements getCaseAccess() {
		return pCase;
	}
	
	public ParserRule getCaseRule() {
		return getCaseAccess().getRule();
	}
	
	//Condition:
	//    'when' action=Action 'is' value=('true' | 'false')
	//;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//Outcome:
	//    'then' (items+=Item*)? 'is' result=('true' | 'false')
	//;
	public OutcomeElements getOutcomeAccess() {
		return pOutcome;
	}
	
	public ParserRule getOutcomeRule() {
		return getOutcomeAccess().getRule();
	}
	
	//TestCase:
	//    'case:' given=[Case] when=[Condition] then=[Outcome]
	//;
	public TestCaseElements getTestCaseAccess() {
		return pTestCase;
	}
	
	public ParserRule getTestCaseRule() {
		return getTestCaseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}