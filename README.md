<!-- Badges -->
<p align="center">
  <img src="https://img.shields.io/badge/Java-SE-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/19_Topics-Comprehensive_Curriculum-007396?style=flat-square" alt="19 Topics" />
  <img src="https://img.shields.io/badge/Includes-Final_Exam_%7C_Assignments-4EAA25?style=flat-square" alt="Assignments" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=flat-square" alt="License" />
</p>

<h1 align="center">Java Fundamental — Training Curriculum</h1>

<p align="center">
  A progressive, day-by-day Java SE training course with <strong>sample code</strong> and <strong>hands-on assignments</strong> covering everything from basic syntax to advanced topics — collections, exception handling, lambda expressions, and OOP.
</p>

---

## Table of Contents

- [Curriculum](#curriculum)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Author](#author)
- [License](#license)

---

## Curriculum

| # | Topic | Package | Highlights |
|---|---|---|---|
| 1 | Initialisation & Data Types | `day1/` | Variables, primitives, casting, printing |
| 2 | Casting & Passing By | `day1/` | Type casting, pass-by-value |
| 3 | Flow of Control | `day2_decision/` | `if-else`, `switch-case` |
| 4 | Nested Conditionals | `day2_decision/` | Nested if-else, nested switch |
| 5 | Ternary Operator | `day2_decision/` | Ternary expressions |
| 6 | Looping | `day3_looping/` | `for`, `while`, `do-while`, Fibonacci, patterns (21 files) |
| 7 | Nested Loops, Break, Continue | `day3_looping/` | Loop control, nested iteration |
| 8 | Algorithms & Logic | `day4_logic/` | Palindrome, tax calc, substring, bitwise ops |
| 9 | Operators | `day4_logic/` | Arithmetic, assignment, comparison, logical, bitwise |
| 10 | Arrays | `day5_array/` | 1D/2D arrays, sorting, linear search, matrix |
| 11 | Multidimensional Arrays | `day5_array/` | Matrix operations |
| 12 | Methods & Modifiers | `day6_function/` | Functions, temp conversion, StringBuffer |
| 13 | OOP Basics | `day7_OOP/` | Classes, objects, inheritance |
| 14 | OOP Applied | `day8_OOP/` | Cart/Product/User — e-commerce domain modeling |
| 15 | Collections | `day9_collection/` | `ArrayList`, `LinkedList`, `HashSet`, `HashMap` |
| 16 | Exception Handling | `day9_exceptionhandling/` | Try-catch, custom exceptions |
| 17 | Lambda Expressions | `day9_lambda/` | Functional interfaces, lambda syntax |
| 18 | Post-Tests & Weekly Tests | `day9_postTest/`, `weeklyTest_1/`, `training_week2/` | Assessments |
| 19 | Final Exam | `FinalExam/` | 10 comprehensive exam files covering all topics |

---

## Tech Stack

| Technology | Purpose |
|---|---|
| **Java SE** | Core language and standard library |
| **Collections Framework** | `ArrayList`, `LinkedList`, `HashSet`, `HashMap` |
| **Exception Handling** | Try-catch, custom exceptions |
| **Lambda Expressions** | Functional programming in Java |

---

## Project Structure

```
java-fundamental/
├── src/
│   └── nexsoft/
│       ├── day1/                     # Initialisation, casting, data types
│       │   ├── SampleDataTypes.java
│       │   └── tugasDay1.java
│       ├── day2_decision/            # Conditionals (if-else, switch, nested)
│       ├── day3_looping/             # Loops, nested loops, patterns (21 files)
│       ├── day4_logic/               # Algorithms, palindrome, bitwise
│       ├── day5_array/               # 1D/2D arrays, sorting, matrix
│       ├── day6_function/            # Methods, modifiers, StringBuffer
│       ├── day7_OOP/                 # OOP basics
│       ├── day8_OOP/                 # OOP applied (e-commerce domain)
│       ├── day9_collection/          # Collections framework
│       ├── day9_exceptionhandling/   # Exception handling
│       ├── day9_lambda/              # Lambda expressions
│       ├── day9_postTest/            # Post-test exercises
│       ├── exercises/                # Circle class exercise
│       ├── FinalExam/                # 10 comprehensive exam files
│       ├── sasaranOOP/               # OOP targets (Drone, Senjata)
│       ├── advancedTest_1/           # Advanced assessment
│       ├── weeklyTest_1/             # Weekly assessment
│       └── training_week2/           # Week 2 training
├── LICENSE
└── README.md
```

---

## Prerequisites

| Requirement | Version |
|---|---|
| Java JDK | 8 or later |
| IDE (optional) | Eclipse, IntelliJ, or VS Code |

---

## Getting Started

### Clone & Explore

```bash
# Clone the repository
git clone https://github.com/ridhotadjudin/java-fundamental.git
cd java-fundamental

# Compile all source files
javac -d bin src/nexsoft/**/*.java

# Run any specific program
java -cp bin nexsoft.day1.SampleDataTypes
```

### Open in Eclipse

1. **File → Import → Existing Projects into Workspace**
2. Select the `java-fundamental` directory
3. Browse packages in the `src/nexsoft/` folder
4. Right-click any file → **Run As → Java Application**

### Learning Path

Each topic folder contains:
- **`Sample*.java`** — demonstration and explanation code
- **`tugasDay*.java`** — hands-on assignment to practice the concept

Work through the curriculum sequentially from `day1/` to `FinalExam/`.

---

## Author

**Ridho Tadjudin**

- 🌐 Website: [ridhotadjudin.id](https://ridhotadjudin.id)
- 💻 GitHub: [@ridhotadjudin](https://github.com/ridhotadjudin)

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

<p align="center">
  Built with ☕ and Java
</p>
