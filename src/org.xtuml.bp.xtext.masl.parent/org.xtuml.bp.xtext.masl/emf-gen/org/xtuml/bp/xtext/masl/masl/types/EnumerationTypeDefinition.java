/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.EnumerationTypeDefinition#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface EnumerationTypeDefinition extends AbstractTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Enumerators</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtuml.bp.xtext.masl.masl.types.Enumerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerators</em>' containment reference list.
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getEnumerationTypeDefinition_Enumerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumerator> getEnumerators();

} // EnumerationTypeDefinition
