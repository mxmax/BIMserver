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
import org.bimserver.models.ifc2x3.IfcPropertyBoundedValue;
import org.bimserver.models.ifc2x3.IfcUnit;
import org.bimserver.models.ifc2x3.IfcValue;

import org.bimserver.models.ifc2x3.impl.IfcSimplePropertyImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcPropertyBoundedValueImpl#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcPropertyBoundedValueImpl#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcPropertyBoundedValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyBoundedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyBoundedValue
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
	protected IfcPropertyBoundedValueImpl()
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
		return Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getUpperBoundValue()
	{
		return (IfcValue)eGet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundValue(IfcValue newUpperBoundValue)
	{
		eSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, newUpperBoundValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperBoundValue()
	{
		eUnset(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperBoundValue()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getLowerBoundValue()
	{
		return (IfcValue)eGet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundValue(IfcValue newLowerBoundValue)
	{
		eSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, newLowerBoundValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerBoundValue()
	{
		eUnset(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerBoundValue()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit()
	{
		return (IfcUnit)eGet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit)
	{
		eSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit()
	{
		eUnset(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_PROPERTY_BOUNDED_VALUE__UNIT);
	}

} //IfcPropertyBoundedValueImpl
