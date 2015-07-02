/**
 */
package mathExpr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mathExpr.OperatorInput#getOperator <em>Operator</em>}</li>
 *   <li>{@link mathExpr.OperatorInput#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see mathExpr.MathExprPackage#getOperatorInput()
 * @model
 * @generated
 */
public interface OperatorInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.Operator#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' container reference.
	 * @see #setOperator(Operator)
	 * @see mathExpr.MathExprPackage#getOperatorInput_Operator()
	 * @see mathExpr.Operator#getInputs
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link mathExpr.OperatorInput#getOperator <em>Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' container reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.Number#getOperatorInputs <em>Operator Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' reference.
	 * @see #setNumber(mathExpr.Number)
	 * @see mathExpr.MathExprPackage#getOperatorInput_Number()
	 * @see mathExpr.Number#getOperatorInputs
	 * @model opposite="operatorInputs"
	 * @generated
	 */
	mathExpr.Number getNumber();

	/**
	 * Sets the value of the '{@link mathExpr.OperatorInput#getNumber <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(mathExpr.Number value);

} // OperatorInput
