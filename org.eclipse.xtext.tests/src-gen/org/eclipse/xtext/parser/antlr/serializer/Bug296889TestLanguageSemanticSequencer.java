/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.antlr.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.antlr.bug296889Test.Bug296889TestPackage;
import org.eclipse.xtext.parser.antlr.bug296889Test.Model;
import org.eclipse.xtext.parser.antlr.bug296889Test.Postop;
import org.eclipse.xtext.parser.antlr.bug296889Test.Preop;
import org.eclipse.xtext.parser.antlr.bug296889Test.Variable;
import org.eclipse.xtext.parser.antlr.services.Bug296889TestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Bug296889TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug296889TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Bug296889TestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Bug296889TestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Bug296889TestPackage.POSTOP:
				sequence_Postop(context, (Postop) semanticObject); 
				return; 
			case Bug296889TestPackage.PREOP:
				sequence_Preop(context, (Preop) semanticObject); 
				return; 
			case Bug296889TestPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (expressions+=Expression+ | values+=DataTypeExpression+)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Postop
	 *     Postop returns Postop
	 *
	 * Constraint:
	 *     (expr=Postop_Postop_1_0 functionName='--')
	 * </pre>
	 */
	protected void sequence_Postop(ISerializationContext context, Postop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug296889TestPackage.Literals.POSTOP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug296889TestPackage.Literals.POSTOP__EXPR));
			if (transientValues.isValueTransient(semanticObject, Bug296889TestPackage.Literals.POSTOP__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug296889TestPackage.Literals.POSTOP__FUNCTION_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostopAccess().getPostopExprAction_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getPostopAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0(), semanticObject.getFunctionName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Preop
	 *     Preop returns Preop
	 *
	 * Constraint:
	 *     (functionName='--' expr=Variable)
	 * </pre>
	 */
	protected void sequence_Preop(ISerializationContext context, Preop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug296889TestPackage.Literals.PREOP__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug296889TestPackage.Literals.PREOP__FUNCTION_NAME));
			if (transientValues.isValueTransient(semanticObject, Bug296889TestPackage.Literals.PREOP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug296889TestPackage.Literals.PREOP__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreopAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0(), semanticObject.getFunctionName());
		feeder.accept(grammarAccess.getPreopAccess().getExprVariableParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Variable
	 *     Postop returns Variable
	 *     Postop.Postop_1_0 returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug296889TestPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug296889TestPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
