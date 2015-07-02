/**
 */
package mathExpr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mathExpr.Operator#getInputs <em>Inputs</em>}</li>
 *   <li>{@link mathExpr.Operator#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see mathExpr.MathExprPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link mathExpr.OperatorInput}.
	 * It is bidirectional and its opposite is '{@link mathExpr.OperatorInput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see mathExpr.MathExprPackage#getOperator_Inputs()
	 * @see mathExpr.OperatorInput#getOperator
	 * @model opposite="operator" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<OperatorInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.OperatorOutput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(OperatorOutput)
	 * @see mathExpr.MathExprPackage#getOperator_Output()
	 * @see mathExpr.OperatorOutput#getOperator
	 * @model opposite="operator" containment="true"
	 * @generated
	 */
	OperatorOutput getOutput();

	/**
	 * Sets the value of the '{@link mathExpr.Operator#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OperatorOutput value);

} // Operator
