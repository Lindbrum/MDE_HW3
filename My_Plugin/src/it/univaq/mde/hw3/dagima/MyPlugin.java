package it.univaq.mde.hw3.dagima;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import daGiMa_MDE_HW3.Career;
import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.CoursePeriod;
import daGiMa_MDE_HW3.CreditType;
import daGiMa_MDE_HW3.CustomEnumeration;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Factory;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.Department;
import daGiMa_MDE_HW3.ExamType;
import daGiMa_MDE_HW3.ExaminationCall;
import daGiMa_MDE_HW3.ExtraInfo;
import daGiMa_MDE_HW3.MetadataType;
import daGiMa_MDE_HW3.News;
import daGiMa_MDE_HW3.PassingGrade;
import daGiMa_MDE_HW3.Professor;
import daGiMa_MDE_HW3.Student;
import daGiMa_MDE_HW3.University;

public class MyPlugin {

	protected enum Metaclass{
		STUDENT, PROFESSOR, UNIVERSITY, 
	}
	protected Map<EClass,EObject> models = new HashMap<>();
	
	public static void create() {
		
		Calendar calendar = Calendar.getInstance();
		
		//Student - Dario
		Student studentDario = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentDario.setName("Dario");
		studentDario.setSurname("D'Ercole");
		studentDario.setEmail("d.d@u.it");
		studentDario.setMatriculation_number(288615);
		studentDario.setTelephone("+393839082312");
		
		
		//Professor - Alesse
		Professor profAlesse = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profAlesse.setName("Edoardo");
		profAlesse.setSurname("Alesse");
		profAlesse.setEmail("e.a@u.it");
		profAlesse.setOffice_telephone("08622380320");
		profAlesse.setOrcid("fo2030-dfidf3-2398293");
		profAlesse.setTelephone("+3937478374423");
		
		//Professor - Muccini
		Professor profMuccini = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profMuccini.setName("Henry");
		profMuccini.setSurname("Muccini");
		profMuccini.setEmail("h.m@u.it");
		profMuccini.setOffice_telephone("08622380321");
		profMuccini.setOrcid("fo2033-dfiaf3-2398283");
		profMuccini.setTelephone("+39328278332");
		
		//Professor - Pierantonio
		Professor profPierantonio = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profMuccini.setName("Alfonso");
		profMuccini.setSurname("Pierantonio");
		profMuccini.setEmail("a.p@u.it");
		profMuccini.setOffice_telephone("08622380322");
		profMuccini.setOrcid("fo2022-dfanf3-2398283");
		profMuccini.setTelephone("+39389328721");
		
		//University - L'Aquila
		University universityLaquila = DaGiMa_MDE_HW3Factory.eINSTANCE.createUniversity();
		universityLaquila.setName("University of L'Aquila");
		universityLaquila.setRector(profAlesse);
		
		//Department - Disim
		Department departmentDisim = DaGiMa_MDE_HW3Factory.eINSTANCE.createDepartment();
		departmentDisim.setName("DISIM");
		departmentDisim.setUniversity(universityLaquila);
		departmentDisim.setWebsite("www.disim.it");
		
		//News - for DISIM by Henry Muccini
		News newsDisimMuccini = DaGiMa_MDE_HW3Factory.eINSTANCE.createNews();
		newsDisimMuccini.setTitle("This is a title");
		newsDisimMuccini.setAuthor(profMuccini);
		newsDisimMuccini.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		newsDisimMuccini.setDepartment(departmentDisim);
		calendar.clear();
		calendar.set(2023, 11, 10);
		newsDisimMuccini.setPublication_date(calendar.getTime());
		
		//Degree course - Computer Science
		DegreeCourse degreeCourseCS = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		degreeCourseCS.setName("Computer Science");
		degreeCourseCS.setCfu(180);
		degreeCourseCS.setCode("L-31");
		degreeCourseCS.setCoordinator(profMuccini);
		degreeCourseCS.setDepartment(departmentDisim);
		degreeCourseCS.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		degreeCourseCS.setDuration(3);
		degreeCourseCS.getLanguage().addAll(Arrays.asList("Italian"));
		degreeCourseCS.setReference_year(2020);
		
		//Custom Enumeration: Degree types
		CustomEnumeration customEnumDegreeTypes = DaGiMa_MDE_HW3Factory.eINSTANCE.createCustomEnumeration();
		customEnumDegreeTypes.setName("DegreeType");
		customEnumDegreeTypes.getValues().addAll(Arrays.asList("BACHELOR_DEGREE", "MASTER_DEGREE", "POST_GRADUATE", "PHD"));
		
		//Extra info - DegreeType: BACHELOR_DEGREE
		ExtraInfo extraInfoDegreeTypeBachelor = DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo();
		extraInfoDegreeTypeBachelor.setEnum(customEnumDegreeTypes);
		extraInfoDegreeTypeBachelor.setLower_multiplicity(1);
		extraInfoDegreeTypeBachelor.setHigher_multiplicity(1);
		extraInfoDegreeTypeBachelor.setType(MetadataType.ENUMERATION);
		extraInfoDegreeTypeBachelor.setValue("BACHELOR_DEGREE");
		extraInfoDegreeTypeBachelor.setName(extraInfoDegreeTypeBachelor.getEnum().getName()+"_"+extraInfoDegreeTypeBachelor.getValue());
		
		//Add the degree type info to the computer science bachelor
		degreeCourseCS.getExtra_info().addAll(Arrays.asList(extraInfoDegreeTypeBachelor));
		
		//Degree course - Master in Computer Science (ASE)
		DegreeCourse degreeCourseASE = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		degreeCourseASE.setName("Master degree in Computer Science (Advanced Software Engineering)");
		degreeCourseASE.setCfu(120);
		degreeCourseASE.setCode("L-32");
		degreeCourseASE.setCoordinator(profMuccini);
		degreeCourseASE.setDepartment(departmentDisim);
		degreeCourseASE.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		degreeCourseASE.setDuration(2);
		degreeCourseASE.getLanguage().addAll(Arrays.asList("English"));
		degreeCourseASE.setReference_year(2023);
		
		//Extra info - DegreeType: MASTER_DEGREE
		ExtraInfo extraInfoDegreeTypeMaster = DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo();
		extraInfoDegreeTypeMaster.setEnum(customEnumDegreeTypes);
		extraInfoDegreeTypeMaster.setLower_multiplicity(1);
		extraInfoDegreeTypeMaster.setHigher_multiplicity(1);
		extraInfoDegreeTypeMaster.setType(MetadataType.ENUMERATION);
		extraInfoDegreeTypeMaster.setValue("MASTER_DEGREE");
		extraInfoDegreeTypeMaster.setName(extraInfoDegreeTypeMaster.getEnum().getName()+"_"+extraInfoDegreeTypeMaster.getValue());
		
		//Add the degree type info to the computer science master
		degreeCourseASE.getExtra_info().addAll(Arrays.asList(extraInfoDegreeTypeMaster));
		
		//Post-graduate - Web technologies master
		DegreeCourse degreeCourseWT = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		degreeCourseWT.setName("Master in Web Technologies");
		degreeCourseWT.setCfu(60);
		degreeCourseWT.setCode("L-51");
		degreeCourseWT.setCoordinator(profMuccini);
		degreeCourseWT.setDepartment(departmentDisim);
		degreeCourseWT.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		degreeCourseWT.setDuration(1);
		degreeCourseWT.getLanguage().addAll(Arrays.asList("Italian"));
		degreeCourseWT.setReference_year(2023);
		
		//Extra info - DegreeType: POST_GRADUATE
		ExtraInfo extraInfoDegreeTypePostGraduate = DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo();
		extraInfoDegreeTypePostGraduate.setEnum(customEnumDegreeTypes);
		extraInfoDegreeTypePostGraduate.setLower_multiplicity(1);
		extraInfoDegreeTypePostGraduate.setHigher_multiplicity(1);
		extraInfoDegreeTypePostGraduate.setType(MetadataType.ENUMERATION);
		extraInfoDegreeTypePostGraduate.setValue("POST_GRADUATE");
		extraInfoDegreeTypePostGraduate.setName(extraInfoDegreeTypePostGraduate.getEnum().getName()+"_"+extraInfoDegreeTypePostGraduate.getValue());
		
		
		//Custom Enumeration: post graduate level
		CustomEnumeration customEnumPostGraduateLevels = DaGiMa_MDE_HW3Factory.eINSTANCE.createCustomEnumeration();
		customEnumPostGraduateLevels.setName("PostGraduateLevel");
		customEnumPostGraduateLevels.getValues().addAll(Arrays.asList("FIRST", "SECOND"));
		
		//Extra info - PostGraduateLevel: FIRST
		ExtraInfo extraInfoPostGraduateLevelFirst = DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo();
		extraInfoPostGraduateLevelFirst.setEnum(customEnumPostGraduateLevels);
		extraInfoPostGraduateLevelFirst.setLower_multiplicity(1);
		extraInfoPostGraduateLevelFirst.setHigher_multiplicity(1);
		extraInfoPostGraduateLevelFirst.setType(MetadataType.ENUMERATION);
		extraInfoPostGraduateLevelFirst.setValue("FIRST");
		extraInfoPostGraduateLevelFirst.setName(extraInfoPostGraduateLevelFirst.getEnum().getName()+"_"+extraInfoPostGraduateLevelFirst.getValue());
		
		//Add the degree type info and the level to the post-graduate
		degreeCourseWT.getExtra_info().addAll(Arrays.asList(extraInfoDegreeTypePostGraduate, extraInfoPostGraduateLevelFirst));
		
		//Course - Software Engineering
		Course courseSE = DaGiMa_MDE_HW3Factory.eINSTANCE.createCourse();
		courseSE.setName("Software Engineering 20/21");
		courseSE.setCfu(15);
		courseSE.setCode("F1000");
		courseSE.setCredit_type(CreditType.B);
		courseSE.getDegree_courses().addAll(Arrays.asList(degreeCourseCS));
		courseSE.getLanguage().addAll(Arrays.asList("Italian"));
		courseSE.setPeriod(CoursePeriod.FIRST_SEMESTER);
		courseSE.getTeachers().addAll(Arrays.asList(profMuccini));
		courseSE.setYear(2);
		
		
		//Examination call - Software Engineering #1
		calendar.clear();
		ExaminationCall examCallSE1 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallSE1.setClassroom("A1.6");
		examCallSE1.setCourse(courseSE);
		calendar.set(2021, 0, 14);
		examCallSE1.setDate(calendar.getTime());
		examCallSE1.setDescription("First winter call for Software Engineering 20/21");
		examCallSE1.setType(ExamType.PROJECT);
		
		//Examination call - Software Engineering #2
		calendar.clear();
		ExaminationCall examCallSE2 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallSE2.setClassroom("A1.6");
		examCallSE2.setCourse(courseSE);
		calendar.set(2021, 0, 28);
		examCallSE2.setDate(calendar.getTime());
		examCallSE2.setDescription("Second winter call for Software Engineering 20/21");
		examCallSE2.setType(ExamType.PROJECT);
		
		//Examination call - Software Engineering #3
		calendar.clear();
		ExaminationCall examCallSE3 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallSE3.setClassroom("A1.6");
		examCallSE3.setCourse(courseSE);
		calendar.set(2021, 1, 11);
		examCallSE3.setDate(calendar.getTime());
		examCallSE3.setDescription("Third winter call for Software Engineering 20/21");
		examCallSE3.setType(ExamType.PROJECT);
		//Add student booking
		examCallSE3.getBooked_students().addAll(Arrays.asList(studentDario));
		
		
		//Course - Model-driven Engineering
		Course courseMDE = DaGiMa_MDE_HW3Factory.eINSTANCE.createCourse();
		courseMDE.setName("Model-driven Engineering 23/24");
		courseMDE.setCfu(15);
		courseMDE.setCode("F1100");
		courseMDE.setCredit_type(CreditType.B);
		courseMDE.getDegree_courses().addAll(Arrays.asList(degreeCourseASE));
		courseMDE.getLanguage().addAll(Arrays.asList("English"));
		courseMDE.setPeriod(CoursePeriod.FIRST_SEMESTER);
		courseMDE.getTeachers().addAll(Arrays.asList(profPierantonio));
		courseMDE.setYear(1);
		
		//Examination call - Model-driven Engineering #1
		calendar.clear();
		ExaminationCall examCallMDE1 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallMDE1.setClassroom("A1.6");
		examCallMDE1.setCourse(courseMDE);
		calendar.set(2024, 0, 18);
		examCallMDE1.setDate(calendar.getTime());
		examCallMDE1.setDescription("First winter call for Model-driven Engineering 23/24");
		examCallMDE1.setType(ExamType.PROJECT);
		//Add student booking
		examCallMDE1.getBooked_students().addAll(Arrays.asList(studentDario));
		
		//Examination call - Model-driven Engineering #2
		calendar.clear();
		ExaminationCall examCallMDE2 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallMDE2.setClassroom("A1.6");
		examCallMDE2.setCourse(courseMDE);
		calendar.set(2024, 1, 1);
		examCallMDE2.setDate(calendar.getTime());
		examCallMDE2.setDescription("Second winter call for Model-driven Engineering 23/24");
		examCallMDE2.setType(ExamType.PROJECT);
		
		//Examination call - Model-driven Engineering #3
		calendar.clear();
		ExaminationCall examCallMDE3 = DaGiMa_MDE_HW3Factory.eINSTANCE.createExaminationCall();
		examCallMDE3.setClassroom("A1.6");
		examCallMDE3.setCourse(courseMDE);
		calendar.set(2024, 1, 15);
		examCallMDE3.setDate(calendar.getTime());
		examCallMDE3.setDescription("Third winter call for Model-driven Engineering 23/24");
		examCallMDE3.setType(ExamType.PROJECT);
		
		//Career - Dario -> Computer Science
		Career careerDarioCS = DaGiMa_MDE_HW3Factory.eINSTANCE.createCareer();
		careerDarioCS.setDegree_course(degreeCourseCS);
		careerDarioCS.setStudent(studentDario);
		careerDarioCS.setName("Student Transcript ["+careerDarioCS.getStudent().getMatriculation_number()+" - "+careerDarioCS.getDegree_course().getName()+"]");
		
		//Passing grade - Dario -> Software Engineering
		PassingGrade passingGradeDarioSE = DaGiMa_MDE_HW3Factory.eINSTANCE.createPassingGrade();
		passingGradeDarioSE.setCourse(courseSE);
		passingGradeDarioSE.setDate(courseSE.getCalls().get(2).getDate());
		passingGradeDarioSE.setGrade("26");
		passingGradeDarioSE.setStudent(careerDarioCS);
		
		//Career - Dario -> Computer Science Master (ASE)
		Career careerDarioASE = DaGiMa_MDE_HW3Factory.eINSTANCE.createCareer();
		careerDarioASE.setDegree_course(degreeCourseASE);
		careerDarioASE.setStudent(studentDario);
		careerDarioASE.setName("Student Transcript ["+careerDarioASE.getStudent().getMatriculation_number()+" - "+careerDarioASE.getDegree_course().getName()+"]");
		
		//Passing grade - Dario -> Model-Driven Engineering
		PassingGrade passingGradeDarioMDE = DaGiMa_MDE_HW3Factory.eINSTANCE.createPassingGrade();
		passingGradeDarioMDE.setCourse(courseMDE);
		passingGradeDarioMDE.setDate(null);
		passingGradeDarioMDE.setGrade("");
		passingGradeDarioMDE.setStudent(careerDarioASE);
		
	}
	
	public static void create_2() {
		
		//Calendar calendar = Calendar.getInstance();
		
		//Student - Giovanni
		Student studentGiovanni = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentGiovanni.setName("Giovanni");
		studentGiovanni.setSurname("Rossi");
		studentGiovanni.setEmail("gr@u.it");
		studentGiovanni.setMatriculation_number(100100);
		studentGiovanni.setTelephone("+393348754120");
		
		//Student - Mattia
		Student studentMattia = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentMattia.setName("Mattia");
		studentMattia.setSurname("Pino");
		studentMattia.setEmail("mp@u.it");
		studentMattia.setMatriculation_number(100101);
		studentMattia.setTelephone("+393458741102");
		
		//Student - Federica
		Student studentFederica = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentFederica.setName("Federica");
		studentFederica.setSurname("Verdi");
		studentFederica.setEmail("fv@u.it");
		studentFederica.setMatriculation_number(100102);
		studentFederica.setTelephone("+393588741259");
				
		//Student - Nicola
		Student studentNicola = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentNicola.setName("Nicola");
		studentNicola.setSurname("Klauss");
		studentNicola.setEmail("nk@u.it");
		studentNicola.setMatriculation_number(100103);
		studentNicola.setTelephone("+393878744714");
		
		//Student - Giuseppe
		Student studentGiuseppe = DaGiMa_MDE_HW3Factory.eINSTANCE.createStudent();
		studentGiuseppe.setName("Giuseppe");
		studentGiuseppe.setSurname("Bianchi");
		studentGiuseppe.setEmail("gb@u.it");
		studentGiuseppe.setMatriculation_number(100104);
		studentGiuseppe.setTelephone("+393214569874");

		//Professor - Davide
		Professor profDavide = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profDavide.setName("Davide");
		profDavide.setSurname("D'Ettore");
		profDavide.setEmail("dd@p.u.it");
		profDavide.setOffice_telephone("08627896541");
		profDavide.setOrcid("fo2077-perdf3-147852");
		profDavide.setTelephone("+393654789541");
		
		//Professor - Vittorio
		Professor profVittorio = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profVittorio.setName("Vittorio");
		profVittorio.setSurname("Melassi");
		profVittorio.setEmail("vm@p.u.it");
		profVittorio.setOffice_telephone("08627896541");
		profVittorio.setOrcid("er5877-aswef4-784757");
		profVittorio.setTelephone("+393541414102");
		
		//Professor - Alesse
		Professor profAlesse = DaGiMa_MDE_HW3Factory.eINSTANCE.createProfessor();
		profAlesse.setName("Edoardo");
		profAlesse.setSurname("Alesse");
		profAlesse.setEmail("e.a@u.it");
		profAlesse.setOffice_telephone("08622380320");
		profAlesse.setOrcid("fo2030-dfidf3-2398293");
		profAlesse.setTelephone("+3937478374423");
		
		//University - L'Aquila
		University universityLaquila = DaGiMa_MDE_HW3Factory.eINSTANCE.createUniversity();
		universityLaquila.setName("University of L'Aquila");
		universityLaquila.setRector(profAlesse);
				
		//Department - Disim
		Department departmentDisim = DaGiMa_MDE_HW3Factory.eINSTANCE.createDepartment();
		departmentDisim.setName("DISIM");
		departmentDisim.setUniversity(universityLaquila);
		departmentDisim.setWebsite("www.disim.it");
		
		//Custom Enumeration: Degree types
		CustomEnumeration customEnumDegreeTypes = DaGiMa_MDE_HW3Factory.eINSTANCE.createCustomEnumeration();
		customEnumDegreeTypes.setName("DegreeType");
		customEnumDegreeTypes.getValues().addAll(Arrays.asList("BACHELOR_DEGREE", "MASTER_DEGREE", "POST_GRADUATE", "PHD"));
		
		//PhD - PhD in Computer Science
		DegreeCourse phdCS = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		phdCS.setName("PhD in Computer Science");
		phdCS.setCfu(11);
		phdCS.setCode("P-01");
		phdCS.setCoordinator(profDavide);
		phdCS.setDepartment(departmentDisim);
		phdCS.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		phdCS.setDuration(1);
		phdCS.getLanguage().addAll(Arrays.asList("English"));
		phdCS.setReference_year(2023);
		
		//PhD - PhD in Analysis
		DegreeCourse phdAN = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		phdAN.setName("PhD in Analysis");
		phdAN.setCfu(11);
		phdAN.setCode("P-02");
		phdAN.setCoordinator(profVittorio);
		phdAN.setDepartment(departmentDisim);
		phdAN.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		phdAN.setDuration(1);
		phdAN.getLanguage().addAll(Arrays.asList("English"));
		phdAN.setReference_year(2023);
				
		//PhD - PhD in Artificial Intelligence
		DegreeCourse phdAI = DaGiMa_MDE_HW3Factory.eINSTANCE.createDegreeCourse();
		phdAI.setName("PhD in Artificial Intelligence");
		phdAI.setCfu(11);
		phdAI.setCode("P-03");
		phdAI.setCoordinator(profVittorio);
		phdAI.setDepartment(departmentDisim);
		phdAI.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rhoncus lacus metus, vel suscipit libero aliquam mattis. Mauris dignissim id lorem vitae rutrum. Donec nec ipsum ut metus aliquam placerat dapibus sed dui. Donec facilisis varius sollicitudin. Aenean sem nisl, posuere non tincidunt eget, viverra a neque.");
		phdAI.setDuration(1);
		phdAI.getLanguage().addAll(Arrays.asList("English"));
		phdAI.setReference_year(2023);
				
		//Extra info - DegreeType: PHD
		ExtraInfo extraInfoDegreeTypePhd = DaGiMa_MDE_HW3Factory.eINSTANCE.createExtraInfo();
		extraInfoDegreeTypePhd.setEnum(customEnumDegreeTypes);
		extraInfoDegreeTypePhd.setLower_multiplicity(1);
		extraInfoDegreeTypePhd.setHigher_multiplicity(1);
		extraInfoDegreeTypePhd.setType(MetadataType.ENUMERATION);
		extraInfoDegreeTypePhd.setValue("PHD");
		extraInfoDegreeTypePhd.setName(extraInfoDegreeTypePhd.getEnum().getName()+"_"+extraInfoDegreeTypePhd.getValue());
		
	}

//	public final static String FILENAME = "testLiveMDE.xmi";
//
//	public static Diagnostic validate(Library wm) {
//		return Diagnostician.INSTANCE.validate(wm);
//	}

	public static void main(String[] args) {
		create();
//		serializeModel(app, FILENAME);
//		Library libl = load(FILENAME);
//		
//		Diagnostic d = validate(libl);
//		if(d.getSeverity() != Diagnostic.ERROR)
//			System.out.println("the model is valid");
//		else
//			System.out.println("The model is not invalid");
//		System.out.println(app.getBooks().size());
//		app.getBooks().forEach(z -> System.out.println(z.getName()));
	}

//	public static Library load(String fileName) {
//		EPackage.Registry.INSTANCE.put(JuriPackage.eNS_URI, JuriPackage.eINSTANCE);
//		ResourceSet resSet = new ResourceSetImpl();
//		Resource resource = resSet.getResource(URI.createURI(fileName), true);
//		// Get the first model element and cast it to the right type, in my
//		// example everything is hierarchical included in this first node
//		Library myWeb = (Library) resource.getContents().get(0);
//		System.out.println(myWeb);
//		return myWeb;
//	}
//
//	public static void serializeModel(Library wm, String fileName) {
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());
//
//		// Obtain a new resource set
//		ResourceSet resSet = new ResourceSetImpl();
//
//		// create a resource
//		Resource resource = resSet.createResource(URI.createURI(fileName));
//		resource.getContents().add(wm);
//
//		// now save the content.
//		try {
//			resource.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
