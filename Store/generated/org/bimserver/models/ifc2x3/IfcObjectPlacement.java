/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjectPlacement()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcObjectPlacement extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Places Object</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcProduct}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcProduct#getObjectPlacement <em>Object Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places Object</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjectPlacement_PlacesObject()
	 * @see org.bimserver.models.ifc2x3.IfcProduct#getObjectPlacement
	 * @model opposite="ObjectPlacement" upper="2"
	 * @generated
	 */
	EList<IfcProduct> getPlacesObject();

	/**
	 * Returns the value of the '<em><b>Referenced By Placements</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcLocalPlacement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By Placements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By Placements</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjectPlacement_ReferencedByPlacements()
	 * @see org.bimserver.models.ifc2x3.IfcLocalPlacement#getPlacementRelTo
	 * @model opposite="PlacementRelTo"
	 * @generated
	 */
	EList<IfcLocalPlacement> getReferencedByPlacements();

} // IfcObjectPlacement