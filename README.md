# Patient  Management System

**Description:** 
The Patient Management System is a simple Java console program that allows users to add, view, update, search, and schedule. It helps organize basic patient information and appointments using a text-based menu. All data is stored using Java file handling so it can be used again after the program closes.

## OOP Concepts Applied
We applied the following OOP Principles:
### Encapsulation
**Patient Class**
private ArrayList<Appointment> appointments
**Schedule Class**
private ArrayList<String> availableSchedules
**HealthcareSystem**
private Schedule schedule

## Inheritance
**The Patient class inherits from User**

Patient gets: name, age, contactNumber
Patient adds: appointments, requestAppointment()

**The Doctor class inherits from User**

Doctor gets: name, age, contactNumber
Doctor adds: specialization, manageSchedule()

## Polymorphism
**Patient and Doctor classes** both use the same method name displayInfo() but show different outputs.

**Schedule class** uses two versions of addSchedule(), with different parameters.

## Abstract
**User class** hides common details like name and contact, and only shows what other classes need.

**HealthcareSystem** hides complex processes and provides simple methods like bookAppointment() and registerPatient().

## Program Structure
Main Class Structure
| Class | Description |
|:------|:------------|
|**PatientManagement System**| Main Handle login, Main menu, User interaction |
|**Person**| Base class (Patient, Doctor, Visitor) |
|**Patient**| Contains ID, disease, medicine, assigned doctor, oppointment schedule and visitor list |

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
