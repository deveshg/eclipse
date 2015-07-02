/**
 */
package mathExpr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mathExpr.MathExprPackage
 * @generated
 */
public interface MathExprFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MathExprFactory eINSTANCE = mathExpr.impl.MathExprFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Math Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Diagram</em>'.
	 * @generated
	 */
	MathDiagram createMathDiagram();

	/**
	 * Returns a new object of class '<em>Minus Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Operator</em>'.
	 * @generated
	 */
	MinusOperator createMinusOperator();

	/**
	 * Returns a new object of class '<em>Operator Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Input</em>'.
	 * @generated
	 */
	OperatorInput createOperatorInput();

	/**
	 * Returns a new object of class '<em>Operator Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Output</em>'.
	 * @generated
	 */
	OperatorOutput createOperatorOutput();

	/**
	 * Returns a new object of class '<em>Plus Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Operator</em>'.
	 * @generated
	 */
	PlusOperator createPlusOperator();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MathExprPackage getMathExprPackage();

} //MathExprFactory
