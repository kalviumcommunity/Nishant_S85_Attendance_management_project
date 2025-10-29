# School Attendance System
This is a 10-part code-along project to build a console-based school attendance system in Java.

## Session 1: Introduction and Orientation
- Verified Java and Git setup.
- Initialized Git repository for the project.
- Created basic project structure with Main.java.
- Compiled and ran the initial "Welcome" program.
- Pushed initial setup to a part-01 branch on GitHub and created a PR.

### How to Run
1. Navigate to the project root directory (AttendanceSystem).
2. Compile: javac src/com/school/Main.java
3. Run: java -cp src com.school.Main


## Part-02: Core Domain Modelling

- Defined a `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` methods.
- Defined a `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` methods.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Demonstrated basic use of the `this` keyword for referencing instance variables.


## Part-03: Constructor Initialization & Auto-ID Generation

In this part, we:
- Replaced `setDetails()` with constructors in `Student` and `Course` classes.
- Implemented static counters to auto-generate unique IDs.
- Modified the `Main.java` to use constructors and demonstrate ID generation.

### How to Run:
```bash
javac *.java
java Main


### Part 4: Encapsulation & Attendance Recording

**What was done:**
- Encapsulated fields in `Student` and `Course`
- Created `AttendanceRecord` class with validation
- Used `ArrayList` to maintain attendance log
- Handled invalid statuses with appropriate warning
- Displayed attendance records in `Main.java`

**Tested and Verified Output ✅**
- Output shows student/course data, warning, and all attendance records


## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.


## Part 7: Polymorphic Behaviour in Attendance and Displaying Reports
- Modified `AttendanceRecord` to hold `Student` and `Course` objects instead of just their IDs, enhancing its object-oriented nature and how records are displayed. The `toDataString()` method still uses IDs for simpler file storage.
- Created a `displaySchoolDirectory(List<Person> people)` method in `Main.java` to demonstrate polymorphism. This method iterates through a list of `Person` objects (containing `Student`, `Teacher`, `Staff` instances) and calls `person.displayDetails()`. The correct overridden method for each specific object type is executed at runtime.
- Populated a `List<Person>` in `main` and used it with `displaySchoolDirectory`.
- Updated `Main.java` to use `instanceof` and casting when preparing the list of students for saving, as `Person` itself does not implement `Storable`.
- Discussed how polymorphism allows for flexible and extensible code by treating different object types uniformly through a common interface or base class reference.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java`
3. Run: `java -cp src com.school.Main`