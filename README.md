# Java Basics Practice

This project contains practice assignments for learning Java fundamentals, organized under the `com.myjava.basics` package. Below is a summary of the topics covered and the assignments completed for each.

## 1. Control Flow
This section focuses on conditional statements (`if`, `else`, `switch`) and loops (`for`, `while`, `do-while`, `break`, `continue`).

### Assignments:
- **a. NumberCheck**: Checks if a number is positive, negative, or zero using `if-else` statements.
- **b. DayOfWeek**: Prints the day of the week (e.g., Monday) for a given number (1-7) using a `switch` statement.
- **c. PrintNumbers**: Prints numbers from 1 to 10 using a `for` loop.
- **d. Countdown**: Prints numbers from 10 to 1 using a `while` loop.
- **e. SumUntilCondition**: Adds numbers starting from 1 until the sum exceeds 50, using a `do-while` loop and `break`.
- **f. SkipOddNumbers**: Prints numbers from 1 to 20, skipping odd numbers using a `for` loop and `continue`.

## 2. Methods
This section focuses on defining methods, using parameters, return types, and method overloading.

### Assignments:
- **a. SquareCalculator**: Defines a method to calculate the square of a number and prints the result.
- **b. Greeting**: Defines a `void` method to print a greeting message for a given name.
- **c. AddNumbers**: Defines a method to add two numbers and return the sum.
- **d. AreaCalculator**: Demonstrates method overloading by calculating the area of a square and a rectangle.
- **e. EvenOddChecker**: Defines a method to check if a number is even, returning a boolean.
- **f. MaxOfThree**: Defines a method to find the maximum of three numbers using conditionals.

## 3. Classes and Objects
This section focuses on creating classes, objects, constructors, and using the `this` keyword.

### Assignments:
- **a. Student**: Creates a `Student` class with name and age, a constructor, and a method to display details.
- **b. Rectangle**: Creates a `Rectangle` class with length and width, a constructor, and a method to calculate area.
- **c. Car**: Creates a `Car` class with brand and speed, a default constructor, and a method to display details.
- **d. Book**: Creates a `Book` class with title and price, two constructors (one with default price), and a method to display details.
- **e. Circle**: Creates a `Circle` class with radius, a constructor, and a method to calculate circumference.
- **f. Person**: Creates a `Person` class with name and age, a constructor, and a method for the person to introduce themselves.

## 4. Encapsulation
This section focuses on hiding data using `private` fields, providing controlled access with getters and setters, and adding validation logic.

### Assignments:
- **a. PersonEncapsulated**: Creates a `PersonEncapsulated` class with private fields for name and age, a constructor, getters, and setters to access and modify the fields.
- **b. BankAccount**: Creates a `BankAccount` class with private fields for account number and balance, getters, setters with validation to prevent negative balances, and tests the validation.
- **c. BookEncapsulated**: Creates a `BookEncapsulated` class with private fields for title and price, makes title read-only (no setter), and includes getters and a setter for price.
- **d. CarEncapsulated**: Creates a `CarEncapsulated` class with private fields for brand and speed, getters, setters with validation to ensure speed is between 0 and 200, and tests the validation.
- **e. StudentEncapsulated**: Creates a `StudentEncapsulated` class with private fields for id and grade, getters, setters, and a method to display the student’s details.
- **f. Product**: Creates a `Product` class with private fields for name and price, getters, setters with validation, and a method to apply a discount to the price with validation.

## 5. Inheritance
This section focuses on creating class hierarchies using the `extends` keyword, the `super` keyword, and method overriding.

### Assignments:
- **a. Vehicle and Car**: Creates a `Vehicle` class with a brand field and a `Car` class that inherits from it, adding a model field and overriding a method to display details.
- **b. Animal and Dog**: Creates an `Animal` class with a sound method and a `Dog` class that inherits from it, overriding the method and using `super` to call the parent’s method.
- **c. Person and Student**: Creates a `Person` class with name and age, and a `Student` class that inherits from it, adding a grade field and overriding a method to display details.
- **d. Shape and Rectangle**: Creates a `Shape` class with a `calculateArea` method and a `Rectangle` class that inherits from it, overriding the method to compute the area.
- **e. Animal, Mammal, and Cat**: Demonstrates multi-level inheritance with an `Animal` class, a `Mammal` class that inherits from it, and a `Cat` class that inherits from `Mammal`, overriding a method at each level.
- **f. Employee and Manager**: Creates an `Employee` class with name and salary, and a `Manager` class that inherits from it, adding a department field and overriding a method to include a bonus in the pay.

## 6. Polymorphism
This section focuses on runtime polymorphism, method overriding, and using parent class references to invoke child-specific behavior.

### Assignments:
- **a. AnimalSoundTest**: Creates an `Animal` class with `Dog` and `Cat` subclasses, using parent references to call the overridden `sound` method dynamically.
- **b. ShapeAreaTest**: Creates a `Shape` class with `Circle` and `Rectangle` subclasses, using parent references to call the overridden `calculateArea` method.
- **c. EmployeeSalaryTest**: Creates an `Employee` class with `FullTimeEmployee` and `PartTimeEmployee` subclasses, using an array of parent references to calculate salaries polymorphically.
- **d. VehicleMovementTest**: Creates a `Vehicle` class with `Car` and `Bicycle` subclasses, using parent references to call the overridden `move` method.
- **e. DrawingTest**: Creates a `Drawable` class with `Circle` and `Square` subclasses, using a method with a `Drawable` parameter to call the overridden `draw` method.
- **f. ProductDiscountTest**: Creates a `Product` class with `Electronics` and `Clothing` subclasses, combining encapsulation and polymorphism to apply different discounts.

## 7. Interfaces
This section focuses on defining and implementing interfaces using the `implements` keyword, multiple interface implementation, and enforcing abstraction.

### Assignments:
- **a. FlyableTest**: Creates a `Flyable` interface with a fly method, implemented by `Bird` and `Airplane` classes, using interface references to call the method.
- **b. ResizableTest**: Creates a `Resizable` interface with a resize method, implemented by `Image` and `Window` classes, using interface references.
- **c. NotifiableTest**: Creates a `Notifiable` interface with a sendNotification method, implemented by `Email` and `SMS` classes, using an array of interface references.
- **d. DrivableTest**: Creates a `Drivable` interface with a drive method, implemented by `Car` and `Truck` classes, using interface references.
- **e. LoggableTest**: Creates `Loggable` and `Auditable` interfaces with log and audit methods, implemented by `Transaction` class, demonstrating multiple interface implementation.
- **f. RentableTest**: Creates a `Rentable` interface with rent and returnItem methods, implemented by `Bike` and `Scooter` classes, combining encapsulation and interfaces.

## 8. Exception Handling
This section focuses on handling errors using `try`, `catch`, `finally`, `throw`, `throws`, and creating custom exceptions for robust programs.

### Assignments:
- **a. DivideNumbersTest**: Handles `ArithmeticException` when dividing numbers, using try-catch to prevent division by zero.
- **b. FileReaderTest**: Handles `IOException` when reading a file, using try-catch-finally to ensure resource cleanup.
- **c. ArrayAccessTest**: Handles `ArrayIndexOutOfBoundsException` when accessing an array, using multiple catch blocks.
- **d. NumberParserTest**: Handles `NumberFormatException` when parsing strings to integers, throwing a custom exception for invalid input.
- **e. AgeValidatorTest**: Creates a custom `InvalidAgeException` and throws it for invalid ages, using try-catch to handle it.
- **f. LibraryCheckoutTest**: Creates a custom `BookNotAvailableException` and handles it when borrowing books, combining encapsulation and exception handling.

## 9. Enums
This section focuses on defining and using enums for fixed constants, adding fields and methods, and integrating with switch statements for type-safe code.

### Assignments:
- **a. DayOfWeekTest**: Creates a `DayOfWeek` enum with days of the week, using a switch statement to print messages based on the day.
- **b. TrafficLightTest**: Creates a `TrafficLight` enum with colors and durations, using methods to get duration and next light.
- **c. BookGenreTest**: Creates a `BookGenre` enum with genres and descriptions, using a method to get description and a loop to print all genres.
- **d. OrderStatusTest**: Creates an `OrderStatus` enum with statuses and a method to check if delivery is allowed, handling status transitions.
- **e. PlanetTest**: Creates a `Planet` enum with mass and radius, calculating surface gravity using a method and handling invalid planets with exceptions.
- **f. LibraryItemStatusTest**: Creates a `LibraryItemStatus` enum with statuses, integrating encapsulation and exception handling for borrowing logic.

---

### How to Run
- All classes are under the `com.sachin.basics` package in the `src` directory.
- Open the project in IntelliJ IDEA.
- Right-click on any class and select `Run <ClassName>` to see the output.
- Modify the code as needed to experiment with different inputs or add new features.