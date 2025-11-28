# Patient  Management System
*Description*

## OOP Concepts Applied

## Program Structure

## How to Run the Program

## Sample Output
╔════════════════════════════════════════╗
║    PATIENT MANAGEMENT SYSTEM - LOGIN   ║
╚════════════════════════════════════════╝

Username: code of silence
Password: AMT3

✓ Login Successful! Welcome to the system.

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
1. Add Patient
2. View All Patients
3. Search Patient by Name
4. Schedule Appointment
5. Add Visitor to Patient
6. Update Patient Medicine
7. View Patient Details
8. Logout

Enter your choice: 1

╔════════════════════════════════════════╗
║           ADD NEW PATIENT              ║
╚════════════════════════════════════════╝

Enter Name: John Doe  
Enter Age: 30  
Enter Address: 123 Main St  
Enter Contact Number (10-15 digits): 091234567890  
Enter Disease: Flu  
Enter Medicine: Tamiflu  
Enter Doctor's Name: Dr. Smith

✓ Patient added successfully!

=== PATIENT INFORMATION ===  
Name: John Doe  
Age: 30  
Address: 123 Main St  
Contact: 091234567890  
Disease: Flu  
Medicine: Tamiflu  
Doctor: Dr. Smith  
Appointment: Not Scheduled  
Number of Visitors: 0  

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
Enter your choice: 4

╔════════════════════════════════════════╗
║        SCHEDULE APPOINTMENT            ║
╚════════════════════════════════════════╝

Select Patient (1-1): 1  
Enter Appointment Date (yyyy-MM-dd): 2025-12-15

✓ Appointment scheduled successfully for 2025-12-15 with Dr. Dr. Smith

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
Enter your choice: 5

╔════════════════════════════════════════╗
║          ADD VISITOR TO PATIENT        ║
╚════════════════════════════════════════╝

Select Patient (1-1): 1
Enter Visitor Name: Jane Doe  
Enter Relation to Patient: Sister  
Check-in visit for today? (yes/no): yes

✓ Visitor Jane Doe added successfully to patient John Doe  
✓ Visit checked in successfully for Jane Doe on 2025-11-28

=== VISITOR INFORMATION ===  
Name: Jane Doe  
Relation to Patient: Sister  
Associated Patient: John Doe  
Total Visits: 1  

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
Enter your choice: 6

╔════════════════════════════════════════╗
║        UPDATE PATIENT MEDICINE         ║
╚════════════════════════════════════════╝

Select Patient (1-1): 1  
Current Medicine: Tamiflu  
Enter New Medicine: Paracetamol

✓ Medicine updated successfully for patient: John Doe

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
Enter your choice: 7

╔════════════════════════════════════════╗
║         VIEW PATIENT DETAILS           ║
╚════════════════════════════════════════╝

1. John Doe  
Select Patient (1-1): 1

=== PATIENT INFORMATION ===  
Name: John Doe  
Age: 30  
Address: 123 Main St  
Contact: 091234567890  
Disease: Flu  
Medicine: Paracetamol  
Doctor: Dr. Smith  
Appointment: 2025-12-15  
Number of Visitors: 1  

--- Medical History ---  
Name: John Doe  
Age: 30  
Address: 123 Main St  
Contact: 091234567890  
Disease: Flu  
Medicine: Paracetamol  
Doctor: Dr. Smith  
Appointment: 2025-12-15  

--- Visitors ---  
• Jane Doe (Sister) - Visits: 1

╔════════════════════════════════════════╗
║            MAIN MENU                   ║
╚════════════════════════════════════════╝
Enter your choice: 8

✓ Logging out...

✓ Logged out successfully. Thank you for using Patient Management System!

## Author 

## Acknowlegement
