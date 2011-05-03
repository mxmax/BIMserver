/**
 *  (c) Copyright bimserver.org 2009
 *  Licensed under GNU GPLv3
 *  http://www.gnu.org/licenses/gpl-3.0.txt
 *  For more information mail to license@bimserver.org
 *  
 *  Bimserver.org is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Bimserver.org is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License a 
 *  long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcConnectionPointEccentricity;

import org.bimserver.models.ifc2x3.impl.IfcConnectionPointGeometryImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInXAsString <em>Eccentricity In XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInYAsString <em>Eccentricity In YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZAsString <em>Eccentricity In ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPointEccentricityImpl extends IfcConnectionPointGeometryImpl implements IfcConnectionPointEccentricity
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright bimserver.org 2009\r\n Licensed under GNU GPLv3\r\n http://www.gnu.org/licenses/gpl-3.0.txt\r\n For more information mail to license@bimserver.org\r\n \r\n Bimserver.org is free software: you can redistribute it and/or modify \r\n it under the terms of the GNU General Public License as published by \r\n the Free Software Foundation, either version 3 of the License, or\r\n (at your option) any later version.\r\n \r\n Bimserver.org is distributed in the hope that it will be useful, but \r\n WITHOUT ANY WARRANTY; without even the implied warranty of \r\n MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU \r\n General Public License for more details.\r\n \r\n You should have received a copy of the GNU General Public License a \r\n long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointEccentricityImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEccentricityInX()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInX(float newEccentricityInX)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X, newEccentricityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInX()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInX()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInXAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInXAsString(String newEccentricityInXAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING, newEccentricityInXAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInXAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInXAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEccentricityInY()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInY(float newEccentricityInY)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y, newEccentricityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInY()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInY()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInYAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInYAsString(String newEccentricityInYAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING, newEccentricityInYAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInYAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInYAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEccentricityInZ()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZ(float newEccentricityInZ)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z, newEccentricityInZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInZ()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInZ()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInZAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZAsString(String newEccentricityInZAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING, newEccentricityInZAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInZAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInZAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING);
	}

} //IfcConnectionPointEccentricityImpl
