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
Enter Name: Sarah Jones
Enter Age: 45
Enter Address: 4996, Jadewood Farms New Brunswick, NJ 08901
Enter Contact Number (10-15 digits): 09171234567
Enter Disease: Strep Throat
Enter Medicine: Antibiotics
Enter Doctor's Name: John Doe
✓ Patient Sarah Jones assigned to Dr. John Doe
✓ Patient added successfully!

=== PATIENT INFORMATION ===
Name: Sarah Jones
Age: 45
Address: 4996, Jadewood Farms New Brunswick, NJ 08901
Contact: 09171234567
Disease: Strep Throat
Medicine: Antibiotics
Doctor: John Doe
Appointment: Not Scheduled
Number of Visitors: 0

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
Enter Name: Emily Williams
Enter Age: 30
Enter Address: 365 York Ave. League City, TX 77539
Enter Contact Number (10-15 digits): 0921234567
Enter Disease: Asthma
Enter Medicine: Biologics
Enter Doctor's Name: Mary Brown
✓ Patient Emily Williams assigned to Dr. Mary Brown
✓ Patient added successfully!

=== PATIENT INFORMATION ===
Name: Emily Williams
Age: 30
Address: 365 York Ave. League City, TX 77539
Contact: 0921234567
Disease: Asthma
Medicine: Biologics
Doctor: Mary Brown
Appointment: Not Scheduled
Number of Visitors: 0

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

Enter your choice: 2
╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
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

Enter your choice: 3
╔════════════════════════════════════════╗
║         SEARCH PATIENT BY NAME         ║
╚════════════════════════════════════════╝
Enter patient name to search: Emily
✓ Found 1 patient(s):

=== PATIENT INFORMATION ===
Name: Emily Williams
Age: 30
Address: 365 York Ave. League City, TX 77539
Contact: 0921234567
Disease: Asthma
Medicine: Biologics
Doctor: Mary Brown
Appointment: Not Scheduled
Number of Visitors: 0

--- Medical History ---
Name: Emily Williams
Age: 30
Address: 365 York Ave. League City, TX 77539
Contact: 0921234567
Disease: Asthma
Medicine: Biologics
Doctor: Mary Brown
Appointment: Not Scheduled
═════════════════════════════════════════

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

Enter your choice: 4
╔════════════════════════════════════════╗
║        SCHEDULE APPOINTMENT            ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 1
Enter Appointment Date (yyyy-MM-dd): 2025-12-16
✓ Appointment scheduled successfully for 2025-12-16 with Dr. John Doe

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

Enter your choice: 5
╔════════════════════════════════════════╗
║          ADD VISITOR TO PATIENT        ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 2
Enter Visitor Name: David Pearson
Enter Relation to Patient: Husband
✓ Visitor David Pearson added successfully to patient Emily Williams
Check-in visit for today? (yes/no): yes
✓ Visit checked in successfully for David Pearson on 2025-11-28

=== VISITOR INFORMATION ===
Name: David Pearson
Relation to Patient: Husband
Associated Patient: Emily Williams
Total Visits: 1

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

Enter your choice: 5
╔════════════════════════════════════════╗
║          ADD VISITOR TO PATIENT        ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 1
Enter Visitor Name: Ronald Johnson
Enter Relation to Patient: Friend
✓ Visitor Ronald Johnson added successfully to patient Sarah Jones
Check-in visit for today? (yes/no): no

=== VISITOR INFORMATION ===
Name: Ronald Johnson
Relation to Patient: Friend
Associated Patient: Sarah Jones
Total Visits: 0

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

Enter your choice: 6
╔════════════════════════════════════════╗
║        UPDATE PATIENT MEDICINE         ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 2
Current Medicine: Biologics
Enter New Medicine: Flovent
✓ Medicine updated successfully for patient: Emily Williams

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

Enter your choice: 7
╔════════════════════════════════════════╗
║         VIEW PATIENT DETAILS           ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 2

=== PATIENT INFORMATION ===
Name: Emily Williams
Age: 30
Address: 365 York Ave. League City, TX 77539
Contact: 0921234567
Disease: Asthma
Medicine: Flovent
Doctor: Mary Brown
Appointment: Not Scheduled
Number of Visitors: 1

--- Medical History ---
Name: Emily Williams
Age: 30
Address: 365 York Ave. League City, TX 77539
Contact: 0921234567
Disease: Asthma
Medicine: Flovent
Doctor: Mary Brown
Appointment: Not Scheduled

--- Visitors ---
• David Pearson (Husband) - Visits: 1

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

Enter your choice: 7
╔════════════════════════════════════════╗
║         VIEW PATIENT DETAILS           ║
╚════════════════════════════════════════╝

╔════════════════════════════════════════╗
║         ALL REGISTERED PATIENTS        ║
╚════════════════════════════════════════╝
Total Patients: 2
─────────────────────────────────────────
1. Name: Sarah Jones
   Age: 45
   Disease: Strep Throat
   Doctor: John Doe
─────────────────────────────────────────
2. Name: Emily Williams
   Age: 30
   Disease: Asthma
   Doctor: Mary Brown
─────────────────────────────────────────
Select Patient (1-2): 1

=== PATIENT INFORMATION ===
Name: Sarah Jones
Age: 45
Address: 4996, Jadewood Farms New Brunswick, NJ 08901
Contact: 09171234567
Disease: Strep Throat
Medicine: Antibiotics
Doctor: John Doe
Appointment: 2025-12-16
Number of Visitors: 1

--- Medical History ---
Name: Sarah Jones
Age: 45
Address: 4996, Jadewood Farms New Brunswick, NJ 08901
Contact: 09171234567
Disease: Strep Throat
Medicine: Antibiotics
Doctor: John Doe
Appointment: 2025-12-16

--- Visitors ---
• Ronald Johnson (Friend) - Visits: 0

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
9. 
Enter your choice: 8
✓ Logging out...
✓ Logged out successfully. Thank you for using Patient Management System!

## Author 

## Acknowlegement
