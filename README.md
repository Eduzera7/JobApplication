# Job Application Simulator ☕

A beginner Java console project developed as part of my BSc (Hons) Computing & IT studies at CCT College Dublin.

## About the Project

The program asks for years of experience and a visa label, validates the input, and displays a simulated application outcome using `if/else` statements.

**All visa rules and application outcomes are fictional and exist only for programming practice. They do not represent Irish immigration rules, permission to work, or real hiring criteria.**

## Input Validation

- Experience must be a non-negative whole number that fits in a Java `int` (0 to 2147483647).
- Text, decimals, negative numbers, values outside that range, and extra text on the experience line are rejected with a clear message.
- The accepted visa labels are `1G` and `Study`. Comparisons ignore letter case, so `1g`, `study`, and `STUDY` also work.
- Spaces around a visa label are removed with `trim()`.
- Blank, unsupported, or missing visa input produces an error message.
- The program processes one application per run. After an error, it ends; run it again to try another input.

## Fictional Decision Rules

| Visa label | Years of experience | Simulated outcome |
| --- | --- | --- |
| 1G | 2 or more | Invitation to an interview |
| 1G | 0 or 1 | Suggestion to explore an internship programme |
| Study | 2 or more | Suggestion to apply for an interview after graduation |
| Study | 0 or 1 | Encouragement to continue studying and build experience |

These are exercise rules only; no application is submitted and no personal data is saved.

## How to Run

1. Install a Java Development Kit (JDK) and check that `java` and `javac` are available.
2. Download `JobApplication.java` or clone this repository.
3. Open a terminal in the project folder.
4. Compile and run:

```bash
javac JobApplication.java
java JobApplication
```

Only the JDK is required. There are no external libraries or build tools.

## Example

```text
Job Application Simulator
All visa rules and outcomes are fictional and for programming practice only.
Years of experience (whole number, 0 or more):
2
Visa type (1G or Study):
1g
Simulated outcome: You are invited to an interview.
```

## Test Scenarios

Run the program again for each row. Enter the years first, then the visa label if prompted.

| Years input | Visa input | Expected result |
| --- | --- | --- |
| `2` | `1G` | Interview invitation |
| `1` | `1G` | Internship suggestion |
| `0` | `1G` | Internship suggestion |
| `2` | `Study` | Apply after graduation |
| `1` | `Study` | Continue studies and build experience |
| `0` | `Study` | Continue studies and build experience |
| `3` | `1g` | Interview invitation; case is ignored |
| `3` | `sTuDy` | Apply after graduation; case is ignored |
| `2` | `  Study  ` | Apply after graduation; surrounding spaces are removed |
| `2` | `ABC` | Invalid visa type |
| `2` | Empty line or spaces only | Invalid visa type |
| `two` | Not requested | Invalid experience |
| `2.5` | Not requested | Invalid experience |
| `-1` | Not requested | Negative experience rejected |
| `2147483648` | Not requested | Value outside the `int` range rejected |
| `2147483647` | `1G` | Interview invitation; maximum `int` accepted |
| `2 extra` | Not requested | Extra text rejected |

The same compile-and-run flow was also checked with redirected input ending before a visa was supplied and with an empty input stream. Both end with a validation message rather than an exception. The verification environment used OpenJDK 25.0.4.1.

## What I Am Practising

- Reading console input with `Scanner`.
- Checking integer input with `hasNextInt()` before calling `nextInt()`.
- Reading the rest of a line with `nextLine()` after numeric input.
- Using `hasNextLine()` to handle an input stream that ends early.
- Comparing strings with `equalsIgnoreCase()` and removing surrounding spaces with `trim()`.
- Combining conditions with `!` (not) and `&&` (and).
- Using early `return` statements to stop after invalid input.
- Applying simple `if/else` rules and closing the scanner before exiting.
- Checking boundary values and invalid input, and documenting the results.

## Project Scope

This repository contains only `JobApplication.java` and this README. Other college exercises and generated `.class` files are not part of the project.

## Author

Eduardo Rebouças Andres

BSc (Hons) Computing & IT — CCT College Dublin
