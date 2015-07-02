/**
 */
package mathExpr.impl;

import mathExpr.MathExprPackage;
import mathExpr.OperatorOutput;
import mathExpr.Result;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mathExpr.impl.ResultImpl#getOperatorOutput <em>Operator Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends NumberImpl implements Result {
	/**
	 * The cached value of the '{@link #getOperatorOutput() <em>Operator Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorOutput()
	 * @generated
	 * @ordered
	 */
	protected OperatorOutput operatorOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExprPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorOutput getOperatorOutput() {
		if (operatorOutput != null && operatorOutput.eIsProxy()) {
			InternalEObject oldOperatorOutput = (InternalEObject)operatorOutput;
			operatorOutput = (OperatorOutput)eResolveProxy(oldOperatorOutput);
			if (operatorOutput != oldOperatorOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathExprPackage.RESULT__OPERATOR_OUTPUT, oldOperatorOutput, operatorOutput));
			}
		}
		return operatorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorOutput basicGetOperatorOutput() {
		return operatorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorOutput(OperatorOutput newOperatorOutput, NotificationChain msgs) {
		OperatorOutput oldOperatorOutput = operatorOutput;
		operatorOutput = newOperatorOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathExprPackage.RESULT__OPERATOR_OUTPUT, oldOperatorOutput, newOperatorOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorOutput(OperatorOutput newOperatorOutput) {
		if (newOperatorOutput != operatorOutput) {
			NotificationChain msgs = null;
			if (operatorOutput != null)
				msgs = ((InternalEObject)operatorOutput).eInverseRemove(this, MathExprPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
			if (newOperatorOutput != null)
				msgs = ((InternalEObject)newOperatorOutput).eInverseAdd(this, MathExprPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
			msgs = basicSetOperatorOutput(newOperatorOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExprPackage.RESULT__OPERATOR_OUTPUT, newOperatorOutput, newOperatorOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				if (operatorOutput != null)
					msgs = ((InternalEObject)operatorOutput).eInverseRemove(this, MathExprPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
				return basicSetOperatorOutput((OperatorOutput)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				return basicSetOperatorOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				if (resolve) return getOperatorOutput();
				return basicGetOperatorOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				setOperatorOutput((OperatorOutput)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				setOperatorOutput((OperatorOutput)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MathExprPackage.RESULT__OPERATOR_OUTPUT:
				return operatorOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultImpl
