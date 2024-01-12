/**
 */
package daGiMa_MDE_HW4_dest.provider;


import daGiMa_MDE_HW4_dest.Course;
import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destFactory;
import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daGiMa_MDE_HW4_dest.Course} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCodePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addCfuPropertyDescriptor(object);
			addCredit_typePropertyDescriptor(object);
			addYearPropertyDescriptor(object);
			addTeachersPropertyDescriptor(object);
			addDegree_coursesPropertyDescriptor(object);
			addStudents_gradesPropertyDescriptor(object);
			addExtra_infoPropertyDescriptor(object);
			addTeaching_period_start_dayPropertyDescriptor(object);
			addTeaching_period_start_monthPropertyDescriptor(object);
			addTeaching_period_start_yearPropertyDescriptor(object);
			addTeaching_period_end_dayPropertyDescriptor(object);
			addTeaching_period_end_monthPropertyDescriptor(object);
			addTeaching_period_end_yearPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_code_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_name_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_language_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cfu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCfuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_cfu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_cfu_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CFU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Credit type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCredit_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_credit_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_credit_type_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CREDIT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_year_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_year_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teachers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeachersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teachers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teachers_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Degree courses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDegree_coursesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_degree_courses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_degree_courses_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__DEGREE_COURSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Students grades feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStudents_gradesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_students_grades_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_students_grades_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__STUDENTS_GRADES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extra info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtra_infoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_extra_info_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_extra_info_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__EXTRA_INFO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period start day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_start_dayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_start_day_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_start_day_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_DAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period start month feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_start_monthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_start_month_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_start_month_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_MONTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period start year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_start_yearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_start_year_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_start_year_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period end day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_end_dayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_end_day_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_end_day_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_DAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period end month feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_end_monthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_end_month_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_end_month_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_MONTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teaching period end year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeaching_period_end_yearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_teaching_period_end_year_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_teaching_period_end_year_feature", "_UI_Course_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CALLS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Course.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Course"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Course)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Course_type") :
			getString("_UI_Course_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Course.class)) {
			case DaGiMa_MDE_HW4_destPackage.COURSE__CODE:
			case DaGiMa_MDE_HW4_destPackage.COURSE__NAME:
			case DaGiMa_MDE_HW4_destPackage.COURSE__LANGUAGE:
			case DaGiMa_MDE_HW4_destPackage.COURSE__CFU:
			case DaGiMa_MDE_HW4_destPackage.COURSE__CREDIT_TYPE:
			case DaGiMa_MDE_HW4_destPackage.COURSE__YEAR:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_START_DAY:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_START_MONTH:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_START_YEAR:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_END_DAY:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_END_MONTH:
			case DaGiMa_MDE_HW4_destPackage.COURSE__TEACHING_PERIOD_END_YEAR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DaGiMa_MDE_HW4_destPackage.COURSE__CALLS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CALLS,
				 DaGiMa_MDE_HW4_destFactory.eINSTANCE.createExaminationCall()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DaGiMa_MDE_HW4_destEditPlugin.INSTANCE;
	}

}
