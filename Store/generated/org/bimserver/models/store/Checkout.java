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
package org.bimserver.models.store;

import java.util.Date;

import org.bimserver.emf.IdEObject;

import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.store.Checkout#getUser <em>User</em>}</li>
 *   <li>{@link org.bimserver.models.store.Checkout#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.bimserver.models.store.Checkout#getProject <em>Project</em>}</li>
 *   <li>{@link org.bimserver.models.store.Checkout#getDate <em>Date</em>}</li>
 *   <li>{@link org.bimserver.models.store.Checkout#getCheckin <em>Checkin</em>}</li>
 *   <li>{@link org.bimserver.models.store.Checkout#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.store.StorePackage#getCheckout()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface Checkout extends IdEObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright bimserver.org 2009\r\n Licensed under GNU GPLv3\r\n http://www.gnu.org/licenses/gpl-3.0.txt\r\n For more information mail to license@bimserver.org\r\n \r\n Bimserver.org is free software: you can redistribute it and/or modify \r\n it under the terms of the GNU General Public License as published by \r\n the Free Software Foundation, either version 3 of the License, or\r\n (at your option) any later version.\r\n \r\n Bimserver.org is distributed in the hope that it will be useful, but \r\n WITHOUT ANY WARRANTY; without even the implied warranty of \r\n MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU \r\n General Public License for more details.\r\n \r\n You should have received a copy of the GNU General Public License a \r\n long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.";

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.store.Revision#getCheckouts <em>Checkouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' reference.
	 * @see #setRevision(Revision)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_Revision()
	 * @see org.bimserver.models.store.Revision#getCheckouts
	 * @model opposite="checkouts"
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.store.Project#getCheckouts <em>Checkouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_Project()
	 * @see org.bimserver.models.store.Project#getCheckouts
	 * @model opposite="checkouts"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Checkin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkin</em>' reference.
	 * @see #setCheckin(Revision)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_Checkin()
	 * @model
	 * @generated
	 */
	Revision getCheckin();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#getCheckin <em>Checkin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkin</em>' reference.
	 * @see #getCheckin()
	 * @generated
	 */
	void setCheckin(Revision value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.bimserver.models.store.StorePackage#getCheckout_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Checkout#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // Checkout
