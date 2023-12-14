/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.CustomEnumeration;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Tables;
import daGiMa_MDE_HW3.ExtraInfo;
import daGiMa_MDE_HW3.MetadataType;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.BooleanType;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getLower_multiplicity <em>Lower multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getHigher_multiplicity <em>Higher multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtraInfoImpl extends MinimalEObjectImpl.Container implements ExtraInfo {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MetadataType TYPE_EDEFAULT = MetadataType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MetadataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower_multiplicity() <em>Lower multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower_multiplicity() <em>Lower multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected int lower_multiplicity = LOWER_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigher_multiplicity() <em>Higher multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHigher_multiplicity() <em>Higher multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected int higher_multiplicity = HIGHER_MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected CustomEnumeration enum_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MetadataType newType) {
		MetadataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLower_multiplicity() {
		return lower_multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower_multiplicity(int newLower_multiplicity) {
		int oldLower_multiplicity = lower_multiplicity;
		lower_multiplicity = newLower_multiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY, oldLower_multiplicity, lower_multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHigher_multiplicity() {
		return higher_multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigher_multiplicity(int newHigher_multiplicity) {
		int oldHigher_multiplicity = higher_multiplicity;
		higher_multiplicity = newHigher_multiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY, oldHigher_multiplicity, higher_multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEnumeration getEnum() {
		if (enum_ != null && enum_.eIsProxy()) {
			InternalEObject oldEnum = (InternalEObject)enum_;
			enum_ = (CustomEnumeration)eResolveProxy(oldEnum);
			if (enum_ != oldEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM, oldEnum, enum_));
			}
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEnumeration basicGetEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(CustomEnumeration newEnum) {
		CustomEnumeration oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean BooleanValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::BooleanValueTypeCheck";
		try {
			/**
			 *
			 * inv BooleanValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'BOOLEAN' or
			 *         value.oclIsTypeOf(Boolean)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___BOOLEAN_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ BooleanType TYP_Boolean = (BooleanType)idResolver.getClass(TypeId.BOOLEAN, null);
				final /*@NonInvalid*/ MetadataType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_BOOLEAN;
				final /*@NonInvalid*/ Boolean result;
				if (ne) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, value, TYP_Boolean).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean FloatValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::FloatValueTypeCheck";
		try {
			/**
			 *
			 * inv FloatValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'FLOAT' or value.oclIsTypeOf(Real)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___FLOAT_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ PrimitiveType TYP_Real = (PrimitiveType)idResolver.getClass(TypeId.REAL, null);
				final /*@NonInvalid*/ MetadataType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_FLOAT;
				final /*@NonInvalid*/ Boolean result;
				if (ne) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, value, TYP_Real).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean StringValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::StringValueTypeCheck";
		try {
			/**
			 *
			 * inv StringValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'STRING' or
			 *         value.oclIsTypeOf(String)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___STRING_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ PrimitiveType TYP_String = (PrimitiveType)idResolver.getClass(TypeId.STRING, null);
				final /*@NonInvalid*/ MetadataType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_STRING;
				final /*@NonInvalid*/ Boolean result;
				if (ne) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, value, TYP_String).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EnumValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::EnumValueTypeCheck";
		try {
			/**
			 *
			 * inv EnumValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'ENUMERATION' or
			 *         enum?.values->exists(enumValue | enumValue = self.value)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___ENUM_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ MetadataType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_ENUMERATION;
					final /*@Thrown*/ Boolean result;
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_exists;
						try {
							final /*@NonInvalid*/ CustomEnumeration enum1 = this.getEnum();
							final /*@NonInvalid*/ Object values = enum1 == null;
							/*@Thrown*/ OrderedSetValue safe_values_source;
							if (values == Boolean.TRUE) {
								safe_values_source = null;
							}
							else {
								assert enum1 != null;
								final /*@Thrown*/ List<String> values_0 = enum1.getValues();
								final /*@Thrown*/ OrderedSetValue BOXED_values_0 = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_PRIMid_String, values_0);
								safe_values_source = BOXED_values_0;
							}
							if (safe_values_source == null) {
								throw new InvalidValueException("Null source for \'Collection(T).exists(Collection.T[?] | Lambda T() : Boolean[?]) : Boolean[?]\'");
							}
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_enumValue = safe_values_source.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_enumValue.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ String enumValue = (String)ITERATOR_enumValue.next();
								/**
								 * enumValue = self.value
								 */
								final /*@NonInvalid*/ String value = this.getValue();
								final /*@NonInvalid*/ boolean eq = enumValue.equals(value);
								//
								if (eq) {					// Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break;														// Stop immediately
								}
								else if (!eq) {				// Normal unsuccessful body evaluation result
									;															// Carry on
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						}
						catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_exists;
							}
							if (CAUGHT_exists == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean IntegerValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::IntegerValueTypeCheck";
		try {
			/**
			 *
			 * inv IntegerValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'INTEGER' or
			 *         value.oclIsTypeOf(Integer)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___INTEGER_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ PrimitiveType TYP_Integer = (PrimitiveType)idResolver.getClass(TypeId.INTEGER, null);
				final /*@NonInvalid*/ MetadataType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_INTEGER;
				final /*@NonInvalid*/ Boolean result;
				if (ne) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, value, TYP_Integer).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean DoubleValueTypeCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ExtraInfo::DoubleValueTypeCheck";
		try {
			/**
			 *
			 * inv DoubleValueTypeCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = type <> 'DOUBLE' or value.oclIsTypeOf(Real)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO___DOUBLE_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ PrimitiveType TYP_Real_0 = (PrimitiveType)idResolver.getClass(TypeId.REAL, null);
				final /*@NonInvalid*/ MetadataType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = DaGiMa_MDE_HW3Tables.ENUMid_MetadataType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_type != DaGiMa_MDE_HW3Tables.STR_DOUBLE;
				final /*@NonInvalid*/ Boolean result;
				if (ne) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, value, TYP_Real_0).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				return getName();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				return getValue();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				return getType();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				return getLower_multiplicity();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				return getHigher_multiplicity();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				if (resolve) return getEnum();
				return basicGetEnum();
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				setValue((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				setType((MetadataType)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				setLower_multiplicity((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				setHigher_multiplicity((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				setEnum((CustomEnumeration)newValue);
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				setLower_multiplicity(LOWER_MULTIPLICITY_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				setHigher_multiplicity(HIGHER_MULTIPLICITY_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				setEnum((CustomEnumeration)null);
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				return type != TYPE_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				return lower_multiplicity != LOWER_MULTIPLICITY_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				return higher_multiplicity != HIGHER_MULTIPLICITY_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				return enum_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___BOOLEAN_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return BooleanValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___FLOAT_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return FloatValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___STRING_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return StringValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___ENUM_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return EnumValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___INTEGER_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return IntegerValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DaGiMa_MDE_HW3Package.EXTRA_INFO___DOUBLE_VALUE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP:
				return DoubleValueTypeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", lower_multiplicity: ");
		result.append(lower_multiplicity);
		result.append(", higher_multiplicity: ");
		result.append(higher_multiplicity);
		result.append(')');
		return result.toString();
	}

} //ExtraInfoImpl
