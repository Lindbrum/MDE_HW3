/**
 */
package daGiMa_MDE_HW3.provider;


import daGiMa_MDE_HW3.Container;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Factory;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;

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
 * This is the item provider adapter for a {@link daGiMa_MDE_HW3.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider 
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
	public ContainerItemProvider(AdapterFactory adapterFactory) {
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

			addModel_namePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModel_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_model_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_model_name_feature", "_UI_Container_type"),
				 DaGiMa_MDE_HW3Package.Literals.CONTAINER__MODEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__UNIVERSITIES);
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__PROFESSORS);
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__STUDENTS);
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__COURSES);
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__CUSTOM_ENUMERATIONS);
			childrenFeatures.add(DaGiMa_MDE_HW3Package.Literals.CONTAINER__EXTRA_INFOS);
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
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Container)object).getModel_name();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
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

		switch (notification.getFeatureID(Container.class)) {
			case DaGiMa_MDE_HW3Package.CONTAINER__MODEL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DaGiMa_MDE_HW3Package.CONTAINER__UNIVERSITIES:
			case DaGiMa_MDE_HW3Package.CONTAINER__PROFESSORS:
			case DaGiMa_MDE_HW3Package.CONTAINER__STUDENTS:
			case DaGiMa_MDE_HW3Package.CONTAINER__COURSES:
			case DaGiMa_MDE_HW3Package.CONTAINER__CUSTOM_ENUMERATIONS:
			case DaGiMa_MDE_HW3Package.CONTAINER__EXTRA_INFOS:
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
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__UNIVERSITIES,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createUniversity()));

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__PROFESSORS,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor()));

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__STUDENTS,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent()));

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__COURSES,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createCourse()));

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__CUSTOM_ENUMERATIONS,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createCustomEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(DaGiMa_MDE_HW3Package.Literals.CONTAINER__EXTRA_INFOS,
				 DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DaGiMa_MDE_HW3EditPlugin.INSTANCE;
	}

}
