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
import org.bimserver.models.ifc2x3.IfcOpticalMaterialProperties;

import org.bimserver.models.ifc2x3.impl.IfcMaterialPropertiesImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittanceAsString <em>Visible Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittanceAsString <em>Solar Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittanceAsString <em>Thermal Ir Transmittance As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBackAsString <em>Thermal Ir Emissivity Back As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFrontAsString <em>Thermal Ir Emissivity Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBackAsString <em>Visible Reflectance Back As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFrontAsString <em>Visible Reflectance Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFrontAsString <em>Solar Reflectance Front As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBackAsString <em>Solar Reflectance Back As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOpticalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcOpticalMaterialProperties
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
	protected IfcOpticalMaterialPropertiesImpl()
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
		return Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVisibleTransmittance()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittance(float newVisibleTransmittance)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE, newVisibleTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleTransmittance()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleTransmittance()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleTransmittanceAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittanceAsString(String newVisibleTransmittanceAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING, newVisibleTransmittanceAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleTransmittanceAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleTransmittanceAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolarTransmittance()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittance(float newSolarTransmittance)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE, newSolarTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarTransmittance()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarTransmittance()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarTransmittanceAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittanceAsString(String newSolarTransmittanceAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING, newSolarTransmittanceAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarTransmittanceAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarTransmittanceAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThermalIrTransmittance()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittance(float newThermalIrTransmittance)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE, newThermalIrTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrTransmittance()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrTransmittance()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrTransmittanceAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittanceAsString(String newThermalIrTransmittanceAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING, newThermalIrTransmittanceAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrTransmittanceAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrTransmittanceAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThermalIrEmissivityBack()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBack(float newThermalIrEmissivityBack)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK, newThermalIrEmissivityBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityBack()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityBack()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrEmissivityBackAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBackAsString(String newThermalIrEmissivityBackAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING, newThermalIrEmissivityBackAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityBackAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityBackAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThermalIrEmissivityFront()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFront(float newThermalIrEmissivityFront)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT, newThermalIrEmissivityFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityFront()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityFront()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrEmissivityFrontAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFrontAsString(String newThermalIrEmissivityFrontAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING, newThermalIrEmissivityFrontAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityFrontAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityFrontAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVisibleReflectanceBack()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBack(float newVisibleReflectanceBack)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK, newVisibleReflectanceBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceBack()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceBack()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleReflectanceBackAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBackAsString(String newVisibleReflectanceBackAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING, newVisibleReflectanceBackAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceBackAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceBackAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVisibleReflectanceFront()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFront(float newVisibleReflectanceFront)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT, newVisibleReflectanceFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceFront()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceFront()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleReflectanceFrontAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFrontAsString(String newVisibleReflectanceFrontAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING, newVisibleReflectanceFrontAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceFrontAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceFrontAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolarReflectanceFront()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFront(float newSolarReflectanceFront)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT, newSolarReflectanceFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceFront()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceFront()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarReflectanceFrontAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFrontAsString(String newSolarReflectanceFrontAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING, newSolarReflectanceFrontAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceFrontAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceFrontAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolarReflectanceBack()
	{
		return (Float)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBack(float newSolarReflectanceBack)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK, newSolarReflectanceBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceBack()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceBack()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarReflectanceBackAsString()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBackAsString(String newSolarReflectanceBackAsString)
	{
		eSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING, newSolarReflectanceBackAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceBackAsString()
	{
		eUnset(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceBackAsString()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING);
	}

} //IfcOpticalMaterialPropertiesImpl
