package it.univaq.mde.hw4.dagima;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import daGiMa_MDE_HW4_old.Career;
import daGiMa_MDE_HW4_old.Container;
import daGiMa_MDE_HW4_old.Course;
import daGiMa_MDE_HW4_old.CoursePeriod;
import daGiMa_MDE_HW4_old.CreditType;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldFactory;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage;
import daGiMa_MDE_HW4_old.DegreeCourse;
import daGiMa_MDE_HW4_old.DegreeCourseType;
import daGiMa_MDE_HW4_old.Department;
import daGiMa_MDE_HW4_old.ExamType;
import daGiMa_MDE_HW4_old.ExaminationCall;
import daGiMa_MDE_HW4_old.News;
import daGiMa_MDE_HW4_old.PassingGrade;
import daGiMa_MDE_HW4_old.Professor;
import daGiMa_MDE_HW4_old.Student;
import daGiMa_MDE_HW4_old.Thesis;
import daGiMa_MDE_HW4_old.ThesisType;
import daGiMa_MDE_HW4_old.University;

public class MyPluginOld {
public static Container create() {
		
		//Used to set date attributes
		Calendar calendar = Calendar.getInstance();
		
		calendar.clear();
		//Student - Dario
		Student studentDario = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentDario.setName("Dario");
		studentDario.setSurname("D'Ercole");
		calendar.set(1995, 11, 26);
		studentDario.setBirth_date(calendar.getTime());
		studentDario.setEmail("d.d@u.it");
		studentDario.setMatriculation_number(288615);
		studentDario.setTelephone("+393839082312");
		
		
		
		//Professor - Alesse
		calendar.clear();
		Professor profAlesse = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profAlesse.setName("Edoardo");
		profAlesse.setSurname("Alesse");
		calendar.set(1995, 11, 26);
		profAlesse.setBirth_date(calendar.getTime());
		profAlesse.setEmail("e.a@u.it");
		profAlesse.setOffice_telephone("08622380320");
		profAlesse.setOrcid("fo2030-dfidf3-2398293");
		profAlesse.setTelephone("+3937478374423");
		
		calendar.clear();
		//Professor - Muccini
		Professor profMuccini = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profMuccini.setName("Henry");
		profMuccini.setSurname("Muccini");
		calendar.set(1995, 11, 26);
		profMuccini.setBirth_date(calendar.getTime());
		profMuccini.setEmail("h.m@u.it");
		profMuccini.setOffice_telephone("08622380321");
		profMuccini.setOrcid("fo2033-dfiaf3-2398283");
		profMuccini.setTelephone("+39328278332");
		
		calendar.clear();
		//Professor - Pierantonio
		Professor profPierantonio = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profPierantonio.setName("Alfonso");
		profPierantonio.setSurname("Pierantonio");
		calendar.set(1995, 11, 26);
		profPierantonio.setBirth_date(calendar.getTime());
		profPierantonio.setEmail("a.p@u.it");
		profPierantonio.setOffice_telephone("08622380322");
		profPierantonio.setOrcid("fo2022-dfanf3-2398283");
		profPierantonio.setTelephone("+39389328721");
		
		//University - L'Aquila
		University universityLaquila = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createUniversity();
		universityLaquila.setName("University of L'Aquila");
		universityLaquila.setRector(profAlesse);
		
		//Department - Disim
		Department departmentDisim = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDepartment();
		departmentDisim.setName("DISIM");
		departmentDisim.setUniversity(universityLaquila);
		departmentDisim.setWebsite("www.disim.it");
		
		//News - for DISIM by Henry Muccini
		News newsDisimMuccini = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createNews();
		newsDisimMuccini.setTitle("This is a title");
		newsDisimMuccini.setAuthor(profMuccini);
		newsDisimMuccini.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		newsDisimMuccini.setDepartment(departmentDisim);
		calendar.clear();
		calendar.set(2023, 11, 10);
		newsDisimMuccini.setPublication_date(calendar.getTime());
		
		//Degree course - Computer Science
		DegreeCourse degreeCourseCS = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		degreeCourseCS.setName("Computer Science");
		degreeCourseCS.setType(DegreeCourseType.BACHELOR_DEGREE);
		degreeCourseCS.setCfu(180);
		degreeCourseCS.setCode("L-31");
		degreeCourseCS.setCoordinator(profMuccini);
		degreeCourseCS.setDepartment(departmentDisim);
		degreeCourseCS.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		degreeCourseCS.setDuration(3);
		degreeCourseCS.getLanguage().addAll(Arrays.asList("Italian"));
		degreeCourseCS.setReference_year(2020);
		
		//Degree course - Master in Computer Science (ASE)
		DegreeCourse degreeCourseASE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		degreeCourseASE.setName("Master degree in Computer Science (Advanced Software Engineering)");
		degreeCourseASE.setType(DegreeCourseType.MASTER_DEGREE);
		degreeCourseASE.setCfu(120);
		degreeCourseASE.setCode("L-32");
		degreeCourseASE.setCoordinator(profMuccini);
		degreeCourseASE.setDepartment(departmentDisim);
		degreeCourseASE.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		degreeCourseASE.setDuration(2);
		degreeCourseASE.getLanguage().addAll(Arrays.asList("English"));
		degreeCourseASE.setReference_year(2023);
		
		//Post-graduate - Web technologies master
		DegreeCourse degreeCourseWT = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		degreeCourseWT.setName("Master in Web Technologies");
		degreeCourseWT.setType(DegreeCourseType.MASTER);
		degreeCourseWT.setCfu(60);
		degreeCourseWT.setCode("L-51");
		degreeCourseWT.setCoordinator(profMuccini);
		degreeCourseWT.setDepartment(departmentDisim);
		degreeCourseWT.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		degreeCourseWT.setDuration(1);
		degreeCourseWT.getLanguage().addAll(Arrays.asList("Italian"));
		degreeCourseWT.setReference_year(2023);
		
		//Add enrolled courses to student
		studentDario.getEnrolled_courses().addAll(Arrays.asList(degreeCourseCS, degreeCourseASE));
		
		//Thesis - Dario -> Computer Science
		Thesis thesisDarioCS = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createThesis();
		thesisDarioCS.setDegree_course(degreeCourseCS);
		thesisDarioCS.setStudent(studentDario);
		thesisDarioCS.setSupervisor(profPierantonio);
		thesisDarioCS.setTitle("A thesis on lorem ipsum yadada");
		thesisDarioCS.setType(ThesisType.COMPILATION);
		
		//Course - Software Engineering
		Course courseSE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createCourse();
		
		courseSE.setName("Software Engineering 20-21");
		courseSE.setCfu(15);
		courseSE.setId_course("F1000");
		courseSE.setCredit_type(CreditType.B);
		courseSE.getDegree_courses().addAll(Arrays.asList(degreeCourseCS));
		courseSE.getLanguage().addAll(Arrays.asList("Italian"));
		courseSE.setPeriod(CoursePeriod.FIRST_SEMESTER);
		courseSE.getTeachers().addAll(Arrays.asList(profMuccini));
		courseSE.setYear(2);
		
		
		//Examination call - Software Engineering #1
		calendar.clear();
		ExaminationCall examCallSE1 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallSE1.setClassroom("A1.6");
		examCallSE1.setCourse(courseSE);
		calendar.set(2021, 0, 14);
		examCallSE1.setDate(calendar.getTime());
		examCallSE1.setDescription("First winter call for Software Engineering 20-21");
		examCallSE1.setType(ExamType.PROJECT);
		
		//Examination call - Software Engineering #2
		calendar.clear();
		ExaminationCall examCallSE2 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallSE2.setClassroom("A1.6");
		examCallSE2.setCourse(courseSE);
		calendar.set(2021, 0, 28);
		examCallSE2.setDate(calendar.getTime());
		examCallSE2.setDescription("Second winter call for Software Engineering 20-21");
		examCallSE2.setType(ExamType.PROJECT);
		
		//Examination call - Software Engineering #3
		calendar.clear();
		ExaminationCall examCallSE3 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallSE3.setClassroom("A1.6");
		examCallSE3.setCourse(courseSE);
		calendar.set(2021, 1, 11);
		examCallSE3.setDate(calendar.getTime());
		examCallSE3.setDescription("Third winter call for Software Engineering 20-21");
		examCallSE3.setType(ExamType.PROJECT);
		//Add student booking
		examCallSE3.getBooked_students().addAll(Arrays.asList(studentDario));
		
		//Course - Model-driven Engineering
		Course courseMDE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createCourse();
		
		courseMDE.setName("Model-driven Engineering 23-24");
		courseMDE.setCfu(15);
		courseMDE.setId_course("F1100");
		courseMDE.setCredit_type(CreditType.B);
		courseMDE.getDegree_courses().addAll(Arrays.asList(degreeCourseASE));
		courseMDE.getLanguage().addAll(Arrays.asList("English"));
		courseMDE.setPeriod(CoursePeriod.FIRST_SEMESTER);
		courseMDE.getTeachers().addAll(Arrays.asList(profPierantonio));
		courseMDE.setYear(1);
		
		//Examination call - Model-driven Engineering #1
		calendar.clear();
		ExaminationCall examCallMDE1 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallMDE1.setClassroom("A1.6");
		examCallMDE1.setCourse(courseMDE);
		calendar.set(2024, 0, 18);
		examCallMDE1.setDate(calendar.getTime());
		examCallMDE1.setDescription("First winter call for Model-driven Engineering 23-24");
		examCallMDE1.setType(ExamType.PROJECT);
		//Add student booking
		examCallMDE1.getBooked_students().addAll(Arrays.asList(studentDario));
		
		//Examination call - Model-driven Engineering #2
		calendar.clear();
		ExaminationCall examCallMDE2 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallMDE2.setClassroom("A1.6");
		examCallMDE2.setCourse(courseMDE);
		calendar.set(2024, 1, 1);
		examCallMDE2.setDate(calendar.getTime());
		examCallMDE2.setDescription("Second winter call for Model-driven Engineering 23-24");
		examCallMDE2.setType(ExamType.PROJECT);
		
		//Examination call - Model-driven Engineering #3
		calendar.clear();
		ExaminationCall examCallMDE3 = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createExaminationCall();
		examCallMDE3.setClassroom("A1.6");
		examCallMDE3.setCourse(courseMDE);
		calendar.set(2024, 1, 15);
		examCallMDE3.setDate(calendar.getTime());
		examCallMDE3.setDescription("Third winter call for Model-driven Engineering 23-24");
		examCallMDE3.setType(ExamType.PROJECT);
		
		
		//Career - Dario -> Computer Science
		Career careerDarioCS = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createCareer();
		careerDarioCS.setDegree_course(degreeCourseCS);
		careerDarioCS.setStudent(studentDario);
		careerDarioCS.setName("Student Transcript ["+careerDarioCS.getStudent().getMatriculation_number()+" - "+careerDarioCS.getDegree_course().getName()+"]");
		
		//Passing grade - Dario -> Software Engineering
		PassingGrade passingGradeDarioSE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createPassingGrade();
		passingGradeDarioSE.setCourse(courseSE);
		passingGradeDarioSE.setDate(courseSE.getCalls().get(2).getDate());
		passingGradeDarioSE.setGrade("26");
		passingGradeDarioSE.setStudent(careerDarioCS);
		
		//Career - Dario -> Computer Science Master (ASE)
		Career careerDarioASE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createCareer();
		careerDarioASE.setDegree_course(degreeCourseASE);
		careerDarioASE.setStudent(studentDario);
		careerDarioASE.setName("Student Transcript ["+careerDarioASE.getStudent().getMatriculation_number()+" - "+careerDarioASE.getDegree_course().getName()+"]");
		
		//Passing grade - Dario -> Model-Driven Engineering
		PassingGrade passingGradeDarioMDE = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createPassingGrade();
		passingGradeDarioMDE.setCourse(courseMDE);
		passingGradeDarioMDE.setDate(null);
		passingGradeDarioMDE.setGrade("");
		passingGradeDarioMDE.setStudent(careerDarioASE);
		
		//Root
		Container container = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createContainer();
		container.setModel_name(MODEL_1);
		container.getCourses().addAll(Arrays.asList(courseSE, courseMDE));
		container.getProfessors().addAll(Arrays.asList(profAlesse, profMuccini, profPierantonio));
		container.getStudents().addAll(Arrays.asList(studentDario));
		container.getUniversities().addAll(Arrays.asList(universityLaquila));
		
		return container;
	}

	public static Container create_2() {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.clear();
		//Student - Giovanni
		Student studentGiovanni = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentGiovanni.setName("Giovanni");
		studentGiovanni.setSurname("Rossi");
		calendar.set(1995, 11, 26);
		studentGiovanni.setBirth_date(calendar.getTime());
		studentGiovanni.setEmail("gr@u.it");
		studentGiovanni.setMatriculation_number(100100);
		studentGiovanni.setTelephone("+393348754120");
		
		calendar.clear();
		//Student - Mattia
		Student studentMattia = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentMattia.setName("Mattia");
		studentMattia.setSurname("Pino");
		calendar.set(1995, 11, 26);
		studentMattia.setBirth_date(calendar.getTime());
		studentMattia.setEmail("mp@u.it");
		studentMattia.setMatriculation_number(100101);
		studentMattia.setTelephone("+393458741102");
		
		calendar.clear();
		//Student - Federica
		Student studentFederica = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentFederica.setName("Federica");
		studentFederica.setSurname("Verdi");
		calendar.set(1995, 11, 26);
		studentFederica.setBirth_date(calendar.getTime());
		studentFederica.setEmail("fv@u.it");
		studentFederica.setMatriculation_number(100102);
		studentFederica.setTelephone("+393588741259");
		
		calendar.clear();
		//Student - Nicola
		Student studentNicola = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentNicola.setName("Nicola");
		studentNicola.setSurname("Klauss");
		calendar.set(1995, 11, 26);
		studentNicola.setBirth_date(calendar.getTime());
		studentNicola.setEmail("nk@u.it");
		studentNicola.setMatriculation_number(100103);
		studentNicola.setTelephone("+393878744714");
		
		calendar.clear();
		//Student - Giuseppe
		Student studentGiuseppe = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createStudent();
		studentGiuseppe.setName("Giuseppe");
		studentGiuseppe.setSurname("Bianchi");
		calendar.set(1995, 11, 26);
		studentGiuseppe.setBirth_date(calendar.getTime());
		studentGiuseppe.setEmail("gb@u.it");
		studentGiuseppe.setMatriculation_number(100104);
		studentGiuseppe.setTelephone("+393214569874");
	
		calendar.clear();
		//Professor - Davide
		Professor profDavide = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profDavide.setName("Davide");
		profDavide.setSurname("D'Ettore");
		calendar.set(1995, 11, 26);
		profDavide.setBirth_date(calendar.getTime());
		profDavide.setEmail("dd@p.u.it");
		profDavide.setOffice_telephone("08627896541");
		profDavide.setOrcid("fo2077-perdf3-147852");
		profDavide.setTelephone("+393654789541");
		
		calendar.clear();
		//Professor - Vittorio
		Professor profVittorio = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profVittorio.setName("Vittorio");
		profVittorio.setSurname("Melassi");
		calendar.set(1995, 11, 26);
		profVittorio.setBirth_date(calendar.getTime());
		profVittorio.setEmail("vm@p.u.it");
		profVittorio.setOffice_telephone("08627896541");
		profVittorio.setOrcid("er5877-aswef4-784757");
		profVittorio.setTelephone("+393541414102");
		
		calendar.clear();
		//Professor - Alesse
		Professor profAlesse = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createProfessor();
		profAlesse.setName("Edoardo");
		profAlesse.setSurname("Alesse");
		calendar.set(1995, 11, 26);
		profAlesse.setBirth_date(calendar.getTime());
		profAlesse.setEmail("e.a@u.it");
		profAlesse.setOffice_telephone("08622380320");
		profAlesse.setOrcid("fo2030-dfidf3-2398293");
		profAlesse.setTelephone("+3937478374423");
		
		//University - L'Aquila
		University universityLaquila = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createUniversity();
		universityLaquila.setName("University of L'Aquila");
		universityLaquila.setRector(profAlesse);
				
		//Department - Disim
		Department departmentDisim = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDepartment();
		departmentDisim.setName("DISIM");
		departmentDisim.setUniversity(universityLaquila);
		departmentDisim.setWebsite("www.disim.it");
		
		//PhD - PhD in Computer Science
		DegreeCourse phdCS = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		phdCS.setName("PhD in Computer Science");
		phdCS.setType(DegreeCourseType.PHD);
		phdCS.setCfu(11);
		phdCS.setCode("P-01");
		phdCS.setCoordinator(profDavide);
		phdCS.setDepartment(departmentDisim);
		phdCS.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		phdCS.setDuration(1);
		phdCS.getLanguage().addAll(Arrays.asList("English"));
		phdCS.setReference_year(2023);
		
		
		//PhD - PhD in Analysis
		DegreeCourse phdAN = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		phdAN.setName("PhD in Analysis");
		phdAN.setType(DegreeCourseType.PHD);
		phdAN.setCfu(11);
		phdAN.setCode("P-02");
		phdAN.setCoordinator(profVittorio);
		phdAN.setDepartment(departmentDisim);
		phdAN.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		phdAN.setDuration(1);
		phdAN.getLanguage().addAll(Arrays.asList("English"));
		phdAN.setReference_year(2023);
				
		//PhD - PhD in Artificial Intelligence
		DegreeCourse phdAI = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createDegreeCourse();
		phdAI.setName("PhD in Artificial Intelligence");
		phdAI.setType(DegreeCourseType.PHD);
		phdAI.setCfu(11);
		phdAI.setCode("P-03");
		phdAI.setCoordinator(profVittorio);
		phdAI.setDepartment(departmentDisim);
		phdAI.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque."
				);
		phdAI.setDuration(1);
		phdAI.getLanguage().addAll(Arrays.asList("English"));
		phdAI.setReference_year(2023);
		
		studentFederica.getEnrolled_courses().addAll(Arrays.asList(phdAI));
		studentGiovanni.getEnrolled_courses().addAll(Arrays.asList(phdAN));
		studentGiuseppe.getEnrolled_courses().addAll(Arrays.asList(phdCS));
		studentMattia.getEnrolled_courses().addAll(Arrays.asList(phdAI));
		studentNicola.getEnrolled_courses().addAll(Arrays.asList(phdCS));
				
		//Root
		Container container = DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createContainer();
		container.setModel_name(MODEL_2);
		//container.getCourses().addAll(Arrays.asList());
		container.getProfessors().addAll(Arrays.asList(profAlesse, profDavide, profVittorio));
		container.getStudents().addAll(Arrays.asList(studentFederica, studentGiovanni, studentGiuseppe, studentMattia, studentNicola));
		container.getUniversities().addAll(Arrays.asList(universityLaquila));
		
		return container;
	}
	

	public static Diagnostic validate(EObject model) {
		return Diagnostician.INSTANCE.validate(model);
	}
	
	public final static String FILENAME_TEMPLATE = "%s.xmi";
	public final static String MODEL_1 = "Instance1";
	public final static String MODEL_2 = "Instance2";
	
	public final static String SELECTED_MODEL = MODEL_2;

	public static void main(String[] args) {
		
		Container root;
		Container loadedRoot;
		Diagnostic d;
		
		switch(SELECTED_MODEL) {
		default:
			System.err.println("Invalid model selection, defaulting to %s".formatted(MODEL_1));
			/*FALL-THROUGH*/
		case MODEL_1:
			root = create();
			serializeModel(root, FILENAME_TEMPLATE);
			loadedRoot = load(FILENAME_TEMPLATE.formatted(MODEL_1));
			break;
			
		case MODEL_2:
			root = create_2();
			serializeModel(root, FILENAME_TEMPLATE);
			loadedRoot = load(FILENAME_TEMPLATE.formatted(MODEL_2));
			break;
		}
		
		d = validate(loadedRoot);
		if(d.getSeverity() != Diagnostic.ERROR)
			System.out.println("the model is valid.".formatted(root.getModel_name()));
		else
			System.err.println("The model is not valid: \n\n".formatted(root.getModel_name()) + d.getMessage() + "\n\nDiagnosis source: " + d.getSource());
			
	}

	public static Container load(String fileName) {
		EPackage.Registry.INSTANCE.put(DaGiMa_MDE_HW4_oldPackage.eNS_URI, DaGiMa_MDE_HW4_oldPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Container myModel = (Container) resource.getContents().get(0);
		System.out.println(myModel);
		return myModel;
	}
	
	public static void serializeModel(Container wm, String fileNameTemplate) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
	
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
	
		String fileName = fileNameTemplate.formatted(wm.getModel_name());
		
		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);
	
		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
