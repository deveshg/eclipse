/**
 */
package mathExpr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mathExpr.OperatorOutput#getOperator <em>Operator</em>}</li>
 *   <li>{@link mathExpr.OperatorOutput#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see mathExpr.MathExprPackage#getOperatorOutput()
 * @model
 * @generated
 */
public interface OperatorOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.Operator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' container reference.
	 * @see #setOperator(Operator)
	 * @see mathExpr.MathExprPackage#getOperatorOutput_Operator()
	 * @see mathExpr.Operator#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link mathExpr.OperatorOutput#getOperator <em>Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' container reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.Result#getOperatorOutput <em>Operator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Result)
	 * @see mathExpr.MathExprPackage#getOperatorOutput_Result()
	 * @see mathExpr.Result#getOperatorOutput
	 * @model opposite="operatorOutput"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link mathExpr.OperatorOutput#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

} // OperatorOutput
