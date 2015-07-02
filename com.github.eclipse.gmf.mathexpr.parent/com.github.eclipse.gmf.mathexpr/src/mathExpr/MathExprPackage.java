/**
 */
package mathExpr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mathExpr.MathExprFactory
 * @model kind="package"
 * @generated
 */
public interface MathExprPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mathExpr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/deveshg/eclipse/math";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mathExpr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MathExprPackage eINSTANCE = mathExpr.impl.MathExprPackageImpl.init();

	/**
	 * The meta object id for the '{@link mathExpr.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.NumberImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__OPERATOR_INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.EntryImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OPERATOR_INPUTS = NUMBER__OPERATOR_INPUTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = NUMBER__VALUE;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.MathDiagramImpl <em>Math Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.MathDiagramImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getMathDiagram()
	 * @generated
	 */
	int MATH_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__OPERATORS = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Math Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Math Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.OperatorImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.MinusOperatorImpl <em>Minus Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.MinusOperatorImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getMinusOperator()
	 * @generated
	 */
	int MINUS_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR__INPUTS = OPERATOR__INPUTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Minus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.OperatorInputImpl <em>Operator Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.OperatorInputImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getOperatorInput()
	 * @generated
	 */
	int OPERATOR_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Operator Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.OperatorOutputImpl <em>Operator Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.OperatorOutputImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getOperatorOutput()
	 * @generated
	 */
	int OPERATOR_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Operator Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.PlusOperatorImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getPlusOperator()
	 * @generated
	 */
	int PLUS_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__INPUTS = OPERATOR__INPUTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Plus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mathExpr.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mathExpr.impl.ResultImpl
	 * @see mathExpr.impl.MathExprPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 8;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OPERATOR_INPUTS = NUMBER__OPERATOR_INPUTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = NUMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Operator Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OPERATOR_OUTPUT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mathExpr.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see mathExpr.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for class '{@link mathExpr.MathDiagram <em>Math Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Diagram</em>'.
	 * @see mathExpr.MathDiagram
	 * @generated
	 */
	EClass getMathDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link mathExpr.MathDiagram#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see mathExpr.MathDiagram#getOperators()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link mathExpr.MathDiagram#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see mathExpr.MathDiagram#getEntries()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link mathExpr.MathDiagram#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see mathExpr.MathDiagram#getResults()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Results();

	/**
	 * Returns the meta object for class '{@link mathExpr.MinusOperator <em>Minus Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Operator</em>'.
	 * @see mathExpr.MinusOperator
	 * @generated
	 */
	EClass getMinusOperator();

	/**
	 * Returns the meta object for class '{@link mathExpr.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see mathExpr.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the reference list '{@link mathExpr.Number#getOperatorInputs <em>Operator Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operator Inputs</em>'.
	 * @see mathExpr.Number#getOperatorInputs()
	 * @see #getNumber()
	 * @generated
	 */
	EReference getNumber_OperatorInputs();

	/**
	 * Returns the meta object for the attribute '{@link mathExpr.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mathExpr.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link mathExpr.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see mathExpr.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link mathExpr.Operator#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see mathExpr.Operator#getInputs()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link mathExpr.Operator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see mathExpr.Operator#getOutput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Output();

	/**
	 * Returns the meta object for class '{@link mathExpr.OperatorInput <em>Operator Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Input</em>'.
	 * @see mathExpr.OperatorInput
	 * @generated
	 */
	EClass getOperatorInput();

	/**
	 * Returns the meta object for the container reference '{@link mathExpr.OperatorInput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operator</em>'.
	 * @see mathExpr.OperatorInput#getOperator()
	 * @see #getOperatorInput()
	 * @generated
	 */
	EReference getOperatorInput_Operator();

	/**
	 * Returns the meta object for the reference '{@link mathExpr.OperatorInput#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number</em>'.
	 * @see mathExpr.OperatorInput#getNumber()
	 * @see #getOperatorInput()
	 * @generated
	 */
	EReference getOperatorInput_Number();

	/**
	 * Returns the meta object for class '{@link mathExpr.OperatorOutput <em>Operator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Output</em>'.
	 * @see mathExpr.OperatorOutput
	 * @generated
	 */
	EClass getOperatorOutput();

	/**
	 * Returns the meta object for the container reference '{@link mathExpr.OperatorOutput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operator</em>'.
	 * @see mathExpr.OperatorOutput#getOperator()
	 * @see #getOperatorOutput()
	 * @generated
	 */
	EReference getOperatorOutput_Operator();

	/**
	 * Returns the meta object for the reference '{@link mathExpr.OperatorOutput#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see mathExpr.OperatorOutput#getResult()
	 * @see #getOperatorOutput()
	 * @generated
	 */
	EReference getOperatorOutput_Result();

	/**
	 * Returns the meta object for class '{@link mathExpr.PlusOperator <em>Plus Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Operator</em>'.
	 * @see mathExpr.PlusOperator
	 * @generated
	 */
	EClass getPlusOperator();

	/**
	 * Returns the meta object for class '{@link mathExpr.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see mathExpr.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link mathExpr.Result#getOperatorOutput <em>Operator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator Output</em>'.
	 * @see mathExpr.Result#getOperatorOutput()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_OperatorOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MathExprFactory getMathExprFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mathExpr.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.EntryImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.MathDiagramImpl <em>Math Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.MathDiagramImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getMathDiagram()
		 * @generated
		 */
		EClass MATH_DIAGRAM = eINSTANCE.getMathDiagram();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__OPERATORS = eINSTANCE.getMathDiagram_Operators();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__ENTRIES = eINSTANCE.getMathDiagram_Entries();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__RESULTS = eINSTANCE.getMathDiagram_Results();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.MinusOperatorImpl <em>Minus Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.MinusOperatorImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getMinusOperator()
		 * @generated
		 */
		EClass MINUS_OPERATOR = eINSTANCE.getMinusOperator();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.NumberImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Operator Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER__OPERATOR_INPUTS = eINSTANCE.getNumber_OperatorInputs();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.OperatorImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__INPUTS = eINSTANCE.getOperator_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OUTPUT = eINSTANCE.getOperator_Output();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.OperatorInputImpl <em>Operator Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.OperatorInputImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getOperatorInput()
		 * @generated
		 */
		EClass OPERATOR_INPUT = eINSTANCE.getOperatorInput();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INPUT__OPERATOR = eINSTANCE.getOperatorInput_Operator();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INPUT__NUMBER = eINSTANCE.getOperatorInput_Number();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.OperatorOutputImpl <em>Operator Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.OperatorOutputImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getOperatorOutput()
		 * @generated
		 */
		EClass OPERATOR_OUTPUT = eINSTANCE.getOperatorOutput();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_OUTPUT__OPERATOR = eINSTANCE.getOperatorOutput_Operator();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_OUTPUT__RESULT = eINSTANCE.getOperatorOutput_Result();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.PlusOperatorImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getPlusOperator()
		 * @generated
		 */
		EClass PLUS_OPERATOR = eINSTANCE.getPlusOperator();

		/**
		 * The meta object literal for the '{@link mathExpr.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mathExpr.impl.ResultImpl
		 * @see mathExpr.impl.MathExprPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Operator Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__OPERATOR_OUTPUT = eINSTANCE.getResult_OperatorOutput();

	}

} //MathExprPackage
