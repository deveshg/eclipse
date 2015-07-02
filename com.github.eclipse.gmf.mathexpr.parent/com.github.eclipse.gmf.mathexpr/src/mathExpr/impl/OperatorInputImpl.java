/**
 */
package mathExpr.impl;

import mathExpr.MathExprPackage;
import mathExpr.Operator;
import mathExpr.OperatorInput;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mathExpr.impl.OperatorInputImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link mathExpr.impl.OperatorInputImpl#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorInputImpl extends MinimalEObjectImpl.Container implements OperatorInput {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected mathExpr.Number number;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExprPackage.Literals.OPERATOR_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		if (eContainerFeatureID() != MathExprPackage.OPERATOR_INPUT__OPERATOR) return null;
		return (Operator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperator, MathExprPackage.OPERATOR_INPUT__OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		if (newOperator != eInternalContainer() || (eContainerFeatureID() != MathExprPackage.OPERATOR_INPUT__OPERATOR && newOperator != null)) {
			if (EcoreUtil.isAncestor(this, newOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, MathExprPackage.OPERATOR__INPUTS, Operator.class, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExprPackage.OPERATOR_INPUT__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mathExpr.Number getNumber() {
		if (number != null && number.eIsProxy()) {
			InternalEObject oldNumber = (InternalEObject)number;
			number = (mathExpr.Number)eResolveProxy(oldNumber);
			if (number != oldNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathExprPackage.OPERATOR_INPUT__NUMBER, oldNumber, number));
			}
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mathExpr.Number basicGetNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(mathExpr.Number newNumber, NotificationChain msgs) {
		mathExpr.Number oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathExprPackage.OPERATOR_INPUT__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(mathExpr.Number newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, MathExprPackage.NUMBER__OPERATOR_INPUTS, mathExpr.Number.class, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, MathExprPackage.NUMBER__OPERATOR_INPUTS, mathExpr.Number.class, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExprPackage.OPERATOR_INPUT__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperator((Operator)otherEnd, msgs);
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				if (number != null)
					msgs = ((InternalEObject)number).eInverseRemove(this, MathExprPackage.NUMBER__OPERATOR_INPUTS, mathExpr.Number.class, msgs);
				return basicSetNumber((mathExpr.Number)otherEnd, msgs);
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
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				return basicSetOperator(null, msgs);
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				return basicSetNumber(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				return eInternalContainer().eInverseRemove(this, MathExprPackage.OPERATOR__INPUTS, Operator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				return getOperator();
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
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
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				setNumber((mathExpr.Number)newValue);
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
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				setOperator((Operator)null);
				return;
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				setNumber((mathExpr.Number)null);
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
			case MathExprPackage.OPERATOR_INPUT__OPERATOR:
				return getOperator() != null;
			case MathExprPackage.OPERATOR_INPUT__NUMBER:
				return number != null;
		}
		return super.eIsSet(featureID);
	}

} //OperatorInputImpl
