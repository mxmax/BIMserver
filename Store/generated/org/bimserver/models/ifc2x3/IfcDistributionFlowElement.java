/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDistributionFlowElement()
 * @model
 * @generated
 */
public interface IfcDistributionFlowElement extends IfcDistributionElement {
	/**
	 * Returns the value of the '<em><b>Has Control Elements</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcRelFlowControlElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Control Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Control Elements</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDistributionFlowElement_HasControlElements()
	 * @see org.bimserver.models.ifc2x3.IfcRelFlowControlElements#getRelatingFlowElement
	 * @model opposite="RelatingFlowElement" upper="2"
	 * @generated
	 */
	EList<IfcRelFlowControlElements> getHasControlElements();

} // IfcDistributionFlowElement