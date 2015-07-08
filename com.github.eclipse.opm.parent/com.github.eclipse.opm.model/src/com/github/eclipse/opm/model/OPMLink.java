/**
 */
package com.github.eclipse.opm.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.eclipse.opm.model.OPMLink#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.github.eclipse.opm.model.OPMLink#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.eclipse.opm.model.OPMLink#getTarget <em>Target</em>}</li>
 *   <li>{@link com.github.eclipse.opm.model.OPMLink#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.eclipse.opm.model.OPMPackage#getOPMLink()
 * @model
 * @generated
 */
public interface OPMLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.eclipse.opm.model.OPMObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(OPMObjectProcessDiagram)
	 * @see com.github.eclipse.opm.model.OPMPackage#getOPMLink_Opd()
	 * @see com.github.eclipse.opm.model.OPMObjectProcessDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	OPMObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link com.github.eclipse.opm.model.OPMLink#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(OPMObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.eclipse.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OPMThing)
	 * @see com.github.eclipse.opm.model.OPMPackage#getOPMLink_Source()
	 * @see com.github.eclipse.opm.model.OPMThing#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	OPMThing getSource();

	/**
	 * Sets the value of the '{@link com.github.eclipse.opm.model.OPMLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OPMThing value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.eclipse.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OPMThing)
	 * @see com.github.eclipse.opm.model.OPMPackage#getOPMLink_Target()
	 * @see com.github.eclipse.opm.model.OPMThing#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	OPMThing getTarget();

	/**
	 * Sets the value of the '{@link com.github.eclipse.opm.model.OPMLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OPMThing value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see com.github.eclipse.opm.model.OPMPackage#getOPMLink_Bendpoints()
	 * @model dataType="com.github.eclipse.opm.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

} // OPMLink
