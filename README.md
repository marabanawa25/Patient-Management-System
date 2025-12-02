# Patient  Management System

**Description:** 
The Patient Management System is a simple Java console program that allows users to add, view, update, search, and schedule. It helps organize basic patient information and appointments using a text-based menu. All data is stored using Java file handling so it can be used again after the program closes.

## OOP Concepts Applied
The Patient Management System showcases the Four OOP Principles. The Principles are directly shown by the class design and interactions of the system.

### Encapsulation
All classes in the system utilized private attributes to keep patient details, doctor information and visitor history secure. To access or modify these attributes in a secure manner, getter and setter methods are provided by each class which are the basis of encapsulation.

The following classes has private fields:

**Person Class** ->  name, age, address, contactNumber.

**Patient Class** ->  patientID, disease, medicine, assignedDoctor, visitList.

**Doctor Class** ->  doctorID, age, specialization, assignedPatients.

**Visitor Class** ->  visitorID, patientRelation, visitDates.

The use of private attributes guarantees the following:

 - The other class is not able to change the data directly.
 - Validation is done through setters (e.g., age, validation, validating contact number.)
 - The system's data integrity is preserved.

## Inheritance
Allows classes to reuse and extend the structure and behavior of a parent class. In this case, the abstract class Person is the parent class and Patient, Doctor, and Visitor are the subclasses that inherit its characteristics and introduce their own unique features.

**Parent Class:** Person 

Inherited by all subclasses.

Shared Attributes:

- name
- age
- address
- contactNumber

Shared Behaviors: 

- getters and setters
- age and contact validation
- dispayInfo()

This ensures the cosistency and prevents the duplication of code.

## Polymorphism
The system illustrates polymorphism via the abstract method showDetails() in the Person class, which is overridden by its subclasses: Patient, Doctor and Visitor. Despite the fact that these classes have the same method name, each one implements its own particular behavior based on the type of object invoking the method. 

For instance, when showDetails() is executed on a Patient object, it reveals the patient's illness and the doctor assigned; similarly, when called on a Doctor object, it reveals the doctor's field of specialization; and finally when called by a Visitor, it reveals the visitor's relationship to the patient. This makes the system capable of treating everyone as Person objects while still giving different outputs at runtime. Through the use of the overridden showDetails() method, the program obtains a dynamic, flexible design where different classes can define their particular version of a shared method according to where it is extended  demonstrating the very principle of runtime polymorphism.

## Abstraction
It is implemented by means of the abstract class Person, which includes common properties and an abstract method:

**Abstract Method:** 

public abstract void displayInfo();

The Person class does not have an implementation for this method. However, each derived class is required to supply its own version so that the same behavior is given but with a different output.

**System Advantages: **

- The abstract class conceals all internal aspects that are similar (like the method of validating contacts).
- What is only necessary is made known to the subclasses.
- Each subclass is only concerned with its particular duties.
  
## Program Structure
Class Structure Overview
| Class | Description |
|:------|:------------|
|**PatientManagement System**| Main Handle login, Main menu, User interaction |
|**Person**| Base class (Patient, Doctor, Visitor) |
|**Patient**| Contains ID, disease, medicine, assigned doctor, oppointment schedule and visitor list |
|**Doctor**| Contains ID, specialization and assigned patients |
|**Visitor** | Contains ID, relation to patient, visit schedule and associated patient |

## How to Run the Program
This section gives a straightforward and organized instruction on how to operate the Patient Management System from logging in, selecting menu options, managing patient data, scheduling appointments, assigning doctors, and handling visitor records.

**I. Login**
When the program starts, the user is required to login using a specific login credentials before accessing the system.

**II. Add Patient**
The users can register a new patient by entering their personal and medical details.

**III. View All Patients**
Displays every patient currentlyy registered in the system.

**IV. Search Patient by Name**
Allows the users to look up a specific patient whether the patient is registered on the hospital or not by searching their name on the system.

**V. Schedule Appointment**
Users can schedule an appointment for any existing patient on the system.

**VI. Add Visitor to Patient**
Records a visitor and associates them with a patient registered.

**VII. Update Patient Medicine**
Allows the users to update or change a patient's prescribed medication.

**VIII. View Patient Details**
Displays the full information of a selected patient, including appointments, doctors, visitors and medication.

**IX. Logout**
Users exits from the system safely

## Sample Output
![Dashboard Preview](https://github.com/marabanawa25/Patient-Management-System/blob/master/Output1.png)
![Dashboard Preview](https://github.com/marabanawa25/Patient-Management-System/blob/master/Output2.png)
![Dashboard Preview](https://github.com/marabanawa25/Patient-Management-System/blob/master/Output3.png)
![Dashboard Preview](https://github.com/marabanawa25/Patient-Management-System/blob/master/Output4.png)
![Dashboard Preview](https://github.com/marabanawa25/Patient-Management-System/blob/master/Output5.png)

## Authors 
- Mara Banawa
- AJ Ermitanio
- Tricia Fate Vergara

## Acknowlegement
We would like to express our sincere gratitude to Mr. Emmanuel Charlie Enriquez for the guidance, support, and knowledge shared throughout the development of this project. Your dedication and feedback have been invaluable to our learning and the completion of this work.
