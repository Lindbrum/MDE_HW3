/**
 */
package daGiMa_MDE_HW3;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getValue <em>Value</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getLower_multiplicity <em>Lower multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getHigher_multiplicity <em>Higher multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExtraInfo#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DoubleValueTypeCheck'"
 * @generated
 */
public interface ExtraInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"STRING"</code>.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW3.MetadataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.MetadataType
	 * @see #setType(MetadataType)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Type()
	 * @model default="STRING" required="true"
	 * @generated
	 */
	MetadataType getType();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.MetadataType
	 * @see #getType()
	 * @generated
	 */
	void setType(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Lower multiplicity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower multiplicity</em>' attribute.
	 * @see #setLower_multiplicity(int)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Lower_multiplicity()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLower_multiplicity();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getLower_multiplicity <em>Lower multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower multiplicity</em>' attribute.
	 * @see #getLower_multiplicity()
	 * @generated
	 */
	void setLower_multiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Higher multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher multiplicity</em>' attribute.
	 * @see #setHigher_multiplicity(int)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Higher_multiplicity()
	 * @model required="true"
	 * @generated
	 */
	int getHigher_multiplicity();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getHigher_multiplicity <em>Higher multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher multiplicity</em>' attribute.
	 * @see #getHigher_multiplicity()
	 * @generated
	 */
	void setHigher_multiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference.
	 * @see #setEnum(CustomEnumeration)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExtraInfo_Enum()
	 * @model
	 * @generated
	 */
	CustomEnumeration getEnum();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExtraInfo#getEnum <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(CustomEnumeration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'BOOLEAN\' or value.oclIsTypeOf(Boolean)'"
	 * @generated
	 */
	boolean BooleanValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'FLOAT\' or value.oclIsTypeOf(Real)'"
	 * @generated
	 */
	boolean FloatValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'STRING\' or value.oclIsTypeOf(String)'"
	 * @generated
	 */
	boolean StringValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'ENUMERATION\' or (enum?.values-&gt;exists(enumValue|enumValue = self.value))'"
	 * @generated
	 */
	boolean EnumValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'INTEGER\' or value.oclIsTypeOf(Integer)'"
	 * @generated
	 */
	boolean IntegerValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttype &lt;&gt; \'DOUBLE\' or value.oclIsTypeOf(Real)'"
	 * @generated
	 */
	boolean DoubleValueTypeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExtraInfo
