/**
 */
package daGiMa_MDE_HW4_dest.provider;


import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
import daGiMa_MDE_HW4_dest.DegreeCourse;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link daGiMa_MDE_HW4_dest.DegreeCourse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DegreeCourseItemProvider 
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
	public DegreeCourseItemProvider(AdapterFactory adapterFactory) {
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
			addReference_yearPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addCfuPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addCoordinatorPropertyDescriptor(object);
			addEnrolled_studentsPropertyDescriptor(object);
			addCourse_cataloguePropertyDescriptor(object);
			addExtra_infoPropertyDescriptor(object);
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
				 getString("_UI_DegreeCourse_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_code_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__CODE,
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
				 getString("_UI_DegreeCourse_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_name_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReference_yearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_reference_year_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_reference_year_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__REFERENCE_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_duration_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_DegreeCourse_cfu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_cfu_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__CFU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_description_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__DESCRIPTION,
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
				 getString("_UI_DegreeCourse_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_language_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordinator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_coordinator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_coordinator_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__COORDINATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enrolled students feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnrolled_studentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_enrolled_students_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_enrolled_students_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__ENROLLED_STUDENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Course catalogue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCourse_cataloguePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DegreeCourse_course_catalogue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_course_catalogue_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__COURSE_CATALOGUE,
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
				 getString("_UI_DegreeCourse_extra_info_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DegreeCourse_extra_info_feature", "_UI_DegreeCourse_type"),
				 DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__EXTRA_INFO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DegreeCourse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DegreeCourse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DegreeCourse)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DegreeCourse_type") :
			getString("_UI_DegreeCourse_type") + " " + label;
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

		switch (notification.getFeatureID(DegreeCourse.class)) {
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__CODE:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__NAME:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__REFERENCE_YEAR:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__DURATION:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__CFU:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__DESCRIPTION:
			case DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__LANGUAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
