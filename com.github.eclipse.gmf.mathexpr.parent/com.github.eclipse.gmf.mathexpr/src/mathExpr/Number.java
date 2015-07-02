/**
 */
package mathExpr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mathExpr.Number#getOperatorInputs <em>Operator Inputs</em>}</li>
 *   <li>{@link mathExpr.Number#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mathExpr.MathExprPackage#getNumber()
 * @model abstract="true"
 * @generated
 */
public interface Number extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator Inputs</b></em>' reference list.
	 * The list contents are of type {@link mathExpr.OperatorInput}.
	 * It is bidirectional and its opposite is '{@link mathExpr.OperatorInput#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Inputs</em>' reference list.
	 * @see mathExpr.MathExprPackage#getNumber_OperatorInputs()
	 * @see mathExpr.OperatorInput#getNumber
	 * @model opposite="number"
	 * @generated
	 */
	EList<OperatorInput> getOperatorInputs();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see mathExpr.MathExprPackage#getNumber_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link mathExpr.Number#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Number
