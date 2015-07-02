/**
 */
package mathExpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mathExpr.Result#getOperatorOutput <em>Operator Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see mathExpr.MathExprPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends mathExpr.Number {
	/**
	 * Returns the value of the '<em><b>Operator Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mathExpr.OperatorOutput#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Output</em>' reference.
	 * @see #setOperatorOutput(OperatorOutput)
	 * @see mathExpr.MathExprPackage#getResult_OperatorOutput()
	 * @see mathExpr.OperatorOutput#getResult
	 * @model opposite="result"
	 * @generated
	 */
	OperatorOutput getOperatorOutput();

	/**
	 * Sets the value of the '{@link mathExpr.Result#getOperatorOutput <em>Operator Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Output</em>' reference.
	 * @see #getOperatorOutput()
	 * @generated
	 */
	void setOperatorOutput(OperatorOutput value);

} // Result
