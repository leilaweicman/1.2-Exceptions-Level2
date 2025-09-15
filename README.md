# 1.2-Exceptions-Level2

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercise:

### Exercise 1
Create a class called `Input`. This class should be used to control the different exceptions that may appear in Java when introducing data from the keyboard using the `Scanner` class.

1. The first step is to instantiate a `Scanner` object.  
2. Then, create **static methods** to read different types of data from the keyboard.  
3. If an exception occurs, the method should handle it and ask the user again until the input is correct.  

#### Methods with `InputMismatchException` handling:
- `public static byte readByte(String message);`  
- `public static int readInt(String message);`  
- `public static float readFloat(String message);`  
- `public static double readDouble(String message);`  

#### Methods with custom exception handling:
- `public static char readChar(String message);`  
- `public static String readString(String message);`  
- `public static boolean readYesNo(String message);`  
  - Returns `true` if the user enters `"y"`.  
  - Returns `false` if the user enters `"n"`.  

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.2-Exceptions-Level2.git
cd 1.2-Exceptions-Level2
```

---

## ▶️ Execution
1. Open Main.java in the Exercise1 package.
2. Run the main() method.
3. Example console output:

```sh
Enter the product quantity
10
Quantity (byte): 10

Enter the current year
2024
Year (int): 2024

Enter the temperature in Celsius
-9
Temperature (float): -9.0

Enter the product price
19.95
Price (double): 19.95

Enter the first letter of your name
A
Initial (char): A

Enter your city
Barcelona
City (string): Barcelona

Do you want to continue? (y/n)
n
Continue? false
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
