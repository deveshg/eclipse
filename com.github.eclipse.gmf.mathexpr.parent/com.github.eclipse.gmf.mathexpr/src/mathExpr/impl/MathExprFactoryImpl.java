/**
 */
package mathExpr.impl;

import mathExpr.Entry;
import mathExpr.MathDiagram;
import mathExpr.MathExprFactory;
import mathExpr.MathExprPackage;
import mathExpr.MinusOperator;
import mathExpr.OperatorInput;
import mathExpr.OperatorOutput;
import mathExpr.PlusOperator;
import mathExpr.Result;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathExprFactoryImpl extends EFactoryImpl implements MathExprFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathExprFactory init() {
		try {
			MathExprFactory theMathExprFactory = (MathExprFactory)EPackage.Registry.INSTANCE.getEFactory(MathExprPackage.eNS_URI);
			if (theMathExprFactory != null) {
				return theMathExprFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MathExprFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathExprFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MathExprPackage.ENTRY: return createEntry();
			case MathExprPackage.MATH_DIAGRAM: return createMathDiagram();
			case MathExprPackage.MINUS_OPERATOR: return createMinusOperator();
			case MathExprPackage.OPERATOR_INPUT: return createOperatorInput();
			case MathExprPackage.OPERATOR_OUTPUT: return createOperatorOutput();
			case MathExprPackage.PLUS_OPERATOR: return createPlusOperator();
			case MathExprPackage.RESULT: return createResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathDiagram createMathDiagram() {
		MathDiagramImpl mathDiagram = new MathDiagramImpl();
		return mathDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinusOperator createMinusOperator() {
		MinusOperatorImpl minusOperator = new MinusOperatorImpl();
		return minusOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorInput createOperatorInput() {
		OperatorInputImpl operatorInput = new OperatorInputImpl();
		return operatorInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorOutput createOperatorOutput() {
		OperatorOutputImpl operatorOutput = new OperatorOutputImpl();
		return operatorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusOperator createPlusOperator() {
		PlusOperatorImpl plusOperator = new PlusOperatorImpl();
		return plusOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathExprPackage getMathExprPackage() {
		return (MathExprPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MathExprPackage getPackage() {
		return MathExprPackage.eINSTANCE;
	}

} //MathExprFactoryImpl
